import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JogoDaVelha extends JFrame {

    JButton[] bt = new JButton[9];

    boolean xo = false;
    boolean[] click = new boolean[9];
    public JogoDaVelha (){
        setVisible(true);
        setTitle("Jogo da Velha");
        setDefaultCloseOperation(3);
        setLayout(null);
        setBounds(350,350,700,500);
        int cont = 0;
         for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {


                 bt[cont] = new JButton();
                 add(bt[cont]);
                 bt[cont].setBounds((100*i)+200,(100*j)+75,95,95);
                 bt[cont].setFont(new Font("Arial",Font.BOLD,50));
                 cont++;

             }

        }

         for(int i = 0; i < 9; i++) {
             click[i] = false;

         }
         bt[0].addActionListener(new java.awt.event.ActionListener() {

             @Override
             public void actionPerformed(ActionEvent ae) {
                 if(!click[0]) {
                     click[0] = true;
                     mudar(bt[0]);
                 }
             }
         });

        bt[1].addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if(!click[1]) {
                    click[1] = true;
                    mudar(bt[1]);
                }
            }
        });

        bt[2].addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if(!click[2]) {
                    click[2] = true;
                    mudar(bt[2]);
                }
            }
        });

        bt[3].addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if(!click[3]) {
                    click[3] = true;
                    mudar(bt[3]);
                }
            }
        });

        bt[4].addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if(!click[4]) {
                    click[4] = true;
                    mudar(bt[4]);
                }
            }
        });


        bt[5].addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if(!click[5]) {
                    click[5] = true;
                    mudar(bt[5]);
                }
            }
        });


        bt[6].addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if(!click[6]) {
                    click[6] = true;
                    mudar(bt[6]);
                }
            }
        });


        bt[7].addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if(!click[7]) {
                    click[7] = true;
                    mudar(bt[7]);
                }
            }
        });


        bt[8].addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if(!click[8]) {
                    click[8] = true;
                    mudar(bt[8]);
                }
            }
        });



    }

    public void mudar (JButton btn){

        if(xo){
            btn.setText("O");
            xo = false;
        }else {
            btn.setText("X");
            xo = true;
        }
        winner();
    }

    public void winner (){
        int cont = 0;
        for (int i = 0; i < 9; i++) {
        if(click[i] != false){
                cont++;
            }
        }
        if((bt[0].getText().equals ("X") && bt[1].getText().equals ("X") && bt[2].getText().equals ("X"))
                ||(bt[3].getText().equals ("X") && bt[4].getText().equals ("X") && bt[5].getText().equals ("X"))
                ||(bt[6].getText().equals ("X") && bt[7].getText().equals ("X") && bt[8].getText().equals ("X"))
                ||(bt[0].getText().equals ("X") && bt[3].getText().equals ("X") && bt[6].getText().equals ("X"))
                ||(bt[1].getText().equals ("X") && bt[4].getText().equals ("X") && bt[7].getText().equals ("X"))
                ||(bt[2].getText().equals ("X") && bt[5].getText().equals ("X") && bt[8].getText().equals ("X"))
                ||(bt[0].getText().equals ("X") && bt[4].getText().equals ("X") && bt[8].getText().equals ("X"))
                ||(bt[6].getText().equals ("X") && bt[4].getText().equals ("X") && bt[2].getText().equals ("X"))
                ){
                JOptionPane.showMessageDialog(null, "O Jogador X ganhou!!");
                cleanGame();

        }else if((bt[0].getText().equals ("O") && bt[1].getText().equals ("O") && bt[2].getText().equals ("O"))
                ||(bt[3].getText().equals ("O") && bt[4].getText().equals ("O") && bt[5].getText().equals ("O"))
                ||(bt[6].getText().equals ("O") && bt[7].getText().equals ("O") && bt[8].getText().equals ("O"))
                ||(bt[0].getText().equals ("O") && bt[3].getText().equals ("O") && bt[6].getText().equals ("O"))
                ||(bt[1].getText().equals ("O") && bt[4].getText().equals ("O") && bt[7].getText().equals ("O"))
                ||(bt[2].getText().equals ("O") && bt[5].getText().equals ("O") && bt[8].getText().equals ("O"))
                ||(bt[0].getText().equals ("O") && bt[4].getText().equals ("O") && bt[8].getText().equals ("O"))
                ||(bt[6].getText().equals ("O") && bt[4].getText().equals ("O") && bt[2].getText().equals ("O"))
        ){
            JOptionPane.showMessageDialog(null, "O Jogador O ganhou!!");
            cleanGame();

        }else if(cont == 9){
            JOptionPane.showMessageDialog(null, "Empate !!");
            cleanGame();
        }

    }
    public void cleanGame(){

        for (int i = 0; i < 9; i++) {
            bt[i].setText("");
            click[i] = false;
        }
    }

    public static void main(String[] args) {

        new JogoDaVelha();

    }


}
