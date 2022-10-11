package br.senai.sp.jandira.ui;

import java.awt.Toolkit;

public class HomeFrame extends javax.swing.JFrame {
    
    private EspecialidadesPanel especialidadesPanel;
    
    private final int POS_X = 30;
    private final int POS_Y = 190;
    private final int LARGURA = 800;
    private final int ALTURA = 400;

    public HomeFrame() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/senai/sp/jandira/img/calendar.png")));
        initPanels();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelheader = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        buttonAgenda = new javax.swing.JButton();
        buttonPaciente = new javax.swing.JButton();
        buttonPlanoDeSaude = new javax.swing.JButton();
        buttonMedicos = new javax.swing.JButton();
        buttonEspecialidades = new javax.swing.JButton();
        buttonSair = new javax.swing.JButton();
        panelHome = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        buttonHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Agendamento");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanelheader.setBackground(new java.awt.Color(204, 204, 255));

        labelTitulo.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        labelTitulo.setText("Sistema para agendamento de consultas");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/calendar.png"))); // NOI18N

        javax.swing.GroupLayout jPanelheaderLayout = new javax.swing.GroupLayout(jPanelheader);
        jPanelheader.setLayout(jPanelheaderLayout);
        jPanelheaderLayout.setHorizontalGroup(
            jPanelheaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelheaderLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(labelTitulo)
                .addContainerGap(282, Short.MAX_VALUE))
        );
        jPanelheaderLayout.setVerticalGroup(
            jPanelheaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelheaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanelheaderLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(labelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelheader);
        jPanelheader.setBounds(0, 0, 870, 80);

        buttonAgenda.setBackground(new java.awt.Color(204, 204, 255));
        buttonAgenda.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        buttonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/calendar (1).png"))); // NOI18N
        buttonAgenda.setToolTipText("Agenda");
        buttonAgenda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgendaActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAgenda);
        buttonAgenda.setBounds(110, 120, 60, 50);

        buttonPaciente.setBackground(new java.awt.Color(204, 204, 255));
        buttonPaciente.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        buttonPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/man.png"))); // NOI18N
        buttonPaciente.setToolTipText("Pacientes");
        buttonPaciente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPacienteActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPaciente);
        buttonPaciente.setBounds(180, 120, 60, 50);

        buttonPlanoDeSaude.setBackground(new java.awt.Color(204, 204, 255));
        buttonPlanoDeSaude.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        buttonPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/registo-medico.png"))); // NOI18N
        buttonPlanoDeSaude.setToolTipText("Plano de Saúde");
        buttonPlanoDeSaude.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlanoDeSaudeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPlanoDeSaude);
        buttonPlanoDeSaude.setBounds(250, 120, 60, 50);

        buttonMedicos.setBackground(new java.awt.Color(204, 204, 255));
        buttonMedicos.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        buttonMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/doctor.png"))); // NOI18N
        buttonMedicos.setToolTipText("Médicos");
        buttonMedicos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMedicosActionPerformed(evt);
            }
        });
        getContentPane().add(buttonMedicos);
        buttonMedicos.setBounds(320, 120, 60, 50);

        buttonEspecialidades.setBackground(new java.awt.Color(204, 204, 255));
        buttonEspecialidades.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        buttonEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/stethoscope.png"))); // NOI18N
        buttonEspecialidades.setToolTipText("Especialidades");
        buttonEspecialidades.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEspecialidadesActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEspecialidades);
        buttonEspecialidades.setBounds(390, 120, 60, 50);

        buttonSair.setBackground(new java.awt.Color(204, 204, 255));
        buttonSair.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        buttonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/x-mark.png"))); // NOI18N
        buttonSair.setText("Sair");
        buttonSair.setToolTipText("Sair");
        buttonSair.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(buttonSair);
        buttonSair.setBounds(740, 100, 110, 40);

        panelHome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelHome.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("SISACON");
        panelHome.add(jLabel2);
        jLabel2.setBounds(30, 90, 220, 50);

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel3.setText("Sistema para Agendamento de Consultas");
        panelHome.add(jLabel3);
        jLabel3.setBounds(30, 130, 370, 22);

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 22)); // NOI18N
        jLabel4.setText("Suporte Técnico:");
        panelHome.add(jLabel4);
        jLabel4.setBounds(450, 170, 200, 29);

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel5.setText("Email: suportetecnico@gmail.com");
        panelHome.add(jLabel5);
        jLabel5.setBounds(450, 200, 230, 15);

        jLabel6.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel6.setText("Telefone: (11) 4002-8922");
        panelHome.add(jLabel6);
        jLabel6.setBounds(450, 220, 190, 15);

        jLabel7.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel7.setText("www.sisacon.com.br");
        panelHome.add(jLabel7);
        jLabel7.setBounds(450, 240, 170, 15);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        panelHome.add(jPanel1);
        jPanel1.setBounds(20, 150, 760, 3);

        getContentPane().add(panelHome);
        panelHome.setBounds(30, 190, 800, 400);

        buttonHome.setBackground(new java.awt.Color(153, 153, 255));
        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/pagina-inicial.png"))); // NOI18N
        buttonHome.setToolTipText("Home");
        buttonHome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonHome);
        buttonHome.setBounds(40, 120, 60, 50);

        setSize(new java.awt.Dimension(884, 668));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAgendaActionPerformed

    private void buttonPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPacienteActionPerformed

    private void buttonPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlanoDeSaudeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPlanoDeSaudeActionPerformed

    private void buttonMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMedicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonMedicosActionPerformed

    private void buttonEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidadesActionPerformed
        buttonEspecialidades.setBackground(new java.awt.Color(153, 153, 255));
        buttonHome.setBackground(new java.awt.Color(204, 204, 255));
        panelHome.setVisible(false);
        especialidadesPanel.setVisible(true);
    }//GEN-LAST:event_buttonEspecialidadesActionPerformed

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
       buttonEspecialidades.setBackground(new java.awt.Color(204, 204, 255));
       buttonHome.setBackground(new java.awt.Color(153, 153, 255)); 
       panelHome.setVisible(true);
       especialidadesPanel.setVisible(false);
    }//GEN-LAST:event_buttonHomeActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgenda;
    private javax.swing.JButton buttonEspecialidades;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonMedicos;
    private javax.swing.JButton buttonPaciente;
    private javax.swing.JButton buttonPlanoDeSaude;
    private javax.swing.JButton buttonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelheader;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelHome;
    // End of variables declaration//GEN-END:variables

    private void initPanels() {
        especialidadesPanel = new EspecialidadesPanel();
        especialidadesPanel.setBounds(POS_X, POS_Y, LARGURA, ALTURA);
        getContentPane().add(especialidadesPanel);
        especialidadesPanel.setVisible(false);
    }



}
