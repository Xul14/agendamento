package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JOptionPane;

public class EspecialidadeDialog extends javax.swing.JDialog {
    
    Especialidade especialidade;
    private OperacaoEnum operacao;

    public EspecialidadeDialog(java.awt.Frame parent,
            boolean modal, 
            OperacaoEnum operacao) {
        
         super(parent, modal);

        initComponents();
        this.operacao = operacao;
        preencherTitulo();
    }
    
    public EspecialidadeDialog(java.awt.Frame parent,
            boolean modal,
            Especialidade e,
            OperacaoEnum operacao) {
        
        super(parent, modal);
        initComponents();
        
        especialidade = e;
        this.operacao = operacao;
        
        preencherFormulario();
        preencherTitulo();
    }
    
    private void preencherTitulo(){
        
        labelTitulo.setText("  Especialidades - " + operacao);
        
        if(operacao == OperacaoEnum.EDITAR){
           labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/pencil.png")));
        }else{
           labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/plus.png"))); 
        }
        
    }
    
    private void preencherFormulario(){
        
        textFieldCodigo.setText(especialidade.getCodigo().toString());
        textFieldNome.setText(especialidade.getNome());
        textFieldDescricao.setText(especialidade.getDescricao());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHeader = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        panelDealhesEspecialidades = new javax.swing.JPanel();
        labelCodigo = new javax.swing.JLabel();
        textFieldCodigo = new javax.swing.JTextField();
        labelNomeEspecialidade = new javax.swing.JLabel();
        textFieldNome = new javax.swing.JTextField();
        labelDescricao = new javax.swing.JLabel();
        textFieldDescricao = new javax.swing.JTextField();
        buttonCancelar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        panelHeader.setBackground(new java.awt.Color(204, 204, 255));
        panelHeader.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/plus.png"))); // NOI18N
        labelTitulo.setText(" Especialidades - Adicionar");
        panelHeader.add(labelTitulo);
        labelTitulo.setBounds(50, 10, 490, 40);

        getContentPane().add(panelHeader);
        panelHeader.setBounds(0, 0, 640, 60);

        panelDealhesEspecialidades.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes da Especialidade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 0, 14), new java.awt.Color(153, 102, 255))); // NOI18N
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

        labelNomeEspecialidade.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        labelNomeEspecialidade.setText("Nome da Especialidade:");
        panelDealhesEspecialidades.add(labelNomeEspecialidade);
        labelNomeEspecialidade.setBounds(30, 110, 200, 17);
        panelDealhesEspecialidades.add(textFieldNome);
        textFieldNome.setBounds(30, 130, 460, 30);

        labelDescricao.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        labelDescricao.setText("Descrição da Especialidade:");
        panelDealhesEspecialidades.add(labelDescricao);
        labelDescricao.setBounds(30, 180, 240, 17);
        panelDealhesEspecialidades.add(textFieldDescricao);
        textFieldDescricao.setBounds(30, 200, 460, 30);

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
        buttonCancelar.setBounds(450, 260, 45, 45);

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
        buttonSalvar.setBounds(510, 260, 45, 45);

        getContentPane().add(panelDealhesEspecialidades);
        panelDealhesEspecialidades.setBounds(20, 90, 580, 320);

        setSize(new java.awt.Dimension(655, 463));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigoActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        
        if(operacao == OperacaoEnum.ADICIONAR){
            adicionar();
        }else{
            editar();
        }
        
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void editar(){
        especialidade.setNome(textFieldNome.getText());
        especialidade.setNome(textFieldDescricao.getText());
        
        EspecialidadeDAO.atualizar(especialidade);
        
        JOptionPane.showMessageDialog(null, "Especialidade atualizada com sucesso!", "Especialidades", JOptionPane.INFORMATION_MESSAGE);
        
        dispose();
        
    }
    
    private void adicionar(){
        
        //Criar um objeto especialidade
        Especialidade novaEspecialidade = new Especialidade();
        novaEspecialidade.setNome(textFieldNome.getText());
        novaEspecialidade.setDescricao(textFieldDescricao.getText());
        
        //Gravar o objeto araves do DAO
        EspecialidadeDAO.gravar(novaEspecialidade);
        
        JOptionPane.showMessageDialog(this,
                "Especialidade gravada com sucesso!",
                "ESpecialidades",
                JOptionPane.INFORMATION_MESSAGE);
        
        dispose();
    }
    
    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelNomeEspecialidade;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelDealhesEspecialidades;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JTextField textFieldDescricao;
    private javax.swing.JTextField textFieldNome;
    // End of variables declaration//GEN-END:variables
}
