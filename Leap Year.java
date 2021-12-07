package first.java.programming;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int y;
        System.out.print("Enter any year: ");
        y=input.nextInt();
        if((y%400==0) || (y%100!=0 && y%4==0 ))
        {
            System.out.println("Leap Year");      
        }
        else{
            System.out.println("Not LeapYear");
        }
    }
}
