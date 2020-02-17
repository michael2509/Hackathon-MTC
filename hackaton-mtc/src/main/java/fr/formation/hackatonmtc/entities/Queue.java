package fr.formation.hackatonmtc.entities;

public class Queue {
    private Client[] clients;

    public Queue(Client[] clients) {
        this.clients = clients;
    }

    public Client[] getClients() {
        return clients;
    }

    public void setClients(Client[] clients) {
        this.clients = clients;
    }
}
