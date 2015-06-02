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
      
      System.out.println("\nGood Morning! You sure slept a long time! \nYou're going downstairs from your bedroom and you find a teleporter! What do you do?");
      
      choice = decisionOne();
      
      if (!choice){
        System.out.println("\nWhy the hell would you do that? 4 Ninjas were standing behind you. \nYou received 59 shurikens to the jugular.\n");
        System.out.println("You can have another chance");
        choice = decisionOne();
        while (!choice)
          choice = decisionOne();
      }
      
      if (choice){
        System.out.println("\nVoooooosh. You have been teleported to the Kim-Jong Un-ited States of America\n");
        System.out.println("\nYou see a sword on the ground. It looks rather heavy, but you think you can lift it. \nWould you like to...");
        
        choice = decisionTwo();
      }
      if (choice) {
        System.out.println("\nThe sword seems like a good fit. Maybe you will be able to use it at some point...");
      }
      if (!choice){
        System.out.println("\nA stampede of elephants just trampled you. You were defenseless. You picked up the sword afterwards.");
        healthLoss = (int)(Math.random()*7+1);
        health -= healthLoss;
        System.out.println("You lose " + healthLoss + " health.\nYou now have " + health + " health");
      }
      
      choice = decisionThree();
      if (choice){
        System.out.println("\nThe friendly wolf gave you a cookie. \nTo your surprise, he stood up on 2 legs, shook your hand, and walked away.");
      }
      if (!choice){
        System.out.println("\nYou idiot, you don't have a dog whistle.\nThe wolf mauled your face.");
        healthLoss = (int)(Math.random()*5+1);
        health -= healthLoss;
        System.out.println("You lose " + healthLoss + " health.\nYou now have " + health + " health");
      }
      
      choice = decisionFour();
      if (choice){
        System.out.println("\nMr. Bach commends your trust in the system and gives you a high five.");
      }
      if (!choice){
        healthLoss = (int)(Math.random()*3+1);
        health-=healthLoss;
        System.out.println("\nNow you can't graduate.");
        System.out.println("You lose " + healthLoss + " health due to emotional pain.\nYou now have " + health + " health");
      }
      
      choice = decisionFive();
      if (choice){
        System.out.println("\nYou killed Puff. Man, dragons are so easy to kill");
      }
      if (!choice){
        healthLoss = (int)(Math.random()*20+10);
        health-=healthLoss;
        System.out.println("\n\"HOW DARE YOU?!?\" Puff blows fire on you. \nYou lose " + healthLoss + " health from 3.14th degree burns.\nYou now have " + health + " health");
      }
      
      
      if (health <= 0)
        break;
      choice = decisionSix();
      System.out.println("\nIt doesn't matter what you do it's just a plant. Did you really think anything bad would happen?");
      
      if (health <= 0)
        break;
      choice = decisionSeven();
      if (choice){
        System.out.println("\nGood work! You know a true wizard's weakness");
      }
      if (!choice){
        healthLoss = (int)(Math.random()*11+5);
        health-=healthLoss;
        System.out.println("\nHe's a wizard, you fool. Your sword does not even get close to him.\nYou lose " + healthLoss + " health.\nYou now have " + health + " health");
      }
      
      if (health <= 0)
        break;
      choice = decisionEight();
      if (choice){
        System.out.println("\nSir Brady says \"No, please don't do that, that would be cheating. I respect the game too much to cheat.\"\nHe hands you a $100 bill and quietly says \"No, seriously, I REALLY hate cheating.");
      }
      if (!choice){
        healthLoss = (int)(Math.random()*8+1);
        health-=healthLoss;
        System.out.println("\nThe KGB runs in and steals the ring before you can get your hands on it. They knock you over in the process.\nYou lose " + healthLoss + " health.\nYou now have " + health + " health");
      }
      
      if (health <= 0)
        break;
      choice = decisionNine();
      if (choice){
        System.out.println("\nYour beautiful voice put him to sleep.\nThose animal shelter commercials sure paid off!");
      }
      if (!choice){
        healthLoss = (int)(Math.random()*3+1);
        health-=healthLoss;
        System.out.println("\nYou can't punch ghouls. You fall flat on your face.\nYou lose " + healthLoss + " health.\nYou now have " + health + " health");
      }
      
      if (health <= 0)
        break;
      choice = decisionTen();
      if (choice){
        System.out.println("\nHooray! The world has less terrible movies");
      }
      if (!choice){
        System.out.println("\nMoovies isn't a word. I'm amazed you've made it this far in life.");
      }
      
      if (health <= 0)
        break;
      choice = decisionEleven();
      if (choice){
        System.out.println("\nTurns out it was just a mirror. There's only one person that could be that gorgeous anyways.");
      }
      if (!choice){
        healthLoss = (int)(Math.random()*5+1);
        health-=healthLoss;
        System.out.println("\nOW! It's a mirror. You lose " + healthLoss + " health from your bleeding hand.\nYou now have " + health + " health");
      }
      
      if (health <= 0)
        break;
      choice = decisionTwelve();
      if (choice){
        int healthGain = (int)(Math.random()*10+1);
        health+=healthGain;
        System.out.println("\nMan those were delicious! Your stomach sure is satisfied now! \nYou gain " + healthGain + " health. You now have " + health + " health.");
      }
      if (!choice){
        healthLoss = (int)(Math.random()*10+1);
        health-=healthLoss;
        System.out.println("\nAs you walk away, a giant blueberry falls on top of you. Take that health freaks!\nYou lose " + healthLoss + " health.\nYou now have " + health + " health");
      }
      
      if (health <= 0)
        break;
      choice = decisionThirteen();
      if (choice){
        System.out.println("\nMan, you really enjoy dodgeball! Patches would be proud.");
      }
      if (!choice){
        healthLoss = (int)(Math.random()*5+1);
        health-=healthLoss;
        System.out.println("\nSteve isn't an actual pirate!\nHe puts you in an armbar for trying to steal his wallet.\nYou lose " + healthLoss + " health.\nYou now have " + health + " health");
      }
      
      if (health <= 0)
        break;
      choice = decisionFourteen();
      if (choice){
        System.out.println("\nThe dog wags his tail and also turns into a Chinese man for no reason. \nThis IS just a game, remember. Try not to think too much about it.\nThis is as good of a time as any to give the warning that the creators of this game are not respnsible of any nightmares experienced by the player.");
      }
      if (!choice){
        healthLoss = (int)(Math.random()*7+3);
        health-=healthLoss;
        System.out.println("\nThe dog(?) transforms into a cat and beats you up. You lose " + healthLoss + " health.\nYou now have " + health + " health");
      }
      
      if (health <= 0)
        break;
      choice = decisionFifteen();
      if (choice){
        System.out.println("\nYour mad beatz win and you are declared the hero of France");
      }
      if (!choice){
        healthLoss = (int)(Math.random()*3+1);
        health-=healthLoss;
        System.out.println("\nThe Frenchman gets mad, grows croissants for hands and beats you up. You lose " + healthLoss + " health.\nYou now have " + health + " health");
      }
      
      if (health <= 0)
        break;
      choice = decisionSixteen();
      if (choice){
        int healthGain = (int)(Math.random()*11+1);
        health+=healthGain;
        System.out.println("\nYou dream that your family has all turned into salmon. You happen to love salmon so you eat your family.\nThe salmon replenishes " + healthGain + " health. You now have " + health + " health.");
      }
      if (!choice){
        healthLoss = (int)(Math.random()*5+5);
        int dayNumbers = (int)(Math.random()*3+1);
        health-=(healthLoss*dayNumbers);
        System.out.println("\nYou keep walking and fall down a well, passing out when you hit the bottom. You are passed out for " + dayNumbers + " days. For each day you're passed out, you lose " + healthLoss + " health.\nYou now have " + health + " health");
      }
      
      if (health <= 0)
        break;
      choice = decisionSeventeen();
      if (choice){
        System.out.println("\nDr. Yang is very kind to you and tells you how to get out.");
      }
      if (!choice){
        healthLoss = (int)(Math.random()*5+1);
        health-=healthLoss;
        System.out.println("\nDr. Yang slaps you across the face and scolds you for asking such a personal question. You lose " + healthLoss + " health.\nYou now have " + health + " health");
      }
      
      if (health <= 0)
        break;
      choice = decisionEighteen();
      if (choice){
        System.out.println("\nThe McRib spontaneously combusts after seeing the tattoo.");
      }
      if (!choice){
        healthLoss = (int)(Math.random()*5+3);
        health-=healthLoss;
        System.out.println("\nThe McRib gives you dysentery. You lose " + healthLoss + " health.\nYou now have " + health + " health");
      }
      
      if (health <= 0)
        break;
      choice = decisionNineteen();
      if (choice){
        System.out.println("\nYour new shirt is now stain-free! Good thing you had your Tide To Go!");
      }
      if (!choice){
        healthLoss = (int)(Math.random()*1);
        health-=healthLoss;
        System.out.println("\nThat's disgusting!. You lose " + healthLoss + " health. It IS just barbecue sauce anyways. \nYou now have " + health + " health.");
      }
      
      if (health <= 0)
        break;
      choice = decisionTwenty();
      if (choice){
        System.out.println("\nCongrats you won! Here's your prize:\nhttps://www.youtube.com/watch?v=dQw4w9WgXcQ");
      }
      if (!choice){;
        health-=healthLoss;
        System.out.println("In the room is " + name + ". They kill you with a light saber.");
        System.out.println("That was just sad. Did the Patriots not teach you ANYTHING about cheating?\n You lose ALL of your health. \nYou now have 0 health, loser");
        
      }
      break;
      
      
      
      
    }
    if (health <= 0){
      System.out.println("\nDid you REALLY just lose this game? Just sad....");
    }
  }
}








