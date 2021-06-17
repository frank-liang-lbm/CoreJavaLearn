package inheritance;

public class ManagetTest {
    public static void main(String[] args) {
        var boss = new Manager("Cral Cracker",80000,1987,12,15);
        boss.setBonus(5000);

        var staff=new Employee[3];

        staff[0]=boss;
        staff[1]=new Employee("Harry Hacker",50000,1989,10,1);
        staff[2]=new Employee("Tommy Tester",40000,1990,3,15);
    //e可以引用Manager对象也可以引用Employee对象
        for (Employee e : staff) {
            System.out.println("name="+e.getName()+",salary="+e.getSalary());
        }
    }
}
