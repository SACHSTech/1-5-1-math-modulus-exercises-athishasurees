class Hours extends ConsoleProgram {

  /**
  * Description
  * @author: A.Surees 
  */
  
  public void run() {
    //variables 
    int intHours; 
    int intDays; 
    int intHourLeftover; 

    //hours 
    intHours = readInt ("Input the number of hours"); 

    //calculate 
    intDays = intHours/24;
    intHourLeftover = intHours%24;

    //output 
    System.out.println(intHours + "hours =" + intDays + "days and" + intHourLeftover + "hours ");

    
  }
}