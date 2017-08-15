package by.galov.organizer.dao;

public interface Provider {  
    String DRIVER="com.mysql.jdbc.Driver";  
    String CONNECTION_URL=
            "jdbc:mysql://localhost:3306/organizer"
            + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&"
            + "useLegacyDatetimeCode=false&serverTimezone=UTC";  
    String USERNAME="root";  
    String PASSWORD="123";  
  
}  