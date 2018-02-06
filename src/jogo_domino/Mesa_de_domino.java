package jogo_domino;

import java.util.ArrayList;

public class Mesa_de_domino {
 private ArrayList<Pedra> mesa = new ArrayList<>(); 

    public Mesa_de_domino() {
        
    }
    
    public int check_mesa (){
    return mesa.size(); 
    }
    
    public void add_mesa (int x, int y){
    Pedra e;
    e = new Pedra(x, y);
    mesa.add(e);
    }
}