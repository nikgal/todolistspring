package by.galov.organizer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import by.galov.organizer.beans.User;  
public class LoginDao {  
  
    public static boolean validate(User u){  
    boolean status=false;  
        try{  
            Connection con=ConnectionProvider.getCon();            
            PreparedStatement ps=con.prepareStatement(  
                "SELECT*FROM users WHERE email=? AND pass=?");  
            ps.setString(1,u.getUemail());  
            ps.setString(2, u.getUpass());  
            ResultSet rs=ps.executeQuery();  
            status=rs.next();  
                      
        }catch(Exception e){}  
      
        return status;   
    }  
}