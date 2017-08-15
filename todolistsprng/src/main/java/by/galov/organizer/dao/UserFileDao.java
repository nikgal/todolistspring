package by.galov.organizer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import by.galov.organizer.beans.User;
import by.galov.organizer.beans.UserFile;

public class UserFileDao {
    public static String getFilePath(String filename){
        String path = "D:\\";
        path += filename;
        return path;
    }
    public UserFileDao() {
        // TODO Auto-generated constructor stub
    }
    public static List<UserFile> getUserFiles(User u){
        List<UserFile> files = new ArrayList<UserFile>();
        
        return files;
    }
    public static boolean addUserFile(UserFile uf, int taskid){
        try{  
            
            Connection con=ConnectionProvider.getCon(); 
            
            PreparedStatement ps=con.prepareStatement(
                    "INSERT INTO files (filename, filepath, taskid) "
                    + "VALUES(?,?,?)");  
            ps.setString(1,uf.getFileName());  
            ps.setString(2,getFilePath(uf.getFileName()));  
            ps.setInt(3,taskid);         
            return true;
        }catch(Exception e){
            return false;
        }  
    }
}
