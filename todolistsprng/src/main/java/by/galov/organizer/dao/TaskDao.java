package by.galov.organizer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import by.galov.organizer.beans.Task;

public class TaskDao {

    public TaskDao() {
        // TODO Auto-generated constructor stub
    }
    public static int getTaskId(Task t){
        int id = 1;
        try{  
            Connection con=ConnectionProvider.getCon();  
            PreparedStatement ps=con.prepareStatement(
                    "SELECT id FROM tasks WHERE name=? AND comment=?");  
            ps.setString(1,t.getName());  
            ps.setString(2,t.getComment());  
            ResultSet rs = ps.executeQuery();
            rs.getInt("taskid");
        }catch(Exception e){
            
        }  
        return id;
    }

}
