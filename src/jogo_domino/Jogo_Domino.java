package jogo_domino;

import java.util.ArrayList;
import java.util.List;


//@author Wit

public class Jogo_Domino {
public static void main(String[] args) {
    
Jogador jg = new Jogador();
Domino um = new Domino();


System.out.println("LENDO AS PEDRAS DOS JOGADORES \n\n");

System.out.println("LENDO DO JOGADOR 1 pedra 1 [" +jg.getJogador1().get(0).valor1 +"|"+jg.getJogador1().get(0).valor2+ "]");
System.out.println("LENDO DO JOGADOR 1 pedra 2 [" +jg.getJogador1().get(1).valor1 +"|"+jg.getJogador1().get(1).valor2+ "]");
System.out.println("LENDO DO JOGADOR 1 pedra 3 [" +jg.getJogador1().get(2).valor1 +"|"+jg.getJogador1().get(2).valor2+ "]");
System.out.println("LENDO DO JOGADOR 1 pedra 4 [" +jg.getJogador1().get(3).valor1 +"|"+jg.getJogador1().get(3).valor2+ "]");
System.out.println("LENDO DO JOGADOR 1 pedra 5 [" +jg.getJogador1().get(4).valor1 +"|"+jg.getJogador1().get(4).valor2+ "]");
System.out.println("LENDO DO JOGADOR 1 pedra 6 [" +jg.getJogador1().get(5).valor1 +"|"+jg.getJogador1().get(5).valor2+ "]");
System.out.println("LENDO DO JOGADOR 1 pedra 7 [" +jg.getJogador1().get(6).valor1 +"|"+jg.getJogador1().get(6).valor2+ "]");
/*System.out.println("");
System.out.println("LENDO DO JOGADOR 2 pedra 1 [" +jg.getJogador2().get(0).valor1 +"|"+jg.getJogador2().get(0).valor2+ "]");
System.out.println("LENDO DO JOGADOR 2 pedra 2 [" +jg.getJogador2().get(1).valor1 +"|"+jg.getJogador2().get(1).valor2+ "]");
System.out.println("LENDO DO JOGADOR 2 pedra 3 [" +jg.getJogador2().get(2).valor1 +"|"+jg.getJogador2().get(2).valor2+ "]");
System.out.println("LENDO DO JOGADOR 2 pedra 4 [" +jg.getJogador2().get(3).valor1 +"|"+jg.getJogador2().get(3).valor2+ "]");
System.out.println("LENDO DO JOGADOR 2 pedra 5 [" +jg.getJogador2().get(4).valor1 +"|"+jg.getJogador2().get(4).valor2+ "]");
System.out.println("LENDO DO JOGADOR 2 pedra 6 [" +jg.getJogador2().get(5).valor1 +"|"+jg.getJogador2().get(5).valor2+ "]");
System.out.println("LENDO DO JOGADOR 2 pedra 7 [" +jg.getJogador2().get(6).valor1 +"|"+jg.getJogador2().get(6).valor2+ "]");

System.out.println("");
System.out.println("LENDO DO JOGADOR 3 pedra 1 [" +jg.getJogador3().get(0).valor1 +"|"+jg.getJogador3().get(0).valor2+ "]");
System.out.println("LENDO DO JOGADOR 3 pedra 2 [" +jg.getJogador3().get(1).valor1 +"|"+jg.getJogador3().get(1).valor2+ "]");
System.out.println("LENDO DO JOGADOR 3 pedra 3 [" +jg.getJogador3().get(2).valor1 +"|"+jg.getJogador3().get(2).valor2+ "]");
System.out.println("LENDO DO JOGADOR 3 pedra 4 [" +jg.getJogador3().get(3).valor1 +"|"+jg.getJogador3().get(3).valor2+ "]");
System.out.println("LENDO DO JOGADOR 3 pedra 5 [" +jg.getJogador3().get(4).valor1 +"|"+jg.getJogador3().get(4).valor2+ "]");
System.out.println("LENDO DO JOGADOR 3 pedra 6 [" +jg.getJogador3().get(5).valor1 +"|"+jg.getJogador3().get(5).valor2+ "]");
System.out.println("LENDO DO JOGADOR 3 pedra 7 [" +jg.getJogador3().get(6).valor1 +"|"+jg.getJogador3().get(6).valor2+ "]");

System.out.println("");
System.out.println("LENDO DO JOGADOR 4 pedra 1 [" +jg.getJogador4().get(0).valor1 +"|"+jg.getJogador4().get(0).valor2+ "]");
System.out.println("LENDO DO JOGADOR 4 pedra 2 [" +jg.getJogador4().get(1).valor1 +"|"+jg.getJogador4().get(1).valor2+ "]");
System.out.println("LENDO DO JOGADOR 4 pedra 3 [" +jg.getJogador4().get(2).valor1 +"|"+jg.getJogador4().get(2).valor2+ "]");
System.out.println("LENDO DO JOGADOR 4 pedra 4 [" +jg.getJogador4().get(3).valor1 +"|"+jg.getJogador4().get(3).valor2+ "]");
System.out.println("LENDO DO JOGADOR 4 pedra 5 [" +jg.getJogador4().get(4).valor1 +"|"+jg.getJogador4().get(4).valor2+ "]");
System.out.println("LENDO DO JOGADOR 4 pedra 6 [" +jg.getJogador4().get(5).valor1 +"|"+jg.getJogador4().get(5).valor2+ "]");
System.out.println("LENDO DO JOGADOR 4 pedra 7 [" +jg.getJogador4().get(6).valor1 +"|"+jg.getJogador4().get(6).valor2+ "]");
System.out.println("");


System.out.println("total 1-"+jg.getJogador1().size());
System.out.println("total 2-"+jg.getJogador2().size());
System.out.println("total 3-"+jg.getJogador3().size());
System.out.println("total 4-"+jg.getJogador4().size());
System.out.println("");

jg.Sua_vez();
System.out.println("DEPOIS DE SAIR COM [6|6]");

System.out.println("total jogador 1 - "+jg.getJogador1().size());
System.out.println("total jogador 2 - "+jg.getJogador2().size());
System.out.println("total jogador 3 - "+jg.getJogador3().size());
System.out.println("total jogador 4 - "+jg.getJogador4().size());
*/

//System.out.println("total "+jg.getJogador1().size());
//Mesa_de_domino m = new Mesa_de_domino();
//m.add_mesa(1,1);
//System.out.println(m.check_mesa());
//m.add_mesa(1,2);
//System.out.println(m.check_mesa());
}  
}