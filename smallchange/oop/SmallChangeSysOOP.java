package smallchange.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 该类完成零钱通的各个功能
 * 使用OOP
 * 将每个功能对应一个方法
 */
public class SmallChangeSysOOP {

    //属性

        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";
        String details = "----------------零钱通明细---------------";

        double money = 0;
        double balance = 0;
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        String note = "";


        //显示零钱通菜单
    public void mainMenu(){
        do {
            System.out.println("\n===========零钱通菜单(OOP)=============");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退    出");

            System.out.print("请选择（1-4）：");
            key = scanner.next();

            switch (key) {
                case "1":
                    this.details();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("选择有误，请重新选择");

            }
        } while (loop);
    }

    //完成零钱通明细
    public void details(){
        System.out.println(details);
    }

    //完成收益入账
    public void income(){
        System.out.println("收益入账金额");
        money = scanner.nextDouble();
        /*重点：找出不正确的条件*/
        if (money <= 0) {
            System.out.println("收益入帐金额 需要 大于 0");
            return;//推出方法
        }
        balance += money;
        date = new Date();
        details += "\n收益入帐\t" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    //完成消费
    public void pay(){
        System.out.println("消费项目");
        note = scanner.next();
        System.out.println("消费金额");
        money = scanner.nextDouble();
        if (money <= 0 || money > balance) {
            System.out.println("你的消费金额 应该在 0-"+balance);
            return;
        }
        balance -= money;
        date = new Date();
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    //退出
    public void exit(){
        String choice = "";
        while (true) {
            System.out.println("你确定要退出吗？y/n");
            choice = scanner.next();
            if ("y".equals(choice) || "n".equals(choice)) {
                break;
            }
        }

        if ("y".equals(choice)) {
            loop = false;
        }

    }
}
