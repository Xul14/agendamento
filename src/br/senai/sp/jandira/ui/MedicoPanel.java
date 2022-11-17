package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class MedicoPanel extends javax.swing.JPanel { 
    
    private int linha;

    public MedicoPanel() {
        initComponents();
//        MedicoDAO.criarListaDeMedicos();
        preencherTabela();
    }
    
    private int getLinha(){
        linha = tableMedicos.getSelectedRow();
        return linha;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollMedicos = new javax.swing.JScrollPane();
        tableMedicos = new javax.swing.JTable();
        buttonExcluir = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        buttonAdicionar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Médicos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 0, 14), new java.awt.Color(153, 102, 255))); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 400));
        setLayout(null);

        tableMedicos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tableMedicos.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollMedicos.setViewportView(tableMedicos);

        add(scrollMedicos);
        scrollMedicos.setBounds(30, 40, 732, 287);

        buttonExcluir.setBackground(new java.awt.Color(204, 204, 255));
        buttonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/trash.png"))); // NOI18N
        buttonExcluir.setToolTipText("Excluir");
        buttonExcluir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });
        add(buttonExcluir);
        buttonExcluir.setBounds(550, 340, 50, 40);

        buttonEditar.setBackground(new java.awt.Color(204, 204, 255));
        buttonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/pencil.png"))); // NOI18N
        buttonEditar.setToolTipText("Editar");
        buttonEditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });
        add(buttonEditar);
        buttonEditar.setBounds(620, 340, 50, 40);

        buttonAdicionar.setBackground(new java.awt.Color(204, 204, 255));
        buttonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/plus.png"))); // NOI18N
        buttonAdicionar.setToolTipText("Adicionar");
        buttonAdicionar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarActionPerformed(evt);
            }
        });
        add(buttonAdicionar);
        buttonAdicionar.setBounds(690, 340, 50, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed

        if(getLinha() != -1){
//            excluirMedico();
        }else{
            JOptionPane.showMessageDialog(this,
                "Por favor, selecione a especialidade que você deseja excluir!",
                "Atenção",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buttonExcluirActionPerformed

    private void editarEspecialidade(){
//       
//        Medico medico = MedicoDAO.getMedico(getCodigo());
//        
//        EspecialidadeDialog especialidadeDialog = new EspecialidadeDialog(null, true, especialidade, OperacaoEnum.EDITAR);
//        especialidadeDialog.setVisible(true);
        preencherTabela(); 
    }
    
    private void excluirEspecialidade(){
        
        int resposta = JOptionPane.showConfirmDialog(this,
                "Você confirma a exclusão?",
                "Atenção", 
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        
        if(resposta == 0){
//            MedicoDAO.excluir(getCodigo());
            preencherTabela();
        }
    }
    
    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed

        if(getLinha() != -1){
//            editarMedico();
        }else{
            JOptionPane.showConfirmDialog(this,
                "Por favor, selecione a especialidade que você deseja editar!",
                "Especialidades",
                JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_buttonEditarActionPerformed

    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed

        EspecialidadeDialog especialidadeDialog = new EspecialidadeDialog(null, true, OperacaoEnum.ADICIONAR);
        especialidadeDialog.setVisible(true);
        preencherTabela();
    }//GEN-LAST:event_buttonAdicionarActionPerformed

    private Integer getCodigo(){
        String codigoStr = tableMedicos.getValueAt(getLinha(), 0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JScrollPane scrollMedicos;
    private javax.swing.JTable tableMedicos;
    // End of variables declaration//GEN-END:variables

private void preencherTabela(){

//        tableMedicos.setModel(MedicoDAO.getEspecialidadesModel());
        ajustarTabela();

    }
    
    private void ajustarTabela(){
        
        //Impedir que o usuário movimente as colunas
        tableMedicos.getTableHeader().setReorderingAllowed(false);
        
        //Bloquear a edição das células da tabela
        tableMedicos.setDefaultEditor(Object.class, null);
        
        //Definir largura das colunas
        tableMedicos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tableMedicos.getColumnModel().getColumn(0).setPreferredWidth(100);
        tableMedicos.getColumnModel().getColumn(1).setPreferredWidth(200);
        tableMedicos.getColumnModel().getColumn(2).setPreferredWidth(229);
        tableMedicos.getColumnModel().getColumn(3).setPreferredWidth(200);
       
        
    }

}
