package principal.app;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import principal.entities.Pizza;

public class FrmGrafica extends javax.swing.JFrame {
    List<Pizza> listaPizzas = new ArrayList();
    int y=0;
    
    public FrmGrafica(List<Pizza> listaPizzas) {
        initComponents();
        this.listaPizzas=listaPizzas;  //Recibe por parámetro la lista de pizzas entregadas
        cargarDatosGrafico();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
private void cargarDatosGrafico(){
    // Creamos y rellenamos el modelo de datos
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    // Se llenan los datos del dataset con los datos de la lista de pizzas
    listaPizzas.forEach(p->dataset.setValue(p.getDuracionMilisegundos(), "Pizzas", "Pizza "+p.getId()));
    //Se crea el gráfico
    JFreeChart chart = ChartFactory.createBarChart3D("Tiempo de entrega de las pizzas","Nº de Pizza", 
   "Tiempo de preparación (milisegundos)", dataset, PlotOrientation.VERTICAL, true,
   true, false);
    
    /*
    Parámetros:
    Título del gráfico,
    Etiqueta para el eje horizontal, 
    Etiqueta para el eje vertical,
    El modelo de datos dataset.
    Si queremos las barras en vertical, PlotOrientation.VERTICAL
    Un boolean que indica si queremos una etiqueta con el nombre de las barras  web en la parte inferior 
    Un boolean que indica si queremos tooltip en las barras, de forma que al poner el ratón sobre ellas, aparezca una pequeña etiqueta indicando el valor
    Un boolean si queremos que se generen urls. 
    */
    
  //Ponemos el gráfico en la ventana:
  // Creación del panel con el gráfico
  ChartPanel pnlGrafico = new ChartPanel(chart);
  //Se añade el panel del gráfico al panel que lo contendrá
  PanelGrafica.setLayout(new java.awt.BorderLayout());
  PanelGrafica.add(pnlGrafico, BorderLayout.CENTER);   
}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelGrafica = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        PanelGrafica.setLayout(new java.awt.BorderLayout());
        getContentPane().add(PanelGrafica, java.awt.BorderLayout.CENTER);

        btnCerrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.setPreferredSize(new java.awt.Dimension(150, 50));
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

   
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
            java.util.logging.Logger.getLogger(FrmGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGrafica(new ArrayList()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelGrafica;
    private javax.swing.JButton btnCerrar;
    // End of variables declaration//GEN-END:variables
}
