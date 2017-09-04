package a2017_1.pooa.iff.br.cosmeticosapp_trabalho.model;

/**
 * Created by user on 03/09/17.
 */
public class Corpo {


    private String nome, fabricante, preco;

    public Corpo(String nome, String fabricante, String preco){

        this.nome = nome;
        this.fabricante = fabricante;
        this.preco = preco;

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }


    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }
}