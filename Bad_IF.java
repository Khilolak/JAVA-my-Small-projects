package Week_1;

import java.util.Scanner;

public class Bad_IF {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //variabel
      Scanner input = new Scanner(System.in);
      int num;
      
      //input
        System.out.print("Enater one of the following number;"
                + "\n1, 2, 3, 4, 5 --->");
      num = input.nextInt();
      
      if(num == 1){
          System.out.println("You entered " + num + " that is valid!");
      }
      if(num == 2){
          System.out.println("You entered " + num + " that is valid!");
      }
      if(num == 3){
          System.out.println("You entered " + num + " that is valid!");
      }
      if(num == 4){
          System.out.println("You entered " + num + " that is valid!");
      }
      if(num == 5){
          System.out.println("You entered " + num + " that is valid!");
      }
          
    }
    
}
