package processoSeletivo;

public class Candidate {
    private String nome;
    private int idade;
    private double nota;

    public Candidate(String nome, int idade, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Nota: " + nota;
    }
}

