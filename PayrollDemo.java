import java.util.Scanner;

// class Employee
class Employee {
   Scanner enter = new Scanner(System.in);

   double ID, grosspay, Statetax, Fedtax;
   
   // method to enter employee ID, gross pay, state tax & federal tax
   public void input() {
      System.out.print("Enter your employee ID number: ");
         ID = enter.nextDouble();
         
      System.out.print("Enter your Gross Pay: ");
         grosspay = enter.nextDouble();
                  
      System.out.print("Enter your State Tax: ");
         Statetax = enter.nextDouble();
         
      System.out.print("Enter your Federal Tax: ");
         Fedtax = enter.nextDouble();  }
}
         
// class Payroll
class Payroll {

   double grosspay, Statetax, Fedtax, net_pay;
   
   public Payroll(double grosspay, double Statetax, double Fedtax) {
      this.grosspay = grosspay;
      this.Statetax = Statetax;
      this.Fedtax = Fedtax; }
   
   // method to calculate the employee's net pay
   public double calculateNetPay() {
      return net_pay = grosspay - Statetax - Fedtax; }
   
   // method to print or display the net pay value
   public double printOutput() {
      return calculateNetPay();
   }

}

// the class with the main method
public class PayrollDemo {
   public static void main(String[] arg) {

   Employee MA = new Employee();
      MA.input();
      
   Payroll DS = new Payroll(MA.grosspay, MA.Statetax, MA.Fedtax);
      System.out.printf("Net pay is : %.2f", DS.printOutput());
      
   }
}    
         
    

