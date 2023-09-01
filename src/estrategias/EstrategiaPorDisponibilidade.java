package estrategias;

import java.util.List;

public class EstrategiaPorDisponibilidade implements EstrategiaEmprestimo {

    public Livro escolherLivroParaEmprestimo(List<Livro> livros) {
        Livro livroDisponivel = null;
        for (Livro livro : livros) {
            if (livro.getQuantidadeDisponivel() > 0) {
                livroDisponivel = livro;
                break;
            }
        }
        return livroDisponivel;
    }
}