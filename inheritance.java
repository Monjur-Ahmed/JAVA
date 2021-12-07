package Inheritance;
 class Calculator {
   int z;
public void addition(int x, int y) {
z=x+y;
System.out.println("Summation: "+z);
   }
 }
public class Cal extends Calculator{
   public void subtraction (int x, int y) {
z=x-y;
System.out.println("Substraction: "+z);
   }
public static void main(String args[]) {
      int a=20, b=10;
      Cal add=new Cal();
add.addition(a, b);
add.subtraction(a, b);
   }
}
