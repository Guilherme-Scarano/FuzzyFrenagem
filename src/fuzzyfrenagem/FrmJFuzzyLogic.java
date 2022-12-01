package fuzzyfrenagem;

import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.plot.JDialogFis;
import net.sourceforge.jFuzzyLogic.rule.Variable;

public class FrmJFuzzyLogic extends javax.swing.JFrame {

    double sensorDistancia;
    double sensorVelocidade;
    
    // Parametros do sistema Fuzzy
    String fileName = "regras.fcl";
    FIS fis = FIS.load(fileName);
    JDialogFis dialog = new JDialogFis(fis);
            
    public FrmJFuzzyLogic() {
        initComponents();
    }
    
    void fuzzifica(){
        fis.setVariable("Distancia", sensorDistancia);
        fis.setVariable("Velocidade", sensorVelocidade);
        fis.evaluate();
        Variable resp = fis.getVariable("pressao");
        Double saida = resp.getValue();
        jLabelpressao.setText(String.valueOf(saida));
        
        dialog.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSliderDistancia = new javax.swing.JSlider();
        jSliderVelocidade = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelDistancia = new javax.swing.JLabel();
        jLabelVelocidade = new javax.swing.JLabel();
        jLabelpressao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSliderDistancia.setMaximum(30);
        jSliderDistancia.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderDistanciaStateChanged(evt);
            }
        });

        jSliderVelocidade.setMaximum(80);
        jSliderVelocidade.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderVelocidadeStateChanged(evt);
            }
        });

        jLabel1.setText("Distância");

        jLabel2.setText("Velocidade");

        jLabelDistancia.setText("*");

        jLabelVelocidade.setText("*");

        jLabelpressao.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(281, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSliderDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSliderVelocidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelVelocidade)
                            .addComponent(jLabelDistancia))
                        .addGap(195, 195, 195))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelpressao)
                        .addGap(343, 343, 343))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSliderDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelDistancia))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSliderVelocidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabelVelocidade))
                .addGap(40, 40, 40)
                .addComponent(jLabelpressao)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSliderDistanciaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderDistanciaStateChanged
        sensorDistancia = jSliderDistancia.getValue();
        jLabelDistancia.setText(String.valueOf(sensorDistancia));
        fuzzifica();
    }//GEN-LAST:event_jSliderDistanciaStateChanged

    private void jSliderVelocidadeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderVelocidadeStateChanged
        sensorVelocidade = jSliderVelocidade.getValue();
        jLabelVelocidade.setText(String.valueOf(sensorVelocidade));
        fuzzifica();
    }//GEN-LAST:event_jSliderVelocidadeStateChanged

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmJFuzzyLogic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmJFuzzyLogic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmJFuzzyLogic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmJFuzzyLogic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmJFuzzyLogic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelDistancia;
    private javax.swing.JLabel jLabelVelocidade;
    private javax.swing.JLabel jLabelpressao;
    private javax.swing.JSlider jSliderDistancia;
    private javax.swing.JSlider jSliderVelocidade;
    // End of variables declaration//GEN-END:variables
}
