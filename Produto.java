/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Produto.model;

/**
 *
 * @author computador
 */
public class Produto {
    private long id;
    private long codigo;
    private String nome;
    private long quantidade;
    private long valor_compra;
    private long data;
    private long unidade_medida;
    private long valor_venda;
    private long id_estoque;
    private long id_unidade;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(long quantidade) {
        this.quantidade = quantidade;
    }

    public long getValor_compra() {
        return valor_compra;
    }

    public void setValor_compra(long valor_compra) {
        this.valor_compra = valor_compra;
    }

    public long getData() {
        return data;
    }

    public void setData(long data) {
        this.data = data;
    }

    public long getUnidade_medida() {
        return unidade_medida;
    }

    public void setUnidade_medida(long unidade_medida) {
        this.unidade_medida = unidade_medida;
    }

    public long getValor_venda() {
        return valor_venda;
    }

    public void setValor_venda(long valor_venda) {
        this.valor_venda = valor_venda;
    }

    public long getId_estoque() {
        return id_estoque;
    }

    public void setId_estoque(long id_estoque) {
        this.id_estoque = id_estoque;
    }

    public long getId_unidade() {
        return id_unidade;
    }

    public void setId_unidade(long id_unidade) {
        this.id_unidade = id_unidade;
    }

    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getcodigo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getid() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
