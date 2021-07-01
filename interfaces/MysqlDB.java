package interfaces;

public class MysqlDB implements DBinterface{
    @Override
    public void connect() {
        System.out.println("连接mysql");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭mysql");
    }//alt+enter快速输入重写方法


}
