package a2017_1.pooa.iff.br.cosmeticosapp_trabalho.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import a2017_1.pooa.iff.br.cosmeticosapp_trabalho.Menu_principal;
import a2017_1.pooa.iff.br.cosmeticosapp_trabalho.R;
import a2017_1.pooa.iff.br.cosmeticosapp_trabalho.adapter.ClickRecyclerViewListener;

public class CadastroActivity extends AppCompatActivity implements ClickRecyclerViewListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }

    public void chamaTelaMenu(View v) {
        Toast.makeText(this, "Botão funcionando", Toast.LENGTH_SHORT);

        Intent intent = new Intent(CadastroActivity.this, Menu_principal.class);
        startActivity(intent);
    }


    @Override
    public void onClick(Object object) {

    }
}
