package a2017_1.pooa.iff.br.cosmeticosapp_trabalho.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import a2017_1.pooa.iff.br.cosmeticosapp_trabalho.R;
import a2017_1.pooa.iff.br.cosmeticosapp_trabalho.adapter.RostoAdapter;
import a2017_1.pooa.iff.br.cosmeticosapp_trabalho.model.Rosto;

/**
 * Created by user on 03/09/17.
 */
public class ItensRosto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rosto);

        ListView itens_rosto = (ListView) findViewById(R.id.lvRosto);
        ArrayAdapter adapter = new RostoAdapter(this, acidionarItemRosto());
        itens_rosto.setAdapter(adapter);
    }

    private ArrayList<Rosto> acidionarItemRosto() {
        ArrayList<Rosto> rostos = new ArrayList<Rosto>();
        Rosto r = new Rosto("Sombra", "Boticario", "39.90");
        rostos.add(r);

        return rostos;
    }
}


