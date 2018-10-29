package org.example.demo.ticket.webapp.rest.resource;

import org.example.demo.ticket.business.impl.ManagerFactoryImpl;

public abstract class AbstractResource {

    public static ManagerFactoryImpl sManagerFactoryImpl;

    protected static ManagerFactoryImpl getManagerFactory(){
        return sManagerFactoryImpl;
    }

    public static void setManagerFactory(ManagerFactoryImpl managerFactoryImpl) {
        sManagerFactoryImpl = managerFactoryImpl;
    }
}
