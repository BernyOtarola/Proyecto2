/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
  * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Aplicacion;

import javax.swing.table.DefaultTableModel;
import clases.Inquilino;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author berny
 */
public class Inquilinos extends javax.swing.JFrame {

    private DefaultTableModel tableModel;
    private ArrayList<Inquilino> inquilinosList;
    private GuanaRent guana;
    private Inquilino inquilinoSeleccionado;

    /**
     * Creates new form Inquilinos
     *
     * @param inquilinosList
     * @param guana
     */
    public Inquilinos(ArrayList<Inquilino> inquilinosList, GuanaRent guana) {
        initComponents();
        setTitle("Inquilinos");
        this.inquilinosList = inquilinosList;
        tableModel = (DefaultTableModel) tblInquilinos.getModel();
        inquilinosList = new ArrayList<>();
        this.guana = guana;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCentral = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        cmbxGenero = new javax.swing.JComboBox<>();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        frmTelefono = new javax.swing.JFormattedTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblOcupacion = new javax.swing.JLabel();
        txtOcupacion = new javax.swing.JTextField();
        lblFecNacimiento = new javax.swing.JLabel();
        txtSeleccioneFecha = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInquilinos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Inquilinos");

        lblCedula.setText("Cedula ");

        lblNombre.setText("Nombre");

        lblGenero.setText("Genero");

        lblDireccion.setText("Direccion ");

        cmbxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Genero", "Masculino", "Femenino", " " }));

        lblTelefono.setText("Telefono");

        lblEmail.setText("Email");

        lblBuscar.setText("Buscar");

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir ");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblOcupacion.setText("Ocupacion");

        lblFecNacimiento.setText("FechNac");

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jLabel2.setText("DD/MM/YYYY.");

        javax.swing.GroupLayout pnlCentralLayout = new javax.swing.GroupLayout(pnlCentral);
        pnlCentral.setLayout(pnlCentralLayout);
        pnlCentralLayout.setHorizontalGroup(
            pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnlCentralLayout.createSequentialGroup()
                .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCentralLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNombre)
                            .addComponent(lblCedula)
                            .addComponent(lblGenero)
                            .addComponent(lblDireccion))
                        .addGap(18, 18, 18)
                        .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCentralLayout.createSequentialGroup()
                                .addComponent(lblBuscar)
                                .addGap(18, 18, 18)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCentralLayout.createSequentialGroup()
                                .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCedula)
                                    .addComponent(txtNombre)
                                    .addComponent(cmbxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                                .addGap(85, 85, 85)
                                .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblTelefono)
                                    .addComponent(lblEmail)
                                    .addComponent(lblOcupacion)
                                    .addComponent(lblFecNacimiento))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(frmTelefono)
                                    .addComponent(txtOcupacion)
                                    .addComponent(txtSeleccioneFecha)
                                    .addGroup(pnlCentralLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel2)
                                        .addGap(0, 78, Short.MAX_VALUE))
                                    .addComponent(txtEmail)))))
                    .addGroup(pnlCentralLayout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlCentralLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnGuardar)
                .addGap(18, 18, 18)
                .addComponent(btnEditar)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addGap(18, 18, 18)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        pnlCentralLayout.setVerticalGroup(
            pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefono)
                    .addComponent(frmTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGenero)
                    .addComponent(cmbxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOcupacion)
                    .addComponent(txtOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccion)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFecNacimiento)
                    .addComponent(txtSeleccioneFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscar)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        tblInquilinos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula ", "Nombre", "Genero", "Direccion", "Telefono", "Email", "Ocupacion", "FechaNacimiento"
            }
        ));
        jScrollPane1.setViewportView(tblInquilinos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(pnlCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(pnlCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String cedulaStr = txtCedula.getText();
        String nombre = txtNombre.getText();
        String genero = (String) cmbxGenero.getSelectedItem();
        String direccion = txtDireccion.getText();
        String telefonoStr = frmTelefono.getText();
        String email = txtEmail.getText();
        String ocupacion = txtOcupacion.getText();
        Date fechNac = null;

        if (cedulaStr.isEmpty() || nombre.isEmpty() || genero.equals("Genero")
                || direccion.isEmpty() || telefonoStr.isEmpty() || email.isEmpty() || ocupacion.isEmpty()) {

            StringBuilder errorMessage = new StringBuilder("Los siguientes campos están vacíos:\n");

            if (cedulaStr.isEmpty()) {
                errorMessage.append("- Cédula\n");
            }
            if (nombre.isEmpty()) {
                errorMessage.append("- Nombre\n");
            }
            if (genero.isEmpty()) {
                errorMessage.append("- Genero\n");
            }
            if (direccion.isEmpty()) {
                errorMessage.append("- Direccion\n");
            }
            if (telefonoStr.isEmpty()) {
                errorMessage.append("- Telefono\n");
            }
            if (email.isEmpty()) {
                errorMessage.append("- Email\n");
            }
            if (ocupacion.isEmpty()) {
                errorMessage.append("- Ocupacion\n");
            }

            JOptionPane.showMessageDialog(this, errorMessage.toString(), "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            int cedula = Integer.parseInt(cedulaStr);

            if (isCedulaDuplicate(cedula)) {
                JOptionPane.showMessageDialog(this, "Ya existe un usuario con esta cédula.", "Cédula Duplicada", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int telefono = Integer.parseInt(telefonoStr);
            String fechaSeleccionada = txtSeleccioneFecha.getText();
            if (fechaSeleccionada.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, seleccione una fecha de nacimiento.", "Fecha Vacía", JOptionPane.ERROR_MESSAGE);
                return;
            }
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            fechNac = dateFormat.parse(txtSeleccioneFecha.getText());
            Inquilino inquilino = new Inquilino(cedula, nombre, genero, fechNac, direccion, telefono, email, ocupacion);

            inquilinosList.add(inquilino);

            agregarInquilinoATabla(inquilino);

            limpiarCampos();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Cedula y telefono deben ser números válidos.");
        } catch (ParseException ex) {
            Logger.getLogger(Inquilinos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int filaSeleccionada = tblInquilinos.getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un inquilino para editar.", "Inquilino no seleccionado", JOptionPane.WARNING_MESSAGE);
            return;
        }

        inquilinoSeleccionado = inquilinosList.get(filaSeleccionada);

        txtCedula.setText(String.valueOf(inquilinoSeleccionado.getCedInqui()));
        txtNombre.setText(inquilinoSeleccionado.getNomInqui());
        cmbxGenero.setSelectedItem(inquilinoSeleccionado.getGenero());
        txtDireccion.setText(inquilinoSeleccionado.getDireccion());
        frmTelefono.setText(String.valueOf(inquilinoSeleccionado.getTelefono()));
        txtEmail.setText(inquilinoSeleccionado.getEmail());
        txtOcupacion.setText(inquilinoSeleccionado.getOcupacion());
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        txtSeleccioneFecha.setText(dateFormat.format(inquilinoSeleccionado.getFechNac()));

        btnGuardar.setEnabled(false);
        btnActualizar.setEnabled(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (inquilinoSeleccionado == null) {
            JOptionPane.showMessageDialog(this, "No hay inquilino seleccionado para actualizar.", "Inquilino no seleccionado", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String cedulaStr = txtCedula.getText();
        String nombre = txtNombre.getText();
        String genero = (String) cmbxGenero.getSelectedItem();
        String direccion = txtDireccion.getText();
        String telefonoStr = frmTelefono.getText();
        String email = txtEmail.getText();
        String ocupacion = txtOcupacion.getText();
        Date fechNac = null;

        if (cedulaStr.isEmpty() || nombre.isEmpty() || genero.equals("Genero")
                || direccion.isEmpty() || telefonoStr.isEmpty() || email.isEmpty() || ocupacion.isEmpty()) {

            StringBuilder errorMessage = new StringBuilder("Los siguientes campos están vacíos:\n");

            if (cedulaStr.isEmpty()) {
                errorMessage.append("- Cédula\n");
            }
            if (nombre.isEmpty()) {
                errorMessage.append("- Nombre\n");
            }
            if (genero.isEmpty()) {
                errorMessage.append("- Genero\n");
            }
            if (direccion.isEmpty()) {
                errorMessage.append("- Direccion\n");
            }
            if (telefonoStr.isEmpty()) {
                errorMessage.append("- Telefono\n");
            }
            if (email.isEmpty()) {
                errorMessage.append("- Email\n");
            }
            if (ocupacion.isEmpty()) {
                errorMessage.append("- Ocupacion\n");
            }

            JOptionPane.showMessageDialog(this, errorMessage.toString(), "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            int cedula = Integer.parseInt(cedulaStr);

            // Verificar si se está intentando cambiar la cédula a una ya existente
            if (cedula != inquilinoSeleccionado.getCedInqui() && isCedulaDuplicate(cedula)) {
                JOptionPane.showMessageDialog(this, "Ya existe un inquilino con esta cédula.", "Cédula Duplicada", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int telefono = Integer.parseInt(telefonoStr);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            fechNac = dateFormat.parse(txtSeleccioneFecha.getText());

            // Actualizar los datos del inquilino seleccionado
            inquilinoSeleccionado.setCedInqui(cedula);
            inquilinoSeleccionado.setNomInqui(nombre);
            inquilinoSeleccionado.setGenero(genero);
            inquilinoSeleccionado.setFechNac(fechNac);
            inquilinoSeleccionado.setDireccion(direccion);
            inquilinoSeleccionado.setTelefono(telefono);
            inquilinoSeleccionado.setEmail(email);
            inquilinoSeleccionado.setOcupacion(ocupacion);

            // Actualizar la fila correspondiente en la tabla
            int filaSeleccionada = tblInquilinos.getSelectedRow();
            tableModel.setValueAt(cedula, filaSeleccionada, 0);
            tableModel.setValueAt(nombre, filaSeleccionada, 1);
            tableModel.setValueAt(genero, filaSeleccionada, 2);
            tableModel.setValueAt(fechNac, filaSeleccionada, 3);
            tableModel.setValueAt(direccion, filaSeleccionada, 4);
            tableModel.setValueAt(telefono, filaSeleccionada, 5);
            tableModel.setValueAt(email, filaSeleccionada, 6);
            tableModel.setValueAt(ocupacion, filaSeleccionada, 7);

            // Limpiar los campos y habilitar el botón de Guardar
            limpiarCampos();
            btnGuardar.setEnabled(true);
            btnActualizar.setEnabled(false);
            inquilinoSeleccionado = null;

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Cedula y telefono deben ser números válidos.");
        } catch (ParseException ex) {
            Logger.getLogger(Inquilinos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int filaSeleccionada = tblInquilinos.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un inquilino de la tabla para eliminar.", "Inquilino no seleccionado", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Está seguro de que desea eliminar este inquilino?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            Inquilino inquilinoAEliminar = inquilinosList.get(filaSeleccionada);
            inquilinosList.remove(filaSeleccionada);
            tableModel.removeRow(filaSeleccionada);

            JOptionPane.showMessageDialog(this, "Inquilino eliminado exitosamente.", "Eliminación Exitosa", JOptionPane.INFORMATION_MESSAGE);
            limpiarCampos();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    public void setGuanaRentFrame(GuanaRent guanaRentFrame) {
        this.guana = guanaRentFrame;
    }

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        guana.showGuanaRentFrame();
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        String buscar = txtBuscar.getText().toLowerCase();

        TableRowSorter<TableModel> sorter = new TableRowSorter<>(tblInquilinos.getModel());
        tblInquilinos.setRowSorter(sorter);

        // Crear un filtro que busque coincidencias en las columnas de Cédula (0) y Nombre (1)
        RowFilter<TableModel, Object> cedulaFilter = RowFilter.regexFilter("^" + buscar + "$", 0);
        RowFilter<TableModel, Object> nombreFilter = RowFilter.regexFilter(buscar, 1, 2); // Buscar en las columnas 1 y 2 (Nombre y Género)

        // Combinar los filtros para que se cumpla cualquiera de las condiciones (OR)
        RowFilter<TableModel, Object> combinedFilter = RowFilter.orFilter(java.util.Arrays.asList(cedulaFilter, nombreFilter));

        sorter.setRowFilter(combinedFilter);
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void limpiarCampos() {
        txtCedula.setText("");
        txtNombre.setText("");
        cmbxGenero.setSelectedIndex(0);
        txtDireccion.setText("");
        frmTelefono.setText("");
        txtEmail.setText("");
        txtOcupacion.setText("");
        txtSeleccioneFecha.setText("");
    }

    private boolean isCedulaDuplicate(int cedula) {
        for (Inquilino inquilino : inquilinosList) {
            if (inquilino.getCedInqui() == cedula) {
                return true;
            }
        }
        return false;
    }

    private void agregarInquilinoATabla(Inquilino inquilino) {

        tableModel.addRow(new Object[]{
            inquilino.getCedInqui(),
            inquilino.getNomInqui(),
            cmbxGenero.getSelectedItem(),
            inquilino.getDireccion(),
            frmTelefono.getText(),
            inquilino.getEmail(),
            inquilino.getOcupacion(),
            txtSeleccioneFecha.getText()
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ArrayList<Inquilino> inquilinosList = new ArrayList<>();
                GuanaRent guanaRentFrame = new GuanaRent();
                guanaRentFrame.setInquilinosList(inquilinosList);
                guanaRentFrame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbxGenero;
    private javax.swing.JFormattedTextField frmTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFecNacimiento;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblOcupacion;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JPanel pnlCentral;
    private javax.swing.JTable tblInquilinos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtOcupacion;
    private javax.swing.JTextField txtSeleccioneFecha;
    // End of variables declaration//GEN-END:variables
}
