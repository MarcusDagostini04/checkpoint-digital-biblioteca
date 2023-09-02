package biblioteca;

public class Aluno {
    private String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void update(Livro livro) {
        System.out.println(nome + " foi informado sobre o livro " + livro.getTitulo() + " disponível.");
    }
}
