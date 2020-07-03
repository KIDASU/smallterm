package day02;

/**
 * @program: smallterm
 * @description:
 * @version：
 * @author: Mr.Wang
 * @create: 2020-06-23 09:49
 **/

public class FaceLock extends AbstractLock {
    @Override
    public void lock() {
        System.out.println("使用人脸上锁");
    }

    @Override
    public void open() {
        System.out.println("使用人脸解锁");
    }
}
