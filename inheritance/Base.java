package inheritance;

public class Base {
    public int n1 =100;
    protected int n2=200;
    int n3=300;
    private int n4=400;

    public Base(){
        System.out.println("调用了父类的无参构造器");
    }
}
