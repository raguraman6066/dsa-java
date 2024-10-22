package ArrayList.thread;

import java.util.List;

//extends thread class and override run method
public class Thread1 extends Thread {
    List<Integer> l = null;

    public Thread1(List<Integer> l, String threadName) {
        super(threadName);
        this.l = l;
    }

    @Override
    public void run() {
        l.add(10);
    }
}
