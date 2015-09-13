package br.com.fiap.mob.fiapimoveis.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by Mauricio on 11/09/2015.
 */
@Table(name = "Imoveis")
public class Imovel extends Model {

    public Imovel() {
        super();
    }

    @Column(name = "codigo")
    private int codigo;

    @Column(name = "pathImagem")
    private String pathImagem;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "contato")
    private String contato;

    @Column(name = "emConstrucao")
    private boolean emConstrucao;

    @Column(name = "observacao")
    private String observacao;

    @Column(name = "latitude")
    private double latitude;

    @Column(name = "longitude")
    private double longitude;

    @Column(name = "tamanhoImovel")
    private char tamanhoImovel;

    @Column(name = "tipoImovel")
    private char tipoImovel;


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean isEmConstrucao() {
        return emConstrucao;
    }

    public void setEmConstrucao(boolean emConstrucao) {
        this.emConstrucao = emConstrucao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getPathImagem() {
        return pathImagem;
    }

    public void setPathImagem(String pathImagem) {
        this.pathImagem = pathImagem;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public char getTamanhoImovel() {
        return tamanhoImovel;
    }

    public void setTamanhoImovel(char tamanhoImovel) {
        this.tamanhoImovel = tamanhoImovel;
    }

    public char getTipoImovel() {
        return tipoImovel;
    }

    public void setTipoImovel(char tipoImovel) {
        this.tipoImovel = tipoImovel;
    }
}
