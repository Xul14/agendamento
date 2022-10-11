/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;


/**
 *
 * @author 22282188
 */
public class EspecialidadesPanel extends javax.swing.JPanel {

    /**
     * Creates new form EspecialidadesPanel
     */
    public EspecialidadesPanel() {
        initComponents();
        EspecialidadeDAO.criarListaDeEspecialidades();
        preencherTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonExcluir = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        buttonAdicionar = new javax.swing.JButton();
        buttonExcluir1 = new javax.swing.JButton();
        buttonEditar1 = new javax.swing.JButton();
        buttonAdicionar1 = new javax.swing.JButton();
        scrollEspeciaidades = new javax.swing.JScrollPane();
        tableEspecialidades = new javax.swing.JTable();
        buttonExcluir2 = new javax.swing.JButton();
        buttonEditar2 = new javax.swing.JButton();
        buttonAdicionar2 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Especialidades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 0, 14), new java.awt.Color(153, 102, 255))); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 400));
        setLayout(null);

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
        buttonExcluir.setBounds(630, 580, 50, 40);

        buttonEditar.setBackground(new java.awt.Color(204, 204, 255));
        buttonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/pencil.png"))); // NOI18N
        buttonEditar.setToolTipText("Editar");
        buttonEditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(buttonEditar);
        buttonEditar.setBounds(700, 580, 50, 40);

        buttonAdicionar.setBackground(new java.awt.Color(204, 204, 255));
        buttonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/plus (1).png"))); // NOI18N
        buttonAdicionar.setToolTipText("Adicionar");
        buttonAdicionar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(buttonAdicionar);
        buttonAdicionar.setBounds(770, 580, 50, 40);

        buttonExcluir1.setBackground(new java.awt.Color(204, 204, 255));
        buttonExcluir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/trash.png"))); // NOI18N
        buttonExcluir1.setToolTipText("Excluir");
        buttonExcluir1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluir1ActionPerformed(evt);
            }
        });
        add(buttonExcluir1);
        buttonExcluir1.setBounds(630, 580, 50, 40);

        buttonEditar1.setBackground(new java.awt.Color(204, 204, 255));
        buttonEditar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/pencil.png"))); // NOI18N
        buttonEditar1.setToolTipText("Editar");
        buttonEditar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(buttonEditar1);
        buttonEditar1.setBounds(700, 580, 50, 40);

        buttonAdicionar1.setBackground(new java.awt.Color(204, 204, 255));
        buttonAdicionar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/plus (1).png"))); // NOI18N
        buttonAdicionar1.setToolTipText("Adicionar");
        buttonAdicionar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(buttonAdicionar1);
        buttonAdicionar1.setBounds(770, 580, 50, 40);

        tableEspecialidades.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollEspeciaidades.setViewportView(tableEspecialidades);

        add(scrollEspeciaidades);
        scrollEspeciaidades.setBounds(35, 36, 732, 287);

        buttonExcluir2.setBackground(new java.awt.Color(204, 204, 255));
        buttonExcluir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/trash.png"))); // NOI18N
        buttonExcluir2.setToolTipText("Excluir");
        buttonExcluir2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonExcluir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluir2ActionPerformed(evt);
            }
        });
        add(buttonExcluir2);
        buttonExcluir2.setBounds(560, 340, 50, 40);

        buttonEditar2.setBackground(new java.awt.Color(204, 204, 255));
        buttonEditar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/pencil.png"))); // NOI18N
        buttonEditar2.setToolTipText("Editar");
        buttonEditar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(buttonEditar2);
        buttonEditar2.setBounds(630, 340, 50, 40);

        buttonAdicionar2.setBackground(new java.awt.Color(204, 204, 255));
        buttonAdicionar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/plus (1).png"))); // NOI18N
        buttonAdicionar2.setToolTipText("Adicionar");
        buttonAdicionar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(buttonAdicionar2);
        buttonAdicionar2.setBounds(700, 340, 50, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonExcluirActionPerformed

    private void buttonExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluir1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonExcluir1ActionPerformed

    private void buttonExcluir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluir2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonExcluir2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonAdicionar1;
    private javax.swing.JButton buttonAdicionar2;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonEditar1;
    private javax.swing.JButton buttonEditar2;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JButton buttonExcluir1;
    private javax.swing.JButton buttonExcluir2;
    private javax.swing.JScrollPane scrollEspeciaidades;
    private javax.swing.JTable tableEspecialidades;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela() {

        tableEspecialidades.setModel(EspecialidadeDAO.getEspecialidadesModel());
    }

}
