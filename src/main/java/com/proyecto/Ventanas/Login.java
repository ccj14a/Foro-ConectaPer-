package com.proyecto.Ventanas;

import com.proyecto.Clases.*;
import com.proyecto.Menus.*;
import com.proyecto.Otros.Formatos;
import static com.proyecto.Principal.Main1.clearConsole;
import java.awt.Dimension;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    Usuario gestionU = new Usuario();

    Administrador gestionA = new Administrador();

    Foro foro = new Foro(); // Crear instancia de foro y cargar temas
    Administrador admin = new Administrador();
    Usuario usuarioActual = null;
    Administrador adminActualNormal = null;

    public Login() {
        initComponents();
        gestionU.loadUser(); // Cargar usuarios al inicio
        gestionA.cargaAdmin();// PARA CARGAR LOS ADMINISTARDORES ACTUALES REGISTRADOS
        this.setSize(new Dimension(1210, 720));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campo_user = new javax.swing.JTextField();
        campo_contra = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        btn_crearCuenta = new javax.swing.JButton();
        btn_inciarSesion = new javax.swing.JButton();
        btn_volver = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(36, 48, 60,150));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido");

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario");

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Contraseña");

        campo_user.setBackground(new java.awt.Color(0, 0, 0));
        campo_user.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        campo_user.setForeground(new java.awt.Color(255, 255, 255));
        campo_user.setCaretColor(new java.awt.Color(255, 255, 255));

        campo_contra.setBackground(new java.awt.Color(0, 0, 0));
        campo_contra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campo_contra.setForeground(new java.awt.Color(255, 255, 255));
        campo_contra.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("No tienes una cuenta?");

        btn_crearCuenta.setBackground(new java.awt.Color(255, 153, 0));
        btn_crearCuenta.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btn_crearCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btn_crearCuenta.setText("Crea una");
        btn_crearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearCuentaActionPerformed(evt);
            }
        });

        btn_inciarSesion.setBackground(new java.awt.Color(255, 153, 0));
        btn_inciarSesion.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btn_inciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btn_inciarSesion.setText("Iniciar Sesión");
        btn_inciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inciarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_contra, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_user, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_inciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_crearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 95, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                    .addComponent(jSeparator2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campo_user, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campo_contra, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_inciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(btn_crearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 500, 420));

        btn_volver.setBackground(new java.awt.Color(153, 102, 255));
        btn_volver.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btn_volver.setForeground(new java.awt.Color(255, 255, 255));
        btn_volver.setText("Volver al Inicio");
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });
        jPanel4.add(btn_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/congreso.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 0, 1270, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1210, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_crearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearCuentaActionPerformed
        Registro reg = new Registro();
        reg.setVisible(true);
        reg.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btn_crearCuentaActionPerformed

    private void btn_inciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inciarSesionActionPerformed
        String user = campo_user.getText();
        char[] passwordArray = campo_contra.getPassword();
        String pass = new String(passwordArray);
        if (user.isEmpty() || pass.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Rellene todos los campos");
            return;
        }
        usuarioActual = gestionU.login(user, pass);
        if (usuarioActual != null) {

            JOptionPane.showMessageDialog(null,
                    "Sesión Iniciada");
            this.dispose();

            int opUsuario = 0;
            do {

                opUsuario = MenuUusario.menuUsuario(usuarioActual);

                switch (opUsuario) {
                    case 1:
                        int opF;
                        do {
                            foro.mostrarForo();

                            opF = MenuForo.menuForo(usuarioActual);
                            // clearConsole();

                            switch (opF) {
                                case 1:
                                    String titulo = JOptionPane.showInputDialog("Ingrese el título del nuevo tema:");
                                    if (titulo == null || titulo.trim().isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "Operación cancelada o título vacío.");
                                        break;
                                    }
                                    if (foro.crearTema(titulo, usuarioActual.getUsuario())) {
                                        foro.mostrarForo();
                                    }
                                    clearConsole();
                                    break;

                                case 2:
                                    // Agregar un mensaje a un tema
                                    String inputIdTema = JOptionPane.showInputDialog("Ingrese el número del tema al que desea agregar un mensaje:");
                                    if (inputIdTema == null || inputIdTema.trim().isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "Operación cancelada o entrada inválida.");
                                        break;
                                    }
                                    int idTema = Integer.parseInt(inputIdTema);

                                    String contenido = JOptionPane.showInputDialog("Ingrese su mensaje:");
                                    if (contenido == null || contenido.trim().isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "Operación cancelada o mensaje vacío.");
                                        break;
                                    }
                                    foro.aMensaje(idTema, usuarioActual.getUsuario(), contenido);
                                    foro.mostrarForo();
                                    clearConsole();
                                    break;

                                case 3:
                                    // Responder a un mensaje
                                    inputIdTema = JOptionPane.showInputDialog("Ingrese el número del tema al que desea dejar un comentario:");
                                    if (inputIdTema == null || inputIdTema.trim().isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "Operación cancelada o entrada inválida.");
                                        break;
                                    }
                                    idTema = Integer.parseInt(inputIdTema);

                                    String inputNumMensaje = JOptionPane.showInputDialog("Ingresa el número del mensaje a comentar:");
                                    if (inputNumMensaje == null || inputNumMensaje.trim().isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "Operación cancelada o entrada inválida.");
                                        break;
                                    }
                                    int numMensaje = Integer.parseInt(inputNumMensaje);

                                    contenido = JOptionPane.showInputDialog("Ingrese el comentario:");
                                    if (contenido == null || contenido.trim().isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "Operación cancelada o comentario vacío.");
                                        break;
                                    }
                                    foro.responderMensaje(idTema, numMensaje, usuarioActual.getUsuario(), contenido);
                                    foro.mostrarForo();
                                    clearConsole();
                                    break;

                                case 4:
                                    String palabraClave = JOptionPane.showInputDialog("Ingrese la palabra clave para buscar en el foro:");
                                    if (palabraClave == null || palabraClave.trim().isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "Operación cancelada o entrada vacía.");
                                        break;
                                    }
                                    foro.buscarPorPalabraClave(palabraClave);
                                    foro.mostrarForo();
                                    clearConsole();
                                    break;

                                case 5:
                                    String autorX = JOptionPane.showInputDialog("Ingrese el nombre del autor a filtrar:");
                                    if (autorX == null || autorX.trim().isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "Operación cancelada o entrada vacía.");
                                        break;
                                    }
                                    boolean encontrado = false;
                                    StringBuilder mensajesAutor = new StringBuilder();

                                    for (Tema tema : foro.getTemas()) {
                                        for (Mensaje mensaje : tema.getMensajes()) {
                                            if (mensaje.getAutor().equalsIgnoreCase(autorX)) {
                                                mensajesAutor.append(mensaje.toString()).append("\n");
                                                encontrado = true;
                                            }
                                            for (Mensaje respuesta : mensaje.getRespuestas()) {
                                                if (respuesta.getAutor().equalsIgnoreCase(autorX)) {
                                                    mensajesAutor.append(respuesta.toString()).append("\n");
                                                    encontrado = true;
                                                }
                                            }
                                        }
                                    }

                                    if (encontrado) {
                                        String mensajesFormateados = Formatos.limpiarFormatoConsola(mensajesAutor.toString());
                                        JOptionPane.showMessageDialog(null, mensajesFormateados, "Mensajes del Autor: " + autorX, JOptionPane.INFORMATION_MESSAGE);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No se encontraron mensajes del autor: " + autorX, "Error", JOptionPane.ERROR_MESSAGE);
                                    }
                                    foro.mostrarForo();
                                    clearConsole();
                                    break;

                                case 6:
                                    String inputIdB = JOptionPane.showInputDialog("ID del tema:");
                                    if (inputIdB == null || inputIdB.trim().isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "Operación cancelada o entrada inválida.");
                                        break;
                                    }
                                    int idB = Integer.parseInt(inputIdB);
                                    foro.deleteTema(idB, usuarioActual.getUsuario());
                                    clearConsole();
                                    break;

                                case 7:
                                    String inputIdBu = JOptionPane.showInputDialog("ID del tema:");
                                    if (inputIdBu == null || inputIdBu.trim().isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "Operación cancelada o entrada inválida.");
                                        break;
                                    }
                                    int idBu = Integer.parseInt(inputIdBu);

                                    String inputNumE = JOptionPane.showInputDialog("ID del mensaje:");
                                    if (inputNumE == null || inputNumE.trim().isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "Operación cancelada o entrada inválida.");
                                        break;
                                    }
                                    int numE = Integer.parseInt(inputNumE);

                                    foro.eliminarMensaje(idBu, numE, usuarioActual.getUsuario());
                                    clearConsole();
                                    break;

                                case 8:
                                    String inputIdBus = JOptionPane.showInputDialog("ID del tema:");
                                    if (inputIdBus == null || inputIdBus.trim().isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "Operación cancelada o entrada inválida.");
                                        break;
                                    }
                                    int idBus = Integer.parseInt(inputIdBus);

                                    String inputNumMen = JOptionPane.showInputDialog("ID del mensaje:");
                                    if (inputNumMen == null || inputNumMen.trim().isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "Operación cancelada o entrada inválida.");
                                        break;
                                    }
                                    int numMen = Integer.parseInt(inputNumMen);

                                    String inputNumR = JOptionPane.showInputDialog("ID del comentario:");
                                    if (inputNumR == null || inputNumR.trim().isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "Operación cancelada o entrada inválida.");
                                        break;
                                    }
                                    int numR = Integer.parseInt(inputNumR);

                                    foro.eliminarRespuesta(idBus, numMen, numR, usuarioActual.getUsuario());
                                    clearConsole();
                                    break;

                                case 9:
                                    clearConsole();
                                    break;

                            }
                        } while (opF != 9);
                        break;

                    case 2:
                        JOptionPane.showMessageDialog(null,
                                "Nombres: "
                                + usuarioActual.getNombres() + "\n"
                                + "Usuario: " + usuarioActual.getUsuario() + "\n" + "Contraseña: "
                                + usuarioActual.getContra() + "\nEdad: " + usuarioActual.getEdad()
                                + "\nEstado: " + usuarioActual.getEstadoComoTexto(),
                                "👤:  @" + usuarioActual.getUsuario(),
                                JOptionPane.INFORMATION_MESSAGE);

                        break;
                    case 3:
                        gestionU.modificarAtributosUsuario(usuarioActual);
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Sesion cerrada con éxito");
                        break;

                }
            } while (opUsuario != 4 && usuarioActual != null);
            Home hom = new Home();
            hom.setVisible(true);
            hom.setLocationRelativeTo(null);
            return;

        }

        int opAdmin = 0;

        adminActualNormal = admin.loginAE(user, pass);

        if (admin.loginAG(user, pass) || adminActualNormal != null) {

            JOptionPane.showMessageDialog(null, "Credenciales correctas. Sesion iniciada", "Mensaje",
                    JOptionPane.INFORMATION_MESSAGE);
            this.dispose();

        } else {

            JOptionPane.showMessageDialog(null, "Credenciales incorrectas.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        boolean isAdminGeneral = admin.loginAG(user, pass);
        do {
            opAdmin = MenuAdministracion.menuAdminG(isAdminGeneral);

            switch (opAdmin) {
                case 1:
                    if (gestionU.isListaVacia()) {
                        JOptionPane.showMessageDialog(null, "No hay usuarios registrados, hasta el momento",
                                "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                        break;
                    }
                    int opOpcion;
                    do {
                        opOpcion = gestionU.mostrarUsuariosEnLista();
                        Usuario usuario = null;
                        switch (opOpcion) {

                            case 0: // Desactivar Usuario
                                String userx = JOptionPane
                                        .showInputDialog("Ingrese el nombre del usuario:");
                                usuario = admin.desactivarUser(userx, gestionU.getCab()); // Supone que
                                // devuelve un
                                // objeto Usuario
                                // o null
                                if (usuario != null) {
                                    JOptionPane.showMessageDialog(null,
                                            "Usuario: " + userx + " Desactivado");
                                    gestionU.saveUser();
                                } else {
                                    JOptionPane.showMessageDialog(null, "Usuario no encontrado",
                                            "INFORMACION", JOptionPane.INFORMATION_MESSAGE, null);
                                }
                                break;
                            case 1: // Reactivar Usuario
                                String userToReactivate = JOptionPane
                                        .showInputDialog("Ingrese el nombre del usuario:");
                                usuario = admin.activarUser(userToReactivate, gestionU.getCab());
                                if (usuario != null) {
                                    JOptionPane.showMessageDialog(null,
                                            "Usuario: " + userToReactivate + " Reactivado");
                                    gestionU.saveUser();

                                } else {
                                    JOptionPane.showMessageDialog(null, "Usuario no encontrado",
                                            "INFORMACION", JOptionPane.INFORMATION_MESSAGE, null);
                                }
                                break;
                            case 2: // Eliminar Usuario
                                String userE = JOptionPane
                                        .showInputDialog("Ingrese el nombre del usuario:");
                                usuario = admin.EliminarUser(userE, gestionU.getCab());
                                if (usuario != null) {
                                    JOptionPane.showMessageDialog(null, "Usuario: " + userE + " Eliminado");
                                    gestionU.saveUser();

                                } else {
                                    JOptionPane.showMessageDialog(null, "Usuario no encontrado",
                                            "INFORMACION", JOptionPane.INFORMATION_MESSAGE, null);
                                }
                                break;
                        }
                        break;

                    } while (opOpcion != 3);
                    break;

                case 2:
                    if (isAdminGeneral && gestionA.adminVacio()) {
                        JOptionPane.showMessageDialog(null, "No hay administradores agregados");
                    } else if (isAdminGeneral) {
                        int opcion = gestionA.mostrarAdministradoresEnLista();
                    } else {
                        JOptionPane.showMessageDialog(null, adminActualNormal);
                    }

                    break;
                case 3:
                    if (isAdminGeneral) {
                        String userA = JOptionPane.showInputDialog("Usuario:");
                        gestionA.agregarAdministradorEspecifico(userA);
                    } else {
                        JOptionPane.showMessageDialog(null, "Por ahora esta funcionalidad solo está disponible para el Administrador General");
                    }

                    break;

                case 4:

                    StringBuilder mensajesMensaje = new StringBuilder();
                    for (Tema tema : foro.getTemas()) {
                        mensajesMensaje.append(tema);
                        mensajesMensaje.append("-------------------------------------------------------------------------------------------------------------------------------------------------------\n");
                    }
                    clearConsole();
                    Formatos.mostrarMensajesEnPaginas(mensajesMensaje.toString(), "Mensajes");
                    clearConsole();
                    break;

                case 5:
                    String inputIdB = JOptionPane.showInputDialog(null, "ID del tema:");
                    if (inputIdB == null || inputIdB.isEmpty()) {
                        break; // Salir del caso sin realizar ninguna acción
                    }
                    int idB = Integer.parseInt(inputIdB);
                    foro.deleteTema(idB, Administrador.getADMIN_GENERAL());
                    break;

                case 6:
                    String inputIdBu = JOptionPane.showInputDialog(null, "ID del tema:");
                    if (inputIdBu == null || inputIdBu.isEmpty()) {
                        break;
                    }
                    int idBu = Integer.parseInt(inputIdBu);

                    String inputNumE = JOptionPane.showInputDialog(null, "ID del mensaje:");
                    if (inputNumE == null || inputNumE.isEmpty()) {
                        break;
                    }
                    int numE = Integer.parseInt(inputNumE);

                    foro.eliminarMensaje(idBu, numE, Administrador.getADMIN_GENERAL());
                    break;

                case 7:
                    String inputIdBus = JOptionPane.showInputDialog(null, "ID del tema:");
                    if (inputIdBus == null || inputIdBus.isEmpty()) {
                        break;
                    }
                    int idBus = Integer.parseInt(inputIdBus);

                    String inputNumMen = JOptionPane.showInputDialog(null, "ID del mensaje:");
                    if (inputNumMen == null || inputNumMen.isEmpty()) {
                        break;
                    }
                    int numMen = Integer.parseInt(inputNumMen);

                    String inputNumR = JOptionPane.showInputDialog(null, "ID del comentario:");
                    if (inputNumR == null || inputNumR.isEmpty()) {
                        break;
                    }
                    int numR = Integer.parseInt(inputNumR);

                    foro.eliminarRespuesta(idBus, numMen, numR, Administrador.getADMIN_GENERAL());

                    break;

                case 8:

                    JOptionPane.showMessageDialog(null, "Sesion cerrada con éxito");
                    break;
            }

        } while (opAdmin != 8);
        Home hom = new Home();
        hom.setVisible(true);
        hom.setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_inciarSesionActionPerformed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        this.dispose();
        Home hom = new Home();
        hom.setVisible(true);
        hom.setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_volverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_crearCuenta;
    private javax.swing.JButton btn_inciarSesion;
    private javax.swing.JButton btn_volver;
    private javax.swing.JPasswordField campo_contra;
    private javax.swing.JTextField campo_user;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
