//The Adventures of Danny

import java.util.Scanner;

class Game extends Decisions {
  
  public static void main (String str[]){
    
    boolean choice;
    
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Hello, welcome to Stillwater!\nWhat is your name?");
    String name = scan.nextLine();
    
    System.out.println("What a dumb name! Nice to meet you Danny Leo!");
    
    System.out.println("Good Morning! You sure slept a long time! You're going downstairs from your bedroom and you find a teleporter! What do you do?");
    
    choice = decisionOne();
    
    if (choice == false){
      System.out.println("You can have another chance");
      decisionOne();}
      
    
    
    
    
  }
  
  
}