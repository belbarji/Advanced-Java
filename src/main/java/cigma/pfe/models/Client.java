package cigma.pfe.models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Entity(name = "Tclients")
public class Client extends Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    private String name;
    @OneToMany(cascade = CascadeType.PERSIST,mappedBy = "client")
    private List<Facture> factures;

    @ManyToMany(cascade = {CascadeType.PERSIST})
    @JoinTable(name = "my_join_table_client_promotion",joinColumns = @JoinColumn(name = "client_fk",referencedColumnName = "id" ),
            inverseJoinColumns = @JoinColumn(name="promotion_fk",referencedColumnName="id"))
    private List<Promotion> promotions;

    @OneToOne(cascade = {CascadeType.PERSIST},mappedBy = "client")
    private  CarteFidelio carteFidelio;

    @OneToOne(cascade = {CascadeType.PERSIST},mappedBy = "client")
    private  Adresse adresse;

    public Client(String name) {
        this.name = name; }
    public Client(){}
}