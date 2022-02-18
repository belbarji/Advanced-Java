package cigma.pfe.presentation;

import cigma.pfe.models.Client;
import cigma.pfe.services.IClientService;
import lombok.AllArgsConstructor;

@AllArgsConstructor

public class ClientController {

    private IClientService service;

    public void setService(IClientService service) {
        this.service = service;
    }

    public void save(Client c) {
        service.save(c);
    }

    public void modify(Client c) {
        service.modify(c);
    }

    public void removeById(long id) {
        service.removeById(id);
    }
    public Client getById(long id){
        return service.getById(id);
    }
}




    /*private IClientService service ;
    public void setService(IClientService service) {
        this.service = service;
    }
    public void save(Client c){
        service.save(c);
    }
    public void modify(Client c){
        service.modify(c);
    }
}*/


   /* IClientService clientService;// = new ClientServiceImpl();

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

}*/



