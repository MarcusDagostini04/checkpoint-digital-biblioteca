# Biblioteca Digital em Java

Este é um projeto de biblioteca digital desenvolvido em Java que permite o registro de livros, empréstimo de livros para alunos e devolução de livros.

## Requisitos do Projeto

O projeto atende aos seguintes requisitos:

- Registro de Livros: A biblioteca permite adicionar novos livros ao sistema, cada um com um título, autor, ISBN e quantidade disponível.
- Empréstimo de Livros: Os alunos podem pegar livros emprestados. Cada livro só pode ser emprestado a um aluno por vez.
- Devolução de Livros: Após o empréstimo, os alunos devem devolver os livros.

## Estrutura do Projeto

O projeto é composto por três classes principais:

1. **Livro**: Representa um livro com atributos como título, autor, ISBN e quantidade disponível. Ele também implementa o padrão Observer para gerenciar os alunos interessados em um livro.

2. **Aluno**: Representa um aluno que pode emprestar e devolver livros.

3. **BibliotecaManager**: É a classe central que gerencia o registro de livros, empréstimos e devoluções. Ela implementa o padrão Singleton para garantir que apenas uma instância seja criada.

## Como Usar o Projeto

1. Clone este repositório para o seu ambiente local.

2. Abra o projeto em sua IDE Java preferida (por exemplo, IntelliJ IDEA ou Eclipse).

3. Execute a classe `Main` para testar o funcionamento do projeto.

4. O programa mostrará mensagens no console indicando quando um aluno empresta um livro, quando um aluno devolve um livro e a lista de livros disponíveis na biblioteca.

## Padrões de Projeto

Este projeto utiliza dois padrões de projeto:

- **Singleton Pattern**: A classe `BibliotecaManager` é implementada como um Singleton para garantir que haja apenas uma instância do gerenciador da biblioteca em toda a aplicação.

- **Observer Pattern**: A classe `Livro` implementa o Observer Pattern para gerenciar os alunos interessados em um livro. Quando um livro é emprestado, ele notifica automaticamente os alunos interessados.






