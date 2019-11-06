/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Md. Shahidul Islam
 */
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class page2 extends javax.swing.JFrame {

   int p1=1;
   int p2=0;
   int b1=0;
   int b2=0;
   int b3=0;
   int b4=0;
   int b5=0;
   int b6=0;
   int b7=0;
   int b8=0;
   int b9=0;
   int d=0;
   int p1win=0;
 int p2win=0;
 
 String name1;
 String name2;
   
   
   
   void check()
   {
       if(button1.getText()== "O" && button2.getText()=="O" &&
                button3.getText()=="O"){
           
           page3 p3=new page3();
          p3.setVisible(true);
          this.setVisible(false);
         p3.name1=name1;
          p3.result.setText("Congratulation Winner is "+name1);
           p1win=1;
           
        }
       
       if(button1.getText()== "X" && button2.getText()=="X" &&
                button3.getText()=="X"){
          page3 p3=new page3();
          p3.setVisible(true);
          this.setVisible(false);
         p3.name2=name2;
          p3.result.setText("Congratulation Winner is "+name2);
              p2win=1;
        }
       if(button1.getText()== "O" && button4.getText()=="O" &&
                button7.getText()=="O"){
           page3 p3=new page3();
          p3.setVisible(true);
          this.setVisible(false);
         p3.name1=name1;
          p3.result.setText("Congratulation Winner is "+name1);
              p1win=1;
        }
       if(button1.getText()== "X" && button4.getText()=="X" &&
                button7.getText()=="X"){
            page3 p3=new page3();
          p3.setVisible(true);
          this.setVisible(false);
         p3.name2=name2;
          p3.result.setText("Congratulation Winner is "+name2);
             p2win=1; 
        }
       if(button1.getText()== "O" && button5.getText()=="O" &&
                button9.getText()=="O"){
            page3 p3=new page3();
          p3.setVisible(true);
          this.setVisible(false);
         p3.name1=name1;
          p3.result.setText("Congratulation Winner is "+name1);
           p1win=1;   
        }
       if(button1.getText()== "X" && button5.getText()=="X" &&
                button9.getText()=="X"){
           page3 p3=new page3();
          p3.setVisible(true);
          this.setVisible(false);
         p3.name2=name2;
          p3.result.setText("Congratulation Winner is "+name2);
              p2win=1;
        }
       if(button2.getText()== "O" && button5.getText()=="O" &&
                button8.getText()=="O"){
           page3 p3=new page3();
          p3.setVisible(true);
          this.setVisible(false);
         p3.name1=name1;
          p3.result.setText("Congratulation Winner is "+name1);
            p1win=1;  
        }
       if(button2.getText()== "X" && button5.getText()=="X" &&
                button8.getText()=="X"){
            page3 p3=new page3();
          p3.setVisible(true);
          this.setVisible(false);
         p3.name2=name2;
          p3.result.setText("Congratulation Winner is "+name2);
              p2win=1;
        }
       if(button3.getText()== "O" && button5.getText()=="O" &&
                button7.getText()=="O"){
           page3 p3=new page3();
          p3.setVisible(true);
          this.setVisible(false);
         p3.name1=name1;
          p3.result.setText("Congratulation Winner is "+name1);
             p1win=1; 
        }
       if(button3.getText()== "X" && button5.getText()=="X" &&
                button7.getText()=="X"){
           page3 p3=new page3();
          p3.setVisible(true);
          this.setVisible(false);
         p3.name2=name2;
          p3.result.setText("Congratulation Winner is "+name2);
              p2win=1;
        }
       if(button3.getText()== "O" && button6.getText()=="O" &&
                button9.getText()=="O"){
            page3 p3=new page3();
          p3.setVisible(true);
          this.setVisible(false);
         p3.name1=name1;
          p3.result.setText("Congratulation Winner is "+name1);
             p1win=1; 
        }
       if(button3.getText()== "X" && button6.getText()=="X" &&
                button9.getText()=="X"){
            page3 p3=new page3();
          p3.setVisible(true);
          this.setVisible(false);
         p3.name2=name2;
          p3.result.setText("Congratulation Winner is "+name2);
              p2win=1;
        }
       if(button4.getText()== "O" && button5.getText()=="O" &&
                button6.getText()=="O"){
          page3 p3=new page3();
          p3.setVisible(true);
          this.setVisible(false);
         p3.name1=name1;
          p3.result.setText("Congratulation Winner is "+name1);
             p1win=1; 
        }
       if(button4.getText()== "X" && button5.getText()=="X" &&
                button6.getText()=="X"){
            page3 p3=new page3();
          p3.setVisible(true);
          this.setVisible(false);
         p3.name2=name2;
          p3.result.setText("Congratulation Winner is "+name2);
              p2win=1;
        }
       if(button7.getText()== "O" && button8.getText()=="O" &&
                button9.getText()=="O"){
            page3 p3=new page3();
          p3.setVisible(true);
          this.setVisible(false);
         p3.name1=name1;
          p3.result.setText("Congratulation Winner is "+name1);
              p1win=1;
        }
       if(button7.getText()== "X" && button8.getText()=="X" &&
                button9.getText()=="X"){
            page3 p3=new page3();
          p3.setVisible(true);
          this.setVisible(false);
         p3.name2=name2;
          p3.result.setText("Congratulation Winner is "+name2);
              p2win=1;
        }
       if(d==9 && p1win==0 && p2win==0  )
       {
           page3 p3=new page3();
          p3.setVisible(true);
          this.setVisible(false);
          p3.result.setText("GAME IS DRAWN");
       }
   }
   
    public page2() {
        initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button2 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        button1 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        player1Name = new javax.swing.JTextField();
        player2Name = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });

        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });

        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });

        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });

        player1Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player1NameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(player1Name, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(player2Name, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(player2Name, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(player1Name))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
       d++;
        if(b5==0){
           if(p1==1 && p2==0)
           {
               button5.setText("O");
               p1=0;
               p2=1;
           }
           else
           {
               button5.setText("X");
               p1=1;
               p2=0;
           }
           
           b5=1;
       }
        check(); 
    }//GEN-LAST:event_button5ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
       
        d++;
        
           if(b4==0){
           if(p1==1 && p2==0)
           {
               button4.setText("O");
                p1=0;
                p2=1;
           }
           else
           {
               button4.setText("X");
                p1=1;
               p2=0;
           }
           b4=1;
       }
        check();
    }//GEN-LAST:event_button4ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
      d++;
        if(b1==0){
           if(p1==1 && p2==0)
           {
               button1.setText("O");
               p1=0;
               p2=1;
           }
           else
           {
               button1.setText("X");
               p1=1;
               p2=0;
           }
           b1=1;
       }
       check();
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        d++; 
        if(b2==0){
           if(p1==1 && p2==0)
           {
               button2.setText("O");
                p1=0;
               p2=1;
           }
           else
           {
               button2.setText("X");
                p1=1;
               p2=0;
           }
           b2=1;
       }
          check();
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
        d++;
        if(b3==0){
           if(p1==1 && p2==0)
           {
               button3.setText("O");
                p1=0;
               p2=1;
           }
           else
           {
               button3.setText("X");
                p1=1;
               p2=0;
           }
           b3=1;
       }
         check();
    }//GEN-LAST:event_button3ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
     d++;
        if(b6==0){
           if(p1==1 && p2==0)
           {
               button6.setText("O");
               p1=0;
               p2=1;
           }
           else
           {
               button6.setText("X");
               p1=1;
               p2=0;
           }
           b6=1;
       }
       check();
    }//GEN-LAST:event_button6ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
      d++;
        if(b7==0){
           if(p1==1 && p2==0)
           {
               button7.setText("O");
               p1=0;
               p2=1;
           }
           else
           {
               button7.setText("X");
               p1=1;
               p2=0;
           }
           b7=1;
       }
       check();
    }//GEN-LAST:event_button7ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
       d++;
        if(b8==0){
           if(p1==1 && p2==0)
           {
               button8.setText("O");
               p1=0;
               p2=1;
           }
           else
           {
               button8.setText("X");
               p1=1;
               p2=0;
           }
           b8=1;
       }
        check();
    }//GEN-LAST:event_button8ActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
       d++;
        if(b9==0){
           if(p1==1 && p2==0)
           {
               button9.setText("O");
               p1=0;
               p2=1;
           }
           else
           {
               button9.setText("X");
               p1=1;
               p2=0;
           }
           b9=1;
       }
        check();
    }//GEN-LAST:event_button9ActionPerformed

    private void player1NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player1NameActionPerformed
        
    }//GEN-LAST:event_player1NameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(page2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(page2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(page2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(page2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new page2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    public javax.swing.JTextField player1Name;
    public javax.swing.JTextField player2Name;
    // End of variables declaration//GEN-END:variables
}
