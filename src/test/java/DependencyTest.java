import client.Client;
import org.junit.Test;
import server.Service;

import static org.junit.Assert.*;

public class DependencyTest {
    @Test
    public void noInjection(){
        Client client = new Client("Ok");
        assertEquals("Hello: Service", client.greet());
    }

    @Test
    public void consInjection(){
        Service service = new Service();
        Client client = new Client(service);
        assertEquals("Hello: Service", client.greet());
    }

    @Test
    public void setterInjection(){
        Service service = new Service();
        Client client = new Client();
        client.setService(service);
        assertEquals("Hello: Service", client.greet());
    }

    @Test
    public void interfaceInjection(){
        Service service = new Service();
        Client client = new Client();
        client.setServiceImpl(service);
        assertEquals("Hello: Service", client.greet());
    }
}
