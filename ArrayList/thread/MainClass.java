package ArrayList.thread;

import java.util.List;
import java.util.Vector;
import java.util.ArrayList;

public class MainClass {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        Thread1 t1 = new Thread1(l, "t1");
        Thread2 t2 = new Thread2(l, "t2");
        t1.run();
        t2.run();
    }
}
