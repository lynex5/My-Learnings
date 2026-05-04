-> Bean is like a container whuch hold some data and it is menaged by the Ioc.

Syntax : 
<beans xmlns = "http://www.springframework.org/schema/beans"
   xmlns:xsi = "http://www.w3.org/2001/XMLSchema-instance"
   xsi:schemaLocation = "http://www.springframework.org/schema/beans
   http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">

<bean id="id1" class="com.rahul.spring">
<property name="name" value="Rahul"/>
</bean>

</beans>

Bean-properties:

Here, "id" is used to identitfy the Bean uniquely ,"class" is to find the Java file to use, "property" tag is used to initialize the value to the attributes , "name" attribute is used to tell assign the value to this variable , "value" is to store the data to inject into the variable.


-------------------------------------------------------------------------------------
Scopes:

This will tell the usage of the bean there are five types of scopes

1. singleton
2. prototype
3. request
4. session
5. globalsession

1. singleton: This will tell the logic or values can used by different objects there will be more memory saving, 

2. prototype: This will tell every object will have the separate memory and different login and different values.

3. request: This will tell that data will be taken for every hhtp request.

4. Session:  This store the data for every obj separatly , means one object data will not be shared to another object, like every user will have separate items in there cart.

5. globalsession: This will maitain the data sharing at globalyy means user will get the same data at any place, like on user login will login with his account at dofferent devices he wilp get the same data.

-------------------------------------------------------------------------------------

Beans lifecycle:

There will be some life cycles in the beans .

1. Lazy-init
2. init-method
3. distroy-method

1. lazy-init


syntax: 

<bean id="id1" class="com.rahul.spring" lazy-init="true">
<property name="name" value="Rahul"/>
</bean>


2. init-method: This will happen before the initialization of bean that mean there will some works before the initialization of bean that will be happen before the Bean starting

Syntax: 

<bean id="id1" class="com.rahul.spring" init-method="init">
<property name="name" value="Rahul"/>
</bean> 
-------------------------------------------------------------------------------------

         ---- Bean process ----

-------------------------------------------------------------------------------------

3. destroy-method: This will happen after the bean process tat mean there will be some clean up after the bean process so this one is used afte the bean process.

<bean id="id1" class="com.rahul.spring" destroy-method="detroy">
<property name="name" value="Rahul"/>
</bean>


There is defalut applying option , if there are two methods where those will apply to all beans then we use this.

<beans xmlns = "http://www.springframework.org/schema/beans"
   xmlns:xsi = "http://www.w3.org/2001/XMLSchema-instance"
   xsi:schemaLocation = "http://www.springframework.org/schema/beans
   http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
   defalut-init-method="init" default-destroy-method="destroy">

   <bean id="id1" class="com.rahul.spring">
   <property name="name" value="rahull"/>
   </bean>
</beans>

-------------------------------------------------------------------------------------

Bean-post-processor:

There will be some works before the initalization of bean this will take care of it.

to use this we want a hook meathod called registerShutDownHook() 

