package by.galov.organizer.beans;


public class User {  
private String uname,upass,uemail;  
  
public User(){
    this.uname = "Ivan";
}
public String getUname() {  
    return uname;  
}  
  
public void setUname(String uname) {  
    this.uname = uname;  
}  
  
public String getUpass() {  
    return upass;  
}  
  
public void setUpass(String upass) {  
    this.upass = upass;  
}  
  
public String getUemail() {  
    return uemail;  
}  
  
public void setUemail(String uemail) {  
    this.uemail = uemail;  
}  
public String toString(){
    return this.uname;
}
}  