package jogo_domino;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Wit
 */
public class Domino {
private ArrayList<Pedra> conjuto = new ArrayList<>();
public Domino() {
    
Pedra p; 
p = new Pedra(0,0);
conjuto.add(p);
p = new Pedra(0,1);
conjuto.add(p);
p = new Pedra(0,2);
conjuto.add(p);
p = new Pedra(0,3);
conjuto.add(p);
p = new Pedra(0,4);
conjuto.add(p);
p = new Pedra(0,5);
conjuto.add(p);
p = new Pedra(0,6);
conjuto.add(p);
p = new Pedra(1,1);
conjuto.add(p);
p = new Pedra(1,2);
conjuto.add(p);
p = new Pedra(1,3);
conjuto.add(p);
p = new Pedra(1,4);
conjuto.add(p);
p = new Pedra(1,5);
conjuto.add(p);
p = new Pedra(1,6);
conjuto.add(p);
p = new Pedra(2,2);
conjuto.add(p);
p = new Pedra(2,3);
conjuto.add(p);
p = new Pedra(2,4);
conjuto.add(p);
p = new Pedra(2,5);
conjuto.add(p);
p = new Pedra(2,6);
conjuto.add(p);
p = new Pedra(3,3);
conjuto.add(p);
p = new Pedra(3,4);
conjuto.add(p);
p = new Pedra(3,5);
conjuto.add(p);
p = new Pedra(3,6);
conjuto.add(p);
p = new Pedra(4,4);
conjuto.add(p);
p = new Pedra(4,5);
conjuto.add(p);
p = new Pedra(4,6);
conjuto.add(p);
p = new Pedra(5,5);
conjuto.add(p);
p = new Pedra(5,6);
conjuto.add(p);
p = new Pedra(6,6);
conjuto.add(p);


Collections.shuffle(conjuto);

}

    public ArrayList<Pedra> getConjuto() {
        return conjuto;
    }

    public void setConjuto(ArrayList<Pedra> conjuto) {
        this.conjuto = conjuto;
    }
}