import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("WHILE LOOPS");


    String x;
      do 
      { 
        System.out.println("Yipee");
        System.out.print("do you want to play");
         x = s.nextLine();
      }while(x.equalsIgnoreCase("yes"));
  }
    
 
}

