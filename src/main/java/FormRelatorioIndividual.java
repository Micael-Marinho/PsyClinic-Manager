// Apache NetBeans 24
// Autor: Micael Marinho Souza

public class FormRelatorioIndividual extends javax.swing.JFrame {

    private static FormRelatorioIndividual formRelatorioIndividual;
    private String tipoRelatorio = "CONSULTA";

    //MÉTODO SINGLETON
    public static FormRelatorioIndividual getInstance() {
        if (formRelatorioIndividual == null) {
            formRelatorioIndividual = new FormRelatorioIndividual();
        }
        return formRelatorioIndividual;
    }

    private FormRelatorioIndividual() {
        initComponents();
        // Mantém a janela em tamanho fixo para não desorganizar os componentes.
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jTextArea1.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotRelatorioIndividual = new javax.swing.JLabel();
        rotCodConsulta = new javax.swing.JLabel();
        cxCodConsulta = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        rotRelatorioIndividual.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        rotRelatorioIndividual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rotRelatorioIndividual.setText("Relatório Individual");

        rotCodConsulta.setText("Código da Consulta");

        cxCodConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCodConsultaActionPerformed(evt);
            }
        });

        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(rotCodConsulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxCodConsulta)))
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rotRelatorioIndividual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(rotRelatorioIndividual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxCodConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotCodConsulta))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btBuscar)
                    .addComponent(btLimpar)
                    .addComponent(btVoltar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        setVisible(false);
        FormPrincipal.getInstance().setVisible(true);
    }//GEN-LAST:event_btVoltarActionPerformed

    private void cxCodConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCodConsultaActionPerformed
    }//GEN-LAST:event_cxCodConsultaActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        String chave = cxCodConsulta.getText().trim();
        if (chave.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(
                    this, 
                    "Informe o dado solicitado para gerar o relatório", 
                    "Atenção", 
                    javax.swing.JOptionPane.WARNING_MESSAGE);
            cxCodConsulta.requestFocus();
            return;
        }

        try {
            if (tipoRelatorio.equals("CONSULTA")) {
                Consulta consulta = BDClinica.getInstance().consultarConsulta(lerCodigoConsulta());
                if (consulta != null) {
                    jTextArea1.setText(montarRelatorio(consulta));
                    javax.swing.JOptionPane.showMessageDialog(
                            this, 
                            "Relatório de consulta gerado com sucesso", 
                            "Sucesso", 
                            javax.swing.JOptionPane.INFORMATION_MESSAGE);
                } else {
                    jTextArea1.setText("");
                    javax.swing.JOptionPane.showMessageDialog(
                            this, 
                            "Consulta não encontrada para o código informado", 
                            "Não encontrado", javax.swing.JOptionPane.WARNING_MESSAGE);
                }
            } else if (tipoRelatorio.equals("PACIENTE")) {
                Paciente paciente = BDClinica.getInstance().consultarPacientePorCpfOuNome(chave, chave);
                if (paciente != null) {
                    jTextArea1.setText(montarRelatorio(paciente));
                    javax.swing.JOptionPane.showMessageDialog(
                            this, 
                            "Relatório de paciente gerado com sucesso", 
                            "Sucesso", 
                            javax.swing.JOptionPane.INFORMATION_MESSAGE);
                } else {
                    jTextArea1.setText("");
                    javax.swing.JOptionPane.showMessageDialog(
                            this, 
                            "Paciente não encontrado para o CPF ou nome informado", 
                            "Não encontrado", 
                            javax.swing.JOptionPane.WARNING_MESSAGE);
                }
            } else if (tipoRelatorio.equals("FAMILIAR")) {
                Familiar familiar = BDClinica.getInstance().consultarFamiliarPorCpfOuNome(chave, chave);
                if (familiar != null) {
                    jTextArea1.setText(montarRelatorio(familiar));
                    javax.swing.JOptionPane.showMessageDialog(
                            this, 
                            "Relatório de familiar gerado com sucesso", 
                            "Sucesso", 
                            javax.swing.JOptionPane.INFORMATION_MESSAGE);
                } else {
                    jTextArea1.setText("");
                    javax.swing.JOptionPane.showMessageDialog(
                            this, 
                            "Familiar não encontrado para o CPF ou nome informado",
                            "Não encontrado", 
                            javax.swing.JOptionPane.WARNING_MESSAGE);
                }
            } else if (tipoRelatorio.equals("PSICOLOGO")) {
                Psicologo psicologo = BDClinica.getInstance().consultarPsicologoPorCrpCpfOuNome(chave, chave, chave);
                if (psicologo != null) {
                    jTextArea1.setText(montarRelatorio(psicologo));
                    javax.swing.JOptionPane.showMessageDialog(
                            this, 
                            "Relatório de psicólogo gerado com sucesso", 
                            "Sucesso", 
                            javax.swing.JOptionPane.INFORMATION_MESSAGE);
                } else {
                    jTextArea1.setText("");
                    javax.swing.JOptionPane.showMessageDialog(
                            this, 
                            "Psicólogo não encontrado para o CRP, CPF ou nome informado", 
                            "Não encontrado", 
                            javax.swing.JOptionPane.WARNING_MESSAGE);
                }
            }
        } catch (EntradaInvalidaException e) {
            javax.swing.JOptionPane.showMessageDialog(
                    this, e.getMessage(), 
                    "Erro de validação",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limparCamposRelatorio();
    }//GEN-LAST:event_btLimparActionPerformed

    public void abrirRelatorioConsulta() {
        tipoRelatorio = "CONSULTA";
        rotRelatorioIndividual.setText("Relatório Individual - Consulta");
        rotCodConsulta.setText("Código da Consulta");
        prepararAbertura();
    }

    public void abrirRelatorioPaciente() {
        tipoRelatorio = "PACIENTE";
        rotRelatorioIndividual.setText("Relatório Individual - Paciente");
        rotCodConsulta.setText("CPF ou Nome");
        prepararAbertura();
    }

    public void abrirRelatorioFamiliar() {
        tipoRelatorio = "FAMILIAR";
        rotRelatorioIndividual.setText("Relatório Individual - Familiar");
        rotCodConsulta.setText("CPF ou Nome");
        prepararAbertura();
    }

    public void abrirRelatorioPsicologo() {
        tipoRelatorio = "PSICOLOGO";
        rotRelatorioIndividual.setText("Relatório Individual - Psicólogo");
        rotCodConsulta.setText("CRP, CPF ou Nome");
        prepararAbertura();
    }

    private void prepararAbertura() {
        limparCamposRelatorio();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void limparCamposRelatorio() {
        cxCodConsulta.setText("");
        jTextArea1.setText("");
        cxCodConsulta.requestFocus();
    }

    private int lerCodigoConsulta() throws EntradaInvalidaException {
        try {
            return Integer.parseInt(cxCodConsulta.getText().trim());
        } catch (NumberFormatException e) {
            throw new EntradaInvalidaException("Informe um código numérico para buscar a consulta");
        }
    }

    private String montarRelatorio(Paciente paciente) {
        String texto = "RELATÓRIO INDIVIDUAL DE PACIENTE\n";
        texto += "----------------------------------------\n";
        texto += "Nome: " + paciente.getNome() + "\n";
        texto += "CPF: " + paciente.getCpf() + "\n";
        texto += "Telefone: " + paciente.getTelefone() + "\n";
        texto += "Idade: " + paciente.getIdade() + "\n";
        texto += "Rua: " + paciente.getEndereco().getRua() + "\n"; //Reflexividade
        texto += "Número: " + paciente.getEndereco().getNumero() + "\n"; //Reflexividade
        texto += "Bairro: " + paciente.getEndereco().getBairro() + "\n"; //Reflexividade
        texto += "Cidade: " + paciente.getEndereco().getCidade() + "\n"; //Reflexividade
        texto += "Histórico clínico: " + paciente.getHistoricoClinico() + "\n";
        texto += "Nível de urgência: " + paciente.getNivelUrgencia() + "\n";
        return texto;
    }

    private String montarRelatorio(Familiar familiar) {
        String texto = "RELATÓRIO INDIVIDUAL DE FAMILIAR\n";
        texto += "----------------------------------------\n";
        texto += "Nome: " + familiar.getNome() + "\n";
        texto += "CPF: " + familiar.getCpf() + "\n";
        texto += "Telefone: " + familiar.getTelefone() + "\n";
        texto += "Idade: " + familiar.getIdade() + "\n";
        texto += "Rua: " + familiar.getEndereco().getRua() + "\n"; //Reflexividade
        texto += "Número: " + familiar.getEndereco().getNumero() + "\n"; //Reflexividade
        texto += "Bairro: " + familiar.getEndereco().getBairro() + "\n"; //Reflexividade
        texto += "Cidade: " + familiar.getEndereco().getCidade() + "\n"; //Reflexividade
        texto += "Parentesco: " + familiar.getParentesco() + "\n";
        texto += "Responsável financeiro: " + familiar.getResponsavelFinanceiro() + "\n";
        return texto;
    }

    private String montarRelatorio(Psicologo psicologo) {
        String texto = "RELATÓRIO INDIVIDUAL DE PSICÓLOGO\n";
        texto += "----------------------------------------\n";
        texto += "Nome: " + psicologo.getNome() + "\n";
        texto += "CPF: " + psicologo.getCpf() + "\n";
        texto += "Telefone: " + psicologo.getTelefone() + "\n";
        texto += "Idade: " + psicologo.getIdade() + "\n";
        texto += "Rua: " + psicologo.getEndereco().getRua() + "\n"; //Reflexividade
        texto += "Número: " + psicologo.getEndereco().getNumero() + "\n"; //Reflexividade
        texto += "Bairro: " + psicologo.getEndereco().getBairro() + "\n"; //Reflexividade
        texto += "Cidade: " + psicologo.getEndereco().getCidade() + "\n"; //Reflexividade
        texto += "CRP: " + psicologo.getCrp() + "\n";
        texto += "Abordagem: " + psicologo.getAbordagem() + "\n";
        return texto;
    }

    private String montarRelatorio(Consulta consulta) {
        String texto = "RELATÓRIO INDIVIDUAL DE CONSULTA\n";
        texto += "----------------------------------------\n";
        texto += "Código: " + consulta.getCodigo() + "\n";
        texto += "Tipo: " + consulta.identificarConsulta() + "\n";
        texto += "Data: " + consulta.getData() + "\n";
        texto += "Horário: " + consulta.getHorario() + "\n";
        texto += "Status: " + consulta.getSituacaoAgendamento() + "\n\n";
        texto += "Paciente: " + consulta.getPaciente().getNome() + "\n"; //Reflexividade
        texto += "CPF do paciente: " + consulta.getPaciente().getCpf() + "\n"; //Reflexividade
        texto += "Histórico clínico: " + consulta.getPaciente().getHistoricoClinico() + "\n"; //Reflexividade
        texto += "Nível de urgência: " + consulta.getPaciente().getNivelUrgencia() + "\n\n"; //Reflexividade
        texto += "Psicólogo: " + consulta.getPsicologo().getNome() + "\n"; //Reflexividade
        texto += "CRP: " + consulta.getPsicologo().getCrp() + "\n"; //Reflexividade
        texto += "Abordagem: " + consulta.getPsicologo().getAbordagem() + "\n"; //Reflexividade

        if (consulta instanceof Terapia) {
            Terapia terapia = (Terapia) consulta;
            texto += "\nDados específicos da terapia:\n";
            texto += "Abordagem da terapia: " + terapia.getAbordagem() + "\n";
            texto += "Número da sessão: " + terapia.getNumeroSessao() + "\n";
        } else if (consulta instanceof OrientacaoVocacional) {
            OrientacaoVocacional orientacao = (OrientacaoVocacional) consulta;
            texto += "\nDados específicos da orientação vocacional:\n";
            texto += "Área de interesse: " + orientacao.getAreaInteresse() + "\n";
            texto += "Teste aplicado: " + orientacao.getTesteAplicado() + "\n";
        } else if (consulta instanceof LaudoPsicologico) {
            LaudoPsicologico laudo = (LaudoPsicologico) consulta;
            texto += "\nDados específicos do laudo psicológico:\n";
            texto += "Finalidade: " + laudo.getFinalidadeLaudo() + "\n";
            texto += "Conclusão técnica: " + laudo.getConclusaoTecnica() + "\n";
        } else if (consulta instanceof AtestadoPsicologico) {
            AtestadoPsicologico atestado = (AtestadoPsicologico) consulta;
            texto += "\nDados específicos do atestado psicológico:\n";
            texto += "Dias de afastamento: " + atestado.getIndicarDiasAfastamento() + "\n";
            texto += "Motivo: " + atestado.getMotivoAtestado() + "\n";
        }
        return texto;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField cxCodConsulta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel rotCodConsulta;
    private javax.swing.JLabel rotRelatorioIndividual;
    // End of variables declaration//GEN-END:variables
}
