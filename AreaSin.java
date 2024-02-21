class AreaSin extends ConsoleProgram {

  /**
  * Description
  * @author: A. Surees 
  */
  
  public void run() {
    // declare variables 
    double dblSide1;
    double dblSide2;
    double dblAngle; 
    double dblArea;

    //sides and angles 
    dblSide1 = readDouble("How long is the first side of the triangle ");
    dblSide2 = readDouble ("How long is the second side of the triangle ");
    dblAngle = readInt("What is the angle of the contained angle of the triangle ");

    //calculating the numbers 
    dblAngle = Math.toRadians(dblAngle); 
    dblArea = (dblSide1* dblSide2 * Math.sin (dblAngle)) /2; 

    //show area 
    System.out.println("The area of your triangle is " + dblArea);
  }
}