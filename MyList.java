import java.util.List;
import java.util.ArrayList;

public class MyList {
    private List<Circle> myList;

    public MyList(List<Circle> cl) {
        myList = new ArrayList<>();
        myList.addAll(cl);
    }
    public MyList() {
        myList = new ArrayList<>();
    }

    public void add(Circle c){
        myList.add(c);

    }

    public void printAll(){
        myList.forEach((el) -> {
            el.displayInfo();
            System.out.print(el.perimeter());
        });

    }
}