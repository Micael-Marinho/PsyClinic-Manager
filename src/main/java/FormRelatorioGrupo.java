// Apache NetBeans 24
// Autor: Micael Marinho Souza

public class FormRelatorioGrupo extends javax.swing.JFrame {

    private static FormRelatorioGrupo formRelatorioGrupo;

    //MÉTODO SINGLETON
    public static FormRelatorioGrupo getInstance() {
        if (formRelatorioGrupo == null) {
            formRelatorioGrupo = new FormRelatorioGrupo();
        }
        formRelatorioGrupo.carregarTabela();
        return formRelatorioGrupo;
    }

    private FormRelatorioGrupo() {
        initComponents();
        // Mantém a janela em tamanho fixo para não desorganizar os componentes.
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        configurarTabela();
        carregarTabela();

        // Atualiza os dados sempre que o relatório voltar para a tela.
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                carregarTabela();
            }
        });
    }

    // Trava a edição direta na tabela. Alterações ficam nos cadastros.
    private void configurarTabela() {
        tblConsultasGrupo.setDefaultEditor(Object.class, null);
        tblConsultasGrupo.getTableHeader().setReorderingAllowed(false);
        tblConsultasGrupo.setRowSelectionAllowed(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotRelatorioGrupo = new javax.swing.JLabel();
        tblConsultaRelGrupo = new javax.swing.JScrollPane();
        tblConsultasGrupo = new javax.swing.JTable();
        btAtualizar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        rotRelatorioGrupo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        rotRelatorioGrupo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rotRelatorioGrupo.setText("Relatório em Grupo");

        tblConsultasGrupo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Tipo", "Data", "Horário", "Paciente", "Psicólogo", "Status"
            }
        ));
        tblConsultaRelGrupo.setViewportView(tblConsultasGrupo);

        btAtualizar.setText("Atualizar");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btAtualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btVoltar))
                    .addComponent(tblConsultaRelGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE)
                    .addComponent(rotRelatorioGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotRelatorioGrupo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tblConsultaRelGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAtualizar)
                    .addComponent(btVoltar))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        carregarTabela();
        if (BDClinica.getInstance().listarConsultas().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(
                    this, 
                    "Não há consultas cadastradas para exibir no relatório", 
                    "Atenção", 
                    javax.swing.JOptionPane.WARNING_MESSAGE);
        } else {
            javax.swing.JOptionPane.showMessageDialog(
                    this, 
                    "Relatório em grupo atualizado com sucesso", 
                    "Sucesso", 
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        setVisible(false);
        FormPrincipal.getInstance().setVisible(true);
    }//GEN-LAST:event_btVoltarActionPerformed


    public void carregarTabela() {
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tblConsultasGrupo.getModel();
        modelo.setRowCount(0);

        for (Consulta consulta : BDClinica.getInstance().listarConsultas()) {
            modelo.addRow(new Object[] {
                consulta.getCodigo(),
                consulta.identificarConsulta(),
                consulta.getData(),
                consulta.getHorario(),
                consulta.getPaciente().getNome(), //Reflexividade
                consulta.getPsicologo().getNome(), //Reflexividade
                consulta.getSituacaoAgendamento()
            });
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel rotRelatorioGrupo;
    private javax.swing.JScrollPane tblConsultaRelGrupo;
    private javax.swing.JTable tblConsultasGrupo;
    // End of variables declaration//GEN-END:variables
}
