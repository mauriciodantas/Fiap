package br.com.fiap.mob.fiapimoveis.apdater;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import br.com.fiap.mob.fiapimoveis.R;
import br.com.fiap.mob.fiapimoveis.model.Imovel;

/**
 * Created by Mauricio on 12/09/2015.
 */
public class AdapterListaImoveis extends RecyclerView.Adapter<AdapterListaImoveis.ViewHolder> {


    private List<Imovel> imoveis;

    public AdapterListaImoveis(List<Imovel> imoveis){
        this.imoveis = imoveis;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvNomeImovel;
        private CardView cardView;


        public ViewHolder(View v) {
            super(v);
            tvNomeImovel = (TextView) v.findViewById(R.id.tvImovel);
            cardView = (CardView) v.findViewById(R.id.card_view);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_lista_imoveis, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        final Imovel imovel =  imoveis.get(i);
        viewHolder.tvNomeImovel.setText(imovel.getObservacao());
        viewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"Posicao:"+imovel.getObservacao(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return imoveis.size();
    }





}
