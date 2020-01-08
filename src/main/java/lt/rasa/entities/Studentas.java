package lt.rasa.entities;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Studentai")

public class Studentas {

    @Id
    @Column(name = "id", columnDefinition = "INT(8)")
    private Integer id;

    @Column(name = "vardas")
    private String vardas;

    @Column(name = "pavarde")
    private String pavarde;

    @Column(name = "el_pastas")
    private String elPastas;

    @OneToMany(mappedBy = "studentas", fetch = FetchType.EAGER)
    private List<Pazymys> pazymys;

    public Integer getId() {
        return id;
    }

    public String getVardas() {
        return vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public String getElPastas() {
        return elPastas;
    }

    public List<Pazymys> getPazymys() {
        return pazymys;
    }

    public void setPazymys(List<Pazymys> pazymys) {
        this.pazymys = pazymys;
    }
}
