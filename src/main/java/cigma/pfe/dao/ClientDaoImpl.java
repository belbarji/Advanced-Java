package cigma.pfe.dao;
import cigma.pfe.models.Client;
public class ClientDaoImpl implements IClientDao {
    @Override
    public Client save(Client c) {
        System.out.println("DAO Layer : ClientRepositoryImpl Level");
        return null;
    }
    public ClientDaoImpl() {
        System.out.println("Call ClientRepositoryImpl ....");
    }
}