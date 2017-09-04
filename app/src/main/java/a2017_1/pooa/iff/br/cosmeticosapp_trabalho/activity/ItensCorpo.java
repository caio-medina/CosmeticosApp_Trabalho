package a2017_1.pooa.iff.br.cosmeticosapp_trabalho.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import a2017_1.pooa.iff.br.cosmeticosapp_trabalho.R;
import a2017_1.pooa.iff.br.cosmeticosapp_trabalho.adapter.CorpoAdapter;
import a2017_1.pooa.iff.br.cosmeticosapp_trabalho.model.Corpo;

/**
 * Created by user on 03/09/17.
 */
public class ItensCorpo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corpo);

        ListView itens_corpo = (ListView) findViewById(R.id.lvCorpo);
        ArrayAdapter adapter = new CorpoAdapter(this, acidionarItemCorpo());
        itens_corpo.setAdapter(adapter);
    }

    private ArrayList<Corpo> acidionarItemCorpo() {
        ArrayList<Corpo> corpos = new ArrayList<Corpo>();
        Corpo c = new Corpo("Perfume", "Boticario", "79.90", null);
        corpos.add(c);
        c = new Corpo("Hidratante", "Boticario", "39.90", null);
        corpos.add(c);
        c = new Corpo("Perfume", "Boticario", "39.90", null);
        corpos.add(c);
        c = new Corpo("Sabonete", "Boticario", "4.99", null);
        corpos.add(c);
        c = new Corpo("Esmalte", "Boticario", "7.99", null);
        corpos.add(c);
        c = new Corpo("Perfume", "Natura", "69.99", null);
        corpos.add(c);
        c = new Corpo("Desodorante", "Natura", "9.90", null);
        corpos.add(c);
        c = new Corpo("Creme", "Natura", "14.90", null);
        corpos.add(c);
        c = new Corpo("Sabonete Líquido", "Natura", "8.90", null);
        corpos.add(c);
        c = new Corpo("Lixa de unha", "Natura", "1.99", null);
        corpos.add(c);

        return corpos;
    }
}