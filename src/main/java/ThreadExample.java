class MyThread extends Thread{
    MyThread(String name)
    {
        super(name);
    }
    public void run()
    {
        System.out.println("Thread Name="+Thread.currentThread().getName());
    }
}

public class ThreadExample {

    public static void main(String as[]){

        MyThread t2 =new MyThread("Thread 2");
        t2.start();
        System.out.println("Id : "+t2.getId());
        System.out.println("Priority : "+t2.getPriority());
        System.out.println("State : "+t2.getState());
        System.out.println("Is Daemon : "+t2.isDaemon());
        System.out.println("Is Alive : "+t2.isAlive());
        System.out.println("Stack Trace : "+t2.getStackTrace());
        System.out.println("Thread Name="+Thread.currentThread().getName());
    }
}
