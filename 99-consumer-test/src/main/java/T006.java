import java.util.ArrayList;
import java.util.List;

/**
 * @author jeremy.li
 * @date 2020/12/10
 * @description
 */
public class T006 {


    public static void main(String[] args) throws ClassNotFoundException, InterruptedException {
        T006 t006 = new T006();
        t006.calc();
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

