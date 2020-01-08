package lt.rasa;

import lt.rasa.entities.Pazymys;
import lt.rasa.entities.Studentas;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        uzkrautiDuomenis();
    }



    static void uzkrautiDuomenis(){

        EntityManager em = HibernateUtils.getEntityManager();
        try{
            em.getTransaction().begin();
            List<Studentas> studentai = new ArrayList<>();

            Studentas stud = em.find(Studentas.class,2);
            studentai.add(stud);
            System.out.println(studentai);
            em.getTransaction().commit();

        }catch(Exception ex){}
        System.out.println("Vel nuluzo uzkrautiduomenis nafik. ");

    }

    static void kursoVidurkis(int metai){
        EntityManager em = HibernateUtils.getEntityManager();
        em.getTransaction().begin();

        List<Pazymys> pazymiai = new ArrayList<>();
        pazymiai  = em.createQuery("from Pazymys").getResultList();

        // List<Pazymys> pazymiai = q.getResultList();

//        double avg =  pazymiai.stream()
//                .mapToInt(p -> p.getPazymys())
//                .average()
//                .orElse(0.0);

      //  System.out.println("Kurso vidurkis --> " + avg);

        System.out.println(pazymiai.size() + " " +  pazymiai.getClass());
        em.getTransaction().commit();
    }
    static void spausdintiStudentus(){

        EntityManager em = HibernateUtils.getEntityManager();

        Studentas studentas = em.find(Studentas.class, 1);
        //System.out.println("***" + studentas.getId() + " " + studentas.getVardas() + " " + stu
           //     .getPavarde());

    }
}
