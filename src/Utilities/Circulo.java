package Utilities;

import javax.swing.*;

public class Circulo extends Figura{
    private double raio, result = 0.0;
    private final double pi = 3.14;

    public Circulo(String color, double raio) {
        super(color);
        this.raio = raio;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getPi() {
        return pi;
    }

    public void AreaCirculo(){
       result = pi * (raio*raio);
    }

    public void exibirCiculo(){
        JOptionPane.showMessageDialog(null,"O Valor do Raio é: " + getResult()+"\n"+
                                                                     "Cor: " + getColor());
    }

}
