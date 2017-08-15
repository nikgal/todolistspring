package by.galov.organizer.beans;

public class UserFile {
    private String fileName;
    private User user;
    private Task task;
    public UserFile() {
        // TODO Auto-generated constructor stub
    }
    public UserFile(User user, Task task){
        this.fileName = "shedule";
        this.user = user;
        this.task = task;
    }
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
    public String toString(){
        return this.fileName + ";" + this.getTask() + ";" + this.getUser();
    }

}
