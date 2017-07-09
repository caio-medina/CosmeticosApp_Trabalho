package a2017_1.pooa.iff.br.cosmeticosapp_trabalho;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo = (ImageView) findViewById(R.id.img_cosmeticos);
        logo.setImageResource(R.drawable.img_cosmeticos);


    }

    public void chamaTelaLogin(View v) {
        Toast.makeText(this, "Botão funcionando", Toast.LENGTH_SHORT);

        Intent intent = new Intent(MainActivity.this, Login.class);
        startActivity(intent);
    }

    public void chamaTelaCadastro(View v) {
        Toast.makeText(this, "Botão funcionando", Toast.LENGTH_SHORT);

        Intent intent = new Intent(MainActivity.this, Cadastro.class);
        startActivity(intent);
    }
}
