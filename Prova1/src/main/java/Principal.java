
import control.LDATableModelListaItens;
import java.util.List;
import swing.LDASwingUtils;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author 2023122760328
 */
public class Principal extends javax.swing.JFrame {

    private LDATableModelListaItens tableModelCli;

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        LDASwingUtils.togglePainelVisible(PainelExtra);
        // Amarro o JTable com o meu Abstract Table Model
        tableModelCli = new LDATableModelListaItens();
        tblResumo.setModel(tableModelCli);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpCurso = new javax.swing.ButtonGroup();
        popupTabela = new javax.swing.JPopupMenu();
        Excluir = new javax.swing.JMenuItem();
        Inserir = new javax.swing.JMenuItem();
        lblTitulo = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblNome1 = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail1 = new javax.swing.JTextField();
        txtNome1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        rdbGrad = new javax.swing.JRadioButton();
        rdbPos = new javax.swing.JRadioButton();
        lblCurso = new javax.swing.JLabel();
        cmbCurso = new javax.swing.JComboBox<>();
        lblAnoIni = new javax.swing.JLabel();
        lblAnoFim = new javax.swing.JLabel();
        spnAnoIni = new javax.swing.JSpinner();
        spnAnoFim = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResumo = new javax.swing.JTable();
        btnLimpar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        PainelExtra = new javax.swing.JPanel();
        lblOrientador = new javax.swing.JLabel();
        txtOrientador = new javax.swing.JTextField();
        chkBolsa = new javax.swing.JCheckBox();

        Excluir.setText("Excluir");
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });
        popupTabela.add(Excluir);

        Inserir.setText("Inserir");
        Inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InserirActionPerformed(evt);
            }
        });
        popupTabela.add(Inserir);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 204));
        lblTitulo.setText("Cadastro de Aluno");
        lblTitulo.setToolTipText("");

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Pessoais"));
        jPanel6.setPreferredSize(new java.awt.Dimension(300, 200));

        lblNome1.setText("Nome");

        lblEmail.setText("E-mail");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(lblEmail)
                .addGap(18, 18, 18)
                .addComponent(txtEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(lblNome1)
                .addGap(20, 20, 20)
                .addComponent(txtNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome1)
                    .addComponent(txtNome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Curso"));

        grpCurso.add(rdbGrad);
        rdbGrad.setMnemonic('G');
        rdbGrad.setSelected(true);
        rdbGrad.setText("Graduação");
        rdbGrad.setActionCommand("Feminino");
        rdbGrad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbGradActionPerformed(evt);
            }
        });
        jPanel2.add(rdbGrad);

        grpCurso.add(rdbPos);
        rdbPos.setMnemonic('P');
        rdbPos.setText("Pós-Graduação");
        rdbPos.setActionCommand("Masculino");
        rdbPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbPosActionPerformed(evt);
            }
        });
        jPanel2.add(rdbPos);

        lblCurso.setText("Curso");

        cmbCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sistemas de Informação", "Arquitetura", "Administração" }));

        lblAnoIni.setText("Ano Início");

        lblAnoFim.setText("Ano Conclusão");

        spnAnoIni.setModel(new javax.swing.SpinnerNumberModel(2025, 2015, 2040, 1));

        spnAnoFim.setModel(new javax.swing.SpinnerNumberModel(2029, 2015, 2040, 1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCurso)
                                .addGap(18, 18, 18)
                                .addComponent(cmbCurso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblAnoIni)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spnAnoIni, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblAnoFim)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spnAnoFim, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCurso)
                    .addComponent(cmbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAnoIni)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(spnAnoIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAnoFim)
                            .addComponent(spnAnoFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Resumo"));

        tblResumo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"a", null, null, null, null, null},
                {"a", null, null, null, null, null},
                {"a", null, null, null, null, null},
                {"a", null, null, null, null, null}
            },
            new String [] {
                "Nome", "E-mail", "Curso (G/P)", "Nome do Curso", "Orientador", "Bolsa"
            }
        ));
        tblResumo.setComponentPopupMenu(popupTabela);
        tblResumo.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tblResumo);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(326, 326, 326))
        );

        btnLimpar.setText("limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        PainelExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("Pós-Graduação"));
        PainelExtra.setAutoscrolls(true);

        lblOrientador.setText("Orientador");

        chkBolsa.setMnemonic('B');
        chkBolsa.setText("Com Bolsa");

        javax.swing.GroupLayout PainelExtraLayout = new javax.swing.GroupLayout(PainelExtra);
        PainelExtra.setLayout(PainelExtraLayout);
        PainelExtraLayout.setHorizontalGroup(
            PainelExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelExtraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelExtraLayout.createSequentialGroup()
                        .addComponent(lblOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chkBolsa))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelExtraLayout.setVerticalGroup(
            PainelExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelExtraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrientador)
                    .addComponent(txtOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkBolsa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTitulo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(btnInserir)
                                .addGap(129, 129, 129)
                                .addComponent(btnLimpar)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PainelExtra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar)
                    .addComponent(btnInserir))
                .addGap(18, 18, 18)
                .addComponent(PainelExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdbPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbPosActionPerformed
        // TODO add your handling code here:
        LDASwingUtils.togglePainelVisible(PainelExtra);
    }//GEN-LAST:event_rdbPosActionPerformed

    private void rdbGradActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbGradActionPerformed
        // TODO add your handling code here:
        LDASwingUtils.togglePainelVisible(PainelExtra);
    }//GEN-LAST:event_rdbGradActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:

        LDASwingUtils.clearTxt(txtNome1);
        LDASwingUtils.clearTxt(txtEmail1);
        LDASwingUtils.clearTxt(txtOrientador);
        cmbCurso.setSelectedIndex(0);
        
    }//GEN-LAST:event_btnLimparActionPerformed

    private void InserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InserirActionPerformed
        // TODO add your handling code here:
        String nome = txtNome1.getText();
        String email = txtEmail1.getText();
        char tipoCurso = (char) grpCurso.getSelection().getMnemonic();
        String curso = cmbCurso.getSelectedItem().toString();
        String orientador = txtOrientador.getText();
        boolean chk = chkBolsa.isSelected();
        String isbolsa;
        
        System.out.println(tipoCurso);

        if (chk) {
            isbolsa = "Sim";
        } else {
            isbolsa = "Não";
        }

        inserirTabela(nome, email, curso, tipoCurso, orientador, isbolsa);
    }//GEN-LAST:event_InserirActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ExcluirActionPerformed

    private void inserirTabela(String nome, String email, String curso, char tipoCurso, String Orientador, String isBolsa) {

        if (Orientador == null) {
            Orientador = "";
        }
        if (isBolsa == null) {
            isBolsa = "";
        }
        Cliente cli = new Cliente(nome, email, curso, tipoCurso, Orientador, isBolsa);
        tableModelCli.adicionar(cli);
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Excluir;
    private javax.swing.JMenuItem Inserir;
    private javax.swing.JPanel PainelExtra;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JCheckBox chkBolsa;
    private javax.swing.JComboBox cmbCidade;
    private javax.swing.JComboBox<String> cmbCurso;
    private javax.swing.ButtonGroup grpCurso;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAnoFim;
    private javax.swing.JLabel lblAnoIni;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblComplem;
    private javax.swing.JLabel lblCurso;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEnder;
    private javax.swing.JLabel lblEnder1;
    private javax.swing.JLabel lblEnder5;
    private javax.swing.JLabel lblEnder6;
    private javax.swing.JLabel lblEnder7;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblNum;
    private javax.swing.JLabel lblOrientador;
    private javax.swing.JLabel lblTelFixo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPopupMenu popupTabela;
    private javax.swing.JRadioButton rdbGrad;
    private javax.swing.JRadioButton rdbPos;
    private javax.swing.JSpinner spnAnoFim;
    private javax.swing.JSpinner spnAnoIni;
    private javax.swing.JTable tblResumo;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmail1;
    private javax.swing.JTextField txtEnder;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNome1;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtOrientador;
    private javax.swing.JTextField txtRef;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
