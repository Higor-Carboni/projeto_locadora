/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import components.BordaArredondada;
import controller.ClienteController;
import javax.swing.JOptionPane;
import model.Cliente;

/**
 *
 * @author arthu
 */
public class FrCadCliente extends javax.swing.JDialog {

    /**
     * Creates new form FrCadCliente
     */
    public FrCadCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        edtCPF.setBorder(new BordaArredondada(15));
        edtEmail.setBorder(new BordaArredondada(15));
        edtNome.setBorder(new BordaArredondada(15));
        btnCancelar.setBorder(new BordaArredondada(15));
        btnSalvar.setBorder(new BordaArredondada(15));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        edtNome1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        edtCPF = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        edtEmail = new javax.swing.JTextField();

        edtNome1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setText("Cadastro de Cliente");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        lblNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNome.setText("Nome");
        jPanel1.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        edtNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(edtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 380, -1));

        edtCPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        edtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCPFActionPerformed(evt);
            }
        });
        jPanel1.add(edtCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 380, -1));

        lblEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEmail.setText("Email");
        jPanel1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        lblSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSenha.setText("CPF");
        jPanel1.add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalvarMouseClicked(evt);
            }
        });
        jPanel1.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 140, -1));

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 140, -1));

        edtEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(edtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 380, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseClicked
        //verificar os campos se estão preenchidos corretamente
        if (verificarCampos()) {
            //Se estiverem corretos vou gravar
            gravar();
        }
        //Senão nada acontece
    }//GEN-LAST:event_btnSalvarMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void edtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtCPFActionPerformed

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
            java.util.logging.Logger.getLogger(FrCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrCadCliente dialog = new FrCadCliente(new javax.swing.JFrame(), true);
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

    public void gravar() {
        //criar uma instância da classe cario 
        //vou preencher os campos
        Cliente c = new Cliente();

        //conversão de String para Date
        c.setNome(edtNome.getText());
        c.setEmailCli(edtEmail.getText()); 
        c.setCpf(edtCPF.getText());

        //depois passo o objeto para o controller e ele irá gravar no banco de dados
        ClienteController controller = new ClienteController();

        if (controller.inserir(c)) {
            JOptionPane.showMessageDialog(null,
                    "Cliente gravado com sucesso");
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null,
                    "O cadastro não foi gravado");
        }
    }

    public boolean verificarCampos() {
        //Se eu conseguir passar pelas validações retorna true

        //Nome - não pode ter números ou caracteres especiais, apenas letras e espaço
        //Email - ter um formato de email a@a.com
        //Senha - pelo menos 6 dígitos
        //Data - verificar se está no formato de data dd/mm/aaaa
        if (!edtNome.getText().matches("^[\\p{L} ]+$")) {//a-
            JOptionPane.showMessageDialog(null,
                    "O campo 'Nome' possui formato inválido");
            return false;
        }

        if (!edtEmail.getText().matches("^[a-z0-9._-]+@[a-z0-9._-]+.[a-z._]+$")) {
            JOptionPane.showMessageDialog(null,
                    "O campo 'Email' possui formato inválido");
            return false;
        }
        if (!edtCPF.getText().matches("^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$")) {
            JOptionPane.showMessageDialog(null,
                    "O campo 'CPF' deve estar no formato 000.000.000-00");
            return false;
        }

        return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField edtCPF;
    private javax.swing.JTextField edtEmail;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTextField edtNome1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
