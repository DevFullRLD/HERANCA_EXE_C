package Application;

import Utilities.Circulo;
import Utilities.Quadrado;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int opera = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor correspondente ao desejado:" + "\n" +
                                                                    "1 - Calculo de Raio" + "\n" +
                                                                    "2 - Calculo de Quadrado"));
        switch (opera) {
            case 1:{
                //ENTRADA DE DADOS
                double raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio"));
                String cor = JOptionPane.showInputDialog("Digite o cor do raio");
                Circulo circ = new Circulo(cor, raio);

                //ATRIBUICAO DE DADOS
                circ.setRaio(raio);
                circ.setColor(cor);
                circ.AreaCirculo();

                //EXIBIR DADOS
                circ.exibirCiculo();
                break;
            }
            case 2:{
                //ENTRADA DE DADOS
                double lado = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado"));
                String cor = JOptionPane.showInputDialog("Digite o cor do raio");
                Quadrado qd = new Quadrado(cor, lado);

                //ATRIBUICAO DE DADOS
                qd.setLado(lado);
                qd.setColor(cor);
                qd.AreaQuadrado();

                //EXIBIR DADOS
                qd.exibirQuadrado();
                break;
            }
            default:{
                JOptionPane.showMessageDialog(null, "Opção invalida, execute o programa novamente!");
                break;
            }
        }
    }
}
