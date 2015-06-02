//The Adventures of Danny

import java.util.Scanner;
import java.lang.Math;

class Game extends Decisions{
  
  public static void main (String str[]){
    
    int health = 50;
    int healthLoss = 0;
    boolean choice;
    
    
    Scanner scan = new Scanner (System.in);
    
    while (health > 0){
      
      System.out.println("Hello, welcome to Stillwater!\nWhat is your name?");
      String name = scan.nextLine();
      
      System.out.println("What a dumb name!\nNice to meet you Danny Leo!\n");
      
      System.out.println("Good Morning! You sure slept a long time! \nYou're going downstairs from your bedroom and you find a teleporter! What do you do?");
      
      choice = decisionOne();
      
      if (!choice){
        System.out.println("Why the hell would you do that? 4 Ninjas were standing behind you. \nYou received 59 shurikens to the jugular.\n");
        System.out.println("You can have another chance");
        choice = decisionOne();
      }
      
      if (choice){
        System.out.println("Voooooosh. You have been teleported to the Kim-Jong Un-ited States of America\n");
        System.out.println("You see a sword on the ground. It looks rather heavy, but you think you can lift it. \nWould you like to...");
        
        choice = decisionTwo();
      }
      if (choice) {
        System.out.println("The sword seems like a good fit. Maybe you will be able to use it at some point...");
      }
      if (!choice){
        System.out.println("A stampede of elephants just trampled you. You were defenseless. You picked up the sword afterwards.");
        healthLoss = (int)(Math.random()*7+1);
        health -= healthLoss;
        System.out.println("You lost " + healthLoss + " health.\nYou now have " + health + " health");
      }
      
      choice = decisionThree();
      if (choice){
        System.out.println("The friendly wolf gave you a cookie. \nTo your surprise, he stood up on 2 legs, shook your hand, and walked away.");
      }
      if (!choice){
        System.out.println("You idiot, you don't have a dog whistle.\nThe wolf mauled your face.");
        healthLoss = (int)(Math.random()*5+1);
        health -= healthLoss;
        System.out.println("You lost " + healthLoss + " health.\nYou now have " + health + " health");
      }
      
      choice = decisionFour();
      if (choice){
        System.out.println("Mr. Bach commends your trust in the system and gives you a high five.");
      }
      if (!choice){
        healthLoss = (int)(Math.random()*3+1);
        health-=healthLoss;
        System.out.println("Now you can't graduate.\nYou lose " + healthLoss + " health due to emotional pain.\nYou now have " + health + " health");
      }
      
      choice = decisionFive();
      if (choice){
        System.out.println("You killed Puff. Man, dragons are so easy to kill");
      }
      if (!choice){
        healthLoss = (int)(Math.random()*20+10);
        health-=healthLoss;
        System.out.println("\"HOW DARE YOU?!?\" Puff blows fire on you. \nYou lose " + healthLoss + " health from 3.14th degree burns.\nYou now have " + health + " health");
      }
      
      choice = decisionSix();
      System.out.println("It doesn't matter what you do it's just a plant. Did you really think anything bad would happen?");
      
      
      choice = decisionSeven();
      if (choice){
        System.out.println("Good work! You know a true wizard's weakness");
      }
      if (!choice){
        healthLoss = (int)(Math.random()*11+5);
        health-=healthLoss;
        System.out.println("He's a wizard, stupid. Your sword does not even get close to him.\nYou lose " + healthLoss + "health.\nYou now have " + health + " health");
      }
      
      choice = decisionEight();
      if (choice){
        System.out.println("Sir Brady says \"No, please don't do that, that would be cheating. I respect the game too much to cheat.\"\nHe hands you a $100 bill and quietly says \"No, seriously, I REALLY hate cheating.");
      }
      if (!choice){
        healthLoss = (int)(Math.random()*8+1);
        health-=healthLoss;
        System.out.println("The KGB runs in and steals the ring before you can get your hands on it. They knock you over in the process.\nYou lose " + healthLoss + " health.\nYou now have " + health + " health");
      }
      
      choice = decisionNine();
      if (choice){
        System.out.println("Your beautiful voice put him to sleep.\nThose animal shelter commercials sure paid off!");
      }
      if (!choice){
        healthLoss = (int)(Math.random()*3+1);
        health-=healthLoss;
        System.out.println("You can't punch ghouls. You fall flat on your face.\nYou lose " + healthLoss + " health.\nYou now have " + health + " health");
      }
      
      choice = decisionTen();
      if (choice){
        System.out.println("Hooray! The world has less terrible movies");
      }
      if (!choice){
        System.out.println("Moovies isn't a word. I'm amazed you've made it this far in life.");
      }
      
      choice = decisionEleven();
      if (choice){
        System.out.println("Turns out it was just a mirror. There's only one person that could be that gorgeous anyways.");
      }
      if (!choice){
        healthLoss = (int)(Math.random()*5+1);
        health-=healthLoss;
        System.out.println("OW! It's a mirror. You lose " + healthLoss + " health from your bleeding hand.\nYou now have " + health + " health");
      }
      
      choice = decisionTwelve();
      if (choice){
        int healthGain = (int)(Math.random()*10+1);
        health+=healthGain;
        System.out.println("Man those were delicious! Your stomach sure is satisfied now! \nYou gain " + healthGain + " health. You now have " + health + " health.");
      }
      if (!choice){
        healthLoss = (int)(Math.random()*10+1);
        health-=healthLoss;
        System.out.println("As you walk away, a giant blueberry falls on top of you. Take that health freaks!\n You lose" + healthLoss + " health.\nYou now have " + health + " health");
      }
      
      choice = decisionThirteen();
      if (choice){
        System.out.println("Man, you really enjoy dodgeball! Patches would be proud.");
      }
      if (!choice){
        healthLoss = (int)(Math.random()*5+1);
        health-=healthLoss;
        System.out.println("Steve isn't an actual pirate!\nHe puts you in an armbar when you try to take his pants off for his booty.\nYou lose " + healthLoss + " health.\nYou now have " + health + " health");
      }
      
      choice = decisionFourteen();
      if (choice){
        System.out.println("The dog wags his tail and also turns into a Chinese man for no reason. \nThis IS just a game, remember. Try not to think too much about it.\nThis is as good of a time as any to give the warning that the creators of this game are not respnsible of any nightmares experienced by the player.");
      }
      if (!choice){
        healthLoss = (int)(Math.random()*7+3);
        health-=healthLoss;
        System.out.println("The dog(?) transforms into a cat and beats you up. You lose " + healthLoss + " health.\nYou now have " + health + " health");
      }
      
      choice = decisionFifteen();
      if (choice){
        System.out.println("Your mad beatz win and you are declared the hero of France");
      }
      if (!choice){
        healthLoss = (int)(Math.random()*3+1);
        health-=healthLoss;
        System.out.println("The Frenchman gets mad, grows croissants for hands and beats you up. You lose " + healthLoss + " health.\nYou now have " + health + " health");
      }
      
      choice = decisionSixteen();
      if (choice){
        int healthGain = (int)(Math.random()*11+1);
        health+=healthGain;
        System.out.println("You dream that your family has all turned into salmon. You happen to love salmon so you eat your family.\nThe salmon replenishes " + healthGain + " health. You now have " + health + " health.");
      }
      if (!choice){
        healthLoss = (int)(Math.random()*5+5);
        int dayNumbers = (int)(Math.random()*3+1);
        health-=(healthLoss*dayNumbers);
        System.out.println("You keep walking and fall down a well, passing out when you hit the bottom. You are passed out for " + dayNumbers + " days. For each day you're passed out, you lose " + healthLoss + " health.\nYou now have " + health + " health");
      }
      
      choice = decisionSeventeen();
      if (choice){
        System.out.println("Dr. Yang is very kind to you and tells you how to get out.");
      }
      if (!choice){
        healthLoss = (int)(Math.random()*5+1);
        health-=healthLoss;
        System.out.println("Dr. Yang slaps you across the face and scolds you for asking such a personal question. You lose " + healthLoss + " health.\nYou now have " + health + " health");
      }
      
      choice = decisionEighteen();
      if (choice){
        System.out.println("The McRib spontaneously combusts after seeing the tattoo.");
      }
      if (!choice){
        healthLoss = (int)(Math.random()*5+3);
        health-=healthLoss;
        System.out.println("The McRib gives you dysentery. You lose " + healthLoss + " health.\nYou now have " + health + " health");
      }
      
      choice = decisionNineteen();
      if (choice){
        System.out.println("Your new shirt is now stain-free! Good thing you had your Tide To Go!");
      }
      if (!choice){
        healthLoss = (int)(Math.random()*1);
        health-=healthLoss;
        System.out.println("That's disgusting!. You lose " + healthLoss + " health. It IS just barbecue sauce anyways. \nYou now have " + health + " health.");
      }
      
      choice = decisionTwenty();
      if (choice){
        System.out.println("Congrats you won! Here's your prize:\nhttps://www.youtube.com/watch?v=dQw4w9WgXcQ");
      }
      if (!choice){
        healthLoss = (int)(Math.random()*100);
        health-=healthLoss;
        System.out.println("That was just sad. Did the Patriots not teach you ANYTHING about cheating? You lose ALL of your health. You now have 0 health");
      }
      
      
      
      
      
    }
    if (health <= 0){
      System.out.println("Did you REALLY just lose this game? Just sad....");
    }
  }
}








