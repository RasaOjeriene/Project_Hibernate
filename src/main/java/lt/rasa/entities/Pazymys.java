package lt.rasa.entities;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Pazymiai")
public class Pazymys {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "pazymys")
    private int pazymys;

    @Column(name = "data")
    private LocalDate data;


    @ManyToOne
    private Studentas studentas;


    public int getId() {
        return id;
    }

    public int getPazymys() {
        return pazymys;
    }

    public LocalDate getData() {
        return data;
    }

    public Studentas getStudentas() {
        return studentas;
    }

    @Override
    public String toString() {
        return "Pazymys{" +
                "pazymysId=" + id +
                ", pazymys=" + pazymys +
                ", data=" + data +
                ", studentas=" + studentas +
                '}';
    }
}
