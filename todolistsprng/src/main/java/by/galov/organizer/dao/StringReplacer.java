package by.galov.organizer.dao;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class StringReplacer implements MethodReplacer {

    public StringReplacer() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public Object reimplement(Object arg0, Method arg1, Object[] arg2) throws Throwable {
        System.out.println("new");
        return null;
    }

}
