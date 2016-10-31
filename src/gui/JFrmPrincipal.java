/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.SwingConstants;

/**
 *
 * @author aluno
 */
public class JFrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JFrmPrincipal
     */
    public JFrmPrincipal() {
        initComponents();
        controleAcesso();
        
        setResizable(false);
        
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPnGerencial = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jBtnServidor = new javax.swing.JButton();
        jBtnUnidade = new javax.swing.JButton();
        jBtnProduto = new javax.swing.JButton();
        jBtnFuncionario = new javax.swing.JButton();
        jBtnBolsista = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jBtnOperacao = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jButton3.setText("jButton3");

        jButton5.setText("jButton5");

        jButton8.setText("jButton8");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema Almoxarifado ");

        jPnGerencial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 5));

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jPanel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel1FocusGained(evt);
            }
        });

        jBtnServidor.setBackground(new java.awt.Color(204, 204, 204));
        jBtnServidor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnServidor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/servidor.png"))); // NOI18N
        jBtnServidor.setText("Servidor");
        jBtnServidor.setToolTipText("Efetua cadastro de Servidores");
        jBtnServidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnServidorActionPerformed(evt);
            }
        });

        jBtnUnidade.setBackground(new java.awt.Color(204, 204, 204));
        jBtnUnidade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnUnidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/unidade.png"))); // NOI18N
        jBtnUnidade.setText("Unidade");
        jBtnUnidade.setToolTipText("Efetua cadastro de Unidades de Medidas");
        jBtnUnidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUnidadeActionPerformed(evt);
            }
        });

        jBtnProduto.setBackground(new java.awt.Color(204, 204, 204));
        jBtnProduto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produto.png"))); // NOI18N
        jBtnProduto.setText("Produto");
        jBtnProduto.setToolTipText("Efetua cadastro de Produtos");
        jBtnProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnProdutoActionPerformed(evt);
            }
        });

        jBtnFuncionario.setBackground(new java.awt.Color(204, 204, 204));
        jBtnFuncionario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/funcionario.png"))); // NOI18N
        jBtnFuncionario.setText("Funcionario");
        jBtnFuncionario.setToolTipText("Efetua cadastro de Funcionarios");
        jBtnFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnFuncionarioActionPerformed(evt);
            }
        });

        jBtnBolsista.setBackground(new java.awt.Color(204, 204, 204));
        jBtnBolsista.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnBolsista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bolsista.png"))); // NOI18N
        jBtnBolsista.setText("Bolsista");
        jBtnBolsista.setToolTipText("Efetua cadastro de Bolsistas");
        jBtnBolsista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBolsistaActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cross108 (1).png"))); // NOI18N
        jButton2.setText("Sair");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jSeparator1)
                .addGap(10, 10, 10))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jBtnFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnBolsista)
                        .addComponent(jBtnProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnUnidade)
                        .addComponent(jButton2))
                    .addComponent(jBtnServidor))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBtnBolsista, jBtnFuncionario, jBtnProduto, jBtnServidor, jBtnUnidade});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jBtnServidor)
                .addGap(18, 18, 18)
                .addComponent(jBtnFuncionario)
                .addGap(18, 18, 18)
                .addComponent(jBtnBolsista)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnProduto)
                .addGap(18, 18, 18)
                .addComponent(jBtnUnidade)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBtnBolsista, jBtnFuncionario, jBtnProduto, jBtnServidor, jBtnUnidade});

        jTabbedPane1.addTab("Cadastro ", jPanel1);

        jBtnOperacao.setBackground(new java.awt.Color(204, 204, 204));
        jBtnOperacao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnOperacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/operacao.png"))); // NOI18N
        jBtnOperacao.setText("Operação");
        jBtnOperacao.setToolTipText("Efetua Operações de Entrada e Saida");
        jBtnOperacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOperacaoActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/report1 (1).png"))); // NOI18N
        jButton1.setText("Relatórios");
        jButton1.setToolTipText("Relatórios gerenciais");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cross108 (1).png"))); // NOI18N
        jButton4.setText("Sair");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jBtnOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBtnOperacao, jButton1});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jBtnOperacao)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 307, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(33, 33, 33))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBtnOperacao, jButton1});

        jTabbedPane1.addTab("Operações ", jPanel2);

        javax.swing.GroupLayout jPnGerencialLayout = new javax.swing.GroupLayout(jPnGerencial);
        jPnGerencial.setLayout(jPnGerencialLayout);
        jPnGerencialLayout.setHorizontalGroup(
            jPnGerencialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnGerencialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPnGerencialLayout.setVerticalGroup(
            jPnGerencialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPnGerencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPnGerencial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void controleAcesso (){
        if (JFrmLogin.tipoUsuario.equals("A")){
            System.out.println("OK!");
        }
        else if (JFrmLogin.tipoUsuario.equals("S")){
            jBtnBolsista.setEnabled(false);
            jBtnFuncionario.setEnabled(false);
            jBtnServidor.setEnabled(false);
            jBtnProduto.setEnabled(false);
            jBtnUnidade.setEnabled(false);
            jButton1.setEnabled(false);
            jBtnOperacao.setEnabled(false);
            
        }
        else if (JFrmLogin.tipoUsuario.equals("T")){
            jBtnBolsista.setEnabled(false);
            jBtnFuncionario.setEnabled(false);
            jBtnServidor.setEnabled(false);
        }
    }
    
    private void jPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1FocusGained

    private void jBtnBolsistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBolsistaActionPerformed
        JFrmLstBolsista frmBolsista = new JFrmLstBolsista();
        frmBolsista.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBtnBolsistaActionPerformed

    private void jBtnFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnFuncionarioActionPerformed
        JFrmLstFuncionarios frmFuncionario = new JFrmLstFuncionarios();
        frmFuncionario.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBtnFuncionarioActionPerformed

    private void jBtnProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnProdutoActionPerformed
        JFrmLstProduto frmLstProduto = new JFrmLstProduto();
        frmLstProduto.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBtnProdutoActionPerformed

    private void jBtnUnidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUnidadeActionPerformed
        JFrmLstUnidade frmLstUnidade = new JFrmLstUnidade();
        frmLstUnidade.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBtnUnidadeActionPerformed

    private void jBtnServidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnServidorActionPerformed
        JFrmLstServidores frmLstServidores = new JFrmLstServidores();
        frmLstServidores.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBtnServidorActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jBtnOperacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOperacaoActionPerformed
        JFrmLstOperacao frm = new JFrmLstOperacao();
        frm.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBtnOperacaoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      JFrmRelatorios frmRelatorios = new JFrmRelatorios();
      frmRelatorios.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBolsista;
    private javax.swing.JButton jBtnFuncionario;
    private javax.swing.JButton jBtnOperacao;
    private javax.swing.JButton jBtnProduto;
    private javax.swing.JButton jBtnServidor;
    private javax.swing.JButton jBtnUnidade;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPnGerencial;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
