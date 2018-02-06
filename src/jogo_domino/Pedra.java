package jogo_domino;
public class Pedra {
int valor1;
int valor2;

    public Pedra(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    Pedra() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

}