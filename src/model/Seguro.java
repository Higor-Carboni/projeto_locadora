/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author arthu
 */
public class Seguro {
    private int PkSeguro;
    private String Tipo_seguro;
    private double Valor;
    private int Valor_Cobertura;

    

    public Seguro() {
    }

    
    
    public Seguro(int PkSeguro, String Tipo_seguro, double Valor, int Valor_Cobertura) {
        this.PkSeguro = PkSeguro;
        this.Tipo_seguro = Tipo_seguro;
        this.Valor = Valor;
        this.Valor_Cobertura = Valor_Cobertura;
    }

    public void setPkSeguro(int PkSeguro) {
        this.PkSeguro = PkSeguro;
    }

    public void setTipo_seguro(String Tipo_seguro) {
        this.Tipo_seguro = Tipo_seguro;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }
    
    public void setValor_Cobertura(int Valor_Cobertura) {
        this.Valor_Cobertura = Valor_Cobertura;
    }

    public int getPkSeguro() {
        return PkSeguro;
    }

    public String getTipo_seguro() {
        return Tipo_seguro;
    }

    public double getValor() {
        return Valor;
    }
    
    public int getValor_Cobertura() {
        return Valor_Cobertura;
    }

    
}
