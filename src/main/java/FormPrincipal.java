// Apache NetBeans 24
// Autor: Micael Marinho Souza

public class FormPrincipal extends javax.swing.JFrame {

    private static FormPrincipal formPrincipal;

    //MÉTODO SINGLETON
    public static FormPrincipal getInstance() {
        if (formPrincipal == null) {
            formPrincipal = new FormPrincipal();
        }
        return formPrincipal;
    }

    private FormPrincipal() {
        initComponents();
        // Mantém a janela em tamanho fixo para não desorganizar os componentes.
        setResizable(false);
        setLocationRelativeTo(null);
        configurarTelaPrincipal();
    }

    private void configurarTelaPrincipal() {
        // Tela inicial: os cadastros e relatórios são chamados pelos botões e menus.
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotSistemaClinico = new javax.swing.JLabel();
        btPaciente = new javax.swing.JButton();
        btFamiliar = new javax.swing.JButton();
        btPsicologo = new javax.swing.JButton();
        btAgendamento = new javax.swing.JButton();
        btRelPacientes = new javax.swing.JButton();
        btRelFamiliares = new javax.swing.JButton();
        btRelPsicologos = new javax.swing.JButton();
        btRelatorioIndividual = new javax.swing.JButton();
        btRelatorioGrupo = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        BarraMenuPrincipal = new javax.swing.JMenuBar();
        MenuCadastros = new javax.swing.JMenu();
        ItemMenuCadPes = new javax.swing.JMenuItem();
        ItemMenuCadFam = new javax.swing.JMenuItem();
        ItemMenuCadPsi = new javax.swing.JMenuItem();
        MenuConsultas = new javax.swing.JMenu();
        ItemMenuAgendCons = new javax.swing.JMenuItem();
        MenuRelatorios = new javax.swing.JMenu();
        ItemMenuRelSing = new javax.swing.JMenuItem();
        ItemMenuRelGrupo = new javax.swing.JMenuItem();
        ItemMenuRelPacientes = new javax.swing.JMenuItem();
        ItemMenuRelFamiliares = new javax.swing.JMenuItem();
        ItemMenuRelPsicologos = new javax.swing.JMenuItem();
        MenuCreditos = new javax.swing.JMenu();
        ItemMenuSobre = new javax.swing.JMenuItem();
        MenuSair = new javax.swing.JMenu();
        ItemMenuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        rotSistemaClinico.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rotSistemaClinico.setText("Sistema de Clínica Psicológica");

        btPaciente.setText("Cadastro de Paciente");
        btPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPacienteActionPerformed(evt);
            }
        });

        btFamiliar.setText("Cadastro de Familiar");
        btFamiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFamiliarActionPerformed(evt);
            }
        });

        btPsicologo.setText("Cadastro de Psicólogo");
        btPsicologo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPsicologoActionPerformed(evt);
            }
        });

        btAgendamento.setText("Agendamento de Consulta");
        btAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgendamentoActionPerformed(evt);
            }
        });

        btRelPacientes.setText("Relatório de Pacientes");
        btRelPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelPacientesActionPerformed(evt);
            }
        });

        btRelFamiliares.setText("Relatório de  Familiares");
        btRelFamiliares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelFamiliaresActionPerformed(evt);
            }
        });

        btRelPsicologos.setText("Relatório de Psicólogos");
        btRelPsicologos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelPsicologosActionPerformed(evt);
            }
        });

        btRelatorioIndividual.setText("Relatório Individual - [Consulta]");
        btRelatorioIndividual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelatorioIndividualActionPerformed(evt);
            }
        });

        btRelatorioGrupo.setText("Relatório em Grupo - [Consultas]");
        btRelatorioGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelatorioGrupoActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        MenuCadastros.setText("Cadastros");

        ItemMenuCadPes.setText("Paciente");
        ItemMenuCadPes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenuCadPesActionPerformed(evt);
            }
        });
        MenuCadastros.add(ItemMenuCadPes);

        ItemMenuCadFam.setText("Familiar");
        ItemMenuCadFam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenuCadFamActionPerformed(evt);
            }
        });
        MenuCadastros.add(ItemMenuCadFam);

        ItemMenuCadPsi.setText("Psicólogo");
        ItemMenuCadPsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenuCadPsiActionPerformed(evt);
            }
        });
        MenuCadastros.add(ItemMenuCadPsi);

        BarraMenuPrincipal.add(MenuCadastros);

        MenuConsultas.setText("Consultas");

        ItemMenuAgendCons.setText("Agendar Consulta");
        ItemMenuAgendCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenuAgendConsActionPerformed(evt);
            }
        });
        MenuConsultas.add(ItemMenuAgendCons);

        BarraMenuPrincipal.add(MenuConsultas);

        MenuRelatorios.setText("Relatórios");

        ItemMenuRelSing.setText("Relatório Individual");
        ItemMenuRelSing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenuRelSingActionPerformed(evt);
            }
        });
        MenuRelatorios.add(ItemMenuRelSing);

        ItemMenuRelGrupo.setText("Relatório Grupo");
        ItemMenuRelGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenuRelGrupoActionPerformed(evt);
            }
        });
        MenuRelatorios.add(ItemMenuRelGrupo);

        ItemMenuRelPacientes.setText("Relatório de Pacientes");
        ItemMenuRelPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenuRelPacientesActionPerformed(evt);
            }
        });
        MenuRelatorios.add(ItemMenuRelPacientes);

        ItemMenuRelFamiliares.setText("Relatório de Familiares");
        ItemMenuRelFamiliares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenuRelFamiliaresActionPerformed(evt);
            }
        });
        MenuRelatorios.add(ItemMenuRelFamiliares);

        ItemMenuRelPsicologos.setText("Relatório de Psicólogos");
        ItemMenuRelPsicologos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenuRelPsicologosActionPerformed(evt);
            }
        });
        MenuRelatorios.add(ItemMenuRelPsicologos);

        BarraMenuPrincipal.add(MenuRelatorios);

        MenuCreditos.setText("Créditos");

        ItemMenuSobre.setText("Sobre");
        ItemMenuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenuSobreActionPerformed(evt);
            }
        });
        MenuCreditos.add(ItemMenuSobre);

        BarraMenuPrincipal.add(MenuCreditos);

        MenuSair.setText("Sair");

        ItemMenuSair.setText("Sair");
        ItemMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenuSairActionPerformed(evt);
            }
        });
        MenuSair.add(ItemMenuSair);

        BarraMenuPrincipal.add(MenuSair);

        setJMenuBar(BarraMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(rotSistemaClinico, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btFamiliar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btPsicologo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btAgendamento, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                    .addComponent(btRelatorioIndividual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btRelatorioGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btRelPacientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btRelFamiliares, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btRelPsicologos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(rotSistemaClinico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btFamiliar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btPsicologo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btRelPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btRelFamiliares, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btRelPsicologos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btRelatorioIndividual, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btRelatorioGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgendamentoActionPerformed
        FormCadConsulta.getInstance().setVisible(true);
    }//GEN-LAST:event_btAgendamentoActionPerformed

    private void ItemMenuCadPesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenuCadPesActionPerformed
        FormCadPaciente.getInstance().setVisible(true);
    }//GEN-LAST:event_ItemMenuCadPesActionPerformed

    private void ItemMenuCadFamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenuCadFamActionPerformed
        FormCadFamiliar.getInstance().setVisible(true);
    }//GEN-LAST:event_ItemMenuCadFamActionPerformed

    private void ItemMenuCadPsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenuCadPsiActionPerformed
        FormCadPsicologo.getInstance().setVisible(true);
    }//GEN-LAST:event_ItemMenuCadPsiActionPerformed

    private void ItemMenuAgendConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenuAgendConsActionPerformed
        FormCadConsulta.getInstance().setVisible(true);
    }//GEN-LAST:event_ItemMenuAgendConsActionPerformed

    private void ItemMenuRelSingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenuRelSingActionPerformed
        FormRelatorioIndividual.getInstance().abrirRelatorioConsulta();
    }//GEN-LAST:event_ItemMenuRelSingActionPerformed

    private void ItemMenuRelGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenuRelGrupoActionPerformed
        FormRelatorioGrupo.getInstance().setVisible(true);
        FormRelatorioGrupo.getInstance().carregarTabela();
    }//GEN-LAST:event_ItemMenuRelGrupoActionPerformed

    private void ItemMenuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenuSobreActionPerformed
        javax.swing.JOptionPane.showMessageDialog(
                this,
                "Sistema de Clínica Psicológica\nDesenvolvido por Micael Marinho Souza\nProjeto final de Programação Orientada a Objetos",
                "Sobre o sistema", 
                javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_ItemMenuSobreActionPerformed

    private void btPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPacienteActionPerformed
        FormCadPaciente.getInstance().setVisible(true);
    }//GEN-LAST:event_btPacienteActionPerformed

    private void btFamiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFamiliarActionPerformed
        FormCadFamiliar.getInstance().setVisible(true);
    }//GEN-LAST:event_btFamiliarActionPerformed

    private void btPsicologoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPsicologoActionPerformed
        FormCadPsicologo.getInstance().setVisible(true);
    }//GEN-LAST:event_btPsicologoActionPerformed

    private void btRelatorioIndividualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelatorioIndividualActionPerformed
        FormRelatorioIndividual.getInstance().abrirRelatorioConsulta();
    }//GEN-LAST:event_btRelatorioIndividualActionPerformed

    private void btRelatorioGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelatorioGrupoActionPerformed
        FormRelatorioGrupo.getInstance().setVisible(true);
        FormRelatorioGrupo.getInstance().carregarTabela();
    }//GEN-LAST:event_btRelatorioGrupoActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        int opcao = javax.swing.JOptionPane.showConfirmDialog(
                this, 
                "Deseja realmente sair?", 
                "Sair", 
                javax.swing.JOptionPane.YES_NO_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE);
        if (opcao == javax.swing.JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btSairActionPerformed

    private void ItemMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenuSairActionPerformed
        int opcao = javax.swing.JOptionPane.showConfirmDialog(
                this, 
                "Deseja realmente sair?", 
                "Sair", 
                javax.swing.JOptionPane.YES_NO_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE);
        if (opcao == javax.swing.JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_ItemMenuSairActionPerformed

    private void btRelPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelPacientesActionPerformed
        FormRelatorioIndividual.getInstance().abrirRelatorioPaciente();
    }//GEN-LAST:event_btRelPacientesActionPerformed

    private void btRelFamiliaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelFamiliaresActionPerformed
        FormRelatorioIndividual.getInstance().abrirRelatorioFamiliar();
    }//GEN-LAST:event_btRelFamiliaresActionPerformed

    private void btRelPsicologosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelPsicologosActionPerformed
        FormRelatorioIndividual.getInstance().abrirRelatorioPsicologo();
    }//GEN-LAST:event_btRelPsicologosActionPerformed

    private void ItemMenuRelPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenuRelPacientesActionPerformed
        FormRelatorioIndividual.getInstance().abrirRelatorioPaciente();
    }//GEN-LAST:event_ItemMenuRelPacientesActionPerformed

    private void ItemMenuRelFamiliaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenuRelFamiliaresActionPerformed
        FormRelatorioIndividual.getInstance().abrirRelatorioFamiliar();
    }//GEN-LAST:event_ItemMenuRelFamiliaresActionPerformed

    private void ItemMenuRelPsicologosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenuRelPsicologosActionPerformed
        FormRelatorioIndividual.getInstance().abrirRelatorioPsicologo();
    }//GEN-LAST:event_ItemMenuRelPsicologosActionPerformed

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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormPrincipal.getInstance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenuPrincipal;
    private javax.swing.JMenuItem ItemMenuAgendCons;
    private javax.swing.JMenuItem ItemMenuCadFam;
    private javax.swing.JMenuItem ItemMenuCadPes;
    private javax.swing.JMenuItem ItemMenuCadPsi;
    private javax.swing.JMenuItem ItemMenuRelFamiliares;
    private javax.swing.JMenuItem ItemMenuRelGrupo;
    private javax.swing.JMenuItem ItemMenuRelPacientes;
    private javax.swing.JMenuItem ItemMenuRelPsicologos;
    private javax.swing.JMenuItem ItemMenuRelSing;
    private javax.swing.JMenuItem ItemMenuSair;
    private javax.swing.JMenuItem ItemMenuSobre;
    private javax.swing.JMenu MenuCadastros;
    private javax.swing.JMenu MenuConsultas;
    private javax.swing.JMenu MenuCreditos;
    private javax.swing.JMenu MenuRelatorios;
    private javax.swing.JMenu MenuSair;
    private javax.swing.JButton btAgendamento;
    private javax.swing.JButton btFamiliar;
    private javax.swing.JButton btPaciente;
    private javax.swing.JButton btPsicologo;
    private javax.swing.JButton btRelFamiliares;
    private javax.swing.JButton btRelPacientes;
    private javax.swing.JButton btRelPsicologos;
    private javax.swing.JButton btRelatorioGrupo;
    private javax.swing.JButton btRelatorioIndividual;
    private javax.swing.JButton btSair;
    private javax.swing.JLabel rotSistemaClinico;
    // End of variables declaration//GEN-END:variables
}
