package org.example.demo.ticket.webapp.rest.resource;

import org.example.demo.ticket.business.impl.ManagerFactory;

public abstract class AbstractResource {

    public static ManagerFactory sManagerFactory;

    protected static ManagerFactory getManagerFactory(){
        return sManagerFactory;
    }

    public static void setManagerFactory(ManagerFactory managerFactory) {
        sManagerFactory = managerFactory;
    }
}
