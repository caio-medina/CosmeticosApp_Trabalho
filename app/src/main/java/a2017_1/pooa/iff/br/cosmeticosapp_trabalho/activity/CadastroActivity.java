package a2017_1.pooa.iff.br.cosmeticosapp_trabalho.activity;



import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import io.realm.Realm;
import a2017_1.pooa.iff.br.cosmeticosapp_trabalho.R;
import a2017_1.pooa.iff.br.cosmeticosapp_trabalho.model.Cadastro;

public class CadastroActivity extends AppCompatActivity {

    EditText nome, login, senha, email, cpf;
    Button btsalvar;
    int id;
    Cadastro cadastro;
    private Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        nome = (EditText) findViewById(R.id.edtNome);
        login = (EditText) findViewById(R.id.edtLogin);
        senha = (EditText) findViewById(R.id.edtSenha);
        email = (EditText) findViewById(R.id.edtEmail);
        cpf = (EditText) findViewById(R.id.edtCpf);

        btsalvar = (Button) findViewById(R.id.btConfirmarCadastro);

        Intent intent    = getIntent();
        id = (int) intent.getSerializableExtra("id");
        realm = Realm.getDefaultInstance();




        btsalvar.setOnClickListener( new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                salvar();
            }
        });
        realm.close();
    }


    public void salvar() {

        int proximoID = 1;
        if(realm.where(Cadastro.class).max("id") !=null)
            proximoID = realm.where(Cadastro.class).max("id").intValue()+1;

        realm.beginTransaction();
        Cadastro cadastro = new Cadastro();
        cadastro.setId(proximoID);
        cadastro.setNome(nome.getText().toString());
        cadastro.setLogin(login.getText().toString());
        cadastro.setSenha(senha.getText().toString());
        cadastro.setEmail(email.getText().toString());
        cadastro.setCpf(cpf.getText().toString());

        realm.copyToRealm(cadastro);
        realm.commitTransaction();
        realm.close();

        Toast.makeText(this,"Usuário foi cadastrado",Toast.LENGTH_LONG).show();
        this.finish();

    }




}