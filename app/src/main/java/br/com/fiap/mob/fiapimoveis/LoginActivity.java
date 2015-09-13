package br.com.fiap.mob.fiapimoveis;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import br.com.fiap.mob.fiapimoveis.util.Constants;

public class LoginActivity extends AppCompatActivity {

    private EditText etEmail, etSenha;
    private CheckBox cbManterConectado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etSenha = (EditText) findViewById(R.id.etSenha);
        cbManterConectado = (CheckBox) findViewById(R.id.cbManterConectado);

        verificarSeUsuarioJaEstaConectado();

    }

    private void verificarSeUsuarioJaEstaConectado() {

        SharedPreferences sharedPreferences = getPreferences(Context.MODE_PRIVATE);
        boolean manterUsuarioLogado = sharedPreferences.getBoolean(Constants.CHAVE_MANTER_LOGADO, Boolean.FALSE);
        if (manterUsuarioLogado) {
            //TODO validar usuario salvo
            redirecionarParaTelaPrincipal();
        }

    }


    public void realizarLogin(View view) {

        esconderTeclado();
        
        String email = etEmail.getText().toString();

        String senha = etSenha.getText().toString();

        boolean usuarioExiste = validarUsuario(email, senha);

        if (!usuarioExiste) {
            Snackbar.make(view, getString(R.string.msg_usuario_invalido), Snackbar.LENGTH_SHORT).show();
        } else {

            if (cbManterConectado.isChecked()) {
                salvarDadosUsuario(email, senha);
            }

            redirecionarParaTelaPrincipal();
        }

        

    }

    private void esconderTeclado() {
        //TODO esconder teclado
    }

    private void salvarDadosUsuario(String email, String senha) {
        SharedPreferences sharedPreferences = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(Constants.CHAVE_MANTER_LOGADO, true);
        editor.putString(Constants.CHAVE_EMAIL_USUARIO, email);
        editor.putString(Constants.CHAVE_SENHA, senha);
        editor.commit();
    }

    private void redirecionarParaTelaPrincipal() {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    private boolean validarUsuario(String email, String senha) {
        return email.equals(Constants.EMAIL_USUARIO) && senha.equals(Constants.SENHA_USUARIO);
    }

}
