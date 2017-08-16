package by.galov.organizer.dao;

import by.galov.organizer.beans.User;
import by.galov.organizer.interfaces.UserCreator;

public abstract class AdminCreator implements UserCreator {

    public AdminCreator() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public abstract User createUser();

}
