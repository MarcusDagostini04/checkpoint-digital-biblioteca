package estrategias;

import java.util.List;

public class EstrategiaPorPrioridade implements EstrategiaEmprestimo {
    @Override
    public Livro escolherLivroParaEmprestimo(List<Livro> livros) {
        Livro livroPrioritario = null;
        for (Livro livro : livros) {
            if (livro.getQuantidadeDisponivel() > 0) {
                if (livroPrioritario == null || livro.getTitulo().compareTo(livroPrioritario.getTitulo()) < 0) {
                    livroPrioritario = livro;
                }
            }
        }
        return livroPrioritario;
    }
}
