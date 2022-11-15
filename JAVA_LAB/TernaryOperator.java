import java.util.Scanner;
public class TernaryOperator {
    public static void main(String args[]){
        System.out.println("Find ODD or EVEN using Ternary Operator:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String result=num%2==0? "EVEN NUMBER":"ODD NUMBER";
        System.out.println(result);
}
}
