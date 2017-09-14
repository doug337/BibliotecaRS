/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

/**
 *
 * @author aluno
 */
public class Funcionario extends Usuario {

    /**
     * @return the codFuncionario
     */
    public int getCodFuncionario() {
        return codFuncionario;
    }

    /**
     * @param codFuncionario the codFuncionario to set
     */
    public void setCodFuncionario(int codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    /**
     * @return the cart_trab
     */
    public String getCart_trab() {
        return cart_trab;
    }

    /**
     * @param cart_trab the cart_trab to set
     */
    public void setCart_trab(String cart_trab) {
        this.cart_trab = cart_trab;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }
    private int codFuncionario;
    private String cart_trab;
    private float salario;
    
}
