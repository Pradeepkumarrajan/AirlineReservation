package airlines;

import java.sql.Connection;
import java.sql.DriverManager;


public class MyConnection {
    
    public static Connection getconnection(){
        Connection c = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost/airlines","root","java");
        }
     catch(Exception e){
            System.out.println(e);
           
        }
        return c;

    }
    }
