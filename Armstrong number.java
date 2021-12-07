Package armstrong;
importjava.util.Scanner;
public class Armstrong {
public static void main(String[] args) {
intnum,temp,rem,sum=0;
        Scanner in=new Scanner(System.in);
System.out.println("Enter number to check Armstrong");
num=in.nextInt();	
temp=num;
while(temp!=0){
rem=temp%10;
sum=sum+(rem*rem*rem);
temp=temp/10;
        }
if(num==sum)
System.out.println("The number is Armstrong");
else
System.out.println("This number is not Armstrong");
         }
}

