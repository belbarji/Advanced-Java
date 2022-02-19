package cigma.pfe;
import cigma.pfe.dao.ClientDaoImpl;
import cigma.pfe.models.CarteFidelio;
import cigma.pfe.models.Facture;
import cigma.pfe.models.Promotion;
import cigma.pfe.presentation.ClientController;
import cigma.pfe.models.Client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

public class ApplicationRunner {
        public static void main(String[] args) {
            ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
            ClientController ctrl = (ClientController) context.getBean("idCtrl");
         /*
            Client client = new Client("Omar");
            List<Facture> factures = Arrays.asList(new Facture(1500.0,"facture1"),new Facture(2000.0,"facture2"));
            client.setFactures(factures);
            ctrl.save(client);
         */

         /*
            Client client = new Client("OMAR");
            List<Promotion> promotions=Arrays.asList(new Promotion("remise 10%"),new Promotion("solde 40%"));
            client.setPromotions(promotions);
            ctrl.save(client);
         */

          /*
            Client client = new Client("OMAR");
            CarteFidelio carteFidelio = new CarteFidelio("A29930489");
            carteFidelio.setClient(client);
            client.setCarteFidelio(carteFidelio);
            ctrl.save(client);
         */

                    // (ce cas pratique sera noté sur 5 points dans la note des TPs)

        /*
            Facture facture = new Facture(1500.0,"facture1") ;
            List<Produit> produits = Arrays.asList(new Produit("Produi1",299.00),new Produit("Produit2",199.00));
            facture.setProduits(produits);
            ctrl.create(facture);
        */

        /*
            Client client = new Client("OMAR");
            Adresse adresse = new Adresse("Hay EL MASSIRA 2","CASABLANCA","Morocco");
            adresse.setClient(client);
            client.setAdresse(adresse);
            ctrl.save(client);
        */
                }
            }