package a2017_1.pooa.iff.br.cosmeticosapp_trabalho.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import a2017_1.pooa.iff.br.cosmeticosapp_trabalho.R;
import a2017_1.pooa.iff.br.cosmeticosapp_trabalho.model.Corpo;



/**
 * Created by user on 03/09/17.
 */
public class CorpoAdapter extends ArrayAdapter <Corpo> {
    private final Context context;
    private final ArrayList<Corpo> itens;

    public CorpoAdapter(Context context, ArrayList<Corpo> itens){
        super(context, R.layout.lista_produto, itens);
        this.context = context;
        this.itens = itens;
    }

    public View getView(int position, View convertView, ViewGroup parent){

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.lista_produto, parent, false);

        TextView nome = (TextView) rowView.findViewById(R.id.txNome);
        TextView fabricante = (TextView) rowView.findViewById(R.id.txFabricante);
        TextView preco = (TextView) rowView.findViewById(R.id.txPreco);

        nome.setText(itens.get(position).getNome());
        fabricante.setText(itens.get(position).getFabricante());
        preco.setText( itens.get(position).getPreco());

        return rowView;
    }

}