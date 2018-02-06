package jogo_domino;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author Wit
 */
public class Tela extends JFrame {

    ImageIcon a_tela = new ImageIcon(getClass().getResource("folder\\tela.png"));
    JLabel t0 = new JLabel(a_tela);

    ImageIcon domi0 = new ImageIcon(getClass().getResource("folder\\0.png"));
    JLabel pe0 = new JLabel(domi0);

    ImageIcon domi1 = new ImageIcon(getClass().getResource("folder\\1.png"));
    JLabel pe1 = new JLabel(domi1);

    ImageIcon domi2 = new ImageIcon(getClass().getResource("folder\\2.png"));
    JLabel pe2 = new JLabel(domi2);

    ImageIcon domi3 = new ImageIcon(getClass().getResource("folder\\3.png"));
    JLabel pe3 = new JLabel(domi3);

    ImageIcon domi4 = new ImageIcon(getClass().getResource("folder\\4.png"));
    JLabel pe4 = new JLabel(domi4);

    ImageIcon domi5 = new ImageIcon(getClass().getResource("folder\\5.png"));
    JLabel pe5 = new JLabel(domi5);

    ImageIcon domi6 = new ImageIcon(getClass().getResource("folder\\6.png"));
    JLabel pe6 = new JLabel(domi6);
    
    ImageIcon nulo = new ImageIcon(getClass().getResource("folder\\nulo.png"));
    JLabel nulo1 = new JLabel(nulo);


    public Tela() {
        setTitle("Domino Advanced criador elton diogo");
        setSize(1070, 803);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {

        Graphics2D g0 = (Graphics2D) g;
        Image imgtela = a_tela.getImage();

        AffineTransform at0 = AffineTransform.getTranslateInstance(0, 0);
        at0.rotate(Math.toRadians(0));
        g0.drawImage(imgtela, at0, t0);

        //imagens das pedras que iniciam
        AffineTransform at1 = AffineTransform.getTranslateInstance(400, 690);
        at1.rotate(Math.toRadians(180));
        
        switch (Jogador.jogador1.get(0).valor1) {
            case 0:
                g0.drawImage(domi0.getImage(), at1, t0);
                break;
            case 1:
                g0.drawImage(domi1.getImage(), at1, t0);
                break;
            case 2:
                g0.drawImage(domi2.getImage(), at1, t0);
                break;
            case 3:
                g0.drawImage(domi3.getImage(), at1, t0);
                break;
            case 4:
                g0.drawImage(domi4.getImage(), at1, t0);
                break;
            case 5:
                g0.drawImage(domi5.getImage(), at1, t0);
                break;
            case 6:
                g0.drawImage(domi6.getImage(), at1, t0);
                break;
            default:
                g0.drawImage(nulo.getImage(), at1, t0);
        }
        
        AffineTransform at2 = AffineTransform.getTranslateInstance(357, 592);
        at2.rotate(Math.toRadians(0));
        switch (Jogador.jogador1.get(0).valor2) {
            case 0:
                g0.drawImage(domi0.getImage(), at2, t0);
                break;
            case 1:
                g0.drawImage(domi1.getImage(), at2, t0);
                break;
            case 2:
                g0.drawImage(domi2.getImage(), at2, t0);
                break;
            case 3:
                g0.drawImage(domi3.getImage(), at2, t0);
                break;
            case 4:
                g0.drawImage(domi4.getImage(), at2, t0);
                break;
            case 5:
                g0.drawImage(domi5.getImage(), at2, t0);
                break;
            case 6:
                g0.drawImage(domi6.getImage(), at2, t0);
                break;
            default:
                g0.drawImage(nulo.getImage(), at2, t0);
        }

        AffineTransform at3 = AffineTransform.getTranslateInstance(450, 690);
        at3.rotate(Math.toRadians(180));
         switch (Jogador.jogador1.get(1).valor1) {
            case 0:
                g0.drawImage(domi0.getImage(), at3, t0);
                break;
            case 1:
                g0.drawImage(domi1.getImage(), at3, t0);
                break;
            case 2:
                g0.drawImage(domi2.getImage(), at3, t0);
                break;
            case 3:
                g0.drawImage(domi3.getImage(), at3, t0);
                break;
            case 4:
                g0.drawImage(domi4.getImage(), at3, t0);
                break;
            case 5:
                g0.drawImage(domi5.getImage(), at3, t0);
                break;
            case 6:
                g0.drawImage(domi6.getImage(), at3, t0);
                break;
            default:
                g0.drawImage(nulo.getImage(), at3, t0);
        }

        AffineTransform at4 = AffineTransform.getTranslateInstance(407, 592);
        at4.rotate(Math.toRadians(0));
        switch (Jogador.jogador1.get(1).valor2) {
            case 0:
                g0.drawImage(domi0.getImage(), at4, t0);
                break;
            case 1:
                g0.drawImage(domi1.getImage(), at4, t0);
                break;
            case 2:
                g0.drawImage(domi2.getImage(), at4, t0);
                break;
            case 3:
                g0.drawImage(domi3.getImage(), at4, t0);
                break;
            case 4:
                g0.drawImage(domi4.getImage(), at4, t0);
                break;
            case 5:
                g0.drawImage(domi5.getImage(), at4, t0);
                break;
            case 6:
                g0.drawImage(domi6.getImage(), at4, t0);
                break;
            default:
                g0.drawImage(nulo.getImage(), at4, t0);
        }

        AffineTransform at5 = AffineTransform.getTranslateInstance(500, 690);
        at5.rotate(Math.toRadians(180));
         switch (Jogador.jogador1.get(2).valor1) {
            case 0:
                g0.drawImage(domi0.getImage(), at5, t0);
                break;
            case 1:
                g0.drawImage(domi1.getImage(), at5, t0);
                break;
            case 2:
                g0.drawImage(domi2.getImage(), at5, t0);
                break;
            case 3:
                g0.drawImage(domi3.getImage(), at5, t0);
                break;
            case 4:
                g0.drawImage(domi4.getImage(), at5, t0);
                break;
            case 5:
                g0.drawImage(domi5.getImage(), at5, t0);
                break;
            case 6:
                g0.drawImage(domi6.getImage(), at5, t0);
                break;
            default:
                g0.drawImage(nulo.getImage(), at5, t0);
        }

        AffineTransform at6 = AffineTransform.getTranslateInstance(457, 592);
        at6.rotate(Math.toRadians(0));
         switch (Jogador.jogador1.get(2).valor2) {
            case 0:
                g0.drawImage(domi0.getImage(), at6, t0);
                break;
            case 1:
                g0.drawImage(domi1.getImage(), at6, t0);
                break;
            case 2:
                g0.drawImage(domi2.getImage(), at6, t0);
                break;
            case 3:
                g0.drawImage(domi3.getImage(), at6, t0);
                break;
            case 4:
                g0.drawImage(domi4.getImage(), at6, t0);
                break;
            case 5:
                g0.drawImage(domi5.getImage(), at6, t0);
                break;
            case 6:
                g0.drawImage(domi6.getImage(), at6, t0);
                break;
            default:
                g0.drawImage(nulo.getImage(), at6, t0);
        }

        AffineTransform at7 = AffineTransform.getTranslateInstance(550, 690);
        at7.rotate(Math.toRadians(180));
         switch (Jogador.jogador1.get(3).valor1) {
            case 0:
                g0.drawImage(domi0.getImage(), at7, t0);
                break;
            case 1:
                g0.drawImage(domi1.getImage(), at7, t0);
                break;
            case 2:
                g0.drawImage(domi2.getImage(), at7, t0);
                break;
            case 3:
                g0.drawImage(domi3.getImage(), at7, t0);
                break;
            case 4:
                g0.drawImage(domi4.getImage(), at7, t0);
                break;
            case 5:
                g0.drawImage(domi5.getImage(), at7, t0);
                break;
            case 6:
                g0.drawImage(domi6.getImage(), at7, t0);
                break;
            default:
                g0.drawImage(nulo.getImage(), at7, t0);
        }

        AffineTransform at8 = AffineTransform.getTranslateInstance(507, 592);
        at8.rotate(Math.toRadians(0));
        
        switch (Jogador.jogador1.get(3).valor2) {
            case 0:
                g0.drawImage(domi0.getImage(), at8, t0);
                break;
            case 1:
                g0.drawImage(domi1.getImage(), at8, t0);
                break;
            case 2:
                g0.drawImage(domi2.getImage(), at8, t0);
                break;
            case 3:
                g0.drawImage(domi3.getImage(), at8, t0);
                break;
            case 4:
                g0.drawImage(domi4.getImage(), at8, t0);
                break;
            case 5:
                g0.drawImage(domi5.getImage(), at8, t0);
                break;
            case 6:
                g0.drawImage(domi6.getImage(), at8, t0);
                break;
            default:
                g0.drawImage(nulo.getImage(), at8, t0);
        }

        AffineTransform at9 = AffineTransform.getTranslateInstance(600, 690);
        at9.rotate(Math.toRadians(180));
        switch (Jogador.jogador1.get(4).valor1) {
            case 0:
                g0.drawImage(domi0.getImage(), at9, t0);
                break;
            case 1:
                g0.drawImage(domi1.getImage(), at9, t0);
                break;
            case 2:
                g0.drawImage(domi2.getImage(), at9, t0);
                break;
            case 3:
                g0.drawImage(domi3.getImage(), at9, t0);
                break;
            case 4:
                g0.drawImage(domi4.getImage(), at9, t0);
                break;
            case 5:
                g0.drawImage(domi5.getImage(), at9, t0);
                break;
            case 6:
                g0.drawImage(domi6.getImage(), at9, t0);
                break;
            default:
                g0.drawImage(nulo.getImage(), at9, t0);
        }

        AffineTransform at10 = AffineTransform.getTranslateInstance(557, 592);
        at10.rotate(Math.toRadians(0));
        switch (Jogador.jogador1.get(4).valor2) {
            case 0:
                g0.drawImage(domi0.getImage(), at10, t0);
                break;
            case 1:
                g0.drawImage(domi1.getImage(), at10, t0);
                break;
            case 2:
                g0.drawImage(domi2.getImage(), at10, t0);
                break;
            case 3:
                g0.drawImage(domi3.getImage(), at10, t0);
                break;
            case 4:
                g0.drawImage(domi4.getImage(), at10, t0);
                break;
            case 5:
                g0.drawImage(domi5.getImage(), at10, t0);
                break;
            case 6:
                g0.drawImage(domi6.getImage(), at10, t0);
                break;
            default:
                g0.drawImage(nulo.getImage(), at10, t0);
        }

        AffineTransform at11 = AffineTransform.getTranslateInstance(650, 690);
        at11.rotate(Math.toRadians(180));
        switch (Jogador.jogador1.get(5).valor1) {
            case 0:
                g0.drawImage(domi0.getImage(), at11, t0);
                break;
            case 1:
                g0.drawImage(domi1.getImage(), at11, t0);
                break;
            case 2:
                g0.drawImage(domi2.getImage(), at11, t0);
                break;
            case 3:
                g0.drawImage(domi3.getImage(), at11, t0);
                break;
            case 4:
                g0.drawImage(domi4.getImage(), at11, t0);
                break;
            case 5:
                g0.drawImage(domi5.getImage(), at11, t0);
                break;
            case 6:
                g0.drawImage(domi6.getImage(), at11, t0);
                break;
            default:
                g0.drawImage(nulo.getImage(), at11, t0);
        }

        AffineTransform at12 = AffineTransform.getTranslateInstance(607, 592);
        at12.rotate(Math.toRadians(0));
        switch (Jogador.jogador1.get(5).valor2) {
            case 0:
                g0.drawImage(domi0.getImage(), at12, t0);
                break;
            case 1:
                g0.drawImage(domi1.getImage(), at12, t0);
                break;
            case 2:
                g0.drawImage(domi2.getImage(), at12, t0);
                break;
            case 3:
                g0.drawImage(domi3.getImage(), at12, t0);
                break;
            case 4:
                g0.drawImage(domi4.getImage(), at12, t0);
                break;
            case 5:
                g0.drawImage(domi5.getImage(), at12, t0);
                break;
            case 6:
                g0.drawImage(domi6.getImage(), at12, t0);
                break;
            default:
                g0.drawImage(nulo.getImage(), at12, t0);
        }

        AffineTransform at13 = AffineTransform.getTranslateInstance(700, 690);
        at13.rotate(Math.toRadians(180));
        switch (Jogador.jogador1.get(6).valor1) {
            case 0:
                g0.drawImage(domi0.getImage(), at13, t0);
                break;
            case 1:
                g0.drawImage(domi1.getImage(), at13, t0);
                break;
            case 2:
                g0.drawImage(domi2.getImage(), at13, t0);
                break;
            case 3:
                g0.drawImage(domi3.getImage(), at13, t0);
                break;
            case 4:
                g0.drawImage(domi4.getImage(), at13, t0);
                break;
            case 5:
                g0.drawImage(domi5.getImage(), at13, t0);
                break;
            case 6:
                g0.drawImage(domi6.getImage(), at13, t0);
                break;
            default:
                g0.drawImage(nulo.getImage(), at13, t0);
        }

        AffineTransform at14 = AffineTransform.getTranslateInstance(657, 592);
        at14.rotate(Math.toRadians(0));
         switch (Jogador.jogador1.get(6).valor2) {
            case 0:
                g0.drawImage(domi0.getImage(), at14, t0);
                break;
            case 1:
                g0.drawImage(domi1.getImage(), at14, t0);
                break;
            case 2:
                g0.drawImage(domi2.getImage(), at14, t0);
                break;
            case 3:
                g0.drawImage(domi3.getImage(), at14, t0);
                break;
            case 4:
                g0.drawImage(domi4.getImage(), at14, t0);
                break;
            case 5:
                g0.drawImage(domi5.getImage(), at14, t0);
                break;
            case 6:
                g0.drawImage(domi6.getImage(), at14, t0);
                break;
            default:
                g0.drawImage(nulo.getImage(), at14, t0);
        }

    }

}