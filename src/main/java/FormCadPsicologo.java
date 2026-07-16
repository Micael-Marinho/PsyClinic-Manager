// Apache NetBeans 24
// Autor: Micael Marinho Souza

public class FormCadPsicologo extends javax.swing.JFrame {

    private static FormCadPsicologo formCadPsicologo;
    private String crpOriginal = "";

    //MÉTODO SINGLETON
    public static FormCadPsicologo getInstance() {
        if (formCadPsicologo == null) {
            formCadPsicologo = new FormCadPsicologo();
        }
        return formCadPsicologo;
    }

    private FormCadPsicologo() {
        initComponents();
        // Mantém a janela em tamanho fixo para não desorganizar os componentes.
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotCadastroPsicologo = new javax.swing.JLabel();
        rotNome = new javax.swing.JLabel();
        cxNome = new javax.swing.JTextField();
        rotCPF = new javax.swing.JLabel();
        cxCPF = new javax.swing.JTextField();
        rotTelefone = new javax.swing.JLabel();
        cxTelefone = new javax.swing.JTextField();
        rotIdade = new javax.swing.JLabel();
        cxIdade = new javax.swing.JTextField();
        rotRua = new javax.swing.JLabel();
        cxRua = new javax.swing.JTextField();
        rotNumeroRua = new javax.swing.JLabel();
        cxNumeroRua = new javax.swing.JTextField();
        rotBairro = new javax.swing.JLabel();
        cxBairro = new javax.swing.JTextField();
        rotCidade = new javax.swing.JLabel();
        cxCidade = new javax.swing.JTextField();
        rotCRP = new javax.swing.JLabel();
        cxCRP = new javax.swing.JTextField();
        rotAbordagem = new javax.swing.JLabel();
        cxAbordagem2 = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        rotObs = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        rotCadastroPsicologo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        rotCadastroPsicologo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rotCadastroPsicologo.setText("Cadastro Psicológo");

        rotNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotNome.setText("Nome");

        cxNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxNomeActionPerformed(evt);
            }
        });

        rotCPF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotCPF.setText("CPF (Ex: 777.888.999-00) ");

        cxCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCPFActionPerformed(evt);
            }
        });

        rotTelefone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotTelefone.setText("Telefone (Ex: 43 93523-1100)");

        cxTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxTelefoneActionPerformed(evt);
            }
        });

        rotIdade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotIdade.setText("Idade");

        cxIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxIdadeActionPerformed(evt);
            }
        });

        rotRua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotRua.setText("Rua");

        cxRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxRuaActionPerformed(evt);
            }
        });

        rotNumeroRua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotNumeroRua.setText("Número");

        cxNumeroRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxNumeroRuaActionPerformed(evt);
            }
        });

        rotBairro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotBairro.setText("Bairro");

        cxBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxBairroActionPerformed(evt);
            }
        });

        rotCidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotCidade.setText("Cidade");

        cxCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCidadeActionPerformed(evt);
            }
        });

        rotCRP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotCRP.setText("CRP Psicólogo (06/123456)");

        cxCRP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCRPActionPerformed(evt);
            }
        });

        rotAbordagem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotAbordagem.setText("Abordagem terapêutica");

        cxAbordagem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxAbordagem2ActionPerformed(evt);
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
        rotObs.setText("OBS: CONSULTAR É REALIZADA VIA NOME E/OU CPF");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rotCadastroPsicologo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rotBairro)
                                    .addComponent(rotNumeroRua)
                                    .addComponent(rotCidade)
                                    .addComponent(rotCRP)
                                    .addComponent(rotAbordagem))
                                .addGap(6, 6, 6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rotIdade, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rotRua, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rotTelefone, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rotNome, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rotCPF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cxIdade)
                                .addComponent(cxRua)
                                .addComponent(cxNumeroRua)
                                .addComponent(cxBairro)
                                .addComponent(cxCidade)
                                .addComponent(cxCRP, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cxCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
                                .addComponent(cxTelefone)
                                .addComponent(cxAbordagem2))
                            .addComponent(cxNome)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 309, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btConsultar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btVoltar))
                            .addComponent(rotObs, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(rotCadastroPsicologo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rotNome, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotTelefone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotIdade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxRua, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotRua))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxNumeroRua, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotNumeroRua))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotBairro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotCidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxCRP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotCRP))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxAbordagem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotAbordagem, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltar)
                    .addComponent(btLimpar)
                    .addComponent(btExcluir)
                    .addComponent(btAlterar)
                    .addComponent(btConsultar)
                    .addComponent(btSalvar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rotObs)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCidadeActionPerformed
    }//GEN-LAST:event_cxCidadeActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        if (cxCRP.getText().trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(
                    this, 
                    "Informe o CRP do psicólogo que deseja excluir", 
                    "Atenção", 
                    javax.swing.JOptionPane.WARNING_MESSAGE);
            cxCRP.requestFocus();
            return;
        }
        int opcao = javax.swing.JOptionPane.showConfirmDialog(
                this, 
                "Deseja realmente excluir este psicólogo?", 
                "Confirmação", 
                javax.swing.JOptionPane.YES_NO_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE);
        
        if (opcao == javax.swing.JOptionPane.YES_OPTION) {
            boolean excluiu = BDClinica.getInstance().excluirPsicologo(cxCRP.getText().trim());
            if (excluiu) {
                javax.swing.JOptionPane.showMessageDialog(
                        this, "Psicólogo excluído com sucesso", 
                        "Sucesso", 
                        javax.swing.JOptionPane.INFORMATION_MESSAGE);
                limparCampos();
            } else {
                javax.swing.JOptionPane.showMessageDialog(
                        this, 
                        "Psicólogo não encontrado para exclusão", 
                        "Não encontrado", 
                        javax.swing.JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        setVisible(false);
        FormPrincipal.getInstance().setVisible(true);
    }//GEN-LAST:event_btVoltarActionPerformed

    private void cxCRPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCRPActionPerformed
    }//GEN-LAST:event_cxCRPActionPerformed

    private void cxAbordagem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxAbordagem2ActionPerformed
    }//GEN-LAST:event_cxAbordagem2ActionPerformed

    private void cxBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxBairroActionPerformed
    }//GEN-LAST:event_cxBairroActionPerformed

    private void cxNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxNomeActionPerformed
    }//GEN-LAST:event_cxNomeActionPerformed

    private void cxCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCPFActionPerformed
    }//GEN-LAST:event_cxCPFActionPerformed

    private void cxTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxTelefoneActionPerformed
    }//GEN-LAST:event_cxTelefoneActionPerformed

    private void cxIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxIdadeActionPerformed
    }//GEN-LAST:event_cxIdadeActionPerformed

    private void cxRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxRuaActionPerformed
    }//GEN-LAST:event_cxRuaActionPerformed

    private void cxNumeroRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxNumeroRuaActionPerformed
    }//GEN-LAST:event_cxNumeroRuaActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        try {
            Psicologo psicologo = montarPsicologo();
            BDClinica.getInstance().inserirPsicologo(psicologo);
            crpOriginal = psicologo.getCrp();
            javax.swing.JOptionPane.showMessageDialog(
                    this, 
                    "Psicólogo cadastrado com sucesso", 
                    "Sucesso", 
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
            limparCampos();
            
        } catch (EntradaInvalidaException e) {
            javax.swing.JOptionPane.showMessageDialog(
                    this, 
                    e.getMessage(), 
                    "Erro de validação", 
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        if (cxCRP.getText().trim().isEmpty() && cxCPF.getText().trim().isEmpty() && cxNome.getText().trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(
                    this, 
                    "Informe o CRP, CPF ou nome para consultar o psicólogo", 
                    "Atenção", 
                    javax.swing.JOptionPane.WARNING_MESSAGE);
            cxCRP.requestFocus();
            return;
        }
        Psicologo psicologo = BDClinica.getInstance().consultarPsicologoPorCrpCpfOuNome(cxCRP.getText().trim(), cxCPF.getText().trim(), cxNome.getText().trim());
        if (psicologo != null) {
            preencherCampos(psicologo);
            javax.swing.JOptionPane.showMessageDialog(
                    this, 
                    "Psicólogo encontrado", 
                    "Consulta realizada", 
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else {
            javax.swing.JOptionPane.showMessageDialog(
                    this, 
                    "Psicólogo não encontrado. Verifique CRP, CPF ou nome informado", 
                    "Não encontrado", 
                    javax.swing.JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        try {
            if (cxCRP.getText().trim().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(
                        this, 
                        "Informe o CRP do psicólogo que deseja alterar", 
                        "Atenção",
                        javax.swing.JOptionPane.WARNING_MESSAGE);
                cxCRP.requestFocus();
                return;
            }
            int opcao = javax.swing.JOptionPane.showConfirmDialog(
                    this, 
                    "Confirma a alteração dos dados deste psicólogo?", 
                    "Confirmar alteração", 
                    javax.swing.JOptionPane.YES_NO_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE);
            
            if (opcao == javax.swing.JOptionPane.YES_OPTION) {
                String chaveAlteracao = crpOriginal;
                if (chaveAlteracao.trim().isEmpty()) {
                    Psicologo psicologoAtual = BDClinica.getInstance().consultarPsicologoPorCrpCpfOuNome(cxCRP.getText().trim(), cxCPF.getText().trim(), cxNome.getText().trim());
                    if (psicologoAtual != null) {
                        chaveAlteracao = psicologoAtual.getCrp();
                    }
                }
                Psicologo psicologo = montarPsicologo();
                BDClinica.getInstance().alterarPsicologo(chaveAlteracao, psicologo);
                crpOriginal = psicologo.getCrp();
                javax.swing.JOptionPane.showMessageDialog(
                        this, 
                        "Psicólogo alterado com sucesso", 
                        "Sucesso", 
                        javax.swing.JOptionPane.INFORMATION_MESSAGE);
                limparCampos();
            }
        } catch (EntradaInvalidaException e) {
            javax.swing.JOptionPane.showMessageDialog(
                    this, e.getMessage(), 
                    "Erro de validação", 
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btAlterarActionPerformed


    private Psicologo montarPsicologo() throws EntradaInvalidaException {
        Psicologo psicologo = new Psicologo();
        psicologo.setNome(cxNome.getText().trim());
        psicologo.setCpf(cxCPF.getText().trim());
        psicologo.setTelefone(cxTelefone.getText().trim());
        psicologo.setIdade(lerIdade(cxIdade.getText().trim()));
        psicologo.setEndereco(montarEndereco());
        psicologo.setCrp(cxCRP.getText().trim());
        psicologo.setAbordagem(cxAbordagem2.getText().trim());
        return psicologo;
    }

    private Endereco montarEndereco() {
        Endereco endereco = new Endereco();
        endereco.setRua(cxRua.getText().trim());
        endereco.setNumero(cxNumeroRua.getText().trim());
        endereco.setBairro(cxBairro.getText().trim());
        endereco.setCidade(cxCidade.getText().trim());
        return endereco;
    }

    private int lerIdade(String valor) throws EntradaInvalidaException {
        try {
            return Integer.parseInt(valor);
        } catch (NumberFormatException e) {
            throw new EntradaInvalidaException("A idade deve ser informada com números");
        }
    }

    private void preencherCampos(Psicologo psicologo) {
        cxNome.setText(psicologo.getNome());
        cxCPF.setText(psicologo.getCpf());
        cxTelefone.setText(psicologo.getTelefone());
        cxIdade.setText(String.valueOf(psicologo.getIdade()));
        cxRua.setText(psicologo.getEndereco().getRua()); //Reflexividade
        cxNumeroRua.setText(psicologo.getEndereco().getNumero()); //Reflexividade
        cxBairro.setText(psicologo.getEndereco().getBairro()); //Reflexividade
        cxCidade.setText(psicologo.getEndereco().getCidade()); //Reflexividade
        cxCRP.setText(psicologo.getCrp());
        cxAbordagem2.setText(psicologo.getAbordagem());
        crpOriginal = psicologo.getCrp();
    }

    private void limparCampos() {
        cxNome.setText("");
        cxCPF.setText("");
        cxTelefone.setText("");
        cxIdade.setText("");
        cxRua.setText("");
        cxNumeroRua.setText("");
        cxBairro.setText("");
        cxCidade.setText("");
        cxCRP.setText("");
        cxAbordagem2.setText("");
        crpOriginal = "";
        cxNome.requestFocus();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField cxAbordagem2;
    private javax.swing.JTextField cxBairro;
    private javax.swing.JTextField cxCPF;
    private javax.swing.JTextField cxCRP;
    private javax.swing.JTextField cxCidade;
    private javax.swing.JTextField cxIdade;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxNumeroRua;
    private javax.swing.JTextField cxRua;
    private javax.swing.JTextField cxTelefone;
    private javax.swing.JLabel rotAbordagem;
    private javax.swing.JLabel rotBairro;
    private javax.swing.JLabel rotCPF;
    private javax.swing.JLabel rotCRP;
    private javax.swing.JLabel rotCadastroPsicologo;
    private javax.swing.JLabel rotCidade;
    private javax.swing.JLabel rotIdade;
    private javax.swing.JLabel rotNome;
    private javax.swing.JLabel rotNumeroRua;
    private javax.swing.JLabel rotObs;
    private javax.swing.JLabel rotRua;
    private javax.swing.JLabel rotTelefone;
    // End of variables declaration//GEN-END:variables
}
