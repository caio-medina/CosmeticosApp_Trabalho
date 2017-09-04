package a2017_1.pooa.iff.br.cosmeticosapp_trabalho.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import a2017_1.pooa.iff.br.cosmeticosapp_trabalho.model.Cadastro;
import a2017_1.pooa.iff.br.cosmeticosapp_trabalho.model.Menu_principal;
import a2017_1.pooa.iff.br.cosmeticosapp_trabalho.R;
import io.realm.Realm;
import io.realm.RealmResults;

public class LoginActivity extends AppCompatActivity {

    EditText login, senha;
    Button btbuscar;
    int id;
    Cadastro cadastro;
    private Realm realm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = (EditText) findViewById(R.id.edtLogin);
        senha = (EditText) findViewById(R.id.edtSenha);

        btbuscar = (Button) findViewById(R.id.btConfirmarLogin);

        Intent intent = getIntent();
        id = (int) intent.getSerializableExtra("id");
        realm = Realm.getDefaultInstance();

        btbuscar.setOnClickListener( new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                buscar();
            }
        });

        realm.close();
    }


    public void buscar(){
        String login, senha;

        RealmResults<Cadastro> cadastros = realm.where(Cadastro.class).findAll();


        Toast.makeText(this,"Usuário não foi encontrado",Toast.LENGTH_LONG).show();
        this.finish();

        Toast.makeText(this,"Usuário foi encontrado",Toast.LENGTH_LONG).show();
        this.finish();

    }


}

