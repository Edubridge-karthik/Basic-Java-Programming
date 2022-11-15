import java.util.Scanner;
public class LogicalOperators {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Voting Eligibilty:");
        System.out.println("------------------");
        System.out.println("Enter the Voter Age:");
        int age=sc.nextInt();
        System.out.println("Enter Voter Citizenship:");
        String citizen=(String) sc.next();
        System.out.println(citizen);
        if (age>=18 && citizen=="indian")
        {
            System.out.println("He/She is eligible for vote:");
        }
        else{
            System.out.println("Not  Eligibile");
        }


    }
    
}
