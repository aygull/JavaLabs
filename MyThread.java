import java.util.Timer;
import java.util.TimerTask;


public class MyThread extends Thread {
    protected   int value;
    protected  String str;
    private Timer timer = new Timer();
    public MyThread(int value, String str){
        super(str);
        this.value = value;
        this.str = str;
    }

    public void displayInfo(){
        System.out.println(str +":" + value);
    }

//    @Override
    public void run(int command) {
        // 1 - увеличить, 2 - уменьшить, 3 - остановить

        if (command == 1){
            timer.cancel();
            timer = new Timer();
            timer.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                   value++;
                }
            }, 1000, 1000);
         }
         if (command == 2){
             timer.cancel();
             timer = new Timer();
             timer.scheduleAtFixedRate(new TimerTask() {
                 @Override
                 public void run() {
                     value--;
                 }
             }, 1000, 1000);

         }
         if (command == 3){
             timer.cancel();
         }

//        System.out.println(name + value);
//        StringBuffer str = new StringBuffer();
//        StringBuilder str2 = new  StringBuilder();
//        for(int i =0; i<=5;i++){
//            str.append(i);
//            str2.append(i);
//            System.out.println(str);
//            System.out.println(str2);
//        }
    }
}
