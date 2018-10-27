package org.example.demo.ticket.webapp.listener;

import org.example.demo.ticket.business.ManagerFactory;
import org.example.demo.ticket.business.manager.ProjetManager;
import org.example.demo.ticket.business.manager.TicketManager;
import org.example.demo.ticket.webapp.rest.resource.AbstractResource;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DependencyInjectionListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
         // Création de l'instance de Manager Factory
        ManagerFactory managerFactory = new ManagerFactory();

        managerFactory.setProjetManager(new ProjetManager());
        managerFactory.setTicketManager(new TicketManager());

        // Injection de l'instance de ManagerFactory dans la classe AbstractResource
        AbstractResource.setManagerFactory(managerFactory);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
