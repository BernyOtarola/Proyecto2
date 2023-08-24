package Aplicacion;

import clases.Alquiler;
import clases.Inquilino;
import clases.Mensualidad;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author berny
 */
public class Mensualidades extends javax.swing.JFrame {

    private ArrayList<Mensualidad> mensualidadesList;
    private ArrayList<Alquiler> alquileresList;
    private GuanaRent guana;

    /**
     * Creates new form Mensualidades
     *
     * @param mensualidadesList
     * @param alquileresList
     * @param guana
     * @param inquilinosList
     */
    public Mensualidades(ArrayList<Mensualidad> mensualidadesList, ArrayList<Alquiler> alquileresList, ArrayList<Inquilino> inquilinosList, GuanaRent guana) {
        initComponents();
        setTitle("Gestion de mensualidades");
        this.guana = guana;
        this.mensualidadesList = mensualidadesList;
        this.alquileresList = alquileresList;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlGeneralMensualidades = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtFechaActual = new javax.swing.JTextField();
        cmbxGenerarMes = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtGenerarAño = new javax.swing.JTextField();
        btnGenerarMensualidades = new javax.swing.JButton();
        pnlMostrarMensualidades = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbxMostrarMes = new javax.swing.JComboBox<>();
        btnMostrarMensualidades = new javax.swing.JButton();
        txtMostrarAño = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMensualidades = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cbxInquilino = new javax.swing.JCheckBox();
        cbxMes = new javax.swing.JCheckBox();
        cbxAño = new javax.swing.JCheckBox();
        txtBuscar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlGeneralMensualidades.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Fecha actual");

        cmbxGenerarMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Enero ", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre ", "Diciembre" }));

        jLabel3.setText("Mes");

        jLabel4.setText("Año");

        btnGenerarMensualidades.setText("Generar");
        btnGenerarMensualidades.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGenerarMensualidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarMensualidadesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlGeneralMensualidadesLayout = new javax.swing.GroupLayout(pnlGeneralMensualidades);
        pnlGeneralMensualidades.setLayout(pnlGeneralMensualidadesLayout);
        pnlGeneralMensualidadesLayout.setHorizontalGroup(
            pnlGeneralMensualidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGeneralMensualidadesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlGeneralMensualidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(35, 35, 35)
                .addGroup(pnlGeneralMensualidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlGeneralMensualidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cmbxGenerarMes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtGenerarAño)
                        .addComponent(txtFechaActual))
                    .addComponent(btnGenerarMensualidades, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        pnlGeneralMensualidadesLayout.setVerticalGroup(
            pnlGeneralMensualidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGeneralMensualidadesLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnlGeneralMensualidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlGeneralMensualidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbxGenerarMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlGeneralMensualidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGenerarAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(btnGenerarMensualidades, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pnlMostrarMensualidades.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setText("Mes");

        jLabel8.setText("Año");

        cmbxMostrarMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Enero ", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre ", "Diciembre" }));

        btnMostrarMensualidades.setText("Mostrar Mensualidades");
        btnMostrarMensualidades.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMostrarMensualidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarMensualidadesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMostrarMensualidadesLayout = new javax.swing.GroupLayout(pnlMostrarMensualidades);
        pnlMostrarMensualidades.setLayout(pnlMostrarMensualidadesLayout);
        pnlMostrarMensualidadesLayout.setHorizontalGroup(
            pnlMostrarMensualidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMostrarMensualidadesLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(pnlMostrarMensualidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(pnlMostrarMensualidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbxMostrarMes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMostrarAño, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMostrarMensualidadesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMostrarMensualidades)
                .addGap(83, 83, 83))
        );
        pnlMostrarMensualidadesLayout.setVerticalGroup(
            pnlMostrarMensualidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMostrarMensualidadesLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(pnlMostrarMensualidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbxMostrarMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlMostrarMensualidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtMostrarAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnMostrarMensualidades, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblMensualidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Consecutivo", "Num Alquiler", "Fecha Creacion", "Inquilino", "Mes en cobro", "Año", "Descuento", "Monto a pagar", "Estado"
            }
        ));
        jScrollPane1.setViewportView(tblMensualidades);

        jLabel1.setText("Filtrador por:");

        cbxInquilino.setText("Inquilino");

        cbxMes.setText("Mes");

        cbxAño.setText("Año");

        jLabel5.setText("Generar Mensualidades");

        jLabel6.setText("Mostrar Mensualidades");

        jLabel9.setText("Todos los registros de mensualidades");

        btnSalir.setText("Salir ");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlGeneralMensualidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlMostrarMensualidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cbxInquilino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxMes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxAño)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlGeneralMensualidades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlMostrarMensualidades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbxInquilino)
                    .addComponent(cbxMes)
                    .addComponent(cbxAño)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarMensualidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarMensualidadesActionPerformed
        int selectedMonthIndex = cmbxGenerarMes.getSelectedIndex();
        LocalDate currentDate = LocalDate.now();
        int selectedYear = 0;
        boolean mensualidadesGeneradas = false;

        try {
            selectedYear = Integer.parseInt(txtGenerarAño.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El año ingresado no es válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (selectedMonthIndex == 0) {
            JOptionPane.showMessageDialog(this, "Selecciona un mes válido.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (selectedYear == 0) {
            JOptionPane.showMessageDialog(this, "Ingresa un año válido.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (alquileresList.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay alquileres disponibles para generar mensualidades.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        for (Alquiler alquiler : alquileresList) {
            if (alquiler.isActive() && !isMensualidadGenerated(alquiler, selectedMonthIndex, selectedYear)) {
                double montoMes = calculateMontoMes(alquiler, selectedMonthIndex);

                Mensualidad mensualidad = new Mensualidad(
                        alquiler, currentDate, alquiler.getInquilino(),
                        selectedMonthIndex, selectedYear, alquiler,
                        montoMes, "Pendiente", alquiler, alquiler.getInquilino(), alquiler.getVivienda()
                );

                // Set the AñoActual property of the mensualidad
                mensualidad.setAñoActual(selectedYear);

                // Actualiza el mes en cobro de la mensualidad
                mensualidad.setMesCobro(selectedMonthIndex);

                mensualidadesList.add(mensualidad);

                mensualidadesGeneradas = true;
            }
        }

        actualizarMensualidadesTabla();

        if (mensualidadesGeneradas) {
            JOptionPane.showMessageDialog(this, "Se han generado las mensualidades exitosamente.", "Generar Mensualidades", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnGenerarMensualidadesActionPerformed

    private void btnMostrarMensualidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarMensualidadesActionPerformed
        int selectedMonthIndex = cmbxMostrarMes.getSelectedIndex();
        int selectedYear = Integer.parseInt(txtMostrarAño.getText());

        ArrayList<Mensualidad> filteredMensualidades = new ArrayList<>();

        for (Mensualidad mensualidad : mensualidadesList) {
            if (mensualidad.getMesCobro() == selectedMonthIndex && mensualidad.getAñoActual() == selectedYear) {
                filteredMensualidades.add(mensualidad);
            }
        }

        mostrarMensualidadesFiltradas(filteredMensualidades);

    }//GEN-LAST:event_btnMostrarMensualidadesActionPerformed
    private void mostrarMensualidadesFiltradas(ArrayList<Mensualidad> mensualidades) {

        DefaultTableModel model = (DefaultTableModel) tblMensualidades.getModel();
        model.setRowCount(0);

        for (Mensualidad mensualidad : mensualidades) {
            model.addRow(new Object[]{
                Mensualidad.getConsecutivo(),
                mensualidad.getAlquiler().getNumAlquiler(),
                mensualidad.getFechCreacion(),
                mensualidad.getNomInquilino().getNomInqui(),
                getNombreMes(mensualidad.getMesCobro()),
                mensualidad.getAñoActual(),
                mensualidad.getAlquiler().getPrecioAlquiler(),
                mensualidad.getMontoMes(),
                mensualidad.getEstado(),});
        }
    }

    public String getNombreMes(int mesCobro) {
        String[] meses = {
            "", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };
        return meses[mesCobro];
    }

    public void setGuanaRentFrame(GuanaRent guanaRentFrame) {
        this.guana = guanaRentFrame;
    }

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        guana.showGuanaRentFrame();
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            ArrayList<Alquiler> alquileresList = new ArrayList<>();
            ArrayList<Mensualidad> mensualidadesList = new ArrayList<>();
            ArrayList<Inquilino> inquilinosList = new ArrayList<>();
            GuanaRent guanaRentFrame = new GuanaRent();
            guanaRentFrame.setMensualidadesList(mensualidadesList);
            Mensualidades mensualidadFrame = new Mensualidades(mensualidadesList, alquileresList, inquilinosList, guanaRentFrame);
            mensualidadFrame.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarMensualidades;
    private javax.swing.JButton btnMostrarMensualidades;
    private javax.swing.JButton btnSalir;
    private javax.swing.JCheckBox cbxAño;
    private javax.swing.JCheckBox cbxInquilino;
    private javax.swing.JCheckBox cbxMes;
    private javax.swing.JComboBox<String> cmbxGenerarMes;
    private javax.swing.JComboBox<String> cmbxMostrarMes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlGeneralMensualidades;
    private javax.swing.JPanel pnlMostrarMensualidades;
    private javax.swing.JTable tblMensualidades;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtFechaActual;
    private javax.swing.JTextField txtGenerarAño;
    private javax.swing.JTextField txtMostrarAño;
    // End of variables declaration//GEN-END:variables

    private void actualizarMensualidadesTabla() {

        DefaultTableModel model = (DefaultTableModel) tblMensualidades.getModel();
        model.setRowCount(0);

        for (Mensualidad mensualidad : mensualidadesList) {
            model.addRow(new Object[]{
                Mensualidad.getConsecutivo(),
                mensualidad.getAlquiler().getNumAlquiler(),
                mensualidad.getFechCreacion(),
                mensualidad.getInquilino().getNomInqui(),
                getNombreMes(mensualidad.getMesCobro()),
                mensualidad.getAñoActual(),
                mensualidad.getAlquiler().getPrecioAlquiler(),
                mensualidad.getMontoMes(),
                mensualidad.getEstado(),});
        }

    }

    private boolean isMensualidadGenerated(Alquiler alquiler, int selectedMonthIndex, int selectedYear) {

        for (Mensualidad mensualidad : mensualidadesList) {
            if (mensualidad.getAlquiler() == alquiler
                    && mensualidad.getFechCreacion().getMonthValue() == selectedMonthIndex + 1
                    && mensualidad.getFechCreacion().getYear() == selectedYear) {
                return true;
            }
        }
        return false;

    }

    public double calculateMontoMes(Alquiler alquiler, int selectedMonthIndex) {
        double precioAlquiler = alquiler.getPrecioAlquiler();
        double porcentajeDescuento = 0.0;

        int month = selectedMonthIndex + 1;
        if (month >= 8 && month <= 10) {
            // Temporada Baja
            porcentajeDescuento = 0.1;
        } else if (month >= 3 && month <= 7) {
            // Temporada Media
            porcentajeDescuento = 0.05;
        }

        double monto = precioAlquiler - (precioAlquiler * porcentajeDescuento);
        return monto;
    }

}