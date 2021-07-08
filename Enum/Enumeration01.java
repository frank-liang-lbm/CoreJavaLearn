package Enum;

public class Enumeration01 {
    public static void main(String[] args) {
        System.out.println(SEASON.AUTUMN);

    }
}

//自定义枚举类
class SEASON{
    private String name;
    private String desc;

    public static final SEASON SPRING=new SEASON("春天","温暖");
    public static final SEASON SUMMER=new SEASON("夏天","炎热");
    public static final SEASON AUTUMN=new SEASON("秋天","凉爽");
    public static final SEASON WINTER=new SEASON("冬天","寒冷");


    private SEASON(String name, String desc) {
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
