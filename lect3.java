import java.util.*;
public class lect3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //age detector
        int age=sc.nextInt();
        if (age>=18){
            System.out.println("You are an adult");

        }
        else{
            System.out.println("You are Ishan Joshi who is a 2 year old kid");
        }
        // odd or even 
        int num=sc.nextInt();
        if (num%2==0){
            System.out.println("It is an even number");
        }
        else{
            System.out.println("It is an odd number");
    }
    // comparison between a and b
    int a=sc.nextInt();
    int b=sc.nextInt();
    if (a==b){
        System.out.println("equal");
    }
    else if(a>b){
        System.out.println("a is greater than b");}
        else{
            System.out.println("a is less than b");
        }
        //greetings 
        int button=sc.nextInt();
        if (button==1){
            System.out.println("Namaste");}
        else if (button==2){System.out.println("Hello");}
        else if (button==3)
        {System.out.println("Bonjour");}
        else{
            System.out.println("invalid input");
        }
        //switch (greetings)
        switch(button){
            case 1:System.out.println("hello");
            break;
            case 2:System.out.println("Namaste");
            break;
            case 3:System.out.println("Bonjour");
            break;
            default:System.out.println("ni hao");
        }
char operator=sc.next().charAt(0);
switch(operator) {
    case '+':System.out.println(a+b);
    break;
    case '-':System.out.println(a-b);
    break;
    case '*':System.out.println(a*b);
    break;
    case '/':System.out.println(a/b);
    break;
    case '%':System.out.println(a%b);
    break;
    case '&':System.out.println(a&b);
    break;
    case '|':System.out.println(a|b);
    break;
    default:System.out.println("Illegal operator");
}
    sc.close();
}
}
