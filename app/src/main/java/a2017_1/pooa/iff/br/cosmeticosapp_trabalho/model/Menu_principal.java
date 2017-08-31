package a2017_1.pooa.iff.br.cosmeticosapp_trabalho.model;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import a2017_1.pooa.iff.br.cosmeticosapp_trabalho.R;

public class Menu_principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
    }

    public void chamaTelaCorpo(View v) {
        Toast.makeText(this, "Botão funcionando", Toast.LENGTH_SHORT);

        Intent intent = new Intent(Menu_principal.this, Corpo.class);
        startActivity(intent);
    }

    public void chamaTelaRosto(View v) {
        Toast.makeText(this, "Botão funcionando", Toast.LENGTH_SHORT);

        Intent intent = new Intent(Menu_principal.this, Rosto.class);
        startActivity(intent);
    }

    public void chamaTelaCarrinho(View v) {
        Toast.makeText(this, "Botão funcionando", Toast.LENGTH_SHORT);

        Intent intent = new Intent(Menu_principal.this, Carrinho.class);
        startActivity(intent);
    }
}
