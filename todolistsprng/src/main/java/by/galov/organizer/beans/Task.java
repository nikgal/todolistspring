package by.galov.organizer.beans;

import java.sql.Date;

public class Task {
    private String name;
    private String comment;
    private Date date;
    private TaskStatus status;

    public Task() {
        this.name = "dance";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public String toString(){
        return this.name;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }
    

}
