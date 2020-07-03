package day02.homework;

import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 * @program: smallterm
 * @description:
 * @version：
 * @author: Mr.Wang
 * @create: 2020-06-23 20:05
 **/

public class DiscountFactory {
    public IDiscount getDiscount(String choose){
        IDiscount iDiscount = null ;
        switch (choose) {
            case "1":
                iDiscount = new DiscountOne();
                break;
            case "2":
                iDiscount = new DiscountTwo();
                break;
            case "3":
                iDiscount = new DiscountThree();
                break;
            case "4":
                iDiscount = new DiscountFour();
                break;
            default:
                System.out.println("您输入有误");
                break;
        }
        return iDiscount;
    }
}
