package br.com.fiap.mob.fiapimoveis.apdater;

import android.content.Context;
import android.widget.ArrayAdapter;

import br.com.fiap.mob.fiapimoveis.model.TipoImovel;

/**
 * Created by Mauricio on 13/09/2015.
 */
public class ApdaterTipoImovel extends ArrayAdapter<TipoImovel>{

    public ApdaterTipoImovel(Context context, int resource) {
        super(context, resource);
    }
}
