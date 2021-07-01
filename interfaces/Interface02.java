package interfaces;

public class Interface02 {
    public static void main(String[] args) {
        var mysqlDB = new MysqlDB();
        OracleDB oracleDB = new OracleDB();
        Interface02 interface02 = new Interface02();
        interface02.t(mysqlDB);
        System.out.println("================");
        interface02.t(oracleDB);
    }
    public void t(DBinterface db){
        db.connect();
        db.shutdown();
    }
}
