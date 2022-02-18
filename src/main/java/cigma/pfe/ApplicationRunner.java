package cigma.pfe;
import cigma.pfe.presentation.ClientController;
import cigma.pfe.models.Client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRunner {
        public static void main(String[] args) {

            ApplicationContext context = new
                    ClassPathXmlApplicationContext("spring.xml");
            ClientController ctrl = (ClientController)
                    context.getBean("idCtrl"); // controller est l'id dans le fichier Spring.xml
            Client clt = new Client("OMAR");
            ctrl.save(clt);
        }
    }