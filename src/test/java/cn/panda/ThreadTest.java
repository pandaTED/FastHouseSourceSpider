package cn.panda;

import cn.panda.ThreadJob.ThreadDemo;
import org.junit.Test;

/**
 * Created by lingj on 2017/2/24 0024.
 */
public class ThreadTest {


    @Test
    public void threadTest(){

        Thread thread1 = new Thread(new ThreadDemo("threadDemo1"));
        Thread thread2 = new Thread(new ThreadDemo("threadDemo2"));
        Thread thread3 = new Thread(new ThreadDemo("threadDemo3"));
        Thread thread4 = new Thread(new ThreadDemo("threadDemo4"));


        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }

}
