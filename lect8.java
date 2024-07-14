import java.util.Scanner;

public class lect8 {
    //Question 1
    public static int Average(int x, int y, int z){
        int avg=(x+y+z)/3;
        System.out.println("Average is: "+avg);
        return avg;}
        //Question 2
    public static int SumOddNumber(int n){
        int OddSum=0;
        for (int i=0; i<=n; i++){
            if (i%2!=0){
                OddSum+=i;
            }
        }
        System.out.println("Sum of Odd number is: "+OddSum);
        return OddSum;
    }
    //Question 3
    public static int GreaterNumber(int n, int m){
        if (n>m){
            System.out.println("Greater Number:"+n);
            return n;
        }
        else if (n==m){
            System.out.println("Both are equal.");
        return m;}
        else {
            System.out.println("Greater Number:"+m);
            return m;
        }
    }
    //Question 4
    public static double Circumference(int r){
        double cir=2*3.14*r;
        System.out.println("Circumference of the number:"+cir);
        return cir;
    }
    //Question 5
    public static int ValidVotingAge(int age){
        if (age>=18){
            System.out.println("Valid For Voting");
        }
        else {
            System.out.println("Invalid for Voting");
        }
        return age;}
        //Question 6 is infinite loop
    //Question 7
    public static int NegPosZeroCount(int count) {
        Scanner sc=new Scanner(System.in);
        int CountPositive=0;
        int CountNegative=0;
        int Count0=0;
        System.out.println("enter the " + count + " number");
        for (int i=1; i<=count; i++) {
            int value=sc.nextInt();
            if (value>0){
                CountPositive+=1;  
            }
            else if (value<0){
                CountNegative+=1; 
            }
            else{
                Count0+=1;   
            }
        }
        System.out.println("Count of Zeroes: "+Count0);
        System.out.println("Count of Positives: "+CountPositive);
        System.out.println("Count of Negatives: "+CountNegative);
        sc.close();   
        return 0;  
    }
    //Question 8
    public static int Exponential(int x, int n){
       int expo=1;
        for (int i=1; i<=n; i++){
            expo*=x;}
            System.out.println("X^n="+expo);
            return expo;
    }
    //Question 9 
    public static int GreatestCommonDivisor(int x, int y){
        int factor=1;
        if (x>=y){
            for (int i=1; i<=y; i++){
            if (x%i==0 && y%i==0){
                factor*=i;
                System.out.println("Greatest factor is: "+ factor );
                }
            }
            
        }
            else {
                for (int i=1; i<=x; i++)
            {if (x%i==0 && y%i==0){
                factor*=i;
                System.out.println("Greatest Factor is: "+ factor );
            }
         }
        }
        return 0;
        }
    //Question 10
    public static int Fibonacci(int n){
        int a=0;
        int b=1;
        int c=0;
        System.out.println("Fibonacci is listed below");
        System.out.print(a+" ");
        System.out.print(b+" ");
        for (int i=1; i<=n-2; i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;}
            return 0;
    }
public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int n=sc.nextInt();
    int age=sc.nextInt();
    int count=sc.nextInt();
    Average(a, b, c);
    SumOddNumber(n);
    GreaterNumber(a, c);
    Circumference(b);
    ValidVotingAge(age);
    NegPosZeroCount(count);
    Exponential(a,n);
    GreatestCommonDivisor(b, c);
    Fibonacci(count);
    sc.close();
}
    
}
