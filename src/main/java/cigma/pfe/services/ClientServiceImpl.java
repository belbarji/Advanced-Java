package cigma.pfe.services;

import cigma.pfe.dao.ClientDaoImpl;
import cigma.pfe.models.Client;
import cigma.pfe.dao.IClientDao;

public class ClientServiceImpl implements IClientService {
        IClientDao clientRepository;// = new ClientDaoImpl();
    public ClientServiceImpl(IClientDao clientRepository) {
        System.out.println("Call ClientServiceImpl with ClientRepository param....");
        this.clientRepository = clientRepository;
    }
        @Override
        public Client save(Client c) {
            System.out.println("Service Layer : ClientServiceImpl Level... ");
            return clientRepository.save(c);
        }
        public ClientServiceImpl (){
        System.out.println("Call ClientServiceImpl ....");
}
    }
