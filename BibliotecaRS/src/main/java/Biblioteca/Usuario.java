/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Usuario {

    /**
     * @return the codUsuario
     */
    public int getCodUsuario() {
        return codUsuario;
    }

    /**
     * @param codUsuario the codUsuario to set
     */
    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public int getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the rg
     */
    public int getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(int rg) {
        this.rg = rg;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the datade_nasc
     */
    public Date getDatade_nasc() {
        return datade_nasc;
    }

    /**
     * @param datade_nasc the datade_nasc to set
     */
    public void setDatade_nasc(Date datade_nasc) {
        this.datade_nasc = datade_nasc;
    }

    /**
     * @return the endereco
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the itemPegos
     */
    public String getItemPegos() {
        return itemPegos;
    }

    /**
     * @param itemPegos the itemPegos to set
     */
    public void setItemPegos(String itemPegos) {
        this.itemPegos = itemPegos;
    }
    private int codUsuario;
    private String nome;
    private int cpf;
    private int rg;
    private String email;
    private Date datade_nasc;
    private Endereco endereco;
    private String itemPegos;
    
}







