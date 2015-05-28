import java.util.Scanner;

public class Decisions {
  
  private static String response;
  private static boolean result;
  
  Scanner scan = new Scanner (System.in);
  
  public static boolean decisionOne(){
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("1.Step inside the teleporter \n2. Slowly walk away from the teleporter");
    response = scan.nextLine();
    
    if (response.equals("1")){
      System.out.println("Voooooosh. You have been teleported to the Kim-Jong Un-ited States of America");
      result = true;}
    else if (response.equals("2")){
      System.out.println("Why the hell would you do that? 4 Ninjas were standing behind you. \nYou received 59 shurikens to the jugular.");
      result = false;}
    else System.out.println("Sorry that's not a valid response. Try again.");
    
    return result;
  }
  
  public static boolean decisionTwo(){
  return result;
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
  
  
 