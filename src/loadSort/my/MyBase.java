package loadSort.my;

/**
 * @author fengww
 * @ClassName MyBase
 * @Description TODO
 * @date 2018-11-20 11:07
 */
public class MyBase {


    private String b = "b";

    public String getB() {
        return b;
    }

    public MyBase setB(String b) {
        this.b = b;
        return this;
    }

    public static void setA(String a) {
        MyBase.a = a;
    }

    public MyBase() {

        System.out.println("base 构造方法");
    }

    public static  String a = getA();


    static {
        System.out.println("base 静态代码块");
    }


    private static String getA() {

        System.out.println("Base 静态属性");
        return "aa";
    }

    {
        System.out.println("BASE 代码块");


    }
}
