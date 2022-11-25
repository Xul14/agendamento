package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.OperacaoEnum;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;


public class MedicoDialog extends javax.swing.JDialog {
    
    Medico medico;
    private OperacaoEnum operacao;

    public MedicoDialog(java.awt.Frame parent, boolean modal, OperacaoEnum operacao) {
        
        super(parent, modal);
        
        initComponents();
        this.operacao = operacao;
        preencherTitulo();
    }
    
    public MedicoDialog(java.awt.Frame parent, boolean modal, Medico m, OperacaoEnum operacao) {
        
        super(parent, modal);
        initComponents();
        
        medico = m;
        this.operacao = operacao;
        
        preencherFormulario();
        preencherTitulo();
    }
    
    
    private void preencherTitulo(){
        
        labelTitulo.setText("  Médico - " + operacao);
        
        if(operacao == OperacaoEnum.EDITAR){
           labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/pencil.png")));
        }else{
           labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/plus.png"))); 
        }
        
    }
    
    private void preencherFormulario(){
        
        textFieldCodigo.setText(medico.getCodigo().toString());
        textFieldCrm.setText(medico.getCrm());
        textFieldNome.setText(medico.getNome());
        textFieldTelefone.setText(medico.getTelefone());
        textFieldEmail.setText(medico.getEmail());
        textFieldDataDeNascimento.setText(medico.getDataNascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        buttonCancelar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        labelCodigo = new javax.swing.JLabel();
        textFieldCodigo = new javax.swing.JTextField();
        textFieldCrm = new javax.swing.JTextField();
        labelCrm = new javax.swing.JLabel();
        textFieldNome = new javax.swing.JTextField();
        labelNome = new javax.swing.JLabel();
        textFieldTelefone = new javax.swing.JTextField();
        labelTelefone = new javax.swing.JLabel();
        textFieldEmail = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        labelDataDeNascimento = new javax.swing.JLabel();
        scrollPaneListaEspecialidades = new javax.swing.JScrollPane();
        listEspecialidades = new javax.swing.JList<>();
        labelListadeEspecialidades = new javax.swing.JLabel();
        labelEspecialidadesMedico = new javax.swing.JLabel();
        scrollPaneEspecialidadesMedico = new javax.swing.JScrollPane();
        listEspecialidadesMedicos = new javax.swing.JList<>();
        buttonVermelho = new javax.swing.JButton();
        buttonVerde = new javax.swing.JButton();
        textFieldDataDeNascimento = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        header.setBackground(new java.awt.Color(204, 204, 255));
        header.setForeground(new java.awt.Color(242, 242, 242));
        header.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Consolas", 0, 34)); // NOI18N
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/plus.png"))); // NOI18N
        labelTitulo.setText(" Médicos - Adicionar");
        header.add(labelTitulo);
        labelTitulo.setBounds(48, 20, 640, 41);

        getContentPane().add(header);
        header.setBounds(0, 0, 880, 80);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes do Médico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 0, 14), new java.awt.Color(153, 102, 255))); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 400));
        jPanel2.setLayout(null);

        buttonCancelar.setBackground(new java.awt.Color(204, 204, 255));
        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/x-mark.png"))); // NOI18N
        buttonCancelar.setToolTipText("Cancelar");
        buttonCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonCancelar);
        buttonCancelar.setBounds(670, 400, 45, 45);

        buttonSalvar.setBackground(new java.awt.Color(204, 204, 255));
        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/salve-.png"))); // NOI18N
        buttonSalvar.setToolTipText("Salvar");
        buttonSalvar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonSalvar);
        buttonSalvar.setBounds(730, 400, 45, 45);

        labelCodigo.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        labelCodigo.setText("Código:");
        jPanel2.add(labelCodigo);
        labelCodigo.setBounds(40, 50, 70, 20);

        textFieldCodigo.setEditable(false);
        textFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigoActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldCodigo);
        textFieldCodigo.setBounds(40, 70, 90, 30);
        jPanel2.add(textFieldCrm);
        textFieldCrm.setBounds(210, 70, 110, 30);

        labelCrm.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        labelCrm.setText("CRM:");
        jPanel2.add(labelCrm);
        labelCrm.setBounds(210, 50, 70, 20);
        jPanel2.add(textFieldNome);
        textFieldNome.setBounds(380, 70, 390, 30);

        labelNome.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        labelNome.setText("Nome do Médico:");
        jPanel2.add(labelNome);
        labelNome.setBounds(380, 50, 370, 20);
        jPanel2.add(textFieldTelefone);
        textFieldTelefone.setBounds(40, 160, 180, 30);

        labelTelefone.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        labelTelefone.setText("Telefone:");
        jPanel2.add(labelTelefone);
        labelTelefone.setBounds(40, 140, 90, 20);
        jPanel2.add(textFieldEmail);
        textFieldEmail.setBounds(250, 160, 310, 30);

        labelEmail.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        labelEmail.setText("E-mail:");
        jPanel2.add(labelEmail);
        labelEmail.setBounds(250, 140, 70, 20);

        labelDataDeNascimento.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        labelDataDeNascimento.setText("Data de Nascimento:");
        jPanel2.add(labelDataDeNascimento);
        labelDataDeNascimento.setBounds(590, 140, 190, 20);

        listEspecialidades.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        scrollPaneListaEspecialidades.setViewportView(listEspecialidades);

        jPanel2.add(scrollPaneListaEspecialidades);
        scrollPaneListaEspecialidades.setBounds(40, 250, 190, 180);

        labelListadeEspecialidades.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        labelListadeEspecialidades.setText("Lista de Especialidades:");
        jPanel2.add(labelListadeEspecialidades);
        labelListadeEspecialidades.setBounds(40, 227, 200, 20);

        labelEspecialidadesMedico.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        labelEspecialidadesMedico.setText("Especialidades do Médico:");
        jPanel2.add(labelEspecialidadesMedico);
        labelEspecialidadesMedico.setBounds(350, 230, 200, 20);

        listEspecialidadesMedicos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        scrollPaneEspecialidadesMedico.setViewportView(listEspecialidadesMedicos);

        jPanel2.add(scrollPaneEspecialidadesMedico);
        scrollPaneEspecialidadesMedico.setBounds(350, 250, 190, 180);

        buttonVermelho.setBackground(new java.awt.Color(255, 0, 0));
        buttonVermelho.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        buttonVermelho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/back.png"))); // NOI18N
        buttonVermelho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVermelhoActionPerformed(evt);
            }
        });
        jPanel2.add(buttonVermelho);
        buttonVermelho.setBounds(260, 280, 50, 50);

        buttonVerde.setBackground(new java.awt.Color(0, 255, 0));
        buttonVerde.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        buttonVerde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/back (1).png"))); // NOI18N
        buttonVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVerdeActionPerformed(evt);
            }
        });
        jPanel2.add(buttonVerde);
        buttonVerde.setBounds(260, 350, 50, 50);

        try {
            textFieldDataDeNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(textFieldDataDeNascimento);
        textFieldDataDeNascimento.setBounds(590, 160, 130, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(40, 100, 800, 470);

        setSize(new java.awt.Dimension(896, 628));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed

        CharSequence cha = " ";
//  
//        if (textField.getText().isEmpty() || textFieldCategoria.getText().isEmpty() || textFieldNumero.getText().isEmpty() || textFieldValidade.getText().contains(cha) == true ){
//            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos!", "ERRO", JOptionPane.WARNING_MESSAGE);
//        } else {
//
//            if (operacao == OperacaoEnum.ADICIONAR) {
//                adicionar();
//            } else {
//                editar();
//            }
//        }
        
        if(operacao == OperacaoEnum.ADICIONAR){
            adicionar();
        }else{
            editar();
        } 
        dispose();
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonVermelhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVermelhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonVermelhoActionPerformed

    private void buttonVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVerdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonVerdeActionPerformed

    private void textFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigoActionPerformed

    private void editar(){
        medico.setNome(textFieldNome.getText());
        medico.setCrm(textFieldCrm.getText());
        medico.setTelefone(textFieldTelefone.getText());
        medico.setEmail(textFieldEmail.getText());
        medico.setDataNascimento(LocalDate.parse(textFieldDataDeNascimento.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
//        medico.setEspecialidade(listEspecialidades.getText());
//        medico.setEspecialidade(listEspecialidadesMedico.getText());
    
    }
    
    private void adicionar(){
        
        //Criar um objeto especialidade
        Medico novoMedico = new Medico();
        novoMedico.setNome(textFieldNome.getText());
        novoMedico.setCrm(textFieldCrm.getText());
        novoMedico.setTelefone(textFieldTelefone.getText());
        novoMedico.setEmail(textFieldEmail.getText());
        novoMedico.setDataNascimento(LocalDate.parse(textFieldDataDeNascimento.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        
        //Gravar o objeto araves do DAO
        MedicoDAO.gravar(novoMedico);
        
        JOptionPane.showMessageDialog(this,
                "Médico gravada com sucesso!",
                "Médicos",
                JOptionPane.INFORMATION_MESSAGE);
        
        dispose();
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JButton buttonVerde;
    private javax.swing.JButton buttonVermelho;
    private javax.swing.JPanel header;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelCrm;
    private javax.swing.JLabel labelDataDeNascimento;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEspecialidadesMedico;
    private javax.swing.JLabel labelListadeEspecialidades;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JList<String> listEspecialidades;
    private javax.swing.JList<String> listEspecialidadesMedicos;
    private javax.swing.JScrollPane scrollPaneEspecialidadesMedico;
    private javax.swing.JScrollPane scrollPaneListaEspecialidades;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JTextField textFieldCrm;
    private javax.swing.JFormattedTextField textFieldDataDeNascimento;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldNome;
    private javax.swing.JTextField textFieldTelefone;
    // End of variables declaration//GEN-END:variables
}
