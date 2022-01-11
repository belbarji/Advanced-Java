package cigma.pfe;
import cigma.pfe.controllers.ClientController;
import cigma.pfe.models.Client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MonApplication {
    public static void main(String[] args) {
       /* ClientController ctrl1 //= new ClientController();
        Client client =new Client(1L,"testing");
        ctrl1.save(client);
    }*/
        ApplicationContext context = new
                ClassPathXmlApplicationContext("spring.xml");
        ClientController ctrl = (ClientController)
                context.getBean("controller"); // controller est l'id dans le fichier Spring.xml
        Client client = new Client(1,"ALAMI");
        ctrl.save(client);

         }

}