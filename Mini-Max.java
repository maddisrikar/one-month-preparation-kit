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
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        long small=0,big=0;
        for(int i=0;i<5-1;i++){
            small=small+arr[i];   
        }
        for(int i=1;i<5;i++){
            big=big+arr[i];
        }
        System.out.println(small+" "+big);
    }
}


