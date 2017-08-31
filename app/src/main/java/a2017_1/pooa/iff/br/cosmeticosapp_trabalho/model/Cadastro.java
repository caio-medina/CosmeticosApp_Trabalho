package a2017_1.pooa.iff.br.cosmeticosapp_trabalho.model;

import java.io.Serializable;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;


public class Cadastro extends RealmObject implements Serializable {

    @PrimaryKey
    private int id;
    private String nome;
    private String login;
    private String senha;
    private String email;
    private String cpf;

    public Cadastro() {
    }



    public Cadastro(int id, String nome, String login, String senha, String email, String cpf) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.cpf = cpf;

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}