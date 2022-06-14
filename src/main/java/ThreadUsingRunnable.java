public class ThreadUsingRunnable implements Runnable {

    public void run() {
        for (int i=0; i<5; i++)
            System.out.println(i+" Hello");
    }

    public static void main(String as[]){
        Thread t =new Thread(new ThreadUsingRunnable());
        t.start();
        System.out.println("Thread Name="+Thread.currentThread().getName());
        System.out.println("Id : "+t.getId());
        t.setPriority(10);
        System.out.println(t.getName()+"  "+t.getPriority()+"  "+t.getState());
    }
}
