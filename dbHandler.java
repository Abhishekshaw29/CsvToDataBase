import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
public class dbHandler {
    public static Connection con = null;
    public static Properties props = new Properties();
    public Connection getConnection() throws ClassNotFoundException , SQLException{
        try {
            FileInputStream fis = new FileInputStream("db.Properties");
            props.load(fis);
            
            //load the driver class
            Class.forName(props.getProperty("Db_driver_class"));
            //create connection now 
            String url = props.getProperty("Db_Url");
            String user = props.getProperty("Db_username");
            String password = props.getProperty("Db_password");
        
            con = DriverManager.getConnection(url, user, password);

        } catch (IOException e) {
            e.printStackTrace();
            //TODO: handle exception
        }

        
        return con;
    }
}
