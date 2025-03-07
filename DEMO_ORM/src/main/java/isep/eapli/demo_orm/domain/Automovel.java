package isep.eapli.demo_orm.domain;

public class Automovel {
    private int kms;
    private String matricula;
    private String nome;

    public Automovel() {}
    public Automovel(int kms, String matricula, String nome) {
        this.kms = kms;
        this.matricula = matricula;
        this.nome = nome;
    }

    public int getKms() {
        return kms;
    }

    public void setKms(int kms) {
        this.kms = kms;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Automovel{" +
                "kms=" + kms +
                ", matricula='" + matricula + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
