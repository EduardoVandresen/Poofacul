package Exercicios_livro;

public class Produto {
    protected String nome;
    protected double preco;

    public boolean ehCaro() {
        return preco > 100;
    }

    @Override
    public String toString() {
        return nome + " - " + preco;
    }
}
