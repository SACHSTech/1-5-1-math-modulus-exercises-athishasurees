class FtoC extends ConsoleProgram {

  /**
  * Description
  * @author: A.Surees 
  */
  
  public void run() {
    
    //variables 
    int intFahrenheit;
    int intCelsius;

    //get Farenheit 
    intFahrenheit = readInt("How many degrees in Farenheit");

    //conversion 
    intCelsius = (((intFahrenheit - 32) * 5)/9);

    //output the celsious 
    System.out.println(intFahrenheit + " degrees farenheit is " + intCelsius + " degrees in Celsius");
    
  }
}