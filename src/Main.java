import biblioteca.Aluno;
import biblioteca.BibliotecaManager;
import biblioteca.Livro;
import estrategias.EstrategiaEmprestimo;
import estrategias.EstrategiaPorDisponibilidade;
import estrategias.EstrategiaPorPrioridade;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BibliotecaManager bibliotecaManager = BibliotecaManager.getInstance();

        List<Livro> livros = new ArrayList<>();

        Livro livro1 = new Livro("José do Egito", "Hernandes Dias Lopes", "ISBN: 978-85-7742-371-2", 5);
        Livro livro2 = new Livro("O homem mais rico da Babilônia", "George S. Clason", "ISBN: 978-85-9508-153-6", 3);
        Livro livro3 = new Livro("Mais esperto que o diabo", "Napoleon Hill", "ISBN: 978-85-9673-157-5", 2);

        livros.add(livro1);
        livros.add(livro2);
        livros.add(livro3);

        for (Livro livro : livros) {
            bibliotecaManager.registrarLivro(livro);
        }

        Aluno aluno1 = new Aluno("Roberto");
        Aluno aluno2 = new Aluno("Matheus");

        EstrategiaEmprestimo estrategiaDisponibilidade = new EstrategiaPorDisponibilidade();
        EstrategiaEmprestimo estrategiaPrioridade = new EstrategiaPorPrioridade();

        bibliotecaManager.setEstrategiaEmprestimo(estrategiaDisponibilidade);

        Livro livroParaEmprestimo1 = bibliotecaManager.emprestarLivro(aluno1);
        if (livroParaEmprestimo1 != null) {
            System.out.println(aluno1.getNome() + " emprestou o livro: " + livroParaEmprestimo1.getTitulo());
        } else {
            System.out.println("Nenhum livro disponível para empréstimo para " + aluno1.getNome());
        }

        Livro livroParaEmprestimo2 = bibliotecaManager.emprestarLivro(aluno2);
        if (livroParaEmprestimo2 != null) {
            System.out.println(aluno2.getNome() + " emprestou o livro: " + livroParaEmprestimo2.getTitulo());
        } else {
            System.out.println("Nenhum livro disponível para empréstimo para " + aluno2.getNome());
        }

        Livro livroParaEmprestimo3 = bibliotecaManager.emprestarLivro(aluno1);
        if (livroParaEmprestimo3 != null) {
            System.out.println(aluno1.getNome() + " emprestou o livro: " + livroParaEmprestimo3.getTitulo());
        } else {
            System.out.println("Nenhum livro disponível para empréstimo para " + aluno1.getNome());
        }

        System.out.println("Livros disponíveis na biblioteca:");
        List<Livro> livrosDisponiveis = bibliotecaManager.obterLivrosDisponiveis();
        for (Livro livro : livrosDisponiveis) {
            System.out.println(livro);
        }

        bibliotecaManager.devolverLivro(livroParaEmprestimo3);
        System.out.println(aluno1.getNome() + " devolveu o livro: " + livroParaEmprestimo3.getTitulo());

        System.out.println("Livros disponíveis na biblioteca após a devolução:");
        livrosDisponiveis = bibliotecaManager.obterLivrosDisponiveis();
        for (Livro livro : livrosDisponiveis) {
            System.out.println(livro);
        }

        System.out.println("Programa encerrado.");
    }
}
