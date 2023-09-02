package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private int quantidadeDisponivel;
    private List<Aluno> alunosInteressados = new ArrayList<>();

    public Livro(String titulo, String autor, String isbn, int quantidadeDisponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }


    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                ", quantidadeDisponivel=" + quantidadeDisponivel +
                '}';
    }


    public String getTitulo() {
        return titulo;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void addObserver(Aluno aluno) {
        alunosInteressados.add(aluno);
    }

    public void removeObserver(Aluno aluno) {
        alunosInteressados.remove(aluno);
    }

    public void emprestar() {
        if (quantidadeDisponivel > 0) {
            quantidadeDisponivel--;
            notifyObservers();
        }
    }

    public void devolver() {
        quantidadeDisponivel++;
    }

    private void notifyObservers() {
        for (Aluno aluno : alunosInteressados) {
            aluno.update(this);
        }
    }
}
