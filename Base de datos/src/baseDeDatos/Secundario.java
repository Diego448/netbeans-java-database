package baseDeDatos;
import java.util.Calendar;
import javax.swing.JOptionPane;
/**
 *
 * @author Diego
 */
public class Secundario extends javax.swing.JInternalFrame {
    int currentRowId = 0;
    int modRowId = 0;
    String[] a = new String[40];
    Calendar añoActual = Calendar.getInstance();
    int añoActualI = añoActual.get(Calendar.YEAR);
    void createList(){
         for (int i = 0; i < 40; i++) {
            a[i] = String.valueOf(i + 1973);
        }
    }
    String obtenerGenero(){
        String genero = null;
        if(sexoM.isSelected())
            genero = "Masculino";
        if(sexoF.isSelected())
            genero = "Femenino";
        return genero;
    }
    String obtenerAñoDeNacimiento(){
        String añoNacimiento = null;
        añoNacimiento = String.valueOf(año.getSelectedItem());
        return añoNacimiento;
    }
    String adaptar(String palabra){
        String adaptarPalabra = "";
        if(palabra!="")
            adaptarPalabra = ", ";
        return adaptarPalabra;
    }
    String obtenerHabilidades(){
        String habilidadesTexto = "";
        if(cHab.isSelected())
            habilidadesTexto = "C/C++";
        if(javaHab.isSelected())
            habilidadesTexto = habilidadesTexto + adaptar(habilidadesTexto) + "Java";
        if(VBHab.isSelected())
            habilidadesTexto += adaptar(habilidadesTexto) + "Visual Basic";
        if(csHab.isSelected())
            habilidadesTexto += adaptar(habilidadesTexto) + "C#";
        if(netHab.isSelected())
            habilidadesTexto += adaptar(habilidadesTexto) + ".NET/Javascript";
        if(otrasHab.isSelected())
            habilidadesTexto += adaptar(habilidadesTexto) + otras.getText();
        return habilidadesTexto;
    }
    void borrarDatosTemporales(){
        nombre.setText("");
        apellido.setText("");
        sexoF.setSelected(false);
        año.setSelectedItem(año.getItemAt(0));
        edad.setText("");
        cHab.setSelected(false);
        javaHab.setSelected(false);
        VBHab.setSelected(false);
        csHab.setSelected(false);
        netHab.setSelected(false);
        otrasHab.setSelected(false);
        otras.setText("");
    }
    public Secundario() {
        initComponents();
        createList();
        año.setModel(new javax.swing.DefaultComboBoxModel(a));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        sexoM = new javax.swing.JRadioButton();
        sexoF = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        edad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cHab = new javax.swing.JCheckBox();
        javaHab = new javax.swing.JCheckBox();
        VBHab = new javax.swing.JCheckBox();
        otrasHab = new javax.swing.JCheckBox();
        otras = new javax.swing.JTextField();
        csHab = new javax.swing.JCheckBox();
        netHab = new javax.swing.JCheckBox();
        año = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        baseDeDatos = new javax.swing.JTable();
        añadir = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Base de datos");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nuevo usuario"));

        jLabel1.setText("Nombre:");

        jLabel2.setText("Apellido:");

        jLabel3.setText("Sexo:");

        sexo.add(sexoM);
        sexoM.setText("Masculino");

        sexo.add(sexoF);
        sexoF.setText("Femenino");

        jLabel4.setText("Edad:");

        jLabel5.setText("Año de nacimiento:");

        jLabel6.setText("Habilidades:");

        cHab.setText("C/C++");

        javaHab.setText("Java");

        VBHab.setText("Visual Basic");

        otrasHab.setText("Otras:");

        csHab.setText("C#");

        netHab.setText(".NET/Javascript");

        año.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        año.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombre))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(apellido)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sexoM)
                                    .addComponent(sexoF)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cHab)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(javaHab)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(VBHab)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(csHab)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(netHab)
                                .addGap(0, 38, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(otrasHab)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(otras)))))
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(sexoM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexoF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cHab)
                    .addComponent(javaHab)
                    .addComponent(VBHab)
                    .addComponent(csHab)
                    .addComponent(netHab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(otrasHab)
                    .addComponent(otras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 17, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro"));

        baseDeDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Edad", "Sexo", "Año de nacimiento", "Habilidades"
            }
        ));
        jScrollPane2.setViewportView(baseDeDatos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
        );

        añadir.setText("Añadir");
        añadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                añadirMouseClicked(evt);
            }
        });

        modificar.setText("Modificar");
        modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarMouseClicked(evt);
            }
        });

        eliminar.setText("Eliminar");

        jButton4.setText("jButton4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(añadir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(añadir)
                    .addComponent(modificar)
                    .addComponent(eliminar)
                    .addComponent(jButton4))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void añadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_añadirMouseClicked
        if(currentRowId<10){
            if(!"".equals(nombre.getText()) && !"".equals(apellido.getText()) && !"".equals(edad.getText()) && !"".equals(obtenerGenero()) && !"".equals(obtenerAñoDeNacimiento()) && !"".equals(obtenerHabilidades())){
            baseDeDatos.setValueAt(nombre.getText(), currentRowId, 0);
            baseDeDatos.setValueAt(apellido.getText(), currentRowId, 1);
            baseDeDatos.setValueAt(edad.getText(), currentRowId, 2);
            baseDeDatos.setValueAt(obtenerGenero(), currentRowId, 3);
            baseDeDatos.setValueAt(obtenerAñoDeNacimiento(), currentRowId, 4);
            baseDeDatos.setValueAt(obtenerHabilidades(), currentRowId, 5);
            }else{
                JOptionPane.showMessageDialog(null, "Favor de llenar todos los campos", "Información insuficiente", JOptionPane.ERROR_MESSAGE);
                currentRowId -= 1;
            }
        }
        currentRowId += 1;
        if(currentRowId>10)
            JOptionPane.showMessageDialog(null, "La base de datos esta llena. Imposible añadir usuaio", "Advertencia", JOptionPane.ERROR_MESSAGE);
         if(!"".equals(nombre.getText()) && !"".equals(apellido.getText()) && !"".equals(edad.getText()) && !"".equals(obtenerGenero()) && !"".equals(obtenerAñoDeNacimiento()) && !"".equals(obtenerHabilidades()))
        borrarDatosTemporales();
    }//GEN-LAST:event_añadirMouseClicked

    private void añoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añoActionPerformed
        int aux = Integer.parseInt(String.valueOf(año.getModel().getSelectedItem()));
        edad.setText(String.valueOf(añoActualI - aux));
    }//GEN-LAST:event_añoActionPerformed

    private void modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarMouseClicked
        if(baseDeDatos.getSelectedRow() != -1){
        modRowId = baseDeDatos.getSelectedRow();
        nombre.setText(String.valueOf(baseDeDatos.getValueAt(0, modRowId)));
        }
    }//GEN-LAST:event_modificarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox VBHab;
    private javax.swing.JTextField apellido;
    private javax.swing.JButton añadir;
    private javax.swing.JComboBox año;
    private javax.swing.JTable baseDeDatos;
    private javax.swing.JCheckBox cHab;
    private javax.swing.JCheckBox csHab;
    private javax.swing.JTextField edad;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JCheckBox javaHab;
    private javax.swing.JButton modificar;
    private javax.swing.JCheckBox netHab;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField otras;
    private javax.swing.JCheckBox otrasHab;
    private javax.swing.ButtonGroup sexo;
    private javax.swing.JRadioButton sexoF;
    private javax.swing.JRadioButton sexoM;
    // End of variables declaration//GEN-END:variables
}