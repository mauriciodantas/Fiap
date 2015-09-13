package br.com.fiap.mob.fiapimoveis.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.mob.fiapimoveis.CadastroImovelActivity;
import br.com.fiap.mob.fiapimoveis.R;
import br.com.fiap.mob.fiapimoveis.apdater.AdapterListaImoveis;
import br.com.fiap.mob.fiapimoveis.model.Imovel;

/**
 * Created by Mauricio on 12/09/2015.
 */
public class ListaImoveisFragment extends Fragment {

    private RecyclerView rvImoveis;
    private LinearLayoutManager mLayoutManager;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.lista_imoveis_fragment, container, false);

        rvImoveis = (RecyclerView) v.findViewById(R.id.rvImoveis);
        mLayoutManager = new LinearLayoutManager(v.getContext());
        rvImoveis.setLayoutManager(mLayoutManager);
        rvImoveis.setAdapter(new AdapterListaImoveis(buscarImoveis()));
        return v;
    }


    public List<Imovel> buscarImoveis() {
        //TODO realizar busca de imoveis

        List<Imovel> imoveis = new ArrayList<Imovel>();

        for (int i = 0; i <= 20; i++) {

            Imovel imovel = new Imovel();
            imovel.setObservacao("Teste");
            imoveis.add(imovel);

        }

        return imoveis;

    }


}


