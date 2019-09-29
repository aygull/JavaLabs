import java.util.Scanner;

public class Main {

    public static void main(String []args){
//        Circle circ = new Circle(40, 50, 80);
//        Rectangle rec = new Rectangle(400,50,90,100);
//        MyList List2 = new MyList();
//        List2.add(circ);
//        List2.add(rec);
//        List2.printAll();
//        MyThread potok = new MyThread();
////        potok.run();
        ThreadList myL = new ThreadList();
        MyThread mThread = new MyThread(10, "a");	//Создание потока
        myL.add(mThread);
        while (true){
            System.out.println("Введите команду: " + "\n" + "1 - добавить счётчик" + "\n" + "2 - показать список счётчиков" +
                    "\n" + "3 - выбрать счётчик по индексу");
            Scanner in2 = new Scanner(System.in);
            int symb =  in2.nextInt();
            if (symb  == 1){
                System.out.println("Введите название счётчика:");
                String name = in2.next();
                System.out.println("Введите значение счётчика:");
                int value = in2.nextInt();
                myL.add(new MyThread(value, name));

            }

            if (symb == 2){
                myL.printAll();
            }
            if (symb == 3){
                System.out.println("Введите индекс счётчика:");
                int index = in2.nextInt();
                System.out.println("Введите команду: " + "\n" + "1 -  увеличивать счётчик" + "\n" + "2 - уменьшать счётчик" +
                        "\n" + "3 - остановить счётчик");
                int command = in2.nextInt();
                myL.myList.get(index).run(command);
            }
        }
    }
}
