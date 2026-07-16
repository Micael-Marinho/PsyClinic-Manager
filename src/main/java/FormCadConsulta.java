// Apache NetBeans 24
// Autor: Micael Marinho Souza

public class FormCadConsulta extends javax.swing.JFrame {

    private static FormCadConsulta formCadConsulta;
    private int codigoOriginal = 0;

    //MÉTODO SINGLETON
    public static FormCadConsulta getInstance() {
        if (formCadConsulta == null) {
            formCadConsulta = new FormCadConsulta();
        }
        return formCadConsulta;
    }

    private FormCadConsulta() {
        initComponents();
        // Mantém a janela em tamanho fixo para não desorganizar os componentes.
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        configurarTipoConsulta();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotAgendamentoConsulta = new javax.swing.JLabel();
        rotCodigo = new javax.swing.JLabel();
        cxCodigo = new javax.swing.JTextField();
        rotData = new javax.swing.JLabel();
        cxData = new javax.swing.JTextField();
        rotHorario = new javax.swing.JLabel();
        cxHorario = new javax.swing.JTextField();
        rotSituacao = new javax.swing.JLabel();
        cxSituacao = new javax.swing.JTextField();
        rotCPF = new javax.swing.JLabel();
        cxCPF = new javax.swing.JTextField();
        rotCRP = new javax.swing.JLabel();
        cxCRP = new javax.swing.JTextField();
        rotTipoConsulta = new javax.swing.JLabel();
        cboxTipoConsulta = new javax.swing.JComboBox<>();
        rotAbordagem = new javax.swing.JLabel();
        cxAbordagem = new javax.swing.JTextField();
        rotSessao = new javax.swing.JLabel();
        cxSessao = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        rotObs = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        rotAgendamentoConsulta.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        rotAgendamentoConsulta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rotAgendamentoConsulta.setText("Agendamento de Consulta");

        rotCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotCodigo.setText("Código (Ex: 1)");

        cxCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCodigoActionPerformed(evt);
            }
        });

        rotData.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotData.setText("Data (Ex: 10/05/2027)");

        cxData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxDataActionPerformed(evt);
            }
        });

        rotHorario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotHorario.setText("Horário (hh:mm)");

        cxHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxHorarioActionPerformed(evt);
            }
        });

        rotSituacao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotSituacao.setText("Situação (Ex: Confirmado)");

        cxSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxSituacaoActionPerformed(evt);
            }
        });

        rotCPF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotCPF.setText("CPF Paciente (Ex: 777.888.999-00)");

        cxCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCPFActionPerformed(evt);
            }
        });

        rotCRP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotCRP.setText("CRP Psicólogo (06/123456)");

        cxCRP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCRPActionPerformed(evt);
            }
        });

        rotTipoConsulta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotTipoConsulta.setText("Tipo de Consulta");

        cboxTipoConsulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboxTipoConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxTipoConsultaActionPerformed(evt);
            }
        });

        rotAbordagem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotAbordagem.setText("Abordagem Terapêutica");

        cxAbordagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxAbordagemActionPerformed(evt);
            }
        });

        rotSessao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotSessao.setText("N° Sessão (Ex: 1)");

        cxSessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxSessaoActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
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

        rotObs.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rotObs.setText("OBS: CONSULTAR É REALIZADA VIA CÓDIGO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rotAgendamentoConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rotCodigo)
                                    .addComponent(rotData)
                                    .addComponent(rotHorario)
                                    .addComponent(rotSituacao)
                                    .addComponent(rotCPF)
                                    .addComponent(rotAbordagem)
                                    .addComponent(rotSessao)
                                    .addComponent(rotCRP)
                                    .addComponent(rotTipoConsulta))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btSalvar)
                                .addGap(7, 7, 7)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cxCodigo)
                            .addComponent(cxData)
                            .addComponent(cxHorario)
                            .addComponent(cxSituacao)
                            .addComponent(cxCPF)
                            .addComponent(cxCRP)
                            .addComponent(cboxTipoConsulta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btConsultar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btVoltar))
                            .addComponent(cxSessao)
                            .addComponent(cxAbordagem))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(rotObs)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotAgendamentoConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotCodigo)
                    .addComponent(cxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotData)
                    .addComponent(cxData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotHorario)
                    .addComponent(cxHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotSituacao)
                    .addComponent(cxSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotCPF)
                    .addComponent(cxCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotCRP)
                    .addComponent(cxCRP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotTipoConsulta)
                    .addComponent(cboxTipoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotAbordagem)
                    .addComponent(cxAbordagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotSessao)
                    .addComponent(cxSessao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btConsultar)
                    .addComponent(btAlterar)
                    .addComponent(btExcluir)
                    .addComponent(btLimpar)
                    .addComponent(btVoltar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rotObs)
                .addGap(4, 4, 4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboxTipoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxTipoConsultaActionPerformed
        atualizarRotulosTipoConsulta();
    }//GEN-LAST:event_cboxTipoConsultaActionPerformed

    private void cxDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxDataActionPerformed
    }//GEN-LAST:event_cxDataActionPerformed

    private void cxHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxHorarioActionPerformed
    }//GEN-LAST:event_cxHorarioActionPerformed

    private void cxCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCodigoActionPerformed
    }//GEN-LAST:event_cxCodigoActionPerformed

    private void cxSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxSituacaoActionPerformed
    }//GEN-LAST:event_cxSituacaoActionPerformed

    private void cxCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCPFActionPerformed
    }//GEN-LAST:event_cxCPFActionPerformed

    private void cxCRPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCRPActionPerformed
    }//GEN-LAST:event_cxCRPActionPerformed

    private void cxAbordagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxAbordagemActionPerformed
    }//GEN-LAST:event_cxAbordagemActionPerformed

    private void cxSessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxSessaoActionPerformed
    }//GEN-LAST:event_cxSessaoActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        try {
            Consulta consulta = montarConsulta();
            BDClinica.getInstance().inserirConsulta(consulta);
            javax.swing.JOptionPane.showMessageDialog(
                    this, 
                    "Consulta cadastrada com sucesso.", 
                    "Sucesso", 
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
            limparCampos();
            
        } catch (EntradaInvalidaException e) {
            javax.swing.JOptionPane.showMessageDialog(
                    this, e.getMessage(), 
                    "Erro de validação", 
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            
        } catch (ConsultaInvalidaException e) {
            javax.swing.JOptionPane.showMessageDialog(
                    this, e.getMessage(), 
                    "Consulta inválida", 
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            
        } catch (HorarioIndisponivelException e) {
            javax.swing.JOptionPane.showMessageDialog(
                    this, e.getMessage(), 
                    "Horário indisponível", 
                    javax.swing.JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        try {
            if (cxCodigo.getText().trim().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(
                        this, 
                        "Informe o código da consulta para realizar a busca", 
                        "Atenção", 
                        javax.swing.JOptionPane.WARNING_MESSAGE);
                cxCodigo.requestFocus();
                return;
            }
            int codigo = lerInteiro(cxCodigo.getText().trim(), "Informe o código numérico da consulta");
            Consulta consulta = BDClinica.getInstance().consultarConsulta(codigo);
            if (consulta != null) {
                preencherCampos(consulta);
                javax.swing.JOptionPane.showMessageDialog(
                        this, 
                        "Consulta encontrada", 
                        "Consulta realizada", 
                        javax.swing.JOptionPane.INFORMATION_MESSAGE);
                
            } else {
                javax.swing.JOptionPane.showMessageDialog(
                        this,
                        "Consulta não encontrada para o código informado",
                        "Não encontrado", 
                        javax.swing.JOptionPane.WARNING_MESSAGE);
            }
        } catch (EntradaInvalidaException e) {
            javax.swing.JOptionPane.showMessageDialog(
                    this, e.getMessage(), 
                    "Erro de validação", 
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        try {
            if (cxCodigo.getText().trim().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(
                        this, 
                        "Informe o código da consulta que deseja alterar", 
                        "Atenção", 
                        javax.swing.JOptionPane.WARNING_MESSAGE);
                cxCodigo.requestFocus();
                return;
            }
            int opcao = javax.swing.JOptionPane.showConfirmDialog(
                    this, 
                    "Confirma a alteração desta consulta?",
                    "Confirmar alteração",
                    javax.swing.JOptionPane.YES_NO_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE);
            
            if (opcao == javax.swing.JOptionPane.YES_OPTION) {
                Consulta consulta = montarConsulta();
                int chaveAlteracao = codigoOriginal > 0 ? codigoOriginal : consulta.getCodigo();
                BDClinica.getInstance().alterarConsulta(chaveAlteracao, consulta);
                codigoOriginal = consulta.getCodigo();
                javax.swing.JOptionPane.showMessageDialog(
                        this,
                        "Consulta alterada com sucesso", 
                        "Sucesso", 
                        javax.swing.JOptionPane.INFORMATION_MESSAGE);
                limparCampos();
            }
        } catch (EntradaInvalidaException e) {
            javax.swing.JOptionPane.showMessageDialog(
                    this, e.getMessage(), 
                    "Erro de validação", 
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            
        } catch (ConsultaInvalidaException e) {
            javax.swing.JOptionPane.showMessageDialog(
                    this, e.getMessage(), 
                    "Consulta inválida", 
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            
        } catch (HorarioIndisponivelException e) {
            javax.swing.JOptionPane.showMessageDialog(
                    this, e.getMessage(), 
                    "Horário indisponível", 
                    javax.swing.JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        try {
            if (cxCodigo.getText().trim().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(
                        this,
                        "Informe o código da consulta que deseja excluir", 
                        "Atenção", 
                        javax.swing.JOptionPane.WARNING_MESSAGE);
                cxCodigo.requestFocus();
                return;
            }
            int codigo = lerInteiro(cxCodigo.getText().trim(), "Informe o código numérico da consulta");
            int opcao = javax.swing.JOptionPane.showConfirmDialog(
                    this, 
                    "Deseja realmente excluir esta consulta?", 
                    "Confirmação", 
                    javax.swing.JOptionPane.YES_NO_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE);
            
            if (opcao == javax.swing.JOptionPane.YES_OPTION) {
                boolean excluiu = BDClinica.getInstance().excluirConsulta(codigo);
                if (excluiu) {
                    javax.swing.JOptionPane.showMessageDialog(
                            this, 
                            "Consulta excluída com sucesso", 
                            "Sucesso", 
                            javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    limparCampos();
                    
                } else {
                    javax.swing.JOptionPane.showMessageDialog(
                            this, 
                            "Consulta não encontrada para exclusão.", 
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
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        setVisible(false);
        FormPrincipal.getInstance().setVisible(true);
    }//GEN-LAST:event_btVoltarActionPerformed

    private void configurarTipoConsulta() {
        cboxTipoConsulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {
            "Terapia", "Orientacao Vocacional", "Laudo Psicologico", "Atestado Psicologico"
        }));
        atualizarRotulosTipoConsulta();
    }

    private void atualizarRotulosTipoConsulta() {
        String tipo = String.valueOf(cboxTipoConsulta.getSelectedItem());
        if (tipo.equals("Terapia")) {
            rotAbordagem.setText("Abordagem");
            rotSessao.setText("N° Sessão");
            
        } else if (tipo.equals("Orientacao Vocacional")) {
            rotAbordagem.setText("Área de Interesse");
            rotSessao.setText("Teste Aplicado");
            
        } else if (tipo.equals("Laudo Psicologico")) {
            rotAbordagem.setText("Finalidade");
            rotSessao.setText("Conclusão Técnica");
            
        } else if (tipo.equals("Atestado Psicologico")) {
            rotAbordagem.setText("Dias Afastamento");
            rotSessao.setText("Motivo");
        }
    }

    private Consulta montarConsulta() throws EntradaInvalidaException, ConsultaInvalidaException {
        int codigo = lerInteiro(cxCodigo.getText().trim(), "O código da consulta deve ser numérico.");
        Paciente paciente = BDClinica.getInstance().consultarPaciente(cxCPF.getText().trim());
        Psicologo psicologo = BDClinica.getInstance().consultarPsicologo(cxCRP.getText().trim());

        if (paciente == null) {
            throw new EntradaInvalidaException("Cadastre ou consulte um paciente válido antes de agendar a consulta");
        }
        if (psicologo == null) {
            throw new EntradaInvalidaException("Cadastre ou consulte um psicólogo válido antes de agendar a consulta");
        }

        Consulta consulta;
        String tipo = String.valueOf(cboxTipoConsulta.getSelectedItem());
        if (tipo.equals("Terapia")) {
            Terapia terapia = new Terapia();
            terapia.setAbordagem(cxAbordagem.getText().trim());
            terapia.setNumeroSessao(lerInteiroOpcional(cxSessao.getText().trim()));
            consulta = terapia;
            
        } else if (tipo.equals("Orientacao Vocacional")) {
            OrientacaoVocacional orientacao = new OrientacaoVocacional();
            orientacao.setAreaInteresse(cxAbordagem.getText().trim());
            orientacao.setTesteAplicado(cxSessao.getText().trim());
            consulta = orientacao;
            
        } else if (tipo.equals("Laudo Psicologico")) {
            LaudoPsicologico laudo = new LaudoPsicologico();
            laudo.setFinalidadeLaudo(cxAbordagem.getText().trim());
            laudo.setConclusaoTecnica(cxSessao.getText().trim());
            consulta = laudo;
            
        } else {
            AtestadoPsicologico atestado = new AtestadoPsicologico();
            atestado.setIndicarDiasAfastamento(lerInteiroOpcional(cxAbordagem.getText().trim()));
            atestado.setMotivoAtestado(cxSessao.getText().trim());
            consulta = atestado;
        }

        consulta.setCodigo(codigo);
        consulta.setData(cxData.getText().trim());
        consulta.setHorario(cxHorario.getText().trim());
        consulta.setPaciente(paciente);
        consulta.setPsicologo(psicologo);

        if (cxSituacao.getText().trim().isEmpty()) {
            consulta.agendar();
        } else {
            consulta.setStatus(cxSituacao.getText().trim());
        }
        return consulta;
    }

    private int lerInteiro(String valor, String mensagemErro) throws EntradaInvalidaException {
        try {
            return Integer.parseInt(valor);
        } catch (NumberFormatException e) {
            throw new EntradaInvalidaException(mensagemErro);
        }
    }

    private int lerInteiroOpcional(String valor) throws EntradaInvalidaException {
        if (valor == null || valor.trim().isEmpty()) {
            return 0;
        }
        return lerInteiro(valor.trim(), "O campo numérico deve ser preenchido apenas com números");
    }

    private void preencherCampos(Consulta consulta) {
        cxCodigo.setText(String.valueOf(consulta.getCodigo()));
        cxData.setText(consulta.getData());
        cxHorario.setText(consulta.getHorario());
        cxSituacao.setText(consulta.getSituacaoAgendamento());
        cxCPF.setText(consulta.getPaciente().getCpf()); //Reflexividade
        cxCRP.setText(consulta.getPsicologo().getCrp()); //Reflexividade
        cboxTipoConsulta.setSelectedItem(consulta.identificarConsulta());
        atualizarRotulosTipoConsulta();

        codigoOriginal = consulta.getCodigo();
        if (consulta instanceof Terapia) {
            Terapia terapia = (Terapia) consulta;
            cxAbordagem.setText(terapia.getAbordagem());
            cxSessao.setText(String.valueOf(terapia.getNumeroSessao()));
            
        } else if (consulta instanceof OrientacaoVocacional) {
            OrientacaoVocacional orientacao = (OrientacaoVocacional) consulta;
            cxAbordagem.setText(orientacao.getAreaInteresse());
            cxSessao.setText(orientacao.getTesteAplicado());
            
        } else if (consulta instanceof LaudoPsicologico) {
            LaudoPsicologico laudo = (LaudoPsicologico) consulta;
            cxAbordagem.setText(laudo.getFinalidadeLaudo());
            cxSessao.setText(laudo.getConclusaoTecnica());
            
        } else if (consulta instanceof AtestadoPsicologico) {
            AtestadoPsicologico atestado = (AtestadoPsicologico) consulta;
            cxAbordagem.setText(String.valueOf(atestado.getIndicarDiasAfastamento()));
            cxSessao.setText(atestado.getMotivoAtestado());
        }
    }

    private void limparCampos() {
        cxCodigo.setText("");
        cxData.setText("");
        cxHorario.setText("");
        cxSituacao.setText("");
        cxCPF.setText("");
        cxCRP.setText("");
        cxAbordagem.setText("");
        cxSessao.setText("");
        cboxTipoConsulta.setSelectedIndex(0);
        atualizarRotulosTipoConsulta();
        codigoOriginal = 0;
        cxCodigo.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox<String> cboxTipoConsulta;
    private javax.swing.JTextField cxAbordagem;
    private javax.swing.JTextField cxCPF;
    private javax.swing.JTextField cxCRP;
    private javax.swing.JTextField cxCodigo;
    private javax.swing.JTextField cxData;
    private javax.swing.JTextField cxHorario;
    private javax.swing.JTextField cxSessao;
    private javax.swing.JTextField cxSituacao;
    private javax.swing.JLabel rotAbordagem;
    private javax.swing.JLabel rotAgendamentoConsulta;
    private javax.swing.JLabel rotCPF;
    private javax.swing.JLabel rotCRP;
    private javax.swing.JLabel rotCodigo;
    private javax.swing.JLabel rotData;
    private javax.swing.JLabel rotHorario;
    private javax.swing.JLabel rotObs;
    private javax.swing.JLabel rotSessao;
    private javax.swing.JLabel rotSituacao;
    private javax.swing.JLabel rotTipoConsulta;
    // End of variables declaration//GEN-END:variables
}
