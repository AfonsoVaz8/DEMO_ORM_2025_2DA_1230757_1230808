package isep.eapli.demo_orm.domain;

import jakarta.persistence.*;

@Entity
public class GrupoAutomovel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private int numeroPortas;
    private String nome;
    private String classe;

    public GrupoAutomovel() {
    }

    public GrupoAutomovel(String nome, int numeroPortas, String classe) {
        this.numeroPortas = numeroPortas;
        this.nome = nome;
        this.classe = classe;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    @Override
    public String toString() {
        return String.format("|%-5d | %-20s | %-10s | %-5d |", id, nome, classe, numeroPortas);
    }

}
