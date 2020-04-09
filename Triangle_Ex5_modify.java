import java.util.Scanner;
// The Triangle class stores and manipulates data for a //triangle.
 public class Triangle_Ex5_modify {

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
     public double getArea(double height, double base) {
          return 0.5 * height * base; }
          
}


class Triangle_Extended {
   public static void main(String[] arg) {
   Scanner sc = new Scanner (System.in);
   
   double height, base, area;
   
   System.out.print("Tinggi piramid? ");
      height = sc.nextDouble();
      
   System.out.print("Panjang tapak piramid? ");
      base = sc.nextDouble();
      
   Triangle_Ex5_modify ac = new Triangle_Ex5_modify();
   System.out.printf("Keluasan piramid adalah...%.2f", ac.getArea(height, base));
   
   }
}
