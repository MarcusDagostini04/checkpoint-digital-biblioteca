public class BibliotecaManager {
    private static BibliotecaManager instancia;

    private BibliotecaManager() {
        // Construtor privado para impedir a criação de instâncias
    }

    public static synchronized BibliotecaManager getInstance() {
        if (instancia == null) {
            instancia = new BibliotecaManager();
        }
        return instancia;
    }

    // Outros métodos para gerenciar o sistema da biblioteca
}
