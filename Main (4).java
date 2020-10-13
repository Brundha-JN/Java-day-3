
import java.util.Scanner;
public class company {



  public static void main(String[] args) {
   String name;
   int date,month,year,salary,age,annual,tax;
   Scanner s = new Scanner(System.in);
   System.out.println("Enter the name");
   name=s.nextLine();
   System.out.println("Enter the birth date ");
   date=s.nextInt();
   System.out.println("Enter the birth month ");
   month=s.nextInt();
   System.out.println("Enter the birth year ");
   year=s.nextInt();
   System.out.println("Enter the monthly salary ");
   salary=s.nextInt();
   if(year>2020 || month>12 ||date>31){
     System.out.println("Enter the details correctly");
   }
   else{
   age=2020-year;
   annual= salary*12;
   System.out.println("Name:-"+name);
   System.out.println("Age:-"+age);
   System.out.println("Annual Salary:-"+annual);
   
   if(annual>=500000){
     tax=20;
     System.out.println("Tax:-"+tax+"%");
   }
   else if(annual>=400000 && annual<500000){
     tax=15;
     System.out.println("Tax:-"+tax+"%");
   }
   else if(annual>=300000 && annual<400000){
     tax=10;
     System.out.println("Tax:-"+tax+"%");
   }
   else if(annual>=200000 && annual<300000){
     tax=5;
     System.out.println("Tax:-"+tax+"%");
   }
   else {
     tax=0;
     System.out.println("Tax:-"+tax+"%");
     
   }
   
   }
   
   
  }

}