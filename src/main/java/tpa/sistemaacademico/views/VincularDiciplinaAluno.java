/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tpa.sistemaacademico.views;

import java.util.ArrayList;
import tpa.sistemaacademico.app.Aluno;
import tpa.sistemaacademico.app.ComparadorAlunoPorNome;
import tpa.sistemaacademico.app.ComparadorDisciplinaPorCodigo;
import tpa.sistemaacademico.app.ComparadorDisciplinaPorNome;
import tpa.sistemaacademico.app.Disciplina;
import tpa.sistemaacademico.lib.ArvoreBinaria;

/**
 *
 * @author lume
 */
public class VincularDiciplinaAluno extends javax.swing.JFrame {

    /**
     * Creates new form VincularDiciplinaAluno
     */
    
    ArvoreBinaria arvoreBinariaAluno;
    ArvoreBinaria arvoreBinariaDisciplina;

    public VincularDiciplinaAluno(ArvoreBinaria arvoreAluno, ArvoreBinaria arvoreDisci) {
        initComponents();
        this.setLocationRelativeTo(null);

        arvoreBinariaAluno = arvoreAluno;
        arvoreBinariaDisciplina = arvoreDisci;
        
        ArrayList <Aluno> listaAlunos = arvoreBinariaAluno.listar();
        ArrayList <Disciplina> listaDisciplinas = arvoreBinariaDisciplina.listar();
        
        for (Aluno aluno : listaAlunos) {
            AlunoComboBox.addItem(aluno.getNome());
        }
        
        for (Disciplina disciplina : listaDisciplinas) {
            DisciplinaComboBox.addItem(disciplina.getNome());
        }
        
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AlunoComboBox = new javax.swing.JComboBox<>();
        DisciplinaComboBox = new javax.swing.JComboBox<>();
        vincularAluno = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        errorField = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cancelarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DisciplinaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisciplinaComboBoxActionPerformed(evt);
            }
        });

        vincularAluno.setBackground(new java.awt.Color(0, 204, 51));
        vincularAluno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        vincularAluno.setForeground(new java.awt.Color(255, 255, 255));
        vincularAluno.setText("Vincular");
        vincularAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vincularAlunoMouseClicked(evt);
            }
        });

        errorField.setBackground(new java.awt.Color(242, 242, 242));
        errorField.setColumns(20);
        errorField.setRows(5);
        jScrollPane1.setViewportView(errorField);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Selecione o Aluno:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Selecione Disciplina:");
        jLabel2.setToolTipText("");

        cancelarButton.setBackground(new java.awt.Color(204, 0, 51));
        cancelarButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cancelarButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelarButton.setText("Cancelar");
        cancelarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AlunoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DisciplinaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cancelarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(vincularAluno)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AlunoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DisciplinaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vincularAluno)
                    .addComponent(cancelarButton)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DisciplinaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisciplinaComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DisciplinaComboBoxActionPerformed

    private void cancelarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarButtonMouseClicked
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_cancelarButtonMouseClicked

    private void vincularAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vincularAlunoMouseClicked
        ComparadorAlunoPorNome compAlunoPorNome = new ComparadorAlunoPorNome();
        ComparadorDisciplinaPorNome compDisciplinaPorNome = new ComparadorDisciplinaPorNome();
        ComparadorDisciplinaPorCodigo compDisciplinaPorCodigo = new ComparadorDisciplinaPorCodigo();

        String alunoSelecionado = (String) AlunoComboBox.getSelectedItem();
        String disciplinaSelecionada = (String) DisciplinaComboBox.getSelectedItem();

        if (alunoSelecionado == null || disciplinaSelecionada == null) {
            errorField.setText("Selecione um aluno e uma disciplina.");
            return;
        }

        Aluno aluno = new Aluno(-1, alunoSelecionado);
        Disciplina disciplina = new Disciplina(-1, disciplinaSelecionada, -1);

        Aluno novoAluno = (Aluno) arvoreBinariaAluno.pesquisar(aluno, compAlunoPorNome);
        Disciplina novoDisciplina = (Disciplina) arvoreBinariaDisciplina.pesquisar(disciplina, compDisciplinaPorNome);

        if (novoAluno == null) {
            errorField.setText("Aluno não encontrado.");
            return;
        }
        if (novoDisciplina == null) {
            errorField.setText("Disciplina não encontrada.");
            return;
        }

        ArrayList<Integer> cursadas = novoAluno.getDisciplinas();
        if (cursadas == null) {
            cursadas = new ArrayList<>();
        }

        if (cursadas.contains(novoDisciplina.getCodigo())) {
            errorField.setText("Disciplina já cursada/vinculada.");
        } else {
            ArrayList<Integer> preReqs = novoDisciplina.getPrerequisitos();
            ArrayList<Disciplina> disciplinasFaltantes = new ArrayList<>();
            String disciplinasFaltantesLabel = "";

            for (int i = 0; i < preReqs.size(); i++) {
                Integer elemento = preReqs.get(i);
                if (!cursadas.contains(elemento)) {
                    Disciplina disciplinaBusca = new Disciplina(elemento, "fantasy", -1);
                    Disciplina novoNaoCursada = (Disciplina) arvoreBinariaDisciplina.pesquisar(disciplinaBusca, compDisciplinaPorCodigo);
                    if (novoNaoCursada != null) {
                        disciplinasFaltantes.add(novoNaoCursada);
                    }
                }
            }

            if (disciplinasFaltantes.isEmpty()) {
                novoAluno.setDisciplinas(novoDisciplina);
                this.setVisible(false);
            } else {
                for (Disciplina elemento : disciplinasFaltantes) {
                    disciplinasFaltantesLabel += elemento.getNome() + "\n";
                }
                errorField.setText("Faltam os pré-requisitos: \n" + disciplinasFaltantesLabel);
            }
        }
    }//GEN-LAST:event_vincularAlunoMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AlunoComboBox;
    private javax.swing.JComboBox<String> DisciplinaComboBox;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JTextArea errorField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton vincularAluno;
    // End of variables declaration//GEN-END:variables
}
