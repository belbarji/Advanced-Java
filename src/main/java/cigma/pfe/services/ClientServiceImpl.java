package cigma.pfe.services;

import cigma.pfe.models.Client;
import cigma.pfe.dao.IClientDao;
import lombok.AllArgsConstructor;

@AllArgsConstructor

public class ClientServiceImpl implements IClientService {
    private IClientDao dao;
    public void setDao(IClientDao dao) {
        this.dao = dao;
    }
    @Override
    public Client save(Client c) {
        return dao.save(c);
    }
    @Override
    public Client modify(Client c) {
        return dao.update(c);
    }
    @Override
    public void removeById(long id) {
        dao.deleteById(id);
    }
    @Override
    public Client getById(long id) {
        return dao.findById(id);
    }
}




  /*  private IClientDao dao;
    public void setDao(IClientDao dao) {
        this.dao = dao;
    }
    @Override
    public Client save(Client c) {
        return dao.save(c);
    }
    @Override
    public Client modify(Client c) {
        return dao.update(c);
    }
}*/










       /* IClientDao clientRepository;// = new ClientDaoImpl();
    public ClientServiceImpl(IClientDao clientRepository) {
        System.out.println("Call ClientServiceImpl with ClientRepository param....");
        this.clientRepository = clientRepository;
    }
        @Override
        public boolean save(Client c) {
            System.out.println("Service Layer : ClientServiceImpl Level... ");
            return clientRepository.save(c);
        }
        public ClientServiceImpl (){
        System.out.println("Call ClientServiceImpl ....");
}
    }*/
