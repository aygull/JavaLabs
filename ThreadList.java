import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ThreadList {
    public List<MyThread> myList;

    public ThreadList(List<MyThread> cl) {
        myList = new ArrayList<>();
        myList.addAll(cl);
    }

    public ThreadList() {
        myList = new ArrayList<>();
    }

    public void add(MyThread c) {
        myList.add(c);
//        c.run();
    }

    public void printAll() {
        myList.forEach((el) -> {
            el.displayInfo(); });

    }
}