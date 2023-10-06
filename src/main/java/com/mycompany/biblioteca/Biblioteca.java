package com.mycompany.biblioteca;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private final List<Livro> livros;
    private String path = "/Users/rafaelamoreira/NetBeansProjects/Biblioteca/src/main/java/com/mycompany/biblioteca/";

    public Biblioteca() {
        this.livros = new ArrayList<>();
        carregarLivrosDoArquivo(path + "livros.csv");
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public boolean pesquisarLivro(String titulo, String genero) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo) && livro.getGenero().equalsIgnoreCase(genero)) {
                return true;
            }
        }
        return false;
    }

    private void carregarLivrosDoArquivo(String arquivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(";");
                if (partes.length == 2) {
                    String titulo = partes[0].trim();
                    String genero = partes[1].trim();
                    adicionarLivro(new Livro(titulo, genero));
                }
            }
        } catch (IOException e) {
        }
    }

}
