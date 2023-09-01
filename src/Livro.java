import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private int quantidadeDisponivel;

    // Construtor


    public Livro() {
    }

    public Livro(String titulo, String autor, String isbn, int quantidadeDisponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    // getters e setters


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    private List<Aluno> alunosInteressados = new ArrayList<>();

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

    private void notifyObservers() {
        for (Aluno aluno : alunosInteressados) {
            aluno.update(this);
        }
    }

    public void devolver() {
        quantidadeDisponivel++;
    }

}

