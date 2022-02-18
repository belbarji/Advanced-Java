package cigma.pfe.presentation;

import cigma.pfe.models.Client;
import cigma.pfe.services.IClientService;

public class ClientController {
    IClientService clientService;// = new ClientServiceImpl();

    public ClientController(IClientService clientService) {
        System.out.println("Call ClientController with clientService param....");
        this.clientService = clientService;
    }

    public boolean save(Client c ){
        System.out.println("Client Controller level...");
        return clientService.save(c);
    }
    public ClientController() {
        System.out.println("Call ClientController ....");
    }

}



