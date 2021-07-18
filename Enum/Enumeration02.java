package Enum;

public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season2.SPRING);
        System.out.println(Season2.AUTUMN);
    }
}

//使用枚举类
enum Season2{


//    public static final SEASON SPRING=new SEASON("春天","温暖");
//    public static final SEASON SUMMER=new SEASON("夏天","炎热");
//    public static final SEASON AUTUMN=new SEASON("秋天","凉爽");
//    public static final SEASON WINTER=new SEASON("冬天","寒冷");
    SPRING("春天","温暖"),WINTER("冬天","寒冷"),AUTUMN("秋天","凉爽"),SUMMER("夏天","炎热");

    private String name;
    private String desc;

    private Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "SEASON{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
