import java.util.*;
public class lect5 {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
    //rectangle pattern
        int a= sc.nextInt();
        int b= sc.nextInt();
        for (int i=0; i<=a; i++) {
            for (int j=0; j<=b; j++){
                System.out.print("*"+" ");
            }
            System.out.print('\n');
        }
        
    //hollow rectangle pattern
        for (int i=0; i<=a; i++) {
            for (int j=0; j<=b; j++) {
            if (i==0||i==a||j==0||j==b){
            System.out.print("* ");}
        else{
            System.out.print(" "+" ");
        }
        }
        System.out.print("\n");
    }
    //right triangle pattern
    for (int i=1; i<=a; i++) {
        for (int j=1; j<=i; j++){
            System.out.print("* ");
        }
        System.out.print("\n");
    }
    //invert right triangle pattern
    for (int i=1; i<=a; i++) {
        for (int j=1; j<=a-i+1; j++) {
            System.out.print("* ");}
            System.out.print("\n");}
    //inverted half pyramid pattern
    for (int i=1; i<=a; i++) {
        for (int j=1; j<=a-i; j++) {
            System.out.print("  ");}
            for (int k=1; k<=i; k++) {
                System.out.print("* ");}
            System.out.print("\n");}
        //right triangle pattern with number
        for (int i=1; i<=a; i++) {
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }
        //invert right triangle pattern with number
    for (int i=1; i<=a; i++) {
        for (int j=1; j<=a-i+1; j++) {
            System.out.print(j);}
            System.out.print("\n");}
            //floyd's triangle
            int num=1;
            for (int i=1; i<=a; i++) {
                for (int j=1; j<=i; j++){
                     
                    System.out.print(num +" ");
                num++;}
             System.out.print("\n");
            
        }
        //0-1 triangle
        int sum=0;
        for (int i=1; i<=a; i++) {
            for (int j=1; j<=i; j++){
              sum=i+j;
              if (sum%2==0){
                System.out.print("1");
              }
              else{
                System.out.print("0");
              }
            }
         System.out.print("\n");
        
    }
    sc.close();
}
}
   