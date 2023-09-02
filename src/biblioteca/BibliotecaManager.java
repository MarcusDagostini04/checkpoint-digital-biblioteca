package biblioteca;

import estrategias.EstrategiaEmprestimo;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaManager {
    private static BibliotecaManager instancia;
    private EstrategiaEmprestimo estrategiaEmprestimo;
    private List<Livro> livrosDisponiveis;

    private BibliotecaManager() {
        livrosDisponiveis = new ArrayList<>();
    }

    public static synchronized BibliotecaManager getInstance() {
        if (instancia == null) {
            instancia = new BibliotecaManager();
        }
        return instancia;
    }

    public void setEstrategiaEmprestimo(EstrategiaEmprestimo estrategia) {
        this.estrategiaEmprestimo = estrategia;
    }

    public void registrarLivro(Livro livro) {
        livrosDisponiveis.add(livro);
    }

    public Livro emprestarLivro(Aluno aluno1) {
        if (estrategiaEmprestimo == null) {
            throw new RuntimeException("Empréstimo não foi configurado.");
        }

        return estrategiaEmprestimo.escolherLivroParaEmprestimo(livrosDisponiveis);
    }

    public void devolverLivro(Livro livro) {
        if (livrosDisponiveis.contains(livro)) {
            livro.devolver();
        } else {
            System.out.println("Este livro não pertence à biblioteca.");
        }
    }
    public List<Livro> obterLivrosDisponiveis() {
        return new ArrayList<>(livrosDisponiveis);
    }

}