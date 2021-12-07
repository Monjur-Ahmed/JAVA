packagemutithread;

public class A extends Thread{
    @Override
public void run(){
for(inti=0;i<3;i++){
System.out.println(1);
try{
Thread.sleep(500);
}catch(InterruptedException e){
e.printStackTrace();
            }
        }
    }
}

packagemutithread;

public class Test  {
public static void main(String[] args) {
        A obj=new A();
obj.start();
for (inti = 0; i< 3; i++){
System.out.println(2);
try{
Thread.sleep(500);
}catch(InterruptedException e){
e.printStackTrace();
            }
       }
    } 
}
