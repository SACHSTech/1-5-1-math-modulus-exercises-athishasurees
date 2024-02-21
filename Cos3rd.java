class Cos3rd extends ConsoleProgram {

  /**
  * Description
  * @author: A.Surees
  */
  
  public void run() {
    // variables 
    double dblSide1; 
    double dblSide2; 
    double dblAngle; 
    double dblSide3; 

    //get sides 
    dblSide1 = readDouble("How long is the first side of the triangle"); 
    dblSide2 = readDouble("How long is the second side of the triangle"); 
    dblAngle = readInt("What is the angle og yhr contained angle of the triangle");

    //calculate the numbers 
    dblAngle = Math.toRadians(dblAngle);
    dblSide3 = Math.sqrt((dblSide1 * dblSide1) + (dblSide2 * dblSide2) -2* dblSide1 * dblSide2 * Math.cos(dblAngle));

    //say length of the side 
    System.out.println("The angle of the missing side is" + dblSide3);
    
    
  }
}