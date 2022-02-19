package cigma.pfe.models;

import lombok.*;

import javax.persistence.*;
import org.hibernate.annotations.Cascade;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor

public class CarteFidelio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String code;

    @OneToOne()
    @JoinColumn(name = "client_id")
    private Client client ;

    public CarteFidelio() {
    }

    public CarteFidelio(String code) {
        this.code = code; }

}

