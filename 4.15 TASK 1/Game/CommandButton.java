/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;
import java.util.*;
/**
*
* @author MinGyu
*/
public class CommandButton extends javax.swing.JDialog {

   /**
    * Creates new form CommandButton
    */
	char[] q = {'X','X','X','X','X','X','X','X'};
	char[] clone = new char[8];
	int cnt=0;
   public CommandButton(java.awt.Frame parent, boolean modal) {
       super(parent, modal);
       initComponents();
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
   private void initComponents() {

       jButton1 = new javax.swing.JButton();
       jButton2 = new javax.swing.JButton();
       jButton3 = new javax.swing.JButton();
       jButton4 = new javax.swing.JButton();
       jButton5 = new javax.swing.JButton();
       jButton6 = new javax.swing.JButton();
       jButton7 = new javax.swing.JButton();
       jButton8 = new javax.swing.JButton();
       jButton9 = new javax.swing.JButton();
       jButton10 = new javax.swing.JButton();
       jLabel[0] = new javax.swing.JLabel();
       jLabel[1] = new javax.swing.JLabel();
       jLabel[2] = new javax.swing.JLabel();
       jLabel[3] = new javax.swing.JLabel();
       jLabel[4] = new javax.swing.JLabel();
       jLabel[5] = new javax.swing.JLabel();
       jLabel[6] = new javax.swing.JLabel();
       jLabel[7] = new javax.swing.JLabel();

       setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

       jButton1.setText("��");
       jButton1.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               jButton1ActionPerformed(evt);
           }
       });

       jButton2.setText("��");
       jButton2.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               jButton2ActionPerformed(evt);
           }
       });

       jButton3.setText("��");
       jButton3.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               jButton3ActionPerformed(evt);
           }
       });

       jButton4.setText("��");
       jButton4.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               jButton4ActionPerformed(evt);
           }
       });

       jButton5.setText("��");
       jButton5.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               jButton5ActionPerformed(evt);
           }
       });

       jButton6.setText("��");
       jButton6.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               jButton6ActionPerformed(evt);
           }
       });

       jButton7.setText("��");
       jButton7.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               jButton7ActionPerformed(evt);
           }
       });

       jButton8.setText("jButton3");
       jButton8.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               jButton8ActionPerformed(evt);
           }
       });

       jButton9.setText("jButton4");
       jButton9.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               jButton9ActionPerformed(evt);
           }
       });

       jButton10.setText("jButton5");
       jButton10.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               jButton10ActionPerformed(evt);
           }
       });

       jLabel[0].setText(Character.toString(this.q[0]));

       jLabel[1].setText(Character.toString(this.q[1]));

       jLabel[2].setText(Character.toString(this.q[2]));

       jLabel[3].setText(Character.toString(this.q[3]));

       jLabel[4].setText(Character.toString(this.q[4]));

       jLabel[5].setText(Character.toString(this.q[5]));

       jLabel[6].setText(Character.toString(this.q[6]));

       jLabel[7].setText(Character.toString(this.q[7]));

       javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
       getContentPane().setLayout(layout);
       layout.setHorizontalGroup(
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
               .addGap(0, 0, Short.MAX_VALUE)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                   .addGroup(layout.createSequentialGroup()
                       .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(jLabel[7], javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                               .addComponent(jLabel[2], javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                               .addComponent(jLabel[1], javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                               .addComponent(jLabel[0], javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                           .addComponent(jLabel[5], javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(jLabel[4], javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(jLabel[3], javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                       .addGap(185, 185, 185))
                   .addGroup(layout.createSequentialGroup()
                       .addComponent(jLabel[6], javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                       .addGap(59, 59, 59))))
           .addGroup(layout.createSequentialGroup()
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                   .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                   .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                   .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                   .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                   .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                   .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                   .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addContainerGap(137, Short.MAX_VALUE))
       );
       layout.setVerticalGroup(
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(layout.createSequentialGroup()
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jButton1)
                   .addComponent(jButton2)
                   .addComponent(jButton3)
                   .addComponent(jButton4)
                   .addComponent(jButton5))
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jButton6)
                   .addComponent(jButton7)
                   .addComponent(jButton8)
                   .addComponent(jButton10)
                   .addComponent(jButton9))
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
               .addComponent(jLabel[7], javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
               .addComponent(jLabel[6], javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
               .addComponent(jLabel[5], javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
               .addComponent(jLabel[4], javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
               .addComponent(jLabel[3], javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
               .addComponent(jLabel[2], javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
               .addComponent(jLabel[1], javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
               .addComponent(jLabel[0], javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addContainerGap())
       );

       pack();
   }// </editor-fold>                        

   private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       // TODO add your handling code here:
	   if(cnt==8)
		   return;
	  this.q[cnt++]='��';
	  jLabel[cnt-1].setText(Character.toString(this.q[cnt-1]));
   }                                        

   private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       // TODO add your handling code here:
	   if(cnt==8)
		   return;
	   this.q[cnt++]='��';
	   jLabel[cnt-1].setText(Character.toString(this.q[cnt-1]));
   }                                        

   private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       // TODO add your handling code here:
	   if(cnt==8)
		   return;
	   this.q[cnt++]='��';
	   jLabel[cnt-1].setText(Character.toString(this.q[cnt-1]));
   }                                        

   private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       // TODO add your handling code here:
	   if(cnt==8)
		   return;
	   this.q[cnt++]='��';
	   jLabel[cnt-1].setText(Character.toString(this.q[cnt-1]));
   }                                        

   private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       // TODO add your handling code here:
	   if(cnt==8)
		   return;
	   this.q[cnt++]='��';
	   jLabel[cnt-1].setText(Character.toString(this.q[cnt-1]));
   }                                        

   private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       // TODO add your handling code here:
	   if(cnt==8)
		   return;
	   this.q[cnt++]='��';
	   jLabel[cnt-1].setText(Character.toString(this.q[cnt-1]));
   }                                        

   private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       // TODO add your handling code here:
	   if(cnt==8)
		   return;
	   this.q[cnt++] = '��';
	   jLabel[cnt-1].setText(Character.toString(this.q[cnt-1]));
   }                                        

   private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       // TODO add your handling code here:
   }                                        

   private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       // TODO add your handling code here:
   }                                        

   private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                          
       // TODO add your handling code here:
   }                                         

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
           java.util.logging.Logger.getLogger(CommandButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (InstantiationException ex) {
           java.util.logging.Logger.getLogger(CommandButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (IllegalAccessException ex) {
           java.util.logging.Logger.getLogger(CommandButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (javax.swing.UnsupportedLookAndFeelException ex) {
           java.util.logging.Logger.getLogger(CommandButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       }
       //</editor-fold>

       /* Create and display the dialog */
       java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
               CommandButton dialog = new CommandButton(new javax.swing.JFrame(), true);
               dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                   @Override
                   public void windowClosing(java.awt.event.WindowEvent e) {
                       System.exit(0);
                   }
               });
               dialog.setVisible(true);
           }
       });
   }

   // Variables declaration - do not modify                     
   private javax.swing.JButton jButton1;
   private javax.swing.JButton jButton10;
   private javax.swing.JButton jButton2;
   private javax.swing.JButton jButton3;
   private javax.swing.JButton jButton4;
   private javax.swing.JButton jButton5;
   private javax.swing.JButton jButton6;
   private javax.swing.JButton jButton7;
   private javax.swing.JButton jButton8;
   private javax.swing.JButton jButton9;
   private javax.swing.JLabel[] jLabel=new javax.swing.JLabel[8];
  // private javax.swing.JLabel jLabel[0];
  // private javax.swing.JLabel jLabel[1];
  // private javax.swing.JLabel jLabel[2];
  // private javax.swing.JLabel jLabel[3];
  // private javax.swing.JLabel jLabel[4];
  // private javax.swing.JLabel jLabel[5];
  // private javax.swing.JLabel jLabel[6];
  // private javax.swing.JLabel jLabel[7];
   // End of variables declaration                   
}

