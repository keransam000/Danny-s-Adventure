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
    System.out.println("You continue exploring this unfamiliar land.\nAfter a couple minutes, A wolf appears.");

    if (response.equals("1")){
      result = true;}

    else if (response.equals("2")){

      result = false;}



    return result;}
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
  
  
 