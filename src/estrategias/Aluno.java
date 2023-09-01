package estrategias;

import estrategias.Livro;

public class Aluno {
    private String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void update(Livro livro) {
        System.out.println(nome + " foi notificado sobre o livro " + livro.getTitulo() + " disponível.");
    }
}
