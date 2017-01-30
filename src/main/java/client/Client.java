package client;

import server.InterfaceService;
import server.Service;

public class Client implements InterfaceService {
    private Service service;

    public Client(String message) {
        service = new Service();
        System.out.println("No injection service: " + message );

    }

    //Constructor injection
    public Client(Service service) {
        this.service = service;
        System.out.println("Constructior service");

    }

    //Setter injection
    public void setService(Service service) {
        this.service = service;
        System.out.println("Setter service");
    }

    //Interface injection
    public void setServiceImpl(Service service) {
        this.service = service;
        System.out.println("Interface service");
    }

    public String greet(){
        return "Hello: " + service.name();
    }
}
