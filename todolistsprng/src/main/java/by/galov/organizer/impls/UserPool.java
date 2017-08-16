package by.galov.organizer.impls;

import java.util.Collection;

import by.galov.organizer.beans.User;

public class UserPool implements by.galov.organizer.interfaces.UserPool {
    private Collection<User> userCollection;
    
    public UserPool() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public Collection<User> getUserCollection() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
       for(User u : userCollection){
           sb.append(u);
       }
        return sb.toString();
    }
    

    public void setUserCollection(Collection<User> userCollection) {
        this.userCollection = userCollection;
    }

}
