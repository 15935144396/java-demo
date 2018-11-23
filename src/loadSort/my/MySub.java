package loadSort.my;

/**
 * @author fengww
 * @ClassName MySub
 * @Description TODO
 * @date 2018-11-20 11:11
 */
public class MySub extends MyBase {


    public static String a = getA();

    private String b = getB();

    public MySub() {
        System.out.println("sub 构造方法");
    }


    static {
        System.out.println("sub 静态代码块");
    }

    public static String getA(){
        System.out.println("sub 静态属性");
        return "sub_aa";
    }


    public static void setA(String a) {
        MySub.a = a;
    }

    @Override
    public String getB() {
        System.out.println("sub 非静态");
        return b;
    }

    @Override
    public MySub setB(String b) {
        this.b = "SUB_BB";
        return this;
    }


    {
        System.out.println("SUB 代码块");


    }
}
