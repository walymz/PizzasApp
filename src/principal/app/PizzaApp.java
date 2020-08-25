
package principal.app;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import principal.entities.Pizza;
import principal.entities.Tiempo;
import principal.enums.Estado;
import principal.enums.Tamano;
import principal.enums.TipoPizza;
import principal.utils.Reloj;

public class PizzaApp extends javax.swing.JFrame {
  DefaultListModel modeloLista;
  DefaultListModel modeloListaTiempo;
  List<Pizza> listaPizzas;
  Map<String, TipoPizza> mapaTipoPizza;
  
    public PizzaApp() {
        initComponents();
        /*
        Se inicia el Reloj
        */
        new Thread(new Reloj(lblReloj)).start();
        setLocationRelativeTo(null);
        cargarDatos();
        pack();
    }
private void cargarDatos(){
    /*
    Se cargan los datos de los comboBox 
    */
    
    /*
    En el combo cmdTipoPizza se usa un mapa para que quede relación entre el String
    del comboBox y el TipoPizza que representa en el enumerado
    */
    mapaTipoPizza = new HashMap();
    for(TipoPizza t: TipoPizza.values()){
        String nombre = t.toString().replace("_"," "); //Para que el enumerado CUATRO_QUESOS quede representado por el Sring "CUATRO QUESOS"
        mapaTipoPizza.put(nombre, t); //Se relaciona el String con su correspondiente valor en el enumerado TipoPizza
        cmbTipoPizza.addItem(nombre); //Se llena el combo TipoPizza con el String
    }
    
    listaPizzas = new ArrayList(); //Se crea una lista para almancenar las pizzas entregadas
    
    for(Tamano t: Tamano.values()) cmbTamano.addItem(t);  //Se añaden los elementos del Tamaño de las pizzas al combo box
    
    //Se relacionan los modelos de la lista de item a su correspondiente componente gráfico
    modeloLista = new DefaultListModel();  
    modeloListaTiempo = new DefaultListModel();
    lstPizzas.setModel(modeloLista);
    listaTiempos.setModel(modeloListaTiempo);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelCentro = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPizzas = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cmbTamano = new javax.swing.JComboBox<>();
        cmbTipoPizza = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnEntregar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaTiempos = new javax.swing.JList<>();
        btnPedir = new javax.swing.JButton();
        btnGraficar = new javax.swing.JButton();
        PanelInferior = new javax.swing.JPanel();
        lblInfo = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        lblReloj = new javax.swing.JLabel();
        lblPromedio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pizzas");

        jScrollPane1.setViewportView(lstPizzas);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Tamaño:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Pizza:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmbTipoPizza, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTamano, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTipoPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbTamano, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        btnEntregar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEntregar.setText("Entregar");
        btnEntregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntregarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Comprar:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Pedidos:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Duración:");

        jScrollPane2.setViewportView(listaTiempos);

        btnPedir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPedir.setText("Pedir");
        btnPedir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedirActionPerformed(evt);
            }
        });

        btnGraficar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGraficar.setText("Graficar");
        btnGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelCentroLayout = new javax.swing.GroupLayout(PanelCentro);
        PanelCentro.setLayout(PanelCentroLayout);
        PanelCentroLayout.setHorizontalGroup(
            PanelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCentroLayout.createSequentialGroup()
                .addGroup(PanelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCentroLayout.createSequentialGroup()
                        .addContainerGap(388, Short.MAX_VALUE)
                        .addGroup(PanelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(27, 27, 27))
                    .addGroup(PanelCentroLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(btnPedir, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEntregar, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171)))
                .addGroup(PanelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(btnGraficar, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
                .addGap(27, 27, 27))
            .addGroup(PanelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelCentroLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(PanelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                    .addContainerGap(788, Short.MAX_VALUE)))
        );
        PanelCentroLayout.setVerticalGroup(
            PanelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCentroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCentroLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCentroLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(PanelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGraficar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEntregar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPedir, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
            .addGroup(PanelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelCentroLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel5)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(109, Short.MAX_VALUE)))
        );

        getContentPane().add(PanelCentro, java.awt.BorderLayout.CENTER);

        PanelInferior.setPreferredSize(new java.awt.Dimension(1050, 55));

        lblReloj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReloj.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout PanelInferiorLayout = new javax.swing.GroupLayout(PanelInferior);
        PanelInferior.setLayout(PanelInferiorLayout);
        PanelInferiorLayout.setHorizontalGroup(
            PanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInferiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblReloj, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        PanelInferiorLayout.setVerticalGroup(
            PanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInferiorLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(PanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblReloj, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(PanelInferior, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedirActionPerformed
         //Se crea una nueva pizza con los valores seleccionados en los comboBox 
         /*
          La instrucción: mapaTipoPizza.get(cmbTipoPizza.getItemAt(cmbTipoPizza.getSelectedIndex())) 
          busca en el mapa con la clave del String del combo cmbTipoPizza que se encuentra seleccionado y
         obtiene su valor correspondiente en el enum TipoPizza
          */
         Pizza p = new Pizza(mapaTipoPizza.get(cmbTipoPizza.getItemAt(cmbTipoPizza.getSelectedIndex())), cmbTamano.getItemAt(cmbTamano.getSelectedIndex()));
         //Se agrega el objeto pizza a la lista de pizzas solicitadas
         modeloLista.addElement(p);
         //Se actualizan los lbl de información
         lblCantidad.setText("Cantidad de pizzas pedidas: "+Pizza.getCantidadPedida()+", cantidad de pizzas entregadas: "+Pizza.getCantidadServida());
    }//GEN-LAST:event_btnPedirActionPerformed

    private void btnEntregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntregarActionPerformed
        //Se verifica que haya un elemento seleccionado
        if(lstPizzas.getSelectedIndex()==-1) { //Si es -1 no hay nada seleccionado en la lista de pizzas pedidas
            JOptionPane.showMessageDialog(this, "Primero seleccione una pizza","Error", 0, null);
            return;
        }
        // se obtiene la pizza seleccionada y se verifica que su estado sea PEDIDA
        Pizza p = lstPizzas.getSelectedValue();
        if (p.getEstado()==Estado.SERVIDA){
            JOptionPane.showMessageDialog(this, "Esta pizza ya fue servida","Error", 0, null);
            return;
        }
        if (p.getEstado()==Estado.PEDIDA){
          listaPizzas.add(p); //Agrega la pizza en la lista de pizzas entregadas
          //Se sirve la pizza y se actualiza la información del label
          lblInfo.setText(p.servir());  
          lblCantidad.setText("Cantidad de pizzas pedidas: "+Pizza.getCantidadPedida()+", cantidad de pizzas entregadas: "+Pizza.getCantidadServida());
          //Se obtiene la duración de la pizza, y se calcula el promedio, poniéndo el resultado en el label
          //Tiempo duracion = p.getDuracion();
          lblPromedio.setText("Tiempo promedio de entrega: "+calcularPromedio(p).toString());
                                                             //Devuelve un objeto Tiempo y se manda a visualizar su método toString
        }
    }//GEN-LAST:event_btnEntregarActionPerformed
 /*
    Este método recibe la duración de la pizza,
    lo incorpora a la lista de tiempos 
    y luego actualiza el promedio de la misma
    */
    private Tiempo calcularPromedio(Pizza p) {
        modeloListaTiempo.addElement("Pizza "+p.getId()+" = "+" "+p.getDuracion());
        long suma=0;
        for (int i = 0; i < listaPizzas.size(); i++) {
            suma+=listaPizzas.get(i).getDuracionMilisegundos();
        }
        long promedio = suma/listaPizzas.size();
        /*
        El promedio en milisegundos es usado para crear un objeto calendar, en base al cual se devuelve un nuevo objeto de tipo tiempo con 
        el promedio del tiempo calculado
         */
        Calendar promedioTiempo = Calendar.getInstance();
        promedioTiempo.setTimeInMillis(promedio);
        promedioTiempo.setTimeZone(TimeZone.getTimeZone("UTC"));
        return new Tiempo(promedioTiempo); //Devuelve un objeto Tiempo pasándo el Calendar promedioTiempo como parámetro a su constructor
    }
    private void btnGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficarActionPerformed
       if(listaPizzas.size()==0){ //Si no hay pizzas preparadas pues manda un mensaje de error
           JOptionPane.showMessageDialog(this, "Espere a que se entregue alguna pizza para ver el gráfico de tiempos de entrega","Error", 0, null);
           return;
       }
       //Si hay pizzas preparadas muestra el gráfico, pasándo por parámetro la lista de pizzas preparadas
       JFrame grafica = new FrmGrafica(listaPizzas);
       grafica.setVisible(true);
    }//GEN-LAST:event_btnGraficarActionPerformed
 

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
            java.util.logging.Logger.getLogger(PizzaApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PizzaApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PizzaApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PizzaApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PizzaApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCentro;
    private javax.swing.JPanel PanelInferior;
    private javax.swing.JButton btnEntregar;
    private javax.swing.JButton btnGraficar;
    private javax.swing.JButton btnPedir;
    private javax.swing.JComboBox<Tamano> cmbTamano;
    private javax.swing.JComboBox<String> cmbTipoPizza;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblPromedio;
    private javax.swing.JLabel lblReloj;
    private javax.swing.JList<Float> listaTiempos;
    private javax.swing.JList<Pizza> lstPizzas;
    // End of variables declaration//GEN-END:variables
}
