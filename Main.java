import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    while(true) {
      System.out.print("Enter the number of seconds to convert: ");
      Scanner in = new Scanner (System.in);
      
      int secondsent = in.nextInt();
      System.out.println();
      System.out.println(secondsent + " seconds equals: ");
      int days, hours, minutes, seconds;
      
      //number of seconds in each:
      days = 86400;
      hours = 3600;
      minutes = 60; 

      int dayst = secondsent / days;
      int hourst = (secondsent % days) / hours;
      int minutest = ((secondsent % days) % hours) / minutes;
      int secondst = (((secondsent % days) % hours) % minutes) % 60;

      System.out.println(dayst + "\t\tDays"); //printouts
      System.out.println(hourst + "\t\tHours");
      System.out.println(minutest + "\t\tMinutes");
      System.out.println(secondst + "\t\tSeconds\n");
    }
  }
}