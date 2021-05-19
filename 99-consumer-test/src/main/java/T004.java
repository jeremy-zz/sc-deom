import java.util.ArrayList;
import java.util.List;

/**
 * @author jeremy.li
 * @date 2020/12/10
 * @description
 */
public class T004 {

    private Object object = new Object();

    public static void main(String[] args) throws ClassNotFoundException, InterruptedException {


        T004 t004 = new T004();
        t004.execute();
    }

    public void execute() {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                synchronized (object) {
                    System.out.println(Thread.currentThread().getName());
                    try {
                        calc();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }

    }

    public void calc() throws InterruptedException {
        List<Object> objectList = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            byte[] ss = new byte[2 * 1024];
            objectList.add(ss);
            Thread.sleep(1000);
        }
    }
}
