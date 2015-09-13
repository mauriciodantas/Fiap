package br.com.fiap.mob.fiapimoveis.model;

import br.com.fiap.mob.fiapimoveis.R;

/**
 * Created by Mauricio on 11/09/2015.
 */
public enum TamanhoImovel {

    PEQUENO('P', R.string.pequeno),
    MEDIO('M',R.string.medio),
    GRANDE('G',R.string.grande);

    public char tipo;
    public int idDescricao;

    TamanhoImovel(char tipo, int idDescricao){
        this.tipo = tipo;
        this.idDescricao = idDescricao;
    }



}
