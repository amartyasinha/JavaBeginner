class ThreadSample implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i<100; i++) {
            System.out.println("Hello Runnable");
        }
    }
}

class ThreadAnother implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i<150; i++){
            System.out.println("Hola Runnable Again");
        }
    }
}
public class ThreadRunnable {
    public static void main(String[] args) {
        ThreadSample ts = new ThreadSample();

        ThreadAnother ta = new ThreadAnother();

        new Thread(ts).start();
        new Thread(ta).start();
    }
}