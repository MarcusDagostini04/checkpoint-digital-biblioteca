package estrategias;

import biblioteca.Livro;

import java.util.List;

public class EstrategiaPorDisponibilidade implements EstrategiaEmprestimo {
    @Override
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
