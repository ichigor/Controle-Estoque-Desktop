/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import factory.ConnectionFactory;
import java.io.InputStream;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author aluno
 */
public class JFrmRelatorios extends javax.swing.JFrame {

    /**
     * Creates new form JFrmPrincipal
     */
    public JFrmRelatorios() {
        initComponents();
        
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

        jButton8 = new javax.swing.JButton();
        jPnGerencial = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jBtnServidor1 = new javax.swing.JButton();
        jBtnFuncionario = new javax.swing.JButton();
        jBtnBolsista = new javax.swing.JButton();
        jBtnProduto = new javax.swing.JButton();
        jBtnUnidade = new javax.swing.JButton();
        jBtnServidor = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jButton8.setText("jButton8");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema Almoxarifado  - Relatorios");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPnGerencial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 5));

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Relatorios", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jBtnServidor1.setBackground(new java.awt.Color(204, 204, 204));
        jBtnServidor1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnServidor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/servidor.png"))); // NOI18N
        jBtnServidor1.setText("Relação de Servidores");
        jBtnServidor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnServidor1ActionPerformed(evt);
            }
        });
        jTabbedPane1.addTab("Servidor", jBtnServidor1);

        jBtnFuncionario.setBackground(new java.awt.Color(204, 204, 204));
        jBtnFuncionario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/funcionario.png"))); // NOI18N
        jBtnFuncionario.setText("Relação de Funcionarios");
        jBtnFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnFuncionarioActionPerformed(evt);
            }
        });
        jTabbedPane1.addTab("Funcionario", jBtnFuncionario);

        jBtnBolsista.setBackground(new java.awt.Color(204, 204, 204));
        jBtnBolsista.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnBolsista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bolsista.png"))); // NOI18N
        jBtnBolsista.setText("Relação de Bolsistas");
        jBtnBolsista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBolsistaActionPerformed(evt);
            }
        });
        jTabbedPane1.addTab("Bolsista", jBtnBolsista);

        jBtnProduto.setBackground(new java.awt.Color(204, 204, 204));
        jBtnProduto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produto.png"))); // NOI18N
        jBtnProduto.setText("Relação de Produtos");
        jBtnProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnProdutoActionPerformed(evt);
            }
        });
        jTabbedPane1.addTab("Produto", jBtnProduto);

        jBtnUnidade.setBackground(new java.awt.Color(204, 204, 204));
        jBtnUnidade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnUnidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/unidade.png"))); // NOI18N
        jBtnUnidade.setText("Unidades cadastradas");
        jBtnUnidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUnidadeActionPerformed(evt);
            }
        });
        jTabbedPane1.addTab("Unidade", jBtnUnidade);

        jBtnServidor.setBackground(new java.awt.Color(204, 204, 204));
        jBtnServidor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnServidor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/operacao.png"))); // NOI18N
        jBtnServidor.setText("Relação de Operações ");
        jBtnServidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnServidorActionPerformed(evt);
            }
        });
        jTabbedPane1.addTab("Operações", jBtnServidor);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cross108 (1).png"))); // NOI18N
        jButton2.setText("Sair");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jTabbedPane1.addTab("Sair", jButton2);

        javax.swing.GroupLayout jPnGerencialLayout = new javax.swing.GroupLayout(jPnGerencial);
        jPnGerencial.setLayout(jPnGerencialLayout);
        jPnGerencialLayout.setHorizontalGroup(
            jPnGerencialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnGerencialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPnGerencialLayout.setVerticalGroup(
            jPnGerencialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnGerencialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addContainerGap())
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
                .addComponent(jPnGerencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnBolsistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBolsistaActionPerformed
        InputStream inputStream = getClass().getResourceAsStream("/Bolsista.jasper");
        Map parametros = new HashMap();
        Connection con = (Connection) ConnectionFactory.getConnection();
        
        try {
            //Map Map = new HashMap();
           // String arquivo = null;
            //arquivo = System.getProperty("user.dir") + "Servidor.jasper";
            JasperPrint jp = JasperFillManager.fillReport(inputStream, parametros, con);
            JasperViewer view = new JasperViewer(jp, false);
            view.setExtendedState(JasperViewer.MAXIMIZED_BOTH);
            view.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE);
            view.setVisible(true);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar relatório: " + ex);
        }
    }//GEN-LAST:event_jBtnBolsistaActionPerformed

    private void jBtnFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnFuncionarioActionPerformed
         InputStream inputStream = getClass().getResourceAsStream("/Funcionario.jasper");
        Map parametros = new HashMap();
        Connection con = (Connection) ConnectionFactory.getConnection();
        
        try {
            //Map Map = new HashMap();
           // String arquivo = null;
            //arquivo = System.getProperty("user.dir") + "Servidor.jasper";
            JasperPrint jp = JasperFillManager.fillReport(inputStream, parametros, con);
            JasperViewer view = new JasperViewer(jp, false);
            view.setExtendedState(JasperViewer.MAXIMIZED_BOTH);
            view.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE);
            view.setVisible(true);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar relatório: " + ex);
        }
    }//GEN-LAST:event_jBtnFuncionarioActionPerformed

    private void jBtnProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnProdutoActionPerformed
               InputStream inputStream = getClass().getResourceAsStream("/Produtos.jasper");
        Map parametros = new HashMap();
        Connection con = (Connection) ConnectionFactory.getConnection();
        
        try {
            //Map Map = new HashMap();
           // String arquivo = null;
            //arquivo = System.getProperty("user.dir") + "Servidor.jasper";
            JasperPrint jp = JasperFillManager.fillReport(inputStream, parametros, con);
            JasperViewer view = new JasperViewer(jp, false);
            view.setExtendedState(JasperViewer.MAXIMIZED_BOTH);
            view.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE);
            view.setVisible(true);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar relatório: " + ex);
        }
    }//GEN-LAST:event_jBtnProdutoActionPerformed

    private void jBtnUnidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUnidadeActionPerformed
        InputStream inputStream = getClass().getResourceAsStream("/Unidades.jasper");
        Map parametros = new HashMap();
        Connection con = (Connection) ConnectionFactory.getConnection();
        
        try {
            //Map Map = new HashMap();
           // String arquivo = null;
            //arquivo = System.getProperty("user.dir") + "Servidor.jasper";
            JasperPrint jp = JasperFillManager.fillReport(inputStream, parametros, con);
            JasperViewer view = new JasperViewer(jp, false);
            view.setExtendedState(JasperViewer.MAXIMIZED_BOTH);
            view.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE);
            view.setVisible(true);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar relatório: " + ex);
        }
    }//GEN-LAST:event_jBtnUnidadeActionPerformed

    private void jBtnServidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnServidorActionPerformed
         InputStream inputStream = getClass().getResourceAsStream("/Operacao.jasper");
        Map parametros = new HashMap();
        Connection con = (Connection) ConnectionFactory.getConnection();
        
        try {
            //Map Map = new HashMap();
           // String arquivo = null;
            //arquivo = System.getProperty("user.dir") + "Servidor.jasper";
            JasperPrint jp = JasperFillManager.fillReport(inputStream, parametros, con);
            JasperViewer view = new JasperViewer(jp, false);
            view.setExtendedState(JasperViewer.MAXIMIZED_BOTH);
            view.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE);
            view.setVisible(true);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar relatório: " + ex);
        }
    }//GEN-LAST:event_jBtnServidorActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jBtnServidor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnServidor1ActionPerformed
        InputStream inputStream = getClass().getResourceAsStream("/Servidor.jasper");
        Map parametros = new HashMap();
        Connection con = (Connection) ConnectionFactory.getConnection();
        
        try {
            //Map Map = new HashMap();
           // String arquivo = null;
            //arquivo = System.getProperty("user.dir") + "Servidor.jasper";
            JasperPrint jp = JasperFillManager.fillReport(inputStream, parametros, con);
            JasperViewer view = new JasperViewer(jp, false);
            view.setExtendedState(JasperViewer.MAXIMIZED_BOTH);
            view.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE);
            view.setVisible(true);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar relatório: " + ex);
        }
    }//GEN-LAST:event_jBtnServidor1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        dispose();
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(JFrmRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmRelatorios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBolsista;
    private javax.swing.JButton jBtnFuncionario;
    private javax.swing.JButton jBtnProduto;
    private javax.swing.JButton jBtnServidor;
    private javax.swing.JButton jBtnServidor1;
    private javax.swing.JButton jBtnUnidade;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton8;
    private javax.swing.JPanel jPnGerencial;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
