package DSA.Patterns.Pattern11;

public class Pattern11 {
    public static void main(String[] args){
    int n=5;
    for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
            if(i==j || ((i%2==j%2))){
                System.out.print("1");
            }else{
                System.out.print("0");
            }
        }
        System.out.println();
    }
    }
}
