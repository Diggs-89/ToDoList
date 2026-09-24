package Lista;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class TelasToDoList extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelasToDoList.class.getName());
    
    DefaultTableModel model;
    
     private static final String CONCLUIDA = "Concluída";
     private static final String NAO_CONCLUIDA = "Não concluída";
     private final ArrayList<String> Tarefas = new ArrayList();
     private final ArrayList<String> TarefasFiltradas = new ArrayList();
    public TelasToDoList() {
        initComponents();
        
        setLocationRelativeTo(null);
        model = (DefaultTableModel) jTableTarefas.getModel();
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxCidade = new javax.swing.JComboBox<>();
        jTextFieldInserirTarefa = new javax.swing.JTextField();
        jButtonAdd = new javax.swing.JButton();
        jComboBoxFiltroStatus = new javax.swing.JComboBox<>();
        jButtonConcluir = new javax.swing.JButton();
        jButtonRemove = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTarefas = new javax.swing.JTable();

        jComboBoxCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Campo Mourão", "Curitiba", "Maringa", "Cianorte", "Mambore", "Araruna", " " }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextFieldInserirTarefa.addActionListener(this::jTextFieldInserirTarefaActionPerformed);

        jButtonAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonAdd.setText("Adicionar");
        jButtonAdd.addActionListener(this::jButtonAddActionPerformed);

        jComboBoxFiltroStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todas", "Concluidas", "Não concluidas" }));

        jButtonConcluir.setText("Concluir");
        jButtonConcluir.addActionListener(this::jButtonConcluirActionPerformed);

        jButtonRemove.setText("Remover");
        jButtonRemove.addActionListener(this::jButtonRemoveActionPerformed);

        jTableTarefas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Tarefa", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableTarefas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxFiltroStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldInserirTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAdd))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonConcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonRemove)))
                        .addGap(0, 22, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldInserirTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBoxFiltroStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConcluir)
                    .addComponent(jButtonRemove))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConcluirActionPerformed
        int LinhaSelecionada = jTableTarefas.getSelectedRow();
        if (LinhaSelecionada < 0){
            JOptionPane.showMessageDialog(null, "Nenhuma tarefa foi selecionada!");
            return;
        }
        String TarefaSelecionada = recuperarTarefa(LinhaSelecionada);
        int indiceTarefaSelecionada = Tarefas.indexOf(TarefaSelecionada);
        String dados = Tarefas.get(indiceTarefaSelecionada);
        
        Tarefas.set(indiceTarefaSelecionada. dados[0] + ";" + CONCLUIDA );
        filtrarTabela();
        preencherTabela();
    }//GEN-LAST:event_jButtonConcluirActionPerformed

    private void jButtonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveActionPerformed
      int LinhaSelecionada = jTableTarefas.getSelectedRow();
      if (LinhaSelecionada < 0){
          JOptionPane.showMessageDialog(null, "Nenhuma tarefa foi selecionada");
          return;
      }
      int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir a tarefa?");
      
      String tarefaSelecionada = recuperarTarefa(LinhaSelecionada);
      
      int indiceTarefaSelecionada = Tarefas.indexOf(tarefaSelecionada);
      
      if(opcao == JOptionPane.YES_OPTION){
          Tarefas.remove(indiceTarefaSelecionada);
          preencherTabela();
      }
      filtrarTabela();
      
      preencherTabela();
    }//GEN-LAST:event_jButtonRemoveActionPerformed

    private void preencherTabela(){
        ArrayList<String> ListaTarefas;
        
        if (jComboBoxFiltroStatus.getSelectedIndex() > 0){
            ListaTarefas = TarefasFiltradas;
        }else{
            ListaTarefas = Tarefas;
        }
        
        model.setRowCount(0);
        
        for (String tarefa : ListaTarefas){
            String[] dados = tarefa.split(";");
            
            model.addRow(new Object[]{
                dados[0],
                dados[1]
            });
            
        }
    }
    
    private void filtrarTabela(){
        int opcao = jComboBoxFiltroStatus.getSelectedIndex();
        TarefasFiltradas.clear();
        String[] dados;
        
        for (String tarefas : Tarefas){
            dados = tarefas.split(":");
            
            switch (opcao){
                case 0:
                    TarefasFiltradas.add(tarefas);
                    break;
                case 1:
                    if (dados[1].equals(CONCLUIDA)){
                        TarefasFiltradas.add(tarefas);
                    }
                    break;
                case 2:
                    if(dados[1].equals(NAO_CONCLUIDA)){
                        TarefasFiltradas.add(tarefas);
                    }
            }
        }
    }
    
    private String recuperarTarefa(int indiceTarefa){
        if (jComboBoxFiltroStatus.getSelectedIndex() > 0){
            return TarefasFiltradas.get(indiceTarefa);
            }else{
                return Tarefas.get(indiceTarefa);
        }   
    }
    private void jTextFieldInserirTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldInserirTarefaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldInserirTarefaActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        if (jTextFieldInserirTarefa.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "A descrição da tarefa não pode ser vazia");
            return;
        }
        if (hasTarefaRepetida(jTextFieldInserirTarefa.getText())){
            JOptionPane.showMessageDialog(null, "A tarefa " + jTextFieldInserirTarefa.getText() + " já existe;");
            return;
        }
        Tarefas.add(jTextFieldInserirTarefa.getText() + ";" + NAO_CONCLUIDA);
        preencherTabela();
        
        jTextFieldInserirTarefa.setText("");
        
    }//GEN-LAST:event_jButtonAddActionPerformed
     
    public boolean hasTarefaRepetida (String novaTarefa){
        for (String tarefas : Tarefas){
            String dados[] = tarefas.split(";");
            if (novaTarefa.toLowerCase().equals(dados [0]. toLowerCase())){
                
            }
        }
        return false;
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new TelasToDoList().setVisible(true));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonConcluir;
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JComboBox<String> jComboBoxCidade;
    private javax.swing.JComboBox<String> jComboBoxFiltroStatus;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTarefas;
    private javax.swing.JTextField jTextFieldInserirTarefa;
    // End of variables declaration//GEN-END:variables
}
