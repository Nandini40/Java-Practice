import java.util.*;
public class lect4 {
    public static void main(String[] args){
        //for loop
        for (int i = 0; i <20; i++) {
            System.out.println("Tripti is sleeping...");}
            //while loop
            Scanner sc=new Scanner(System.in);
            int i=sc.nextInt();
            while( i<6){
                System.out.println(i);
                i++;
            }
            //do-while loop
            int ishi=sc.nextInt();
            do{
                System.out.println("ishi is gadhero");
                ishi++;
            }while(ishi<=22);
            //sum of first n natural number
            int n = sc.nextInt();
            int sum=0;
for (int k=0; k<n; k++){
    sum=sum+n;
}
System.out.println(sum);
//printing table
int table = sc.nextInt();
for(int j=0; j<11; j++){
    System.out.println(table*j);
}
    sc.close();
        }
}
