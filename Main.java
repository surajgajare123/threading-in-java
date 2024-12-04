class MyThread extends Thread{
    public void run(){
        int i = 1;
        while(i<100){
        System.out.println("hello i am thread1 i am cooking......");
        i++;
        }
    }
}
class MyThread1 extends Thread{
     public void run(){
        int i = 1;
        while(i<100){
        System.out.println("hello i am thread2 i am chating.........");
        i++;
        }
    }
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		MyThread t1 = new MyThread();
		MyThread1 t2 = new MyThread1();
		t1.start();
		t2.start();
	}
}
