public class HelloWorld extends Thread{

public void run(){  
   
System.out.println("running thread name is:"+Thread.currentThread().getName());  
   System.out.println("running thread priority is:"+Thread.currentThread().getPriority());    
  }  

     public static void main(String []args){
        System.out.println("Hello World");
        HelloWorld m1=new HelloWorld();  
  	HelloWorld m2=new HelloWorld();  
 	m1.setPriority(Thread.MIN_PRIORITY);  
  	m1.yield();
  	m2.setPriority(Thread.MAX_PRIORITY);  
  	m1.start();  
  	m2.start();  
     }
}
