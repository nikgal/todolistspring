package by.galov.organizer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import by.galov.organizer.beans.Task;

public class ShowTasksDao {

    public ShowTasksDao() {
        // TODO Auto-generated constructor stub
    }
    
    public static List<Task> getUserTasks(String email){
        List<Task> tasks= new ArrayList<Task>();
        try{  
            Connection con=ConnectionProvider.getCon();            
            PreparedStatement ps = con.prepareStatement(  
                "SELECT*FROM tasks WHERE userid=(SELECT userid FROM users WHERE email=?);");  
            ps.setString(1,email);  
            ResultSet rs = ps.executeQuery();
           
            while(rs.next()){
                Task task = new Task();
                task.setName(rs.getString("name"));
                task.setComment(rs.getString("comment"));
                task.setDate(rs.getDate("date"));
                tasks.add(task);
            }
        }catch(Exception e){
            e.printStackTrace();
        }  
        return tasks;
        
    }
    public static int save(Task t){
        return 1;
    }

}
