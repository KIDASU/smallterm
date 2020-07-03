package discount;

/**
 * @program: smallterm
 * @description:
 * @version：
 * @author: Mr.Wang
 * @create: 2020-06-22 16:32
 **/

public class Son extends Father {
    @Override
    public double cal(double price, double discount) {
        double fin=super.cal(price,discount);
        if(fin>=100) {
            fin = fin - 30;
        }
        return fin;
    }
}
