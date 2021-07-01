package interfaces;

public class OracleDB implements DBinterface{
    @Override
    public void connect(){
        System.out.println("连接Oracle");
    }
    @Override
    public void shutdown(){
        System.out.println("关闭Oracle");
    }
}
