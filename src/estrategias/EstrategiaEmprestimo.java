package estrategias;

import java.util.List;

public interface EstrategiaEmprestimo {
    Livro escolherLivroParaEmprestimo(List<Livro> livros);

}
