package cigma.pfe.services;

import cigma.pfe.models.Client;
import cigma.pfe.dao.IClientDao;
import cigma.pfe.models.Facture;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor

public class ClientServiceImpl implements IClientService {

        IClientDao clientRepository;

        public void ClientServiceImp (IClientDao clientRepository) {
            this.clientRepository = clientRepository;
        }
        @Override
        public Client save(Client c ){
            return clientRepository.save(c);
        }

        @Override
        public Client modify(Client c){
            return clientRepository.update(c);
        }
        @Override
        public void removeById(long id){
            clientRepository.deleteById(id);
        }
        @Override
        public Client getById(long id){
            return clientRepository.findById(id);
        }
        @Override
        public List<Client> getAll(){
            return clientRepository.findAll();
        }

        // Facture

        @Override
        public Facture create(Facture f){
            return clientRepository.create(f);
        }

        @Override
        public List<Facture> read(){
            return clientRepository.read();
        }
        @Override
        public void delete(long id){
            clientRepository.deleteFactureById(id);
        }

        @Override
        public Facture update(Facture f) {
            return clientRepository.update(f);
        }
    }