import java.util.Scanner;

public class Decisions {
  
  private static String response;
  private static boolean result;
  
  Scanner scan = new Scanner (System.in);
  
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
    System.out.println("You continue exploring this unfamiliar land.\nAfter a couple minutes, A wolf appears. \n1.Use a dog whistle.\nOR\n2.Befriend him");

    if (response.equals("1")){
      result = true;}

    else if (response.equals("2")){

      result = false;}


    return result;}

  
  public static boolean decisionFour(){
    System.out.println("1. Pony clap\nOR\n2.Senior Prank! Ha!");

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
    System.out.println("1. Asks if he lives by sea\nOR\n2. Stab him");

    if (response.equals("2")){
      result = true;}

    else if (response.equals("1")){

      result = false;}

else {
      System.out.println("Sorry that's not a valid response. Try again.");
      decisionFive();
      
      return result;
}

}
    public static boolean decisionSix(){
    System.out.println("1. Gather\nOR\n2. Set it on fire");

    if (response.equals("1")){
      result = true;}

    else if (response.equals("2")){

      result = true;}

else {
      System.out.println("Sorry that's not a valid response. Try again.");
      decisionSix();
      
      return result;
}
}
  
   public static boolean decisionSeven(){
    System.out.println("1. Tug on his beard\nOR\n2. Challenge to a battle");

    if (response.equals("1")){
      result = true;}

    else if (response.equals("2")){

      result = false;}

else {
      System.out.println("Sorry that's not a valid response. Try again.");
      decisionSeven();
      
      return result;
}
}
    public static boolean decisionEight(){
    System.out.println("1. Take his Super Bowl rings and claim it�s a gift\nOR\n2. Deflate his footballs");

    if (response.equals("2")){
      result = true;}

    else if (response.equals("1")){

      result = false;}

else {
      System.out.println("Sorry that's not a valid response. Try again.");
      decisionEight();
      
      return result;
}
}
     public static boolean decisionNine(){
    System.out.println("1. Punch it\nOR\n2. Sing Sarah McLachlan");

    if (response.equals("2")){
      result = true;}

    else if (response.equals("1")){

      result = false;}

else {
      System.out.println("Sorry that's not a valid response. Try again.");
      decisionNine();
      
      return result;
}
}
      public static boolean decisionTen(){
    System.out.println("1. Tell him to make better movies\nOR\n2. Tell him to make better moovies");

    if (response.equals("1")){
      result = true;}

    else if (response.equals("2")){

      result = false;}

else {
      System.out.println("Sorry that's not a valid response. Try again.");
      decisionTen();
      
      return result;
}
}
       public static boolean decisionEleven(){
    System.out.println("1. Kiss him\nOR\n2. Punch him");

    if (response.equals("1")){
      result = true;}

    else if (response.equals("2")){

      result = false;}

else {
      System.out.println("Sorry that's not a valid response. Try again.");
      decisionEleven();
      
      return result;
}
}
   }
   