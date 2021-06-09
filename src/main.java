import java.sql.SQLException;

public class main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DbHelper obj=new DbHelper();
        System.out.println(obj);
        obj.Stinsert("saddam",5,"saddam844420@gmail.com", (double) 8444876239l,"154558fff");




    }
}
