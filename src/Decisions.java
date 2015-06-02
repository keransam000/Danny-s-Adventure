import java.util.Scanner;

public class Decisions {
  
  private static String response;
  private static boolean result;
  
  
  public static boolean decisionOne(){
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("1. Step inside the teleporter \nOR\n2. Slowly walk away from the teleporter");
    response = scan.nextLine();
    
    if (response.equals("1")){
      result = true;}
    
    else if (response.equals("2")){
      
      result = false;}
    else {
      System.out.println("Sorry that's not a valid response. Try again.");
      decisionOne();
    }
    return result;
  }
  
  public static boolean decisionTwo(){
    System.out.println("1. Pick up the sword \nOR\n2. Leave it there and explore the area");
    Scanner scan = new Scanner(System.in);
    response = scan.nextLine();
    
    
    if (response.equals("1")){
      result = true;}
    
    else if (response.equals("2")){
      
      result = false;}
    
    else {
      System.out.println("Sorry that's not a valid response. Try again.");
      decisionTwo();
    }
    
    return result;
  }
  
  public static boolean decisionThree(){
    System.out.println("\nYou continue exploring this unfamiliar land.\nAfter a couple minutes, A wolf appears.");
    System.out.println("Do you...\n1. Use a dog whistle.\nOR\n2. Befriend him");
    Scanner scan = new Scanner(System.in);
    response = scan.nextLine();
    
    if (response.equals("2")){
      result = true;}
    
    else if (response.equals("1")){
      
      result = false;}
    
    
    return result;}
  
  
  public static boolean decisionFour(){
    System.out.println("\nMr. Bach sees you with the wolf and asks whether you're bringing it to school for a prank or not.");
    System.out.println("Do you... \n1. Pony clap\nOR\n2. Tell him it's actually a Senior Prank! Ha!");
    Scanner scan = new Scanner(System.in);
    response = scan.nextLine();
    
    if (response.equals("1")){
      result = true;}
    
    else if (response.equals("2")){
      
      result = false;}
    
    else {
      System.out.println("Sorry that's not a valid response. Try again.");
      decisionFour();}
    
    return result;
    
  }  
  
  
  public static boolean decisionFive(){
    System.out.println("\nPuff the Dragon appears and seems strangely feral. \nThere is white foam forming around his mouth, and there are new cuts and bruises all over his 50 foot body.\nDo you...");
    System.out.println("1. Asks if he lives by sea\nOR\n2. Stab him");
    Scanner scan = new Scanner(System.in);
    response = scan.nextLine();
    
    if (response.equals("2")){
      result = true;}
    
    else if (response.equals("1")){
      
      result = false;}
    
    else {
      System.out.println("Sorry that's not a valid response. Try again.");
      decisionFive();
    }
    return result;
  }
  public static boolean decisionSix(){
    System.out.println("\nAs you walk away from the dragon you stumble across a tiny purple plant that glows. \nYour knowledge from Stillwater Area High School, given to you by Mr. Axt, " + "makes you believe that it could be heavily irradiated and you don’t have enough time to use Pythagoras to physics the plant.");
    System.out.println("Do you...\n1. Gather the plant\nOR\n2. KILL IT WITH FIRE!!!");
    Scanner scan = new Scanner(System.in);
    response = scan.nextLine();
    
    if (response.equals("1")){
      result = true;}
    
    else if (response.equals("2")){
      
      result = true;}
    
    else {
      System.out.println("Sorry that's not a valid response. Try again.");
      decisionSix();
    }
    return result;
    
  }
  
  public static boolean decisionSeven(){
    System.out.println("\nYou continue your travel for about 30 minutes.\nAn old man stumbles out of a bush nearby and says that he is the the most powerful wizard in the realm.\nHe offers you his powers to help you on your travel, but for a price...");
    System.out.println("Do you...\n1. Tug on his beard\nOR\n2. Challenge to a battle");
    Scanner scan = new Scanner(System.in);
    response = scan.nextLine();
    
    if (response.equals("1")){
      result = true;}
    
    else if (response.equals("2")){
      result = false;}
    
    else {
      System.out.println("Sorry that's not a valid response. Try again.");
      decisionSeven();
    }
    return result;}
  
  
  public static boolean decisionEight() {
    System.out.println("\nTom Brady approaches you with his glorious hair. He challenges you to a battle.");
    System.out.println("Do you... \n1. Take his Super Bowl rings and claim it’s a gift\nOR\n2. Deflate his footballs");
    Scanner scan = new Scanner(System.in);
    response = scan.nextLine();
    
    if (response.equals("2")) {
      result = true;
    } else if (response.equals("1")) {
      result = false;
    } else {
      System.out.println("Sorry that's not a valid response. Try again.");
      decisionEight();
      
    }
    
    return result;
  }
  public static boolean decisionNine(){
    System.out.println("\nYou encounter a Ghoul. That's it, just a ghoul. Not much special about it. Does everything have to be special for you?!?");
    System.out.println("Do you...\n1. Punch it\nOR\n2. Sing Sarah McLachlan");
    Scanner scan = new Scanner(System.in);
    response = scan.nextLine();
    
    if (response.equals("2")){
      result = true;}
    
    else if (response.equals("1")){
      
      result = false;}
    
    else {
      System.out.println("Sorry that's not a valid response. Try again.");
      decisionNine();
      
    }
    return result;
  }
  public static boolean decisionTen(){
    System.out.println("\nAdam Sandler walks up to you and starts talking to in one of the weird voices he uses in most of his movies. \nYou are very annoyed and mad at him because you saw The Waterboy in theaters and it was a bad movie.");
    System.out.println("Do you...\n1. Tell him to make better movies\nOR\n2. Tell him to make better moovies");
    Scanner scan = new Scanner(System.in);
    response = scan.nextLine();
    
    if (response.equals("1")){
      result = true;}
    
    else if (response.equals("2")){
      
      result = false;}
    
    else {
      System.out.println("Sorry that's not a valid response. Try again.");
      decisionTen();
    }
    return result;
  }
  public static boolean decisionEleven(){
    System.out.println("\nA very handsome man named Danny Leo walks in front of you. \nYou are stunned by his beauty.");
    System.out.println("Do you...\n1. Kiss him\nOR\n2. Punch him");
    Scanner scan = new Scanner(System.in);
    response = scan.nextLine();
    
    if (response.equals("1")){
      result = true;}
    
    else if (response.equals("2")){
      
      result = false;}
    
    else {
      System.out.println("Sorry that's not a valid response. Try again.");
      decisionEleven();
    }
    return result;
  }
  
  public static boolean decisionTwelve(){
    System.out.println("\nYou come across some garbage on the ground. But whats this?! Its a bag of Pizza Rolls. What do you do?");
    System.out.println("Do you...\n1. Microwave them\nOR\n2. Leave them there. They could be poisoned.");
    Scanner scan = new Scanner(System.in);
    response = scan.nextLine();
    
    if (response.equals("1")){
      result = true;}
    
    else if (response.equals("2")){
      
      result = false;}
    
    else {
      System.out.println("Sorry that's not a valid response. Try again.");
      decisionTwelve();
    }
    return result;
  }
  
  
  public static boolean decisionThirteen(){
    System.out.println("\nSteve the Pirate appears! He challenges you to fisticuffs and dodgeball.");
    System.out.println("Do you...\n1. Play dodgeball\nOR\n2. Steal his booty");
    Scanner scan = new Scanner(System.in);
    response = scan.nextLine();
    
    if (response.equals("1")){
      result = true;}
    
    else if (response.equals("2")){
      
      result = false;}
    
    else {
      System.out.println("Sorry that's not a valid response. Try again.");
      decisionThirteen();
    }
    return result;
  }
  
  public static boolean decisionFourteen(){
    System.out.println("\nYou encounter a talking dog. Hey, what else is new?!?");
    System.out.println("Do you...\n1. Ask him why he is not a cat\nOR\n2. Pet him");
    Scanner scan = new Scanner(System.in);
    response = scan.nextLine();
    
    if (response.equals("2")){
      result = true;}
    
    else if (response.equals("1")){
      
      result = false;}
    
    else {
      System.out.println("Sorry that's not a valid response. Try again.");
      decisionFourteen();
    }
    return result;
  }
  
  public static boolean decisionFifteen(){
    System.out.println("\nYou encounter a man from France. One might even go as far as to call him a Frenchman.");
    System.out.println("Do you...\n1. Tell him to move somewhere better in Europe\nOR\n2. Challenge him to a beatboxing battle.");
    Scanner scan = new Scanner(System.in);
    response = scan.nextLine();
    
    if (response.equals("2")){
      result = true;}
    
    else if (response.equals("1")){
      
      result = false;}
    
    else {
      System.out.println("Sorry that's not a valid response. Try again.");
      decisionFifteen();
    }
    return result;
  }
  
  
  public static boolean decisionSixteen(){
    System.out.println("\nYou've been journeying for quite a while. \nActually it has only been about 4 hours, but it's getting dark.");
    System.out.println("Would you like to...\n1. Take a rest and hopefully not fall asleep for too long\nOR\n2. Keep going. There's hopefully plenty to see still.");
    Scanner scan = new Scanner(System.in);
    response = scan.nextLine();
    
    if (response.equals("1")){
      result = true;}
    
    else if (response.equals("2")){
      
      result = false;}
    
    else {
      System.out.println("Sorry that's not a valid response. Try again.");
      decisionSixteen();
    }
    return result;
  }
  
  public static boolean decisionSeventeen(){
    System.out.println("\nYou wake up at the DMZ (no, not the DMV). There are many strange people including the Asian woman from Grey’s Anatomy.");
    System.out.println("Do you...\n1. Ask Dr. Yang is she knows what’s going on\nOR\n2. Jump into her arms and cry");
    Scanner scan = new Scanner(System.in);
    response = scan.nextLine();
    
    if (response.equals("2")){
      result = true;}
    
    else if (response.equals("1")){
      
      result = false;}
    
    else {
      System.out.println("Sorry that's not a valid response. Try again.");
      decisionSeventeen();
    }
    return result;
  }
  
  public static boolean decisionEighteen(){
    System.out.println("\nAfter finding your way out of the DMZ, you walk into the local McDonalds because you are feeling healthy and you want to get rid of that awful feeling. \nLittle do you know that that specific McDonalds found nuclear waste in the food just recently. \nYou encounter a McRib that has come to life. Suddenly, you remember that your weakness is imitation meat.");
    System.out.println("Would you like to...\n1. Show it your Burger King tattoo that you got in college\nOR\n2. Eat your way through the battle");
    Scanner scan = new Scanner(System.in);
    response = scan.nextLine();
    
    if (response.equals("1")){
      result = true;}
    
    else if (response.equals("2")){
      
      result = false;}
    
    else {
      System.out.println("Sorry that's not a valid response. Try again.");
      decisionEighteen();
    }
    return result;
  }
  
  public static boolean decisionNineteen(){
    System.out.println("\nYou notice some cheap barbecue sauce on your shirt");
    System.out.println("Do you...\n1. Use Tide To Go: The portable, instant stain remover that helps eliminate many fresh food and drink stains on the spot. \n(Remember kids, keep a Tide To Go in your briefcase, car, purse and kitchen — anywhere you might encounter stains)\nOR\n2. Lick it off your shirt. It's just a small stain");
    Scanner scan = new Scanner(System.in);
    response = scan.nextLine();
    
    if (response.equals("1")){
      result = true;}
    
    else if (response.equals("2")){
      
      result = false;}
    
    else {
      System.out.println("Sorry that's not a valid response. Try again.");
      decisionNineteen();
    }
    return result;
  }
  
  public static boolean decisionTwenty(){
    System.out.println("\nThe game master appears and offers a way to beat the game in just one move.");
    System.out.println("Would you like to...\n1. Go with it. If only you had been offered this before you got emotionally invested in this dumb game...\nOR\n2. Decide you don't want to cheat your way through life");
    Scanner scan = new Scanner(System.in);
    response = scan.nextLine();
    
    if (response.equals("1")){
      result = true;}
    
    else if (response.equals("2")){
      
      result = false;}
    
    else {
      System.out.println("Sorry that's not a valid response. Try again.");
      decisionTwenty();
    }
    return result;
  }
  
  
  
  
  
  
}
