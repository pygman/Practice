package runnable;

/**
 * Created by pygmalion on 2014/11/13.
 */
public class TestRunnable {
    private static int a=0;
    public static void main(String[] args) {
//        new Thread(()-> {
//            System.out.println("1");
//        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<30;i++){
                    System.out.println(++TestRunnable.a);
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<30;i++){
                    System.out.println(--TestRunnable.a);
                }
            }
        }).start();
    }
}
