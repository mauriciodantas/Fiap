package br.com.fiap.mob.fiapimoveis.model;

import android.app.Application;
import android.content.res.Resources;

import br.com.fiap.mob.fiapimoveis.App;
import br.com.fiap.mob.fiapimoveis.MainActivity;
import br.com.fiap.mob.fiapimoveis.R;

/**
 * Created by Mauricio on 11/09/2015.
 */
public enum TipoImovel {

    CASA('c', R.string.casa),
    APARTAMENTO('a',R.string.apartamento),
    LOJA('l',R.string.loja),
    KITNET('k',R.string.kitnet),
    OUTRO('o',R.string.outro);

    public char tipo;
    public int idDescricao;


    TipoImovel(char tipo, int idDescricao){
        this.tipo = tipo;
        this.idDescricao = idDescricao;
    }



}
