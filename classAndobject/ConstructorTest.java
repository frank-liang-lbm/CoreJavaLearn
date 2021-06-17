package classAndobject;

import java.util.Random;

public class ConstructorTest {
    public static void main(String[] args) {
        var staff = new Employee1[3];

        staff[0]=new Employee1("Harry",40000);
        staff[1]=new Employee1(60000);
        staff[2]=new Employee1();

        for (Employee1 e : staff) {
            System.out.println("name="+e.getName()+",id="+e.getId()+",salary="+e.getSalary());
        }
    }

}

class Employee1
{
    private static int nextId;

    private int id;
    private String name="";
    private double salary;

    static//静态初始化块
    {
        var generator=new Random();
        nextId= generator.nextInt(10000);
    }
    //对象初始化块
    {
        id=nextId;
        nextId++;
    }

    public Employee1(String n,double s)
    {
        name = n;
        salary = s;
    }

    public Employee1(double s)
    {
        this("Employee1#"+nextId,s);//调用另一个构造器
    }

    public Employee1()
    {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
