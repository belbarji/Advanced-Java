package cigma.pfe.services;
import cigma.pfe.models.Client;
import cigma.pfe.models.Facture;

import java.util.List;

public interface IClientService {
    Client save(Client c) ;
    Client modify(Client c);
    void removeById(long id);
    Client getById(long id);

    // Facture

    Facture create(Facture f);
    List<Facture> read();
    void delete(long id);
    Facture update(Facture f);
    List<Client> getAll();
}