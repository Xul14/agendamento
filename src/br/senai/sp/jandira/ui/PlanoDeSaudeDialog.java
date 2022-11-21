package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class PlanoDeSaudeDialog extends javax.swing.JDialog {

    PlanoDeSaude planoDeSaude;
    private OperacaoEnum operacao;

    public PlanoDeSaudeDialog(java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao) {

        super(parent, modal);

        initComponents();
        this.operacao = operacao;
        preencherTitulo();

    }

    public PlanoDeSaudeDialog(java.awt.Frame parent,
            boolean modal,
            PlanoDeSaude p,
            OperacaoEnum operacao) {

        super(parent, modal);
        initComponents();

        planoDeSaude = p;
        this.operacao = operacao;

        preencherFormulario();
        preencherTitulo();
    }

    private void preencherTitulo() {

        labelTitulo.setText("  Plano de Saúde - " + operacao);

        if (operacao == OperacaoEnum.EDITAR) {
            labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/pencil.png")));
        } else {
            labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/plus.png")));
        }

    }

    private void preencherFormulario() {

        textFieldCodigo.setText(planoDeSaude.getCodigo().toString());
        textFieldOperadora.setText(planoDeSaude.getOperadora());
        textFieldCategoria.setText(planoDeSaude.getCategoria());
        textFieldNumero.setText(planoDeSaude.getNumero());
        textFieldValidade.setText(planoDeSaude.getValidade().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHeader = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        panelDealhesEspecialidades = new javax.swing.JPanel();
        labelCodigo = new javax.swing.JLabel();
        textFieldCodigo = new javax.swing.JTextField();
        labelOperadora = new javax.swing.JLabel();
        textFieldOperadora = new javax.swing.JTextField();
        labelCategoria = new javax.swing.JLabel();
        textFieldCategoria = new javax.swing.JTextField();
        buttonCancelar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        labelNumero = new javax.swing.JLabel();
        textFieldNumero = new javax.swing.JTextField();
        labelValidade = new javax.swing.JLabel();
        textFieldValidade = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        panelHeader.setBackground(new java.awt.Color(204, 204, 255));
        panelHeader.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/plus.png"))); // NOI18N
        labelTitulo.setText(" Plano De Saúde - Adicionar");
        panelHeader.add(labelTitulo);
        labelTitulo.setBounds(50, 10, 490, 40);

        getContentPane().add(panelHeader);
        panelHeader.setBounds(0, 0, 730, 60);

        panelDealhesEspecialidades.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Plano de Saúde", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 0, 14), new java.awt.Color(153, 102, 255))); // NOI18N
        panelDealhesEspecialidades.setLayout(null);

        labelCodigo.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        labelCodigo.setText("Código:");
        panelDealhesEspecialidades.add(labelCodigo);
        labelCodigo.setBounds(30, 40, 90, 17);

        textFieldCodigo.setEditable(false);
        textFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigoActionPerformed(evt);
            }
        });
        panelDealhesEspecialidades.add(textFieldCodigo);
        textFieldCodigo.setBounds(30, 60, 80, 30);

        labelOperadora.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        labelOperadora.setText("Operadora:");
        panelDealhesEspecialidades.add(labelOperadora);
        labelOperadora.setBounds(30, 110, 140, 17);
        panelDealhesEspecialidades.add(textFieldOperadora);
        textFieldOperadora.setBounds(30, 130, 220, 30);

        labelCategoria.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        labelCategoria.setText("Categoria:");
        panelDealhesEspecialidades.add(labelCategoria);
        labelCategoria.setBounds(30, 180, 240, 17);
        panelDealhesEspecialidades.add(textFieldCategoria);
        textFieldCategoria.setBounds(30, 200, 230, 30);

        buttonCancelar.setBackground(new java.awt.Color(204, 204, 255));
        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/x-mark.png"))); // NOI18N
        buttonCancelar.setToolTipText("Cancelar");
        buttonCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        panelDealhesEspecialidades.add(buttonCancelar);
        buttonCancelar.setBounds(460, 290, 45, 45);

        buttonSalvar.setBackground(new java.awt.Color(204, 204, 255));
        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/salve-.png"))); // NOI18N
        buttonSalvar.setToolTipText("Salvar");
        buttonSalvar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        panelDealhesEspecialidades.add(buttonSalvar);
        buttonSalvar.setBounds(520, 290, 45, 45);

        labelNumero.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        labelNumero.setText("Número:");
        panelDealhesEspecialidades.add(labelNumero);
        labelNumero.setBounds(350, 110, 130, 17);
        panelDealhesEspecialidades.add(textFieldNumero);
        textFieldNumero.setBounds(350, 130, 230, 30);

        labelValidade.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        labelValidade.setText("Validade:");
        panelDealhesEspecialidades.add(labelValidade);
        labelValidade.setBounds(350, 180, 130, 20);

        textFieldValidade.setColumns(8);
        try {
            textFieldValidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textFieldValidade.setText("/  /");
        textFieldValidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldValidadeActionPerformed(evt);
            }
        });
        panelDealhesEspecialidades.add(textFieldValidade);
        textFieldValidade.setBounds(350, 200, 140, 30);

        getContentPane().add(panelDealhesEspecialidades);
        panelDealhesEspecialidades.setBounds(20, 90, 600, 370);

        setSize(new java.awt.Dimension(685, 519));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigoActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed

        CharSequence cha = " ";
  
        if (textFieldOperadora.getText().isEmpty() || textFieldCategoria.getText().isEmpty() || textFieldNumero.getText().isEmpty() || textFieldValidade.getText().contains(cha) == true ){
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos!", "ERRO", JOptionPane.WARNING_MESSAGE);
        } else {

            if (operacao == OperacaoEnum.ADICIONAR) {
                adicionar();
            } else {
                editar();
            }
        }


    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void textFieldValidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldValidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldValidadeActionPerformed

    private void editar() {
        planoDeSaude.setOperadora(textFieldOperadora.getText());
        planoDeSaude.setCategoria(textFieldCategoria.getText());
        planoDeSaude.setNumero(textFieldNumero.getText());
        planoDeSaude.setValidade(LocalDate.parse(textFieldValidade.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        PlanoDeSaudeDAO.atualizar(planoDeSaude);

        JOptionPane.showMessageDialog(null, "Plano de Saúde atualizado com sucesso!", "Plano de Saúde", JOptionPane.INFORMATION_MESSAGE);

        dispose();

    }

    private void adicionar() {

        PlanoDeSaude novoPlanoDeSaude = new PlanoDeSaude();
        novoPlanoDeSaude.setOperadora(textFieldOperadora.getText());
        novoPlanoDeSaude.setCategoria(textFieldCategoria.getText());
        novoPlanoDeSaude.setNumero(textFieldNumero.getText());
        novoPlanoDeSaude.setValidade(LocalDate.parse(textFieldValidade.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        PlanoDeSaudeDAO.gravar(novoPlanoDeSaude);

        JOptionPane.showMessageDialog(this,
                "Plano de Saúde gravado com sucesso!",
                "Plano de Saúde",
                JOptionPane.INFORMATION_MESSAGE);

        dispose();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel labelCategoria;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelOperadora;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelValidade;
    private javax.swing.JPanel panelDealhesEspecialidades;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JTextField textFieldCategoria;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JTextField textFieldNumero;
    private javax.swing.JTextField textFieldOperadora;
    private javax.swing.JFormattedTextField textFieldValidade;
    // End of variables declaration//GEN-END:variables
}
