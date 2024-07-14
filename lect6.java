import java.util.*;
public class lect6 {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
     //butterfly pattern
     for (int i=1; i<=a; i++) {
        for (int j=1; j<=i; j++){
            System.out.print("* ");
        }
        for (int k=1; k<=(a-i); k++) {
            System.out.print("    ");
           }
            for (int l=1; l<=i; l++) {
                System.out.print("* ");
               }
        System.out.print("\n");
    }
    for (int i=a; i>=1; i--) {
        for (int j=1; j<=i; j++) {
            System.out.print("* ");
           }
            for (int k=(a-i); k>=1; k--) {
                System.out.print("    ");
               }
               for (int l=1; l<=i; l++) {
                   System.out.print("* ");
               }
            System.out.print("\n");
           }
   //solid rhombus
   for (int i=0; i<=a; i++) {
       for (int l=0;l<=a-i;l++) {
           System.out.print(" "); 
       }
       for (int j=0; j<=a; j++) {
           System.out.print("*");
       }
       System.out.print("\n");
   }
        //number pyramid
        for (int i=1; i<=a; i++) {
                for (int k=1; k<=a-i;k++) {
                    System.out.print(" ");}
                    for (int j=1; j<=i; j++) {
                System.out.print(i+" ");}
                
            System.out.println();}
            //palindromic pattern 
       for (int i=0; i<=a; i++) {
        for (int j=a-i; j>=0; j--) {
            System.out.print(" ");

        }
        for (int j=i; j>1; j--) {
            System.out.print(j);
        }
            for (int j=1; j<=i; j++) {
                System.out.print(j);
            }
                
                System.out.print("\n");
            }
            //diamond pattern
           for (int i=1; i<=a; i++) {
            for (int j=1;j<a-i;j++) {
                System.out.print(" ");}
                for (int j=1; j<=2*i-1; j++) {
                    System.out.print("*");
                }
                        System.out.println();}


             for (int i=a; i>=1; i--) {
                 for (int j=1;j<=a-i;j++) {
                    System.out.print(" ");}
                 for (int j=0; j<=2*i-1; j++) {
                    System.out.print("*");}
                    System.out.println();}
            sc.close();
   }    
}
