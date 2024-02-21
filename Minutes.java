class Minutes extends ConsoleProgram {

  /**
  * Description
  * @author: A.Surees 

  */
  
  public void run() {
    
    //variables 
    int intMinutes;
    int intDays;
    int intHourLeftover; 
    int intMinutesLeftover;

    //hours 
    intMinutes = readInt("Put the number of minutes"); 

    //calculate 
    intDays = intMinutes/1440; 
   
    intHourLeftover = intDays/24;

    intMinutesLeftover = intHourLeftover/60; 

    
    //output answers 
    System.out.println(intMinutes +"minutes =" + intDays + "days" + intHourLeftover + "hour, and" + intMinutesLeftover + "minutes");
  }
}