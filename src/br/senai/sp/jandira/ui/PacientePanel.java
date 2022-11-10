package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PacienteDAO;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.Paciente;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class PacientePanel extends javax.swing.JPanel {
    
    private int linha;

    public PacientePanel() {
        initComponents();
        PacienteDAO.criarListaDePacientes();
        preencherTabela();
        
    }
    
    private int getLinha(){
        linha = tablePaciente.getSelectedRow();
        return linha;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPaciente = new javax.swing.JScrollPane();
        tablePaciente = new javax.swing.JTable();
        buttonExcluir = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        buttonAdicionar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Pacientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 0, 14), new java.awt.Color(153, 102, 255))); // NOI18N

        tablePaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tablePaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollPaciente.setViewportView(tablePaciente);

        buttonExcluir.setBackground(new java.awt.Color(204, 204, 255));
        buttonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/trash.png"))); // NOI18N
        buttonExcluir.setToolTipText("Excluir");
        buttonExcluir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });

        buttonEditar.setBackground(new java.awt.Color(204, 204, 255));
        buttonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/pencil.png"))); // NOI18N
        buttonEditar.setToolTipText("Editar");
        buttonEditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });

        buttonAdicionar.setBackground(new java.awt.Color(204, 204, 255));
        buttonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/plus.png"))); // NOI18N
        buttonAdicionar.setToolTipText("Adicionar");
        buttonAdicionar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(scrollPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(525, 525, 525)
                            .addComponent(buttonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(buttonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(buttonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(scrollPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(17, 17, 17)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(buttonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed

        if(getLinha() != -1){
//            excluirPaciente;
        }else{
            JOptionPane.showMessageDialog(this,
                "Por favor, selecione a especialidade que você deseja excluir!",
                "Atenção",
                JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buttonExcluirActionPerformed

    private void editarPaciente(){
        
//        Paciente paciente = PacienteDAO.getPaciente
        
    }
    
    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed

//        if(getLinha() != -1){
//            editarEspecialidade();
//        }else{
//            JOptionPane.showConfirmDialog(this,
//                "Por favor, selecione a especialidade que você deseja editar!",
//                "Especialidades",
//                JOptionPane.WARNING_MESSAGE);
//        }

    }//GEN-LAST:event_buttonEditarActionPerformed

    
//    private void editarEspecialidade(){
//       
//        Paciente paciente = PacienteDAO.getEspecialidade(getCodigo());
//        
//        EspecialidadeDialog especialidadeDialog = new EspecialidadeDialog(null, true, paciente, OperacaoEnum.EDITAR);
//        especialidadeDialog.setVisible(true);
//        preencherTabela(); 
//    }
//    
//    private void excluirEspecialidade(){
//        
//        int resposta = JOptionPane.showConfirmDialog(this,
//                "Você confirma a exclusão?",
//                "Atenção", 
//                JOptionPane.YES_NO_OPTION,
//                JOptionPane.QUESTION_MESSAGE);
//        
//        if(resposta == 0){
//            EspecialidadeDAO.excluir(getCodigo());
//            preencherTabela();
//        }
//    }
    
    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed

//        EspecialidadeDialog especialidadeDialog = new EspecialidadeDialog(null, true, OperacaoEnum.ADICIONAR);
//        especialidadeDialog.setVisible(true);
//        preencherTabela();
    }//GEN-LAST:event_buttonAdicionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JScrollPane scrollPaciente;
    private javax.swing.JTable tablePaciente;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela(){

        tablePaciente.setModel(PacienteDAO.getPacienteModel());
        ajustarTabela();

    }
    
    private void ajustarTabela(){
        
        //Impedir que o usuário movimente as colunas
        tablePaciente.getTableHeader().setReorderingAllowed(false);
        
        //Bloquear a edição das células da tabela
        tablePaciente.setDefaultEditor(Object.class, null);
        
        //Definir largura das colunas
        tablePaciente.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tablePaciente.getColumnModel().getColumn(0).setPreferredWidth(100);
        tablePaciente.getColumnModel().getColumn(1).setPreferredWidth(200);
        tablePaciente.getColumnModel().getColumn(2).setPreferredWidth(100);
        tablePaciente.getColumnModel().getColumn(3).setPreferredWidth(200);
        tablePaciente.getColumnModel().getColumn(4).setPreferredWidth(129);
       
        
    }

}
