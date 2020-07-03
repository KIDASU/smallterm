package day02;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * @program: smallterm
 * @description:
 * @version：
 * @author: Mr.Wang
 * @create: 2020-06-23 09:46
 **/

public abstract class AbstractLock {

    public abstract void lock();
    public abstract void open();

    public AbstractLock() {
        System.out.println("a lock created");
    }

    public static void main(String[] args) {
        FaceLock faceLock = new FaceLock();
        faceLock.lock();
        faceLock.open();
    }
}
