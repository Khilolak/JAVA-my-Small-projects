package Week_1;

import java.util.Scanner;

public class User_Input_Variable_Types {

    public static void main(String[] args) {
        // TODO code application logic here
        int age;
        double money;
        String firstName;
        String lastName;
        String fullName;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your age ---> ");
        age = input.nextInt();
        
        System.out.print("Enter your first name ---> ");
        firstName = input.next();
        
        System.out.print("Enter your last name ---> ");
        lastName = input.next();
        
        System.out.print("Enter the amount of money in your wallet ---> ");
        money = input.nextDouble();
        
        fullName = firstName + " " + lastName;
        
        System.out.println("\nSo your name is " + fullName + " you are " + age 
        + " years old and have $" + money + " in your wallet");
        
        
    }
    
}
