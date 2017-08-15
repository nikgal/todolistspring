package by.galov.organizer.dao;

import java.sql.*;  
import static by.galov.organizer.dao.Provider.*;  
  
public class ConnectionProvider {  
private static Connection con=null;  
    static{  
        try{  
            Class.forName(DRIVER);  
            con=DriverManager.getConnection(CONNECTION_URL,USERNAME,PASSWORD);  
        }catch(Exception e){
            e.printStackTrace();
        }  
    }  
  
public static Connection getCon(){  
    return con;  
}  
  
}