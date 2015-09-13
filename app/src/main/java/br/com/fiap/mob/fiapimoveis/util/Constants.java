package br.com.fiap.mob.fiapimoveis.util;

import android.os.Environment;

import java.io.File;

/**
 * Created by Mauricio on 11/09/2015.
 */
public class Constants {

    public static final String TAG_APLICATIVO = "fiapImoveis";
    public static final String EMAIL_USUARIO = "teste@teste.com";
    public static final String SENHA_USUARIO = "123456";
    public static final String CHAVE_MANTER_LOGADO = "manterLogado";
    public static final String CHAVE_EMAIL_USUARIO = "emailUsuario";
    public static final String CHAVE_SENHA= "senha";
    public static final File DIRETORIO_FOTOS = new File(Environment.getExternalStoragePublicDirectory (
            Environment.DIRECTORY_PICTURES), "fotosImoveis");


}
