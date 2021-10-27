package Utilities;

import javax.swing.*;

public class Quadrado extends Figura{
    private double lado, result = 0.0;

    public Quadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void AreaQuadrado(){
       result = lado* lado;
    }

    public void exibirQuadrado(){
        JOptionPane.showMessageDialog(null,"O Valor do Quadrado é: " + getResult()+"\n"+
                                                                    "Cor: " + getColor());
    }
}
