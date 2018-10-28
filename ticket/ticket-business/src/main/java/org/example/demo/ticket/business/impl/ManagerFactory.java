package org.example.demo.ticket.business.impl;

import org.example.demo.ticket.business.contract.manager.ProjetManager;
import org.example.demo.ticket.business.contract.manager.TicketManager;

public class ManagerFactory {

    private ProjetManager projetManager;
    private TicketManager ticketManager;

    public ProjetManager getProjetManager(){
        return this.projetManager;
    }

    public void setProjetManager(ProjetManager projetManager) {
        this.projetManager = projetManager;
    }


    public TicketManager getTicketManager(){
        return this.ticketManager;
    }

    public void setTicketManager(TicketManager ticketManager) {
        this.ticketManager = ticketManager;
    }
}
