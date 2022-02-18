package cigma.pfe;
import cigma.pfe.presentation.ClientController;
import cigma.pfe.models.Client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRunner {
        public static void main(String[] args) {
            ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
            ClientController ctrl = (ClientController) context.getBean("idCtrl");
// Test save use case for three clients
            ctrl.save(new Client("OMAR"));
            ctrl.save(new Client("SIHAM"));
            ctrl.save(new Client("AHMED"));
            ctrl.save(new Client("FARAH"));
// Test modify use case for client with id==1
            ctrl.modify(new Client(1,"new Name"));
// Test remove use case for client with id==1
          //  ctrl.removeById(1L);
// Test find use case for client with id==1
            Client found = ctrl.getById(1L);
        }
}




            /*
            ApplicationContext context = new
                    ClassPathXmlApplicationContext("spring.xml");
            ClientController ctrl = (ClientController)
                    context.getBean("idCtrl"); // controller est l'id dans le fichier Spring.xml
            Client clt = new Client("OMAR");
            ctrl.save(clt);
        }
    }*/