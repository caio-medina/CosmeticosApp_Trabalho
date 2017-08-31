package a2017_1.pooa.iff.br.cosmeticosapp_trabalho.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.List;

import a2017_1.pooa.iff.br.cosmeticosapp_trabalho.R;
import a2017_1.pooa.iff.br.cosmeticosapp_trabalho.adapter.ClickRecyclerViewListener;
import a2017_1.pooa.iff.br.cosmeticosapp_trabalho.model.Cadastro;
import io.realm.Realm;

public class CadastroActivity extends AppCompatActivity implements ClickRecyclerViewListener {

    private Realm realm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_detalhe);
        Toolbar toolbar = (Toolbar) findViewById(R.id.);
        setSupportActionBar(toolbar);

        realm = Realm.getDefaultInstance();
    }

    public void onClick(View view) {
        Intent intent = new Intent(CadastroActivity.this, CadastroDetalheActivity.class);
        intent.putExtra("id", 0);
        startActivity(intent);
    }


    private List<Cadastro> getCadastro(){

        return (List)realm.where(Cadastro.class).findAll();

    }

    @Override
    public void onClick(Object object) {
        Cadastro cadastro = (Cadastro) object;
        Intent intent = new Intent(CadastroActivity.this,CadastroDetalheActivity.class);
        intent.putExtra("id",cadastro.getId());
        startActivity(intent);

    }

    @Override
    public void finish(){
        realm.close();

    }


}
