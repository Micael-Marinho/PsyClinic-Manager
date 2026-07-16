// Apache NetBeans 24
// Autor: Micael Marinho Souza

public class FormCadFamiliar extends javax.swing.JFrame {

    private static FormCadFamiliar formCadFamiliar;
    private String cpfOriginal = "";

    //MÉTODO SINGLETON
    public static FormCadFamiliar getInstance() {
        if (formCadFamiliar == null) {
            formCadFamiliar = new FormCadFamiliar();
        }
        return formCadFamiliar;
    }

    private FormCadFamiliar() {
        initComponents();
        // Mantém a janela em tamanho fixo para não desorganizar os componentes.
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotCadastroFamiliar = new javax.swing.JLabel();
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
        rotParentesco = new javax.swing.JLabel();
        cxParentesco = new javax.swing.JTextField();
        rotRespFin = new javax.swing.JLabel();
        cxRespFin = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        rotObs = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        rotCadastroFamiliar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        rotCadastroFamiliar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rotCadastroFamiliar.setText("Cadastro de Familiar");

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
        rotTelefone.setText("Telefone (Ex: 43 93523-1100) ");

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

        rotParentesco.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotParentesco.setText("Parentesco com paciente");

        cxParentesco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxParentescoActionPerformed(evt);
            }
        });

        rotRespFin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotRespFin.setText("Responsável Financeiro?");

        cxRespFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxRespFinActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotCadastroFamiliar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rotObs)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rotCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rotCPF)
                            .addComponent(rotNome)
                            .addComponent(rotTelefone)
                            .addComponent(rotIdade)
                            .addComponent(rotRua)
                            .addComponent(rotNumeroRua)
                            .addComponent(rotBairro)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rotParentesco)
                                .addGap(1, 1, 1))
                            .addComponent(rotRespFin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cxNome)
                            .addComponent(cxCPF)
                            .addComponent(cxTelefone)
                            .addComponent(cxIdade)
                            .addComponent(cxRua)
                            .addComponent(cxRespFin)
                            .addComponent(cxNumeroRua, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cxBairro)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(cxParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotCadastroFamiliar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotNome)
                    .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rotCPF)
                    .addComponent(cxCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotTelefone)
                    .addComponent(cxTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rotIdade)
                    .addComponent(cxIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotRua)
                    .addComponent(cxRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rotNumeroRua)
                    .addComponent(cxNumeroRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotBairro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotCidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotParentesco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotRespFin)
                    .addComponent(cxRespFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltar)
                    .addComponent(btLimpar)
                    .addComponent(btExcluir)
                    .addComponent(btAlterar)
                    .addComponent(btConsultar)
                    .addComponent(btSalvar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rotObs)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxIdadeActionPerformed
    }//GEN-LAST:event_cxIdadeActionPerformed

    private void cxCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCPFActionPerformed
    }//GEN-LAST:event_cxCPFActionPerformed

    private void cxCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCidadeActionPerformed
    }//GEN-LAST:event_cxCidadeActionPerformed

    private void cxParentescoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxParentescoActionPerformed
    }//GEN-LAST:event_cxParentescoActionPerformed

    private void cxRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxRuaActionPerformed
    }//GEN-LAST:event_cxRuaActionPerformed

    private void cxNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxNomeActionPerformed
    }//GEN-LAST:event_cxNomeActionPerformed

    private void cxTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxTelefoneActionPerformed
    }//GEN-LAST:event_cxTelefoneActionPerformed

    private void cxNumeroRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxNumeroRuaActionPerformed
    }//GEN-LAST:event_cxNumeroRuaActionPerformed

    private void cxBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxBairroActionPerformed
    }//GEN-LAST:event_cxBairroActionPerformed

    private void cxRespFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxRespFinActionPerformed
    }//GEN-LAST:event_cxRespFinActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        try {
            Familiar familiar = montarFamiliar();
            BDClinica.getInstance().inserirFamiliar(familiar);
            cpfOriginal = familiar.getCpf();
            javax.swing.JOptionPane.showMessageDialog(
                    this, 
                    "Familiar cadastrado com sucesso", 
                    "Sucesso", 
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
            limparCampos();
            
        } catch (EntradaInvalidaException e) {
            javax.swing.JOptionPane.showMessageDialog(
                    this, e.getMessage(),
                    "Erro de validação", 
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        if (cxCPF.getText().trim().isEmpty() && cxNome.getText().trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(
                    this, 
                    "Informe o CPF ou o nome para consultar o familiar", 
                    "Atenção", 
                    javax.swing.JOptionPane.WARNING_MESSAGE);
            cxNome.requestFocus();
            return;
        }
        Familiar familiar = BDClinica.getInstance().consultarFamiliarPorCpfOuNome(cxCPF.getText().trim(), cxNome.getText().trim());
        if (familiar != null) {
            preencherCampos(familiar);
            javax.swing.JOptionPane.showMessageDialog(
                    this, 
                    "Familiar encontrado",
                    "Consulta realizada", 
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else {
            javax.swing.JOptionPane.showMessageDialog(
                    this, 
                    "Familiar não encontrado. Verifique o CPF ou o nome informado", 
                    "Não encontrado", 
                    javax.swing.JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        try {
            if (cxCPF.getText().trim().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(
                        this, 
                        "Informe o CPF do familiar que deseja alterar", 
                        "Atenção",
                        javax.swing.JOptionPane.WARNING_MESSAGE);
                cxCPF.requestFocus();
                return;
            }
            int opcao = javax.swing.JOptionPane.showConfirmDialog(
                    this, 
                    "Confirma a alteração dos dados deste familiar?", 
                    "Confirmar alteração", 
                    javax.swing.JOptionPane.YES_NO_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE);
            if (opcao == javax.swing.JOptionPane.YES_OPTION) {
                String chaveAlteracao = cpfOriginal;
                if (chaveAlteracao.trim().isEmpty()) {
                    Familiar familiarAtual = BDClinica.getInstance().consultarFamiliarPorCpfOuNome(cxCPF.getText().trim(), cxNome.getText().trim());
                    if (familiarAtual != null) {
                        chaveAlteracao = familiarAtual.getCpf();
                    }
                }
                Familiar familiar = montarFamiliar();
                BDClinica.getInstance().alterarFamiliar(chaveAlteracao, familiar);
                cpfOriginal = familiar.getCpf();
                javax.swing.JOptionPane.showMessageDialog(
                        this, 
                        "Familiar alterado com sucesso", 
                        "Sucesso", 
                        javax.swing.JOptionPane.INFORMATION_MESSAGE);
                limparCampos();
            }
        } catch (EntradaInvalidaException e) {
            javax.swing.JOptionPane.showMessageDialog(
                    this, 
                    e.getMessage(), 
                    "Erro de validação", 
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        if (cxCPF.getText().trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(
                    this, 
                    "Informe o CPF do familiar que deseja excluir", 
                    "Atenção", 
                    javax.swing.JOptionPane.WARNING_MESSAGE);
            cxCPF.requestFocus();
            return;
        }
        int opcao = javax.swing.JOptionPane.showConfirmDialog(
                this, 
                "Deseja realmente excluir este familiar?", 
                "Confirmação", javax.swing.JOptionPane.YES_NO_OPTION,
                javax.swing.JOptionPane.QUESTION_MESSAGE);
        
        if (opcao == javax.swing.JOptionPane.YES_OPTION) {
            boolean excluiu = BDClinica.getInstance().excluirFamiliar(cxCPF.getText().trim());
            if (excluiu) {
                javax.swing.JOptionPane.showMessageDialog(
                        this, 
                        "Familiar excluído com sucesso", 
                        "Sucesso", 
                        javax.swing.JOptionPane.INFORMATION_MESSAGE);
                limparCampos();
                
            } else {
                javax.swing.JOptionPane.showMessageDialog(
                        this, 
                        "Familiar não encontrado para exclusão", 
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


    private Familiar montarFamiliar() throws EntradaInvalidaException {
        Familiar familiar = new Familiar();
        familiar.setNome(cxNome.getText().trim());
        familiar.setCpf(cxCPF.getText().trim());
        familiar.setTelefone(cxTelefone.getText().trim());
        familiar.setIdade(lerIdade(cxIdade.getText().trim()));
        familiar.setEndereco(montarEndereco());
        familiar.setParentesco(cxParentesco.getText().trim());
        familiar.setResponsavelFinanceiro(cxRespFin.getText().trim());
        return familiar;
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

    private void preencherCampos(Familiar familiar) {
        cxNome.setText(familiar.getNome());
        cxCPF.setText(familiar.getCpf());
        cxTelefone.setText(familiar.getTelefone());
        cxIdade.setText(String.valueOf(familiar.getIdade()));
        cxRua.setText(familiar.getEndereco().getRua()); //Reflexividade
        cxNumeroRua.setText(familiar.getEndereco().getNumero()); //Reflexividade
        cxBairro.setText(familiar.getEndereco().getBairro()); //Reflexividade
        cxCidade.setText(familiar.getEndereco().getCidade()); //Reflexividade
        cxParentesco.setText(familiar.getParentesco());
        cxRespFin.setText(familiar.getResponsavelFinanceiro());
        cpfOriginal = familiar.getCpf();
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
        cxParentesco.setText("");
        cxRespFin.setText("");
        cpfOriginal = "";
        cxNome.requestFocus();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField cxBairro;
    private javax.swing.JTextField cxCPF;
    private javax.swing.JTextField cxCidade;
    private javax.swing.JTextField cxIdade;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxNumeroRua;
    private javax.swing.JTextField cxParentesco;
    private javax.swing.JTextField cxRespFin;
    private javax.swing.JTextField cxRua;
    private javax.swing.JTextField cxTelefone;
    private javax.swing.JLabel rotBairro;
    private javax.swing.JLabel rotCPF;
    private javax.swing.JLabel rotCadastroFamiliar;
    private javax.swing.JLabel rotCidade;
    private javax.swing.JLabel rotIdade;
    private javax.swing.JLabel rotNome;
    private javax.swing.JLabel rotNumeroRua;
    private javax.swing.JLabel rotObs;
    private javax.swing.JLabel rotParentesco;
    private javax.swing.JLabel rotRespFin;
    private javax.swing.JLabel rotRua;
    private javax.swing.JLabel rotTelefone;
    // End of variables declaration//GEN-END:variables
}
