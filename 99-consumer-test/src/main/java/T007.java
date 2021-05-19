import java.lang.reflect.Executable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author jeremy.li
 * @date 2020/12/10
 * @description
 */
public class T007 {


    public static void main(String[] args) throws ClassNotFoundException, InterruptedException {
        T007 t007 = new T007();
        t007.execute();

    }

    public void execute(){
        for (int i = 0; i <5; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName()+":run.........");
                try {
                    calc();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();

        }
    }

    public void calc() throws InterruptedException {
        List<Dog> dogs = new ArrayList<>();
        Dog dog = null;

        while (true) {
            dog = new Dog();
            dogs.add(dog);
            Thread.sleep(10);
            Runtime r = Runtime.getRuntime();
            long freeMemory = r.freeMemory();

            //System.out.println("freeMemory：" + (freeMemory / 1024));
            if ((freeMemory / 1024) < (1024 * 10)) {
                //System.out.println("freeMemory：" + (freeMemory / 1024) + ",清空list");
                int size = dogs.size();
                for (int i = 0; i < (size / 10); i++) {
                    dogs.remove(i);
                }
                //dogs.remove(dogs);
            }
        }
    }
}
