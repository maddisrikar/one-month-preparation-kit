import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Result {
    public static void main(String[]args){
    Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        int a=0,b=0,c=0;
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
            if(arr[i]>0){
                a++;
            }
            if(arr[i]<0){
                b++;
            }
            if(arr[i]==0){
                c++;
            }
        }
        float x=0,y=0,z=0;
        x=(float)a/n;
        y=(float)b/n;
        z=(float)c/n;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }    
}
