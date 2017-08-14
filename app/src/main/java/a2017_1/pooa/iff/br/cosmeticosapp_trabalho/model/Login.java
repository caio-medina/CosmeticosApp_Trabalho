package a2017_1.pooa.iff.br.cosmeticosapp_trabalho.model;

import java.io.Serializable;

import io.realm.RealmObject;

/**
 * Created by user on 14/08/17.
 */
public class Login extends RealmObject implements Serializable {

    private String login;
    private String senha;

    public Login() {
    }

    public Login(String login, String senha) {

        this.login = login;
        this.senha = senha;
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
}

