import java.util.*;
public class lect7 {
    public static void PrintMyName(String name) {
        System.out.println(name);
        return;
    }
    public static int  Sum(int x, int y) {
        int sum=x+y;
        System.out.println(sum);
        return sum;
    }
    public static int  Product(int x, int y) {
        int product=x*y;
        System.out.println(product);
        return product;
    }
    public static int Factorial(int x){
        int factorial=1;
        if (x<0){
            System.out.println("Invalid number");
        }
        else {for (int i=1; i<=x; i++){
            factorial*=i;
        }
        System.out.println(factorial);}
        return factorial;
    }
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String name=sc.next();
    int a=sc.nextInt();
    int b=sc.nextInt();
    PrintMyName(name);
    Sum(a, b);
    Product(a, b);
    Factorial(b);
    


    sc.close();}

}