package cn.panda.ThreadJob;

/**
 * Created by lingj on 2017/2/24 0024.
 */
public class ThreadDemo implements Runnable {

    private Thread t;
    private String threadName;

    int y = 0;

    public ThreadDemo(String string) {
        this.threadName = string;
    }

    public void run() {

        try {

            while (true) {

                if(y<=1000){
                    break;
                }
                System.out.println("threadName------>" + threadName + "-" + y);
                Thread.sleep(500);
                y++;

            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

}
