package cigma.pfe.dao;

import cigma.pfe.models.Client;
import cigma.pfe.models.Facture;

import java.util.List;

public interface IClientDao {
    Client save(Client c);
    Client update(Client c);
    void deleteById(long id);
    Client findById(long idClient);

    // Facture

    List<Client> findAll();
    Facture create(Facture f);
    Facture update(Facture f);
    List<Facture> read();
    void deleteFactureById(long id);

}