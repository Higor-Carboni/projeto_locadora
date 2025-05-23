/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import components.BordaArredondada;
import controller.UsuarioController;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import model.Usuario;
import utils.Utils;

/**
 *
 * @author iband
 */
public class FrConUsuario extends javax.swing.JDialog {

    /**
     * Creates new form FrConUsuario
     */
    public FrConUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ajustarColunas();
        //Abre a tela centralizada
        this.setLocationRelativeTo(null);
        
        
        btnAlterar.setBorder(new BordaArredondada(15));
        btnExcluir.setBorder(new BordaArredondada(15));
        btnPesquisar.setBorder(new BordaArredondada(15));
        btnVoltar.setBorder(new BordaArredondada(15));

        javax.swing.border.Border padding = new javax.swing.border.EmptyBorder(5, 5, 5, 5);
        javax.swing.border.Border line = new javax.swing.border.LineBorder(new java.awt.Color(150, 150, 200), 2, true);
        javax.swing.border.Border roundedBorder = javax.swing.BorderFactory.createCompoundBorder(line, padding);
        jScrollPane1.setBorder(roundedBorder);
    }
private void ajustarColunas() {
    TableColumn colunaId = tblUsuarios.getColumnModel().getColumn(0);
    colunaId.setMinWidth(40);
    colunaId.setMaxWidth(40);
    colunaId.setPreferredWidth(40);
}



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Usuário");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        lblTitulo.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lblTitulo.setText("Consulta de Usuários");

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Email", "Data Nasc.", "Ativo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblUsuarios);

        btnExcluir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExcluirMouseClicked(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAlterarMouseClicked(evt);
            }
        });

        btnVoltar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVoltarMouseClicked(evt);
            }
        });

        btnPesquisar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-lupa24px.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPesquisarMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_lupa.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(jLabel1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(lblTitulo))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnPesquisar))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnVoltar)
                .addGap(383, 383, 383)
                .addComponent(btnAlterar)
                .addGap(15, 15, 15)
                .addComponent(btnExcluir))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(lblTitulo)
                .addGap(14, 14, 14)
                .addComponent(btnPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVoltar)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  private void btnPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarMouseClicked
      pesquisar();
  }//GEN-LAST:event_btnPesquisarMouseClicked

    public void pesquisar() {
        //Pega o modelo da grade com suas colunas
        // o 
        DefaultTableModel modeloTabela = (DefaultTableModel) tblUsuarios.getModel();

        //Limpa a grade setando o número de linhas para zero
        modeloTabela.setNumRows(0);

        //Cria um UsuarioController para poder acessar os dados de tbusuario
        UsuarioController controller = new UsuarioController();

        //consulta os usuários e guarda a lista de usuários que encontrou
        List<Usuario> listaUsuarios = controller.consultar();

        //Preencher a grade
        //percorre todos os usuários presentes na lista
        for (Usuario usu : listaUsuarios) {
            //cria um array onde cada posição é o valor das colunas da grade
            Object[] linha = {
                usu.getPkUsuario(), //coluna 0
                usu.getNome(), //coluna 1
                usu.getEmail(), //coluna 2
                Utils.converterDateToString(usu.getDataNascUsu()), //coluna 3
                usu.ativoToString() //coluna 4
            };

            //Adiciona o array com os dados do usuário na grade
            modeloTabela.addRow(linha);
        }
    }

  private void btnAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarMouseClicked
      //Verificar se tem uma linha da grade selecionada
      if (tblUsuarios.getSelectedRow() != -1) {
          //Se tiver pegar o código do usuário da grade
          int linhaSelecionada = tblUsuarios.getSelectedRow();
          String textoCelula = tblUsuarios.getValueAt(linhaSelecionada, 0).toString();

          //converter o texto da célula em inteiro
          int pkUsuario = Integer.parseInt(textoCelula);

          //com o pkUsuario eu vou criar uma tela de  
          //alteração passando o pkUsuario
          //Essa tela irá carregar os dados desse usuário
          //para poder alterar     
          FrAltUsuario telaAlt = new FrAltUsuario(null, rootPaneCheckingEnabled, pkUsuario);

          telaAlt.setVisible(true);

          pesquisar();
      }
  }//GEN-LAST:event_btnAlterarMouseClicked

  private void btnExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirMouseClicked
      //Verificar se tem uma linha da grade selecionada
      if (tblUsuarios.getSelectedRow() != -1) {
          //Se tiver pegar o código do usuário da grade
          int linhaSelecionada = tblUsuarios.getSelectedRow();
          String textoCelula = tblUsuarios.getValueAt(linhaSelecionada, 0).toString();

          //converter o texto da célula em inteiro
          int pkUsuario = Integer.parseInt(textoCelula);

          //com o pkUsuario eu vou chamar um método de deletar no controller
          UsuarioController controller = new UsuarioController();
          if (controller.deletar(pkUsuario)) {
              pesquisar();
              JOptionPane.showMessageDialog(rootPane, "Deletado com sucesso");
          } else {
              JOptionPane.showMessageDialog(rootPane, "Não foi deletado");
          }
      }
  }//GEN-LAST:event_btnExcluirMouseClicked

    private void btnVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnVoltarMouseClicked

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
            java.util.logging.Logger.getLogger(FrConUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrConUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrConUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrConUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrConUsuario dialog = new FrConUsuario(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblUsuarios;
    // End of variables declaration//GEN-END:variables
}
