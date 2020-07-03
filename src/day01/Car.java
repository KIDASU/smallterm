/**
 * @program: smallterm
 * @description:
 * @version：
 * @author: Mr.Wang
 * @create: 2020-06-22 10:20
 **/

public class Car {

    public static void main(String[] args) {
        Car one=new Car(0);
        Car two=new Car(1);
    }
    static {
        System.out.println("A Car Class");
    }
    {
        System.out.println("A Car Object");
    }
    private Integer id;
    private String master;
    private String number;

    public Car(){
        super();
        System.out.println("A car created");
    }

    public Car(Integer id) {
        super();
        this.id = id;
    }

    public Car(Integer id, String master, String number) {
        super();
        this.id = id;
        this.master = master;
        this.number = number;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
