package DSA.Sortings.MergeSort;
import java.util.*;
public class Merge {

    static void conquer(int a[],int left,int mid,int right,int temp[]){
        int i=left,j=mid+1,k=left;
        while(i<=mid && j<=right){
            if(a[i]<=a[j]){
                temp[k++]=a[i++];
            }else{
                temp[k++]=a[j++];
            }
        }
        while(i<=mid) temp[k++]=a[i++];

        while(j<=right) temp[k++]=a[j++];

        for(int u=left;u<=right;u++) a[u]=temp[u];
    }

    static void divide(int a[],int left,int right,int temp[]){
        if(left<right){
            int mid = left + (right-left)/2;

            divide(a,left,mid,temp);
            divide(a,mid+1,right,temp);

            conquer(a,left,mid,right,temp);
        }
    }
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = x.nextInt();

        int a[] = new int[n];

        System.out.println("Enter the elemets into the array: ");
        for(int i=0;i<n;i++) a[i] = x.nextInt();

        int temp[] = new int[n];

        divide(a,0,a.length-1,temp);

        for(int i:a) System.out.print(" "+i);
    }
}