package br.com.fiap.mob.fiapimoveis.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by Mauricio on 11/09/2015.
 */
@Table(name = "usuario")
public class Usuario extends Model {

    public Usuario(){
        super();
    }


    @Column(name = "nome")
    private String nome;

    @Column(name = "email", unique = true , onUniqueConflict = Column.ConflictAction.FAIL)
    private String email;

    @Column(name = "senha")
    private String senha;

    private boolean manterConectado;


    public boolean isManterConectado() {
        return manterConectado;
    }

    public void setManterConectado(boolean manterConectado) {
        this.manterConectado = manterConectado;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
