package a2017_1.pooa.iff.br.cosmeticosapp_trabalho.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import a2017_1.pooa.iff.br.cosmeticosapp_trabalho.R;
import a2017_1.pooa.iff.br.cosmeticosapp_trabalho.model.Cadastro;


public class CadastroAdapter  extends RecyclerView.Adapter {

    private List<Cadastro> cadastros;
    private Context context;
    private static ClickRecyclerViewListener clickRecyclerViewListener;

    public CadastroAdapter(List<Cadastro> cadastros, Context context,ClickRecyclerViewListener clickRecyclerViewListener) {

        this.cadastros = cadastros;
        this.context = context;
        this.clickRecyclerViewListener = clickRecyclerViewListener;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                      int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.activity_cadastro_detalhe, parent, false);
        CadastroViewHolder cadastroViewHolder = new CadastroViewHolder(view);
        return cadastroViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder,
                                 int position) {

        CadastroViewHolder holder = (CadastroViewHolder) viewHolder;

        Cadastro cadastro  = cadastros.get(position) ;

        holder.nome.setText(cadastro.getNome());
        holder.login.setText(cadastro.getLogin());
        holder.senha.setText(cadastro.getSenha());
        holder.email.setText(cadastro.getEmail());
        holder.cpf.setText(cadastro.getCpf());

    }

    @Override
    public int getItemCount() {

        return cadastros.size();
    }

    private void updateItem(int position) {

    }

    // Método responsável por remover um usuário da lista.
    private void removerItem(int position) {

    }

    public class CadastroViewHolder extends RecyclerView.ViewHolder {

        private final TextView nome;
        private final TextView login;
        private final TextView senha;
        private final TextView email;
        private final TextView cpf;

        public CadastroViewHolder(View itemView) {
            super(itemView);
            nome = (TextView) itemView.findViewById(R.id.edtNome);
            login = (TextView) itemView.findViewById(R.id.edtLogin);
            senha = (TextView) itemView.findViewById(R.id.edtSenha);
            email = (TextView) itemView.findViewById(R.id.edtEmail);
            cpf = (TextView) itemView.findViewById(R.id.edtCpf);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    clickRecyclerViewListener.onClick(cadastros.get(getLayoutPosition()));

                }
            });


        }
    }
}