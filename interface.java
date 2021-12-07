packagepkginterface;

interface A {
final static float pi = 3.1416F;
int a=5;
public void area();
public void primeter();


}
packagepkginterface;


public class B implements A{
public void area(){
float c;
        c=pi*a*a;
System.out.println("Arae="+c);
    }
public void primeter()
    {
float d;
        d=2*pi*a;
System.out.println("Perimeter="+d);
    }

}

packagepkginterface;

class Test {
public static void main(String[] args){
        B obj=new B();
obj.area();
obj.primeter();
    }

}
