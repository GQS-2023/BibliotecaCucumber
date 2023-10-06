package steps;

import com.mycompany.biblioteca.Biblioteca;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import static org.junit.Assert.assertTrue;

public class PesquisaLivrosSteps {

    private Biblioteca biblioteca;
    private String tituloPesquisado;
    private boolean livroEncontrado;

    @Dado("que a biblioteca está inicializada")
    public void queABibliotecaEstáInicializada() {
        biblioteca = new Biblioteca();
    }

    @Quando("\"José\" pesquisar o livro {string} e gênero {string}")
    public void pesquisarOLivroEGênero(String titulo, String genero) {
        tituloPesquisado = titulo;
        livroEncontrado = biblioteca.pesquisarLivro(titulo, genero);
    }

    @Então("ele encontrou o livro {string}")
    public void eleEncontrouOLivro(String titulo) {
        assertTrue(livroEncontrado);
        assertTrue(tituloPesquisado.equalsIgnoreCase(titulo));
    }

}
