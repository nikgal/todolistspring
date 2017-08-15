package by.galov.organizer.dao;

import java.sql.*;

import by.galov.organizer.beans.User;  
  
public class RegisterDao {  
  
public static int register(User u){  
    int status=0;  
        try{  
            Connection con=ConnectionProvider.getCon();  
            PreparedStatement ps=con.prepareStatement("INSERT INTO users (name, email, pass) VALUES(?,?,?)");  
            ps.setString(1,u.getUname());  
            ps.setString(2,u.getUemail());  
            ps.setString(3,u.getUpass());  
                          
            status=ps.executeUpdate();  
        }catch(Exception e){
            
        }  
          
    return status;  
    }
   
  
}  