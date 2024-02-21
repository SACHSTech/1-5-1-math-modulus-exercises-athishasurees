class Power extends ConsoleProgram {

  /**
  * Description
  * @author: A.Surees
  */
  
  public void run() {
    
   //variables 
   double dblBase; 
   double dblExponent; 

   //number 
   dblBase = readInt("What is your base"); 
   dblExponent = readInt("What is your exponent");

   //print out number 
   System.out.println("Your number is:" + Math.pow(dblBase, dblExponent));
  }
}