class MyThread extends Thread{
    MyThread(String name){
        super(name);
    }

//    public void run(){
//        for (int i = 0; i<10; i++){
//            System.out.println("Hello, This is thread");
//        }
//    }
}
public class ThreadConstructor {
    public static void main(String[] args) {
        MyThread th = new MyThread("Sample Name");
//        th.start();
        System.out.println(th.getName());
        System.out.println(th.getId());
    }
}
