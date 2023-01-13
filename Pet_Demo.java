package Week_2;

import java.util.Scanner;

public class Pet_Demo {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Pet p = new Pet("Jane Doe");
        System.out.println("My records on your pet are incomplete\n"
                + "Here is what they currently say:\n"
                + p.toString());
        
        System.out.print("\nPlease enter the pet's name ");
        String na = scan.nextLine();
        
        System.out.print("\nPlease enter the pet's age ");
        int ag = scan.nextInt();
        
        System.out.print("\nPlease enter the pet's weight ");
        double we = scan.nextDouble();
        
        Pet pe = new Pet(na, ag, we);
        
        if (ag > 0 && we > 0) {
            
             System.out.println("\nMy records now say: " + pe.toString());
        }
        else{
            System.err.println("\nError: Negotive age or weights.");
        }
       
    }
    
}
