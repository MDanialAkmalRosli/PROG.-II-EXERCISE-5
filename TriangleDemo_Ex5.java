import java.util.Scanner;
public class TriangleDemo_Ex5
{
   public static void main(String[] args)
   {
      //create a Scanner object
      Scanner sc = new Scanner(System.in); 

      // Create a Triangle object.
      Triangle_Ex5 segitiga = new Triangle_Ex5 ();

      // Prompt user to input value for height and base                 
      System.out.print("Enter the height: ");
		   double height = sc.nextDouble();
	   System.out.print("Enter the base: ");
		   double base = sc.nextDouble();

      //Set the height and base (use mutator) 
      segitiga.set(height, base);	

      // Display the height, base and area (use accessor)
      System.out.println("The pyramid's height is "
                         + segitiga.getHeight());
      System.out.println("The pyramid's base is "
                         + segitiga.getBase());
      
     System.out.println("The pyramid's area is "
                         + segitiga.getArea());
      
   }
}


// The Triangle class stores and manipulates data for a //triangle.
class Triangle_Ex5 {

     private double height;
     private double base, area;

     // The setHeight method accepts an argument which is    
     //stored in the height field.
     public void setHeight(double len) {
          height = len; }

     // The setBase method accepts an argument which is 
     //stored in the base field.     
     public void setBase(double b)  {
          base = b;  }

     //The set method accepts two arguments which are 
     //stored in the height and base fields.  
     public void set(double len, double b) {
          height = len;
          base = b;  }

    // The getHeight method returns the value stored in the 
    //  height field.
     public double getHeight() {
          return height; }

     // The getBase method returns the value stored in the   
     //base field
     public double getBase() {
          return base;  }

     // The getArea method returns the value of area
    // with formula : 0.5 * height * base
     public double getArea() {
          return 0.5 * height * base; }
          
}


