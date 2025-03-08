package isep.eapli.demo_orm.menu;

import isep.eapli.demo_orm.domain.GrupoAutomovel;
import isep.eapli.demo_orm.util.Utils;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.Scanner;

public class RegisteGrupoAutomovelMenu {

    public static void registeGrupoAutomovel() {
        Scanner sc = new Scanner(System.in);
        String name, classe;
        int numeroPortas;

        do {
            System.out.println("Digite o nome do grupo: ");
            name = sc.nextLine();
        } while (!Utils.isValid(name));

        do {
            System.out.println("Digite o nome da classe: ");
            classe = sc.nextLine();
        } while (!Utils.isValid(classe));

        do {
            System.out.println("Digite o número de portas: ");
            numeroPortas = sc.nextInt();
        } while (!Utils.isValidInt(numeroPortas));

        GrupoAutomovel grupoAutomovel = new GrupoAutomovel(numeroPortas, name, classe);
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("DEMO_ORMPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(grupoAutomovel);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
