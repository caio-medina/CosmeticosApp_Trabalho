package a2017_1.pooa.iff.br.cosmeticosapp_trabalho.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import a2017_1.pooa.iff.br.cosmeticosapp_trabalho.R;
import a2017_1.pooa.iff.br.cosmeticosapp_trabalho.adapter.RostoAdapter;
import a2017_1.pooa.iff.br.cosmeticosapp_trabalho.model.Corpo;
import a2017_1.pooa.iff.br.cosmeticosapp_trabalho.model.Rosto;

public class MainActivity extends AppCompatActivity {


    private ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button cadastroBT = (Button) findViewById(R.id.bt_cadastro);

        logo = (ImageView) findViewById(R.id.img_cosmeticos);
        logo.setImageResource(R.drawable.img_cosmeticos);


    }

    public void chamaTelaCadastro(View v) {
        Toast.makeText(this, "Botão funcionando", Toast.LENGTH_SHORT);

        Intent intent = new Intent(MainActivity.this,CadastroActivity.class);
        startActivity(intent);
    }

    public void chamaTelaLogin(View v) {
        Toast.makeText(this, "Botão funcionando", Toast.LENGTH_SHORT);

        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intent);
    }


}

