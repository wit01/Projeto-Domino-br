package jogo_domino;

import java.util.ArrayList;

public class Jogador {

    private final String nome[] = {"A", "B", "C", "D"};
    public boolean iniciar;
    static ArrayList<Pedra> jogador1 = new ArrayList<>();
    private ArrayList<Pedra> jogador2 = new ArrayList<>();
    private ArrayList<Pedra> jogador3 = new ArrayList<>();
    private ArrayList<Pedra> jogador4 = new ArrayList<>();

    public Jogador() {
        Domino d = new Domino();
        new Tela();
        Pedra j;

// jogador 1
        j = new Pedra(d.getConjuto().get(0).valor1, d.getConjuto().get(0).valor2);
        jogador1.add(j);
        j = new Pedra(d.getConjuto().get(1).valor1, d.getConjuto().get(1).valor2);
        jogador1.add(j);
        j = new Pedra(d.getConjuto().get(2).valor1, d.getConjuto().get(2).valor2);
        jogador1.add(j);
        j = new Pedra(d.getConjuto().get(3).valor1, d.getConjuto().get(3).valor2);
        jogador1.add(j);
        j = new Pedra(d.getConjuto().get(4).valor1, d.getConjuto().get(4).valor2);
        jogador1.add(j);
        j = new Pedra(d.getConjuto().get(5).valor1, d.getConjuto().get(5).valor2);
        jogador1.add(j);
        j = new Pedra(d.getConjuto().get(6).valor1, d.getConjuto().get(6).valor2);
        jogador1.add(j);

// jogador 2
        j = new Pedra(d.getConjuto().get(7).valor1, d.getConjuto().get(7).valor2);
        jogador2.add(j);
        j = new Pedra(d.getConjuto().get(8).valor1, d.getConjuto().get(8).valor2);
        jogador2.add(j);
        j = new Pedra(d.getConjuto().get(9).valor1, d.getConjuto().get(9).valor2);
        jogador2.add(j);
        j = new Pedra(d.getConjuto().get(10).valor1, d.getConjuto().get(10).valor2);
        jogador2.add(j);
        j = new Pedra(d.getConjuto().get(11).valor1, d.getConjuto().get(11).valor2);
        jogador2.add(j);
        j = new Pedra(d.getConjuto().get(12).valor1, d.getConjuto().get(12).valor2);
        jogador2.add(j);
        j = new Pedra(d.getConjuto().get(13).valor1, d.getConjuto().get(13).valor2);
        jogador2.add(j);

// jogador 3
        j = new Pedra(d.getConjuto().get(14).valor1, d.getConjuto().get(14).valor2);
        jogador3.add(j);
        j = new Pedra(d.getConjuto().get(15).valor1, d.getConjuto().get(15).valor2);
        jogador3.add(j);
        j = new Pedra(d.getConjuto().get(16).valor1, d.getConjuto().get(16).valor2);
        jogador3.add(j);
        j = new Pedra(d.getConjuto().get(17).valor1, d.getConjuto().get(17).valor2);
        jogador3.add(j);
        j = new Pedra(d.getConjuto().get(18).valor1, d.getConjuto().get(18).valor2);
        jogador3.add(j);
        j = new Pedra(d.getConjuto().get(19).valor1, d.getConjuto().get(19).valor2);
        jogador3.add(j);
        j = new Pedra(d.getConjuto().get(20).valor1, d.getConjuto().get(20).valor2);
        jogador3.add(j);

// jogador 4
        j = new Pedra(d.getConjuto().get(21).valor1, d.getConjuto().get(21).valor2);
        jogador4.add(j);
        j = new Pedra(d.getConjuto().get(22).valor1, d.getConjuto().get(22).valor2);
        jogador4.add(j);
        j = new Pedra(d.getConjuto().get(23).valor1, d.getConjuto().get(23).valor2);
        jogador4.add(j);
        j = new Pedra(d.getConjuto().get(24).valor1, d.getConjuto().get(24).valor2);
        jogador4.add(j);
        j = new Pedra(d.getConjuto().get(25).valor1, d.getConjuto().get(25).valor2);
        jogador4.add(j);
        j = new Pedra(d.getConjuto().get(26).valor1, d.getConjuto().get(26).valor2);
        jogador4.add(j);
        j = new Pedra(d.getConjuto().get(27).valor1, d.getConjuto().get(27).valor2);
        jogador4.add(j);

    }

    public ArrayList<Pedra> getJogador1() {
        return jogador1;
    }

    public void setJogador1(ArrayList<Pedra> jogador1) {
        this.jogador1 = jogador1;
    }

    public ArrayList<Pedra> getJogador2() {
        return jogador2;
    }

    public void setJogador2(ArrayList<Pedra> jogador2) {
        this.jogador2 = jogador2;
    }

    public ArrayList<Pedra> getJogador3() {
        return jogador3;
    }

    public void setJogador3(ArrayList<Pedra> jogador3) {
        this.jogador3 = jogador3;
    }

    public ArrayList<Pedra> getJogador4() {
        return jogador4;
    }

    public void setJogador4(ArrayList<Pedra> jogador4) {
        this.jogador4 = jogador4;
    }

    public void Sua_vez() {
        if (iniciar == false) {
           iniciar = true; 
            for (int i = 0; i < 6; i++) {
                if (jogador1.get(i).valor1 == 6 && jogador1.get(i).valor2 == 6) {
                    jogador1.remove(i);
                } else if (jogador2.get(i).valor1 == 6 && jogador2.get(i).valor2 == 6) {
                    jogador2.remove(i);
                } else if (jogador3.get(i).valor1 == 6 && jogador3.get(i).valor2 == 6) {
                    jogador3.remove(i);
                } else if (jogador4.get(i).valor1 == 6 && jogador4.get(i).valor2 == 6) {
                    jogador4.remove(i);
                }

            }

        } else {
        }

    }

}
