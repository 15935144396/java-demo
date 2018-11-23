package loadSort.my;

/**
 * @author fengww
 * @ClassName MySubAll
 * @Description TODO
 * @date 2018-11-20 11:14
 */
public class MySubAll extends MySub{


    public static  String a = getA();

    private String b = getB();
    public MySubAll() {
        System.out.println("ALL 构造方法");
    }

    public static String getA() {
        return a;
    }

    public static void setA(String a) {
        MySubAll.a = "ALL_A";
        System.out.println("ALL 静态属性");
    }

    static {
        System.out.println("all 静态代码块");
    }


    public static void main(String[] args) {
        MySubAll mySubAll = new MySubAll();
        System.out.println(MySubAll.a);
    }


    @Override
    public String getB() {
        return b;
    }

    @Override
    public MySubAll setB(String b) {
        System.out.println("ALL 设置非静态属性");
        this.b = b;
        return this;
    }


    {
        System.out.println("ALL 代码块");


    }
}
