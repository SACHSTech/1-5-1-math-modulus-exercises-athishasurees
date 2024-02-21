class Circumference extends ConsoleProgram {

  /**
  * Description
  * @author: A.Surees 
  */
  
  public void run() {
    //variables 
    double dblRadius; 
    double dblCircumference;
    
    //radius 
    dblRadius = readDouble("Enter radius: ");

    //circumference
    dblCircumference = (Math.PI) * 2 * dblRadius;

    //output
    System.out.println ("The circumference of a circle with radius " + dblRadius + " is " + dblCircumference);
    
  }
}