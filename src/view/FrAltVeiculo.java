/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import controller.VeiculoController;
import javax.swing.JOptionPane;
import model.Usuario;
import model.Veiculo;
import model.Veiculo;
import utils.Utils;

/**
 *
 * @author arthu
 */
public class FrAltVeiculo extends javax.swing.JDialog {

    /** Creates new form FrAltVeiculo */
    private int id;
    
    public FrAltVeiculo(java.awt.Frame parent, boolean modal, int id) {
        super(parent, modal);
        initComponents();
        
        this.id = id;
        
        carregarVeiculo();
    }
     public void carregarVeiculo() {
    //vamos buscar no banco de dados o restante
    //dos campos do usuario, atualmente só
    //tem o pk

    VeiculoController controller = new VeiculoController();
    Veiculo veiculo = controller.buscarPorId(id);

    String codigo = String.valueOf(veiculo.getid());
    edtCodigo.setText(codigo);
    edtMarca.setText(veiculo.getMarca());
    edtModelo.setText(veiculo.getModelo());
    edtPlaca.setText(veiculo.getPlaca());
    edtAno.setText(veiculo.getAno());
    chkDisponivel.setSelected(veiculo.isDisponivel());

  }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        edtCodigo = new javax.swing.JTextField();
        edtAno = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblConfirmaSenha = new javax.swing.JLabel();
        chkDisponivel = new javax.swing.JCheckBox();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        edtModelo = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        edtMarca = new javax.swing.JTextField();
        edtPlaca = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setText("Alteração de Veículo");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        lblCodigo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCodigo.setText("Código");
        jPanel1.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        edtCodigo.setEditable(false);
        edtCodigo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(edtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 90, -1));

        edtAno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(edtAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 380, -1));

        lblEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEmail.setText("Marca");
        jPanel1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        lblSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSenha.setText("Placa");
        jPanel1.add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        lblConfirmaSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblConfirmaSenha.setText("Ano");
        jPanel1.add(lblConfirmaSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));

        chkDisponivel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chkDisponivel.setText("Disponivel");
        jPanel1.add(chkDisponivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, -1, -1));

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, 140, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        lblNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNome.setText("Modelo");
        jPanel1.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        edtModelo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(edtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 380, -1));

        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalvarMouseClicked(evt);
            }
        });
        jPanel1.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 570, 140, -1));

        edtMarca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(edtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 380, -1));

        edtPlaca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(edtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 380, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseClicked
        if(verificarCampos()){
            gravar();
        }
    }//GEN-LAST:event_btnSalvarMouseClicked

     public boolean verificarCampos() {
    if (edtModelo.getText().equals("")) {
      JOptionPane.showMessageDialog(null,
              "O campo 'Nome' em branco");
      return false;
    }

    if (!edtModelo.getText().matches("^[\\p{L} ]+$")) {
      JOptionPane.showMessageDialog(null,
              "O campo 'Nome' possui caracteres inválidos");
      return false;
    }
    if (edtMarca.getText().equals("")) {
      JOptionPane.showMessageDialog(null,
              "O campo 'Marca' em branco");
      return false;
    }

    if (!edtAno.getText().matches(
            "^[0-9]{4}$")) {
      JOptionPane.showMessageDialog(null,
              "O campo 'Ano' possui formato inválido");
      return false;
    }
    

    return true;
  }
  
  public void gravar(){
    //cria o objeto usuário
    Veiculo Veiculo = new Veiculo();
    
    //preenche os dados do usuário
    Veiculo.setid(id); 
    Veiculo.setModelo(edtModelo.getText());
    Veiculo.setAno(edtAno.getText());
    Veiculo.setMarca(edtMarca.getText());
    Veiculo.setPlaca(edtPlaca.getText());

   

    Veiculo.setDisponivel(chkDisponivel.isSelected());
    
    //Passar o objeto usu para o controller
    //enviar para o banco de dados
    VeiculoController controller = new VeiculoController();

    if (controller.atualizar(Veiculo)) {
      JOptionPane.showMessageDialog(null,
              "Veiulo: " + Veiculo.getid()
              + " alterado com sucesso!");
      this.dispose();
    } else {
      JOptionPane.showMessageDialog(null,
              "Veiculo não será alterado!");
    }
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
            java.util.logging.Logger.getLogger(FrAltVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrAltVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrAltVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrAltVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrAltVeiculo dialog = new FrAltVeiculo(new javax.swing.JFrame(), true, 0);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox chkDisponivel;
    private javax.swing.JTextField edtAno;
    private javax.swing.JTextField edtCodigo;
    private javax.swing.JTextField edtMarca;
    private javax.swing.JTextField edtModelo;
    private javax.swing.JTextField edtPlaca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblConfirmaSenha;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables

}
