package Innerclass;

public class InnerClassExercise01 {
    public static void main(String[] args) {

        //匿名内部类当做实参传递
        f1(new IA() {
            @Override
            public void show() {
                System.out.println("这是一副名画");
            }
        });
        //传统方法
        f1(new picture());

    }

    //静态方法，形参是接口类型,代表实参为一个实现了接口的类
    public static void f1(IA ia){
        ia.show();
    }
}
//接口
interface IA{
    void show();
}
//类，实现接口
class picture implements IA{
    @Override
    public void show(){
        System.out.println("这真的是一副名画");
    }
}