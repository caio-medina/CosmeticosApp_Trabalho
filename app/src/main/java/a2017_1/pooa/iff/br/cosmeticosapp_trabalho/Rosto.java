package a2017_1.pooa.iff.br.cosmeticosapp_trabalho;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Rosto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rosto);
    }

    public void chamaTelaCarrinho(View v) {
        Toast.makeText(this, "Botão funcionando", Toast.LENGTH_SHORT);

        Intent intent = new Intent(Rosto.this, Carrinho.class);
        startActivity(intent);
    }
}
