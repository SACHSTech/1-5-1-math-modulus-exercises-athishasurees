
class Km_to_Miles extends ConsoleProgram {

  /**
  * Description
  * @author: A.Surees 
  */
  
  public void run() {
    
    // inputs 
    double kilometers = readDouble ("Kilometers?"); 
    
    //calculation 
    double miles = kilometers * 0.621371;

    //print miles 
    System.out.println(miles);
  }
}
