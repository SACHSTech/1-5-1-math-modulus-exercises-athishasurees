class Rads extends ConsoleProgram {

  /**
  * Description
  * @author: A.Surees
  */
  
  public void run() {
    
    // variables 
    double dblRadians; 
    double dblDegrees; 

    //conversion
    dblDegrees = readDouble ("Input a measurment for degrees"); 
    dblRadians = Math.toRadians(dblDegrees);

    //output radians 
    System.out.print("A degree value of" + dblDegrees + "is equal to a radians value of" + dblRadians);
    
  }
}