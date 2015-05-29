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
    
    if (!choice){
      System.out.println("Why the hell would you do that? 4 Ninjas were standing behind you. \nYou received 59 shurikens to the jugular.");
      System.out.println("You can have another chance");
      choice = decisionOne();
    }

    if (choice){
      System.out.println("Voooooosh. You have been teleported to the Kim-Jong Un-ited States of America\n");
      System.out.println("You see a sword on the ground. It looks rather heavy, but you think you can lift it. Would you like to...");
      choice = decisionTwo();

      if (choice) {
        System.out.println("The sword seems like a good fit. Maybe you will be able to use it at some point...");
      }
      if (!choice){
        System.out.println("A stampede of elephants just trampled you. You were defenseless. You picked up the sword afterwards.");
      }
      }
    }
      
    
    
    
    
  }
  
  
