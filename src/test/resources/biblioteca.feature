# language: pt

Funcionalidade: Pesquisa de livros na biblioteca usando esquema de cenário

   
    Esquema do Cenário: Pesquisa de um livro dado o titulo e gênero
        Dado que a biblioteca está inicializada
        Quando "José" pesquisar o livro <titulo> e gênero <genero>
        Então ele encontrou o livro <titulo>
        
        Exemplos:
            | titulo| genero|
            | "Java 8"| "COMPUTACAO"|
            | "UML"| "COMPUTACAO"|
            | "Cozinha Mineira"| "GASTRONOMIA"|
            | "Pai Rico, Pai Pobre"| "FINANCAS"|
            |"Pense e enriqueça"| "FINANCAS"|

 

