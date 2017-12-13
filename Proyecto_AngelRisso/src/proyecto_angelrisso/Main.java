/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_angelrisso;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author HP_AMD_64
 */
public class Main extends javax.swing.JFrame {

    int inicios = 0;
    String fonts[];
    ArrayList<JLabel> labels = new ArrayList();

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        icon();
        fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
    }

    public void icon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("visio_mini1.png")));
    }

    @Override
    public void setIconImage(Image image) {
        super.setIconImage(image); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_Flujo = new javax.swing.JDialog();
        bt_inicio = new javax.swing.JButton();
        bt_if = new javax.swing.JButton();
        bt_conv = new javax.swing.JButton();
        bt_datos = new javax.swing.JButton();
        bt_conh = new javax.swing.JButton();
        jp_tabla = new javax.swing.JPanel();
        bt_while = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bt_gen = new javax.swing.JButton();
        bt_adminGuar = new javax.swing.JButton();
        jd_gen = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        tp_text = new javax.swing.JTextPane();
        pp_OP = new javax.swing.JPopupMenu();
        jmi_cambiartxt = new javax.swing.JMenuItem();
        jmi_suprimir = new javax.swing.JMenuItem();
        jmi_fuente = new javax.swing.JMenuItem();
        jmi_copy = new javax.swing.JMenuItem();
        jmi_paste = new javax.swing.JMenuItem();
        jd_guardado = new javax.swing.JDialog();
        bt_guardar = new javax.swing.JButton();
        bt_cargar = new javax.swing.JButton();
        bt_pdf = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        uemeele = new javax.swing.JDialog();
        bt_crearclases = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jp_uml = new javax.swing.JPanel();
        bt_ward = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        bt_cargaruml = new javax.swing.JButton();
        jd_clases = new javax.swing.JDialog();
        rb_pub = new javax.swing.JRadioButton();
        rb_priv = new javax.swing.JRadioButton();
        rb_pro = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        rb_int = new javax.swing.JRadioButton();
        rb_float = new javax.swing.JRadioButton();
        rb_string = new javax.swing.JRadioButton();
        tf_nom = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        bt_attCrear = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        pp_uml = new javax.swing.JPopupMenu();
        jmi_organizar = new javax.swing.JMenuItem();
        jmi_generar = new javax.swing.JMenuItem();
        bt_flujo = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        bt_inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_angelrisso/inicio.png"))); // NOI18N
        bt_inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_inicioMouseClicked(evt);
            }
        });

        bt_if.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_angelrisso/if.png"))); // NOI18N
        bt_if.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_ifMouseClicked(evt);
            }
        });

        bt_conv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_angelrisso/separador.png"))); // NOI18N
        bt_conv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_convMouseClicked(evt);
            }
        });

        bt_datos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_angelrisso/pentagon.png"))); // NOI18N
        bt_datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_datosActionPerformed(evt);
            }
        });

        bt_conh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_angelrisso/separadorh.png"))); // NOI18N
        bt_conh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_conhMouseClicked(evt);
            }
        });

        jp_tabla.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jp_tablaLayout = new javax.swing.GroupLayout(jp_tabla);
        jp_tabla.setLayout(jp_tablaLayout);
        jp_tablaLayout.setHorizontalGroup(
            jp_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1337, Short.MAX_VALUE)
        );
        jp_tablaLayout.setVerticalGroup(
            jp_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 471, Short.MAX_VALUE)
        );

        bt_while.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_angelrisso/while2.png"))); // NOI18N
        bt_while.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_whileMouseClicked(evt);
            }
        });

        jLabel3.setText("Inicio/fin");

        jLabel4.setText("dato");

        jLabel5.setText("if");

        jLabel6.setText("ciclo while");

        jLabel7.setText("connector");

        jLabel8.setText("procesos");

        bt_gen.setText("generar codigo");
        bt_gen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_genActionPerformed(evt);
            }
        });

        bt_adminGuar.setText("realizar guardado");
        bt_adminGuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_adminGuarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_FlujoLayout = new javax.swing.GroupLayout(jd_Flujo.getContentPane());
        jd_Flujo.getContentPane().setLayout(jd_FlujoLayout);
        jd_FlujoLayout.setHorizontalGroup(
            jd_FlujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_FlujoLayout.createSequentialGroup()
                .addGroup(jd_FlujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_FlujoLayout.createSequentialGroup()
                        .addGroup(jd_FlujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_FlujoLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jd_FlujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bt_if, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bt_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bt_inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bt_gen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jd_FlujoLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jLabel3)))
                        .addGroup(jd_FlujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_FlujoLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(bt_conv, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jd_FlujoLayout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jLabel6))
                            .addGroup(jd_FlujoLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(jd_FlujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bt_conh)
                                    .addComponent(bt_while)))
                            .addGroup(jd_FlujoLayout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel8))
                            .addGroup(jd_FlujoLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(bt_adminGuar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jd_FlujoLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153)
                        .addComponent(jLabel7))
                    .addGroup(jd_FlujoLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jp_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jd_FlujoLayout.setVerticalGroup(
            jd_FlujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_FlujoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jp_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(jd_FlujoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jd_FlujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_FlujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_while)
                    .addComponent(bt_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jd_FlujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_FlujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_if)
                    .addComponent(bt_conv))
                .addGroup(jd_FlujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_FlujoLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(bt_datos))
                    .addGroup(jd_FlujoLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_conh, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jd_FlujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_gen, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(bt_adminGuar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );

        jScrollPane2.setViewportView(tp_text);

        jd_gen.getContentPane().add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jmi_cambiartxt.setText("Cambiar color");
        jmi_cambiartxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_cambiartxtActionPerformed(evt);
            }
        });
        pp_OP.add(jmi_cambiartxt);

        jmi_suprimir.setText("suprimir");
        jmi_suprimir.setToolTipText("");
        jmi_suprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_suprimirActionPerformed(evt);
            }
        });
        pp_OP.add(jmi_suprimir);

        jmi_fuente.setText("cambio de fuen te");
        jmi_fuente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_fuenteActionPerformed(evt);
            }
        });
        pp_OP.add(jmi_fuente);

        jmi_copy.setText("copiar");
        jmi_copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_copyActionPerformed(evt);
            }
        });
        pp_OP.add(jmi_copy);

        jmi_paste.setText("pegar");
        jmi_paste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_pasteActionPerformed(evt);
            }
        });
        pp_OP.add(jmi_paste);

        jd_guardado.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_guardar.setText("GUARDAR FLUJO");
        bt_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_guardarActionPerformed(evt);
            }
        });
        jd_guardado.getContentPane().add(bt_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 106, -1, 39));

        bt_cargar.setText("CARGAR FLUJO");
        bt_cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cargarActionPerformed(evt);
            }
        });
        jd_guardado.getContentPane().add(bt_cargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 106, -1, 39));

        bt_pdf.setText("PDF");
        bt_pdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pdfActionPerformed(evt);
            }
        });
        jd_guardado.getContentPane().add(bt_pdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 70, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_angelrisso/amala cilinder.jpg"))); // NOI18N
        jd_guardado.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 4, 460, 340));

        bt_crearclases.setText("Clase nueva");
        bt_crearclases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_crearclasesActionPerformed(evt);
            }
        });

        jButton3.setText("generar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jp_uml.setBackground(new java.awt.Color(204, 255, 255));
        jp_uml.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_umlMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jp_umlLayout = new javax.swing.GroupLayout(jp_uml);
        jp_uml.setLayout(jp_umlLayout);
        jp_umlLayout.setHorizontalGroup(
            jp_umlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
        );
        jp_umlLayout.setVerticalGroup(
            jp_umlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        bt_ward.setText("guardar como png");
        bt_ward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_wardActionPerformed(evt);
            }
        });

        jButton1.setText("guardar como SOTA2");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        bt_cargaruml.setText("cargar");

        javax.swing.GroupLayout uemeeleLayout = new javax.swing.GroupLayout(uemeele.getContentPane());
        uemeele.getContentPane().setLayout(uemeeleLayout);
        uemeeleLayout.setHorizontalGroup(
            uemeeleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uemeeleLayout.createSequentialGroup()
                .addGroup(uemeeleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(uemeeleLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(uemeeleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bt_crearclases, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_ward, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(uemeeleLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(bt_cargaruml)))
                .addGap(34, 34, 34)
                .addComponent(jp_uml, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        uemeeleLayout.setVerticalGroup(
            uemeeleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uemeeleLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(bt_crearclases)
                .addGap(63, 63, 63)
                .addComponent(jButton3)
                .addGap(31, 31, 31)
                .addComponent(bt_ward)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addComponent(bt_cargaruml)
                .addGap(37, 37, 37))
            .addGroup(uemeeleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jp_uml, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        buttonGroup1.add(rb_pub);
        rb_pub.setSelected(true);
        rb_pub.setText("public");

        buttonGroup1.add(rb_priv);
        rb_priv.setText("private");

        buttonGroup1.add(rb_pro);
        rb_pro.setText("protected");

        jLabel10.setText("tipo de variable");

        jLabel11.setText("tipo de variable");

        buttonGroup2.add(rb_int);
        rb_int.setSelected(true);
        rb_int.setText("int");

        buttonGroup2.add(rb_float);
        rb_float.setText("float");

        buttonGroup2.add(rb_string);
        rb_string.setText("string");

        jLabel12.setText("Nombre");

        bt_attCrear.setText("crear");
        bt_attCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_attCrearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_clasesLayout = new javax.swing.GroupLayout(jd_clases.getContentPane());
        jd_clases.getContentPane().setLayout(jd_clasesLayout);
        jd_clasesLayout.setHorizontalGroup(
            jd_clasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_clasesLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(jd_clasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_clasesLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(39, 39, 39)
                        .addGroup(jd_clasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tf_nom)
                            .addGroup(jd_clasesLayout.createSequentialGroup()
                                .addGroup(jd_clasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jd_clasesLayout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel10))
                                    .addGroup(jd_clasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(rb_pro)
                                        .addComponent(rb_pub, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rb_priv, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(71, 71, 71)
                                .addGroup(jd_clasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rb_int)
                                    .addComponent(jLabel11)
                                    .addComponent(rb_float)
                                    .addComponent(rb_string))))
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_clasesLayout.createSequentialGroup()
                        .addComponent(bt_attCrear)
                        .addGap(164, 164, 164))))
        );
        jd_clasesLayout.setVerticalGroup(
            jd_clasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_clasesLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jd_clasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addGroup(jd_clasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jd_clasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_priv)
                    .addComponent(rb_int))
                .addGap(18, 18, 18)
                .addGroup(jd_clasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_pub)
                    .addComponent(rb_float))
                .addGap(18, 18, 18)
                .addGroup(jd_clasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_pro)
                    .addComponent(rb_string))
                .addGap(74, 74, 74)
                .addComponent(bt_attCrear)
                .addContainerGap())
        );

        jmi_organizar.setText("modificar");
        jmi_organizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_organizarActionPerformed(evt);
            }
        });
        pp_uml.add(jmi_organizar);

        jmi_generar.setText("generar codigo");
        jmi_generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_generarActionPerformed(evt);
            }
        });
        pp_uml.add(jmi_generar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PROYECTO");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_flujo.setText("Flujograma");
        bt_flujo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_flujoMouseClicked(evt);
            }
        });
        getContentPane().add(bt_flujo, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 270, 120, 59));

        jButton2.setText("UML");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 110, 50));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BIENVENIDO AL GENERADOR/ VISIO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 56, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_angelrisso/High-tech-background-blue-styles-vector-01.jpg"))); // NOI18N
        jLabel2.setText("     ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 550, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_flujoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_flujoMouseClicked
        jd_Flujo.setVisible(true);
        jd_Flujo.setModal(true);
        jd_Flujo.pack();
        jd_Flujo.setLocationRelativeTo(this);
    }//GEN-LAST:event_bt_flujoMouseClicked

    private void bt_inicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_inicioMouseClicked
        if (inicios == 0) {
            JLabel lbl_inicio;
            lbl_inicio = new JLabel();
            lbl_inicio.setOpaque(true);
            lbl_inicio.getName();
            lbl_inicio.setName("Inicio");
            labels.add(0, lbl_inicio);
            lbl_inicio.setLocation(10, 150);

            lbl_inicio.setIcon(new ImageIcon(".\\src\\proyecto_angelrisso\\Proceso.png"));
            lbl_inicio.setText("INICIO");
            this.jp_tabla.add(lbl_inicio);
            lbl_inicio.setMaximumSize(new Dimension(100, 100));
            lbl_inicio.setMinimumSize(new Dimension(100, 100));
            lbl_inicio.setLocation(new Point(20, 20));
            lbl_inicio.setPreferredSize(new Dimension(100, 100));
            lbl_inicio.setSize(100, 70);
            lbl_inicio.setBackground(Color.BLUE);
            lbl_inicio.setHorizontalTextPosition(SwingConstants.CENTER);
            lbl_inicio.setHorizontalTextPosition(SwingConstants.CENTER);
            lbl_inicio.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                public void mouseDragged(java.awt.event.MouseEvent evt) {
                    jl_this = lbl_inicio;
                    if ((lbl_inicio.getLocation().x + evt.getX() - lbl_inicio.getWidth() / 2) >= 0
                            && (lbl_inicio.getLocation().x + evt.getX() - lbl_inicio.getWidth() / 2) <= 800) {
                        lbl_inicio.setLocation(lbl_inicio.getLocation().x + evt.getX() - lbl_inicio.getWidth() / 2,
                                lbl_inicio.getLocation().y + evt.getY() - lbl_inicio.getHeight() / 2);

                    }

                }
            });
            lbl_inicio.addMouseListener(new MouseListener() {
                public void mouseClicked(MouseEvent evt) {
                    jl_this = lbl_inicio;
                    if (evt.isMetaDown()) {
                        jl_this = lbl_inicio;
                        System.out.println(jl_this);
                        System.out.println(lbl_inicio.getText());
                        pp_OP.show(evt.getComponent(), evt.getX(), evt.getY());
                    }
                }

                public void mouseEntered(MouseEvent arg0) {
                    jl_this = lbl_inicio;
                }

                public void mouseExited(MouseEvent arg0) {
                    jl_this = lbl_inicio;
                }

                public void mousePressed(MouseEvent arg0) {
                    jl_this = lbl_inicio;
                }

                public void mouseReleased(MouseEvent arg0) {
                    jl_this = lbl_inicio;
                }
            });
            inicios++;
        } else if (inicios == 1) {
            int response = JOptionPane.showConfirmDialog(jd_Flujo, "crear final? si crea final se terminara la operacion", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.OK_OPTION) {
                JLabel lbl_inicio;
                lbl_inicio = new JLabel();
                lbl_inicio.setOpaque(true);
                lbl_inicio.getName();
                lbl_inicio.setName("fin");

                this.jp_tabla.add(lbl_inicio);
                labels.add(lbl_inicio);
                lbl_inicio.setLocation(10, 150);
                lbl_inicio.setIcon(new ImageIcon(".\\src\\proyecto_angelrisso\\Proceso.png"));
                lbl_inicio.setText("FIN");
                lbl_inicio.setMaximumSize(new Dimension(100, 100));
                lbl_inicio.setMinimumSize(new Dimension(100, 100));
                lbl_inicio.setLocation(new Point(20, 20));
                lbl_inicio.setPreferredSize(new Dimension(100, 100));
                lbl_inicio.setSize(100, 70);
                lbl_inicio.setBackground(Color.BLUE);
                lbl_inicio.setHorizontalTextPosition(SwingConstants.CENTER);
                lbl_inicio.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                    public void mouseDragged(java.awt.event.MouseEvent evt) {
                        jl_this = lbl_inicio;
                        if ((lbl_inicio.getLocation().x + evt.getX() - lbl_inicio.getWidth() / 2) >= 0
                                && (lbl_inicio.getLocation().x + evt.getX() - lbl_inicio.getWidth() / 2) <= 800) {
                            lbl_inicio.setLocation(lbl_inicio.getLocation().x + evt.getX() - lbl_inicio.getWidth() / 2,
                                    lbl_inicio.getLocation().y + evt.getY() - lbl_inicio.getHeight() / 2);

                        }

                    }
                });
                lbl_inicio.addMouseListener(new MouseListener() {
                    public void mouseClicked(MouseEvent evt) {
                        jl_this = lbl_inicio;
                        if (evt.isMetaDown()) {
                            jl_this = lbl_inicio;
                            System.out.println(jl_this);
                            System.out.println(lbl_inicio.getText());
                            pp_OP.show(evt.getComponent(), evt.getX(), evt.getY());
                        }
                    }

                    public void mouseEntered(MouseEvent arg0) {
                        jl_this = lbl_inicio;
                    }

                    public void mouseExited(MouseEvent arg0) {
                        jl_this = lbl_inicio;
                    }

                    public void mousePressed(MouseEvent arg0) {
                        jl_this = lbl_inicio;
                    }

                    public void mouseReleased(MouseEvent arg0) {
                        jl_this = lbl_inicio;
                    }
                });
            }
        }
    }//GEN-LAST:event_bt_inicioMouseClicked

    private void bt_whileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_whileMouseClicked
        if (c_finwh == 0) {
            c_finwh++;
            JLabel lbl_wh;
            lbl_wh = new JLabel();
            lbl_wh.setOpaque(true);
            lbl_wh.getName();
            lbl_wh.setName("While" + c_wh);
            c_wh++;

            labels.add(lbl_wh);
            lbl_wh.setLocation(10, 150);
            lbl_wh.setBackground(Color.yellow);
            lbl_wh.setIcon(new ImageIcon(".\\src\\proyecto_angelrisso\\while2.png"));
            String s = JOptionPane.showInputDialog("ingrese que va a validar, debe de ser verdadero o si no error en compilado");
            lbl_wh.setText(s);
            this.jp_tabla.add(lbl_wh);
            lbl_wh.setMaximumSize(new Dimension(100, 100));
            lbl_wh.setMinimumSize(new Dimension(100, 100));
            lbl_wh.setLocation(new Point(20, 20));
            lbl_wh.setPreferredSize(new Dimension(100, 100));
            lbl_wh.setSize(90, 90);
            lbl_wh.setHorizontalTextPosition(SwingConstants.CENTER);
            lbl_wh.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                public void mouseDragged(java.awt.event.MouseEvent evt) {
                    jl_this = lbl_wh;
                    if ((lbl_wh.getLocation().x + evt.getX() - lbl_wh.getWidth() / 2) >= 0
                            && (lbl_wh.getLocation().x + evt.getX() - lbl_wh.getWidth() / 2) <= 800) {
                        lbl_wh.setLocation(lbl_wh.getLocation().x + evt.getX() - lbl_wh.getWidth() / 2,
                                lbl_wh.getLocation().y + evt.getY() - lbl_wh.getHeight() / 2);

                    }

                }
            });
            lbl_wh.addMouseListener(new MouseListener() {
                public void mouseClicked(MouseEvent evt) {
                    jl_this = lbl_wh;
                    if (evt.isMetaDown()) {
                        jl_this = lbl_wh;
                        System.out.println(jl_this);
                        System.out.println(lbl_wh.getText());
                        pp_OP.show(evt.getComponent(), evt.getX(), evt.getY());
                    }
                }

                public void mouseEntered(MouseEvent arg0) {
                    jl_this = lbl_wh;
                }

                public void mouseExited(MouseEvent arg0) {
                    jl_this = lbl_wh;
                }

                public void mousePressed(MouseEvent arg0) {
                    jl_this = lbl_wh;
                }

                public void mouseReleased(MouseEvent arg0) {
                    jl_this = lbl_wh;
                }
            });
        } else if (c_finwh > 0) {
            int r = JOptionPane.showConfirmDialog(jd_Flujo, "tiene usted " + c_finwh + " while abiertos,\nsi decide que no, se creara otro if",
                    "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (r != JOptionPane.OK_OPTION) {
                c_finwh--;
                JLabel lbl_wh;
                lbl_wh = new JLabel();
                lbl_wh.setOpaque(true);
                lbl_wh.getName();
                lbl_wh.setName("While" + c_wh);
                this.jp_tabla.add(lbl_wh);

                lbl_wh.setLocation(10, 150);

                lbl_wh.setBackground(Color.orange);
                lbl_wh.setIcon(new ImageIcon(".\\src\\proyecto_angelrisso\\while2.png"));
                String s = JOptionPane.showInputDialog("ingrese que va a validar, debe de ser verdadero o si no error en compilado");
                lbl_wh.setText(s);
                lbl_wh.setMaximumSize(new java.awt.Dimension(100, 100));
                lbl_wh.setMinimumSize(new Dimension(100, 100));
                lbl_wh.setLocation(new Point(20, 20));
                lbl_wh.setPreferredSize(new Dimension(50, 50));
                lbl_wh.setSize(100, 64);
                lbl_wh.setHorizontalTextPosition(SwingConstants.CENTER);
                jl_this = lbl_wh;
                labels.add(lbl_wh);
                lbl_wh.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                    public void mouseDragged(java.awt.event.MouseEvent evt) {
                        jl_this = lbl_wh;
                        if ((lbl_wh.getLocation().x + evt.getX() - lbl_wh.getWidth() / 2) >= 0
                                && (lbl_wh.getLocation().x + evt.getX() - lbl_wh.getWidth() / 2) <= 800) {
                            lbl_wh.setLocation(lbl_wh.getLocation().x + evt.getX() - lbl_wh.getWidth() / 2,
                                    lbl_wh.getLocation().y + evt.getY() - lbl_wh.getHeight() / 2);
                        }

                    }
                });
                lbl_wh.addMouseListener(new MouseListener() {
                    public void mouseClicked(MouseEvent evt) {
                        jl_this = lbl_wh;
                        if (evt.isMetaDown()) {
                            jl_this = lbl_wh;
                            System.out.println(jl_this);
                            pp_OP.show(evt.getComponent(), evt.getX(), evt.getY());
                        }
                    }

                    public void mouseEntered(MouseEvent arg0) {
                        jl_this = lbl_wh;
                    }

                    public void mouseExited(MouseEvent arg0) {
                        jl_this = lbl_wh;
                    }

                    public void mousePressed(MouseEvent arg0) {
                        jl_this = lbl_wh;
                    }

                    public void mouseReleased(MouseEvent arg0) {
                        jl_this = lbl_wh;
                    }
                });
            } else {
                c_finwh++;
                JLabel lbl_finwh;
                lbl_finwh = new JLabel();
                lbl_finwh.setOpaque(true);
                lbl_finwh.getName();
                lbl_finwh.setName("finwh" + c_finwh);
                this.jp_tabla.add(lbl_finwh);

                lbl_finwh.setLocation(10, 150);
                lbl_finwh.setHorizontalTextPosition(SwingConstants.CENTER);
                lbl_finwh.setBackground(Color.orange);
                lbl_finwh.setIcon(new ImageIcon(".\\src\\proyecto_angelrisso\\while2.png"));
                lbl_finwh.setText("}");
                lbl_finwh.setMaximumSize(new java.awt.Dimension(100, 100));
                lbl_finwh.setMinimumSize(new Dimension(100, 100));
                lbl_finwh.setLocation(new Point(20, 20));
                lbl_finwh.setPreferredSize(new Dimension(50, 50));
                lbl_finwh.setSize(100, 64);
                jl_this = lbl_finwh;
                labels.add(lbl_finwh);
                lbl_finwh.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                    public void mouseDragged(java.awt.event.MouseEvent evt) {
                        jl_this = lbl_finwh;
                        if ((lbl_finwh.getLocation().x + evt.getX() - lbl_finwh.getWidth() / 2) >= 0
                                && (lbl_finwh.getLocation().x + evt.getX() - lbl_finwh.getWidth() / 2) <= 800) {
                            lbl_finwh.setLocation(lbl_finwh.getLocation().x + evt.getX() - lbl_finwh.getWidth() / 2,
                                    lbl_finwh.getLocation().y + evt.getY() - lbl_finwh.getHeight() / 2);
                        }

                    }
                });
                lbl_finwh.addMouseListener(new MouseListener() {
                    public void mouseClicked(MouseEvent evt) {
                        jl_this = lbl_finwh;
                        if (evt.isMetaDown()) {
                            jl_this = lbl_finwh;
                            System.out.println(jl_this);
                            pp_OP.show(evt.getComponent(), evt.getX(), evt.getY());
                        }
                    }

                    public void mouseEntered(MouseEvent arg0) {
                        jl_this = lbl_finwh;
                    }

                    public void mouseExited(MouseEvent arg0) {
                        jl_this = lbl_finwh;
                    }

                    public void mousePressed(MouseEvent arg0) {
                        jl_this = lbl_finwh;
                    }

                    public void mouseReleased(MouseEvent arg0) {
                        jl_this = lbl_finwh;
                    }
                });
            }
        }


    }//GEN-LAST:event_bt_whileMouseClicked

    private void bt_ifMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_ifMouseClicked
        if (c_finif == 0) {

            JLabel lbl_if;
            lbl_if = new JLabel();
            lbl_if.setOpaque(true);
            lbl_if.getName();
            System.out.println(lbl_if.getName());
            lbl_if.setName("if" + c_if);
            System.out.println(lbl_if.getName());
            this.jp_tabla.add(lbl_if);

            lbl_if.setLocation(10, 150);

            lbl_if.setBackground(Color.orange);
            lbl_if.setIcon(new ImageIcon(".\\src\\proyecto_angelrisso\\if.png"));
            String s = JOptionPane.showInputDialog("ingrese que va a validar, debe de ser verdadero o si no error en compilado");
            lbl_if.setText(s);
            lbl_if.setMaximumSize(new java.awt.Dimension(100, 100));
            lbl_if.setMinimumSize(new Dimension(100, 100));
            lbl_if.setLocation(new Point(20, 20));
            lbl_if.setPreferredSize(new Dimension(50, 50));
            c_finif++;
            lbl_if.setSize(100, 64);
            jl_this = lbl_if;
            labels.add(lbl_if);
            lbl_if.setHorizontalTextPosition(SwingConstants.CENTER);
            lbl_if.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                public void mouseDragged(java.awt.event.MouseEvent evt) {
                    jl_this = lbl_if;
                    if ((lbl_if.getLocation().x + evt.getX() - lbl_if.getWidth() / 2) >= 0
                            && (lbl_if.getLocation().x + evt.getX() - lbl_if.getWidth() / 2) <= 800) {
                        lbl_if.setLocation(lbl_if.getLocation().x + evt.getX() - lbl_if.getWidth() / 2,
                                lbl_if.getLocation().y + evt.getY() - lbl_if.getHeight() / 2);
                    }

                }
            });
            lbl_if.addMouseListener(new MouseListener() {
                public void mouseClicked(MouseEvent evt) {
                    jl_this = lbl_if;
                    if (evt.isMetaDown()) {
                        jl_this = lbl_if;
                        System.out.println(jl_this);
                        pp_OP.show(evt.getComponent(), evt.getX(), evt.getY());
                    }
                }

                public void mouseEntered(MouseEvent arg0) {
                    jl_this = lbl_if;
                }

                public void mouseExited(MouseEvent arg0) {
                    jl_this = lbl_if;
                }

                public void mousePressed(MouseEvent arg0) {
                    jl_this = lbl_if;
                }

                public void mouseReleased(MouseEvent arg0) {
                    jl_this = lbl_if;
                }
            });
        } else if (c_finif > 0) {
            int r = JOptionPane.showConfirmDialog(jd_Flujo, "tiene usted " + c_finif + " ifs abiertos,\nsi decide que no, se creara otro if",
                    "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (r != JOptionPane.OK_OPTION) {
                c_finif--;
                JLabel lbl_if;
                lbl_if = new JLabel();
                lbl_if.setOpaque(true);
                lbl_if.getName();
                lbl_if.setName("if" + c_if);
                this.jp_tabla.add(lbl_if);

                lbl_if.setLocation(10, 150);

                lbl_if.setBackground(Color.orange);
                lbl_if.setIcon(new ImageIcon(".\\src\\proyecto_angelrisso\\if.png"));
                String s = JOptionPane.showInputDialog("ingrese que va a validar, debe de ser verdadero o si no error en compilado");
                lbl_if.setText(s);
                lbl_if.setMaximumSize(new java.awt.Dimension(100, 100));
                lbl_if.setMinimumSize(new Dimension(100, 100));
                lbl_if.setLocation(new Point(20, 20));
                lbl_if.setPreferredSize(new Dimension(50, 50));
                lbl_if.setSize(100, 64);
                lbl_if.setHorizontalTextPosition(SwingConstants.CENTER);
                jl_this = lbl_if;
                labels.add(lbl_if);
                lbl_if.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                    public void mouseDragged(java.awt.event.MouseEvent evt) {
                        jl_this = lbl_if;
                        if ((lbl_if.getLocation().x + evt.getX() - lbl_if.getWidth() / 2) >= 0
                                && (lbl_if.getLocation().x + evt.getX() - lbl_if.getWidth() / 2) <= 800) {
                            lbl_if.setLocation(lbl_if.getLocation().x + evt.getX() - lbl_if.getWidth() / 2,
                                    lbl_if.getLocation().y + evt.getY() - lbl_if.getHeight() / 2);
                        }

                    }
                });
                lbl_if.addMouseListener(new MouseListener() {
                    public void mouseClicked(MouseEvent evt) {
                        jl_this = lbl_if;
                        if (evt.isMetaDown()) {
                            jl_this = lbl_if;
                            System.out.println(jl_this);
                            pp_OP.show(evt.getComponent(), evt.getX(), evt.getY());
                        }
                    }

                    public void mouseEntered(MouseEvent arg0) {
                        jl_this = lbl_if;
                    }

                    public void mouseExited(MouseEvent arg0) {
                        jl_this = lbl_if;
                    }

                    public void mousePressed(MouseEvent arg0) {
                        jl_this = lbl_if;
                    }

                    public void mouseReleased(MouseEvent arg0) {
                        jl_this = lbl_if;
                    }
                });
            } else {
                c_finif++;
                JLabel lbl_finif;
                lbl_finif = new JLabel();
                lbl_finif.setOpaque(true);
                lbl_finif.getName();
                lbl_finif.setName("finif" + c_finif);
                this.jp_tabla.add(lbl_finif);

                lbl_finif.setLocation(10, 150);

                lbl_finif.setBackground(Color.orange);
                lbl_finif.setIcon(new ImageIcon(".\\src\\proyecto_angelrisso\\if.png"));
                lbl_finif.setText("}");
                lbl_finif.setHorizontalTextPosition(SwingConstants.CENTER);
                lbl_finif.setMaximumSize(new java.awt.Dimension(100, 100));
                lbl_finif.setMinimumSize(new Dimension(100, 100));
                lbl_finif.setLocation(new Point(20, 20));
                lbl_finif.setPreferredSize(new Dimension(50, 50));
                lbl_finif.setSize(100, 64);
                jl_this = lbl_finif;
                labels.add(lbl_finif);
                lbl_finif.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                    public void mouseDragged(java.awt.event.MouseEvent evt) {
                        jl_this = lbl_finif;
                        if ((lbl_finif.getLocation().x + evt.getX() - lbl_finif.getWidth() / 2) >= 0
                                && (lbl_finif.getLocation().x + evt.getX() - lbl_finif.getWidth() / 2) <= 800) {
                            lbl_finif.setLocation(lbl_finif.getLocation().x + evt.getX() - lbl_finif.getWidth() / 2,
                                    lbl_finif.getLocation().y + evt.getY() - lbl_finif.getHeight() / 2);
                        }

                    }
                });
                lbl_finif.addMouseListener(new MouseListener() {
                    public void mouseClicked(MouseEvent evt) {
                        jl_this = lbl_finif;
                        if (evt.isMetaDown()) {
                            jl_this = lbl_finif;
                            System.out.println(jl_this);
                            pp_OP.show(evt.getComponent(), evt.getX(), evt.getY());
                        }
                    }

                    public void mouseEntered(MouseEvent arg0) {
                        jl_this = lbl_finif;
                    }

                    public void mouseExited(MouseEvent arg0) {
                        jl_this = lbl_finif;
                    }

                    public void mousePressed(MouseEvent arg0) {
                        jl_this = lbl_finif;
                    }

                    public void mouseReleased(MouseEvent arg0) {
                        jl_this = lbl_finif;
                    }
                });
            }
        }
    }//GEN-LAST:event_bt_ifMouseClicked

    private void bt_convMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_convMouseClicked
        JLabel lbl_sv;
        lbl_sv = new JLabel();
        lbl_sv.getName();
        lbl_sv.setOpaque(true);
        lbl_sv.setName("lbl_sv" + c_sv);
        c_sv++;
        jp_tabla.add(lbl_sv);

        lbl_sv.setBackground(Color.MAGENTA);
        lbl_sv.setLocation(10, 200);
        String s = JOptionPane.showInputDialog("Ingrese que va a hacer con esto\nejemplo, n+m, debe contener un dato existente"
                + "\nsino, error de compilado");
        lbl_sv.setText(s);
        lbl_sv.setHorizontalTextPosition(SwingConstants.CENTER);
        lbl_sv.setIcon(new ImageIcon("src\\separador.png"));
        lbl_sv.setMaximumSize(new java.awt.Dimension(100, 100));
        lbl_sv.setMinimumSize(new Dimension(100, 100));
        lbl_sv.setLocation(new Point(20, 20));
        lbl_sv.setPreferredSize(new Dimension(50, 50));
        lbl_sv.setSize(6, 100);
        jl_this = lbl_sv;
        labels.add(lbl_sv);
        lbl_sv.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jl_this = lbl_sv;
                if ((lbl_sv.getLocation().x + evt.getX() - lbl_sv.getWidth() / 2) >= 0
                        && (lbl_sv.getLocation().x + evt.getX() - lbl_sv.getWidth() / 2) <= 800) {
                    lbl_sv.setLocation(lbl_sv.getLocation().x + evt.getX() - lbl_sv.getWidth() / 2,
                            lbl_sv.getLocation().y + evt.getY() - lbl_sv.getHeight() / 2);
                }

            }
        });
        lbl_sv.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent evt) {
                jl_this = lbl_sv;
                if (evt.isMetaDown()) {
                    System.out.println(jl_this);
                    pp_OP.show(evt.getComponent(), evt.getX(), evt.getY());

                }
            }

            public void mouseEntered(MouseEvent arg0) {
                jl_this = lbl_sv;
            }

            public void mouseExited(MouseEvent arg0) {
                jl_this = lbl_sv;
            }

            public void mousePressed(MouseEvent arg0) {
                jl_this = lbl_sv;
            }

            public void mouseReleased(MouseEvent arg0) {
                jl_this = lbl_sv;
            }
        });
    }//GEN-LAST:event_bt_convMouseClicked

    private void bt_conhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_conhMouseClicked
        JLabel lbl_sv;
        lbl_sv = new JLabel();
        lbl_sv.getName();
        lbl_sv.setOpaque(true);
        lbl_sv.setName("lbl_sv" + c_sv);
        c_sv++;

        lbl_sv.setLocation(10, 200);
        JOptionPane.showInputDialog("Ingrese un dato o processo que vaya a utilizar en esto");
        lbl_sv.setIcon(new ImageIcon("separadorh.png"));
        lbl_sv.setMaximumSize(new java.awt.Dimension(100, 100));
        lbl_sv.setMinimumSize(new Dimension(100, 100));
        lbl_sv.setLocation(new Point(20, 20));
        lbl_sv.setPreferredSize(new Dimension(50, 50));
        lbl_sv.setSize(100, 40);
        jl_this = lbl_sv;
        labels.add(lbl_sv);
        jp_tabla.add(lbl_sv);
        lbl_sv.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jl_this = lbl_sv;
                if ((lbl_sv.getLocation().x + evt.getX() - lbl_sv.getWidth() / 2) >= 0
                        && (lbl_sv.getLocation().x + evt.getX() - lbl_sv.getWidth() / 2) <= 800) {
                    lbl_sv.setLocation(lbl_sv.getLocation().x + evt.getX() - lbl_sv.getWidth() / 2,
                            lbl_sv.getLocation().y + evt.getY() - lbl_sv.getHeight() / 2);
                }

            }
        });
        lbl_sv.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent evt) {
                jl_this = lbl_sv;
                if (evt.isMetaDown()) {
                    System.out.println(jl_this);
                    pp_OP.show(evt.getComponent(), evt.getX(), evt.getY());

                }
            }

            public void mouseEntered(MouseEvent arg0) {
                jl_this = lbl_sv;
            }

            public void mouseExited(MouseEvent arg0) {
                jl_this = lbl_sv;
            }

            public void mousePressed(MouseEvent arg0) {
                jl_this = lbl_sv;
            }

            public void mouseReleased(MouseEvent arg0) {
                jl_this = lbl_sv;
            }
        });
    }//GEN-LAST:event_bt_conhMouseClicked

    private void bt_genActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_genActionPerformed
        File archivo = new File("./archv.txt");
        FileWriter fw = null;
        BufferedWriter bw = null;
        for (JLabel l : labels) {
            if (l.getName().equals("Inicio")) {
                try {
                    fw = new FileWriter(archivo, false);
                    bw = new BufferedWriter(fw);
                    bw.write("#include <iostream>\n"
                            + "#include<string>\n"
                            + "using namespace std;\n"
                            + "int main(int argc, char** argv) {\n");
                    bw.flush();
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (l.getName().equals("if" + c_if)) {
                try {
                    // String cosas = l.getText();
                    String cosas = "Hola como te va";
                    fw = new FileWriter(archivo, true);
                    bw = new BufferedWriter(fw);
                    bw.write("if(" + cosas + "){\n"
                            + " \n");
                    bw.flush();

                } catch (IOException e) {

                }
            }
            if (l.getName().equals("finif" + c_finif)) {
                try {
                    fw = new FileWriter(archivo, true);
                    bw = new BufferedWriter(fw);
                    bw.write("}");
                    bw.flush();
                } catch (Exception e) {
                }
            }
            if (l.getName().equals("lbl_wh")) {
                try {
                    String streng = " ";
                    fw = new FileWriter(archivo, true);
                    bw = new BufferedWriter(fw);
                    bw.write("while(" + streng + ")");
                    bw.flush();

                } catch (IOException e) {
                }
            }
            if (l.getName().equals("lbl_finwh")) {
                try {
                    fw = new FileWriter(archivo, true);
                    bw = new BufferedWriter(fw);
                    bw.write("}");
                } catch (Exception e) {
                }
            }
            if (l.getName().equals("lbl_sv" + c_sv)) {
                try {

                    fw = new FileWriter(archivo, true);
                    bw = new BufferedWriter(fw);
                    bw.write(l.getText());
                    bw.flush();
                } catch (IOException iOException) {
                }
            }
            if (l.getName().equals("fin")) {
                try {
                    fw = new FileWriter(archivo, true);
                    bw = new BufferedWriter(fw);
                    bw.write("return 0;\n"
                            + "}");
                    bw.flush();

                } catch (IOException iOException) {
                }

            }
        }
        try {
            bw.close();
            fw.close();
        } catch (IOException iOException) {
        }
        tp_text.removeAll();
        String streng = archv("./archv.txt");
        tp_text.setText(streng);
        JOptionPane.showMessageDialog(jd_Flujo, "generando, presione ok para continuar");

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
        jd_gen.setModal(true);
        jd_gen.setVisible(true);
        jd_gen.setLocationRelativeTo(jd_Flujo);
        jd_gen.pack();

    }//GEN-LAST:event_bt_genActionPerformed
    public String archv(String str) {
        FileReader fr = null;
        BufferedReader br = null;
        String st = "";
        String lin = "";
        try {
            fr = new FileReader(str);
            br = new BufferedReader(fr);
            while ((lin = br.readLine()) != null) {
                st += lin + "\n";
            }
        } catch (Exception e) {
        } finally {
            try {
                br.close();
                fr.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return st;
    }
    private void bt_datosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_datosActionPerformed
        String dato = JOptionPane.showInputDialog(this.jd_Flujo, "ingrese un nombre de variable");
        JLabel lbl_dato;
        lbl_dato = new JLabel();
        lbl_dato.getName();
        lbl_dato.setOpaque(true);
        lbl_dato.setName("lbl_dato" + c_dato);
        lbl_dato.setText(dato);
        lbl_dato.setBackground(Color.green);
        c_sv++;
        jp_tabla.add(lbl_dato);
        labels.add(lbl_dato);
        lbl_dato.setLocation(10, 200);
        lbl_dato.setIcon(new ImageIcon(".\\src\\proyecto_angelrisso\\pentagon.png"));
        lbl_dato.setMaximumSize(new java.awt.Dimension(100, 100));
        lbl_dato.setMinimumSize(new Dimension(100, 100));
        lbl_dato.setLocation(new Point(20, 20));
        lbl_dato.setPreferredSize(new Dimension(100, 100));
        lbl_dato.setSize(100, 100);
        jl_this = lbl_dato;

        lbl_dato.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jl_this = lbl_dato;
                if ((lbl_dato.getLocation().x + evt.getX() - lbl_dato.getWidth() / 2) >= 0
                        && (lbl_dato.getLocation().x + evt.getX() - lbl_dato.getWidth() / 2) <= 800) {
                    lbl_dato.setLocation(lbl_dato.getLocation().x + evt.getX() - lbl_dato.getWidth() / 2,
                            lbl_dato.getLocation().y + evt.getY() - lbl_dato.getHeight() / 2);
                }

            }
        });
        lbl_dato.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent evt) {
                jl_this = lbl_dato;
                if (evt.isMetaDown()) {
                    System.out.println(jl_this);
                    pp_OP.show(evt.getComponent(), evt.getX(), evt.getY());
                }
            }

            public void mouseEntered(MouseEvent arg0) {
                jl_this = lbl_dato;
            }

            public void mouseExited(MouseEvent arg0) {
                jl_this = lbl_dato;
            }

            public void mousePressed(MouseEvent arg0) {
                jl_this = lbl_dato;
            }

            public void mouseReleased(MouseEvent arg0) {
                jl_this = lbl_dato;
            }
        });
    }//GEN-LAST:event_bt_datosActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        uemeele.pack();
        uemeele.setModal(true);
        uemeele.setLocationRelativeTo(this);
        uemeele.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jmi_cambiartxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_cambiartxtActionPerformed
        Color color = JColorChooser.showDialog(jd_Flujo, "ingrese  nuevo color de imagen", Color.yellow);
        jl_this.setBackground(color);
    }//GEN-LAST:event_jmi_cambiartxtActionPerformed

    private void jmi_suprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_suprimirActionPerformed

        int response = JOptionPane.showConfirmDialog(jd_Flujo, "Eliminar?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.OK_OPTION) {
            if (jl_this.getName().equals("Inicio") || jl_this.getName().equals("fin")) {
                JOptionPane.showMessageDialog(jd_Flujo, "no se puede eliminar un inicio o un fin");
            } else {
                jp_tabla.remove(jl_this);
                labels.remove(jl_this);
            }
        }
        jp_tabla.repaint();
    }//GEN-LAST:event_jmi_suprimirActionPerformed

    private void jmi_fuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_fuenteActionPerformed

    }//GEN-LAST:event_jmi_fuenteActionPerformed

    private void bt_cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cargarActionPerformed
        JFileChooser jfc = new JFileChooser();
        int r = jfc.showOpenDialog(jd_guardado);
        if (r == JFileChooser.APPROVE_OPTION) {
            cargarOguardar cog = new cargarOguardar(jfc.getSelectedFile().getPath());
            cog.cargar();
            for (JLabel lbl : cog.getLabel()) {
                labels.add(lbl);
                jp_tabla.add(lbl);
                lbl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                    public void mouseDragged(java.awt.event.MouseEvent evt) {
                        jl_this = lbl;
                        if ((lbl.getLocation().x + evt.getX() - lbl.getWidth() / 2) >= 0
                                && (lbl.getLocation().x + evt.getX() - lbl.getWidth() / 2) <= 800) {
                            lbl.setLocation(lbl.getLocation().x + evt.getX() - lbl.getWidth() / 2,
                                    lbl.getLocation().y + evt.getY() - lbl.getHeight() / 2);
                        }

                    }
                });
                lbl.addMouseListener(new MouseListener() {
                    public void mouseClicked(MouseEvent evt) {
                        jl_this = lbl;
                        if (evt.isMetaDown()) {
                            System.out.println(jl_this);
                            pp_OP.show(evt.getComponent(), evt.getX(), evt.getY());
                        }
                    }

                    public void mouseEntered(MouseEvent arg0) {
                        jl_this = lbl;
                    }

                    public void mouseExited(MouseEvent arg0) {
                        jl_this = lbl;
                    }

                    public void mousePressed(MouseEvent arg0) {
                        jl_this = lbl;
                    }

                    public void mouseReleased(MouseEvent arg0) {
                        jl_this = lbl;
                    }
                });
            }
            JOptionPane.showMessageDialog(jd_guardado, "flujo cargado");
            jp_tabla.repaint();
        }
    }//GEN-LAST:event_bt_cargarActionPerformed

    private void bt_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_guardarActionPerformed
        String[] buttons = {"png", "jpeg", "No", "Cancel"};

        int rc = JOptionPane.showOptionDialog(null, "En que va a guardar, conste que siempre se crea un\n"
                + "archivo binario", "Confirmation",
                JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[2]);
        System.out.println(rc);
        if (rc == 0) {
            JFileChooser jfc = new JFileChooser();
            int op = jfc.showSaveDialog(jd_Flujo);
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Imagen png", "png");
            jfc.addChoosableFileFilter(filtro);
            if (op == JFileChooser.APPROVE_OPTION) {
                Dimension d = jp_tabla.getSize();
                BufferedImage image = new BufferedImage(d.width, d.height, BufferedImage.TYPE_INT_RGB);
                jp_tabla.paint(image.getGraphics());
                try {
                    ImageIO.write(image, "png", new File(jfc.getSelectedFile().getPath() + ".png"));
                    path = jfc.getSelectedFile().getPath();
                    System.out.println(path);

                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                cargarOguardar cog = new cargarOguardar(jfc.getSelectedFile().getPath() + ".SOTA");
                for (JLabel t : labels) {
                    cog.getLabel().add(t);
                }
                cog.cargar();
                try {
                    cog.crear();
                } catch (Exception e) {

                }
                JOptionPane.showMessageDialog(jd_Flujo, "Imagen y binario guardados exitosamente");
            }

        } else if (rc == 1) {

        }
    }//GEN-LAST:event_bt_guardarActionPerformed

    private void bt_adminGuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_adminGuarActionPerformed
        jd_guardado.pack();
        jd_guardado.setLocationRelativeTo(jd_Flujo);
        jd_guardado.setModal(false);
        jd_guardado.setVisible(true);
    }//GEN-LAST:event_bt_adminGuarActionPerformed

    private void bt_pdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pdfActionPerformed
        JFileChooser jfc = new JFileChooser();
        int op = jfc.showSaveDialog(jd_guardado);
        if (op == JFileChooser.APPROVE_OPTION) {
            try {
                System.out.println(path);
                Document document = new Document(PageSize.A4);
                PdfWriter.getInstance(document, new FileOutputStream(jfc.getSelectedFile().getPath() + ".pdf"));
                document.open();
                com.itextpdf.text.Image imagen = com.itextpdf.text.Image.getInstance(path + ".png");
                imagen.scaleAbsolute(500, 500);
                imagen.setAlignment(Element.ALIGN_CENTER);
                document.add(imagen);
                document.close();

            } catch (FileNotFoundException ex) {
            } catch (DocumentException | IOException ex) {
            }

        }
        JOptionPane.showMessageDialog(jd_guardado, "guardado como pdf, de alguna manera");
    }//GEN-LAST:event_bt_pdfActionPerformed

    private void bt_crearclasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_crearclasesActionPerformed

        String nombre = JOptionPane.showInputDialog("Ingrese nombre de la clase");
        JPanel panel;
        panel = new JPanel();
        panel.setBackground(Color.blue);
        JLabel titulo = new JLabel();
        titulo.setText(nombre);
        panel.add(titulo);
        jp_uml.add(panel);
        titulo.setLocation(10, 100);
        titulo.setOpaque(true);
        titulo.setBackground(Color.orange);
        titulo.setHorizontalTextPosition(SwingConstants.CENTER);
        titulo.setSize(100, 65);
        panel.setLocation(10, 200);
        panel.setSize(150, 150);
        clases cc = new clases(panel);
        clase.add(cc);
        cc.getLista().add(titulo);

        este = panel;
        panel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                este = panel;
                este.setLocation(este.getLocation().x + evt.getX() - este.getWidth() / 2,
                        este.getLocation().y + evt.getY() - este.getHeight() / 2);
            }
        });

        panel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                este = panel;
                if (evt.isMetaDown()) {
                    este = panel;
                    pp_uml.show(evt.getComponent(), evt.getX(), evt.getY());
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                este = panel;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                este = panel;
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                este = panel;
            }

            @Override
            public void mouseExited(MouseEvent e) {
                este = panel;
            }
        });

    }//GEN-LAST:event_bt_crearclasesActionPerformed

    private void bt_attCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_attCrearActionPerformed

    }//GEN-LAST:event_bt_attCrearActionPerformed

    private void jmi_copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_copyActionPerformed
        ctrlv.add(jl_this);
        JOptionPane.showMessageDialog(jd_Flujo, "copiado");
    }//GEN-LAST:event_jmi_copyActionPerformed

    private void jmi_pasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_pasteActionPerformed
        for (JLabel j : ctrlv) {
            labels.add(j);
            jp_tabla.add(j);
            jp_tabla.repaint();
        }
        JOptionPane.showMessageDialog(jd_Flujo, "pegado");
    }//GEN-LAST:event_jmi_pasteActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        File archivo = new File("./archivo1.txt");
        FileWriter fw = null;
        BufferedWriter bw = null;
        for (clases clase : clase) {
            if (este.equals(clase.getClase())) {
                try {
                    fw = new FileWriter(archivo, true);
                    bw = new BufferedWriter(fw);
                    bw.write("#include<iostream>");
                    bw.write("\n");
                    bw.write("#include <string>");
                    bw.write("\n");
                    bw.write("#ifndef" + " " + clase.getLista().get(0).getText().toUpperCase() + "_CPP");
                    bw.write("\n");
                    bw.write("#define" + " " + clase.getLista().get(0).getText().toUpperCase() + "_CPP");
                    bw.write("\n");
                    bw.write("using namespace std;");
                    bw.write("\n");
                    bw.write("class" + " " + clase.getLista().get(0).getText() + "{");
                    bw.write("\n");
                    bw.write(" " + "private:");
                    bw.write("\n");
                    for (JLabel label : clase.getLista()) {
                        if (label.getText().contains("private")) {
                            bw.write("  " + label.getText().replace("private", ""));
                            bw.write(";");
                            bw.write("\n");
                            con++;
                        }
                    }
                    bw.write(" " + "protected:");
                    bw.write("\n");
                    for (JLabel label : clase.getLista()) {
                        if (label.getText().contains("protected")) {
                            bw.write("  " + label.getText().replace("protected", ""));
                            bw.write(";");
                            bw.write("\n");
                            con++;
                        }
                    }
                    bw.write(" " + "public:");
                    bw.write("\n");
                    for (JLabel label : clase.getLista()) {
                        if (label.getText().contains("public")) {
                            bw.write("  " + label.getText().replace("public", ""));
                            bw.write(";");
                            bw.write("\n");
                            con++;
                        }
                    }
                    bw.write("  " + clase.getLista().get(0).getText() + "()" + "{");
                    bw.write("\n");

                    for (JLabel label : clase.getLista()) {
                        if (label.getText().contains("int")) {
                            if (label.getText().contains("private")) {
                                bw.write("   " + label.getText().replace("private", "").replace("int", "") + "=1");
                                bw.write(";");
                                bw.write("\n");
                            }
                            if (label.getText().contains("protected")) {
                                bw.write("   " + label.getText().replace("protected", "").replace("int", "") + "=1");
                                bw.write(";");
                                bw.write("\n");
                            }
                            if (label.getText().contains("public")) {
                                bw.write("   " + label.getText().replace("public", "").replace("int", "") + "=1");
                                bw.write(";");
                                bw.write("\n");
                            }
                        }
                        if (label.getText().contains("double")) {
                            if (label.getText().contains("private")) {
                                bw.write("   " + label.getText().replace("private", "").replace("double", "") + "=1");
                                bw.write(";");
                                bw.write("\n");
                            }
                            if (label.getText().contains("protected")) {
                                bw.write("   " + label.getText().replace("protected", "").replace("double", "") + "=1");
                                bw.write(";");
                                bw.write("\n");
                            }
                            if (label.getText().contains("public")) {
                                bw.write("   " + label.getText().replace("public", "").replace("double", "") + "=1");
                                bw.write(";");
                                bw.write("\n");
                            }
                        }
                        if (label.getText().contains("string")) {
                            if (label.getText().contains("private")) {
                                bw.write("   " + label.getText().replace("private", "").replace("string", "") + "=\"Hola\"");
                                bw.write(";");
                                bw.write("\n");
                            }
                            if (label.getText().contains("protected")) {
                                bw.write("   " + label.getText().replace("protected", "").replace("string", "") + "=\"Hola\"");
                                bw.write(";");
                                bw.write("\n");
                            }
                            if (label.getText().contains("public")) {
                                bw.write("   " + label.getText().replace("public", "").replace("string", "") + "=\"Hola\"");
                                bw.write(";");
                                bw.write("\n");
                            }
                        }
                    }
                    bw.write("  " + "}");
                    bw.write("\n");
                    bw.write("  " + clase.getLista().get(0).getText());
                    bw.write("(");
                    bw.write("int valor,double decimal,string cadena");
                    bw.write(")");
                    bw.write("{");
                    bw.write("\n");
                    for (JLabel label : clase.getLista()) {
                        if (label.getText().contains("int")) {
                            if (label.getText().contains("private")) {
                                bw.write("    " + label.getText().replace("private", "").replace("int", "") + "=valor");
                                bw.write(";");
                                bw.write("\n");
                            }
                            if (label.getText().contains("protected")) {
                                bw.write("    " + label.getText().replace("protected", "").replace("int", "") + "=valor");
                                bw.write(";");
                                bw.write("\n");
                            }
                            if (label.getText().contains("public")) {
                                bw.write("    " + label.getText().replace("public", "").replace("int", "") + "=valor");
                                bw.write(";");
                                bw.write("\n");
                            }
                        }
                        if (label.getText().contains("double")) {
                            if (label.getText().contains("private")) {
                                bw.write("    " + label.getText().replace("private", "").replace("double", "") + "=decimal");
                                bw.write(";");
                                bw.write("\n");
                            }
                            if (label.getText().contains("protected")) {
                                bw.write("    " + label.getText().replace("protected", "").replace("double", "") + "=decimal");
                                bw.write(";");
                                bw.write("\n");
                            }
                            if (label.getText().contains("public")) {
                                bw.write("    " + label.getText().replace("public", "").replace("double", "") + "=decimal");
                                bw.write(";");
                                bw.write("\n");
                            }
                        }
                        if (label.getText().contains("string")) {
                            if (label.getText().contains("private")) {
                                bw.write("    " + label.getText().replace("private", "").replace("string", "") + "=cadena");
                                bw.write(";");
                                bw.write("\n");
                            }
                            if (label.getText().contains("protected")) {
                                bw.write("    " + label.getText().replace("protected", "").replace("string", "") + "=cadena");
                                bw.write(";");
                                bw.write("\n");
                            }
                            if (label.getText().contains("public")) {
                                bw.write("    " + label.getText().replace("public", "").replace("string", "") + "=cadena");
                                bw.write(";\n");

                            }
                        }
                    }
                    bw.write(" " + "}");
                    bw.write("\n");
                    bw.write("};");
                    bw.write("\n");
                    bw.write("#endif\n");

                    bw.write("#include <iostream>\n"
                            + "\"#include\" + '\"' + clase.getLista().get(0).getText() + \".cpp\" + '\"'" + "\n"
                            + "using namespace std;\n"
                            + "int main(){\n"
                            + "return 0;\n"
                            + "}\n");
                    bw.flush();

                    try {
                        bw.close();
                        fw.close();
                    } catch (IOException ex) {
                    }
                } catch (IOException ex) {
                }
                tp_text.removeAll();
                String codigo = archv("./archivo1.txt");
                tp_text.setText(codigo);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                }
                JOptionPane.showMessageDialog(uemeele, "Codigo de la clase generado exitosamente");

            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jp_umlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_umlMouseClicked
        if (evt.isMetaDown()) {
            pp_uml.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jp_umlMouseClicked

    private void jmi_organizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_organizarActionPerformed
        String cosa = "";
        String nombre = "";
        String tipo = "";
        if (rb_pub.isSelected()) {
            cosa = "public";
        }
        if (rb_priv.isSelected()) {
            cosa = "private";
        }
        if (rb_pro.isSelected()) {
            cosa = "protected";
        }
        if (rb_float.isSelected()) {
            tipo = "double";
        }
        if (rb_int.isSelected()) {
            tipo = "int";
        }
        if (rb_string.isSelected()) {
            tipo = "string";
        }
        nombre = tf_nom.getText();
        JLabel atributo = new JLabel();
        cont += 100;
        atributo.setText(cosa + " " + tipo + " " + nombre);
        atributo.setLocation(este.getX(), este.getY() + cont);
        atributo.setOpaque(true);
        atributo.setBackground(Color.ORANGE);
        atributo.setHorizontalTextPosition(SwingConstants.CENTER);
        atributo.setSize(100, 65);
        for (clases c : clase) {
            if (c.getClase().equals(este)) {
                este.add(atributo);
                c.getLista().add(atributo);

            }
        }
        este.revalidate();
        este.repaint();
        jp_uml.revalidate();
        jp_uml.repaint();
        jd_clases.dispose();

        JOptionPane.showMessageDialog(uemeele, "Atributo agregado correctamente");
    }//GEN-LAST:event_jmi_organizarActionPerformed

    private void jmi_generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_generarActionPerformed
        File archivo = new File("./archivuml.txt");
        FileWriter fw = null;
        BufferedWriter bw = null;
        for (clases clase : clase) {
            if (este.equals(clase.getClase())) {
                try {
                    fw = new FileWriter(archivo, true);
                    bw = new BufferedWriter(fw);
                    bw.write("#include<iostream>");
                    bw.write("\n");
                    bw.write("#include <string>");
                    bw.write("\n");
                    bw.write("#ifndef" + " " + clase.getLista().get(0).getText().toUpperCase() + "_CPP");
                    bw.write("\n");
                    bw.write("#define" + " " + clase.getLista().get(0).getText().toUpperCase() + "_CPP");
                    bw.write("\n");
                    bw.write("using namespace std;");
                    bw.write("\n");
                    bw.write("class" + " " + clase.getLista().get(0).getText() + "{");
                    bw.write("\n");
                    bw.write(" " + "private:");
                    bw.write("\n");
                    for (JLabel label : clase.getLista()) {
                        if (label.getText().contains("private")) {
                            bw.write("  " + label.getText().replace("private", ""));
                            bw.write(";");
                            bw.write("\n");
                            con++;
                        }
                    }
                    bw.write(" " + "protected:");
                    bw.write("\n");
                    for (JLabel label : clase.getLista()) {
                        if (label.getText().contains("protected")) {
                            bw.write("  " + label.getText().replace("protected", ""));
                            bw.write(";");
                            bw.write("\n");
                            con++;
                        }
                    }
                    bw.write(" " + "public:");
                    bw.write("\n");
                    for (JLabel label : clase.getLista()) {
                        if (label.getText().contains("public")) {
                            bw.write("  " + label.getText().replace("public", ""));
                            bw.write(";");
                            bw.write("\n");
                            con++;
                        }
                    }
                    bw.write("  " + clase.getLista().get(0).getText() + "()" + "{");
                    bw.write("\n");

                    for (JLabel label : clase.getLista()) {
                        if (label.getText().contains("int")) {
                            if (label.getText().contains("private")) {
                                bw.write("   " + label.getText().replace("private", "").replace("int", "") + "=1");
                                bw.write(";");
                                bw.write("\n");
                            }
                            if (label.getText().contains("protected")) {
                                bw.write("   " + label.getText().replace("protected", "").replace("int", "") + "=1");
                                bw.write(";");
                                bw.write("\n");
                            }
                            if (label.getText().contains("public")) {
                                bw.write("   " + label.getText().replace("public", "").replace("int", "") + "=1");
                                bw.write(";");
                                bw.write("\n");
                            }
                        }
                        if (label.getText().contains("double")) {
                            if (label.getText().contains("private")) {
                                bw.write("   " + label.getText().replace("private", "").replace("double", "") + "=1");
                                bw.write(";");
                                bw.write("\n");
                            }
                            if (label.getText().contains("protected")) {
                                bw.write("   " + label.getText().replace("protected", "").replace("double", "") + "=1");
                                bw.write(";");
                                bw.write("\n");
                            }
                            if (label.getText().contains("public")) {
                                bw.write("   " + label.getText().replace("public", "").replace("double", "") + "=1");
                                bw.write(";");
                                bw.write("\n");
                            }
                        }
                        if (label.getText().contains("string")) {
                            if (label.getText().contains("private")) {
                                bw.write("   " + label.getText().replace("private", "").replace("string", "") + "=\"Hola\"");
                                bw.write(";");
                                bw.write("\n");
                            }
                            if (label.getText().contains("protected")) {
                                bw.write("   " + label.getText().replace("protected", "").replace("string", "") + "=\"Hola\"");
                                bw.write(";");
                                bw.write("\n");
                            }
                            if (label.getText().contains("public")) {
                                bw.write("   " + label.getText().replace("public", "").replace("string", "") + "=\"Hola\"");
                                bw.write(";");
                                bw.write("\n");
                            }
                        }
                    }
                    bw.write("  " + "}");
                    bw.write("\n");
                    bw.write("  " + clase.getLista().get(0).getText());
                    bw.write("(");
                    bw.write("int valor,double decimal,string cadena");
                    bw.write(")");
                    bw.write("{");
                    bw.write("\n");
                    for (JLabel label : clase.getLista()) {
                        if (label.getText().contains("int")) {
                            if (label.getText().contains("private")) {
                                bw.write("    " + label.getText().replace("private", "").replace("int", "") + "=valor");
                                bw.write(";");
                                bw.write("\n");
                            }
                            if (label.getText().contains("protected")) {
                                bw.write("    " + label.getText().replace("protected", "").replace("int", "") + "=valor");
                                bw.write(";");
                                bw.write("\n");
                            }
                            if (label.getText().contains("public")) {
                                bw.write("    " + label.getText().replace("public", "").replace("int", "") + "=valor");
                                bw.write(";");
                                bw.write("\n");
                            }
                        }
                        if (label.getText().contains("double")) {
                            if (label.getText().contains("private")) {
                                bw.write("    " + label.getText().replace("private", "").replace("double", "") + "=decimal");
                                bw.write(";");
                                bw.write("\n");
                            }
                            if (label.getText().contains("protected")) {
                                bw.write("    " + label.getText().replace("protected", "").replace("double", "") + "=decimal");
                                bw.write(";");
                                bw.write("\n");
                            }
                            if (label.getText().contains("public")) {
                                bw.write("    " + label.getText().replace("public", "").replace("double", "") + "=decimal");
                                bw.write(";");
                                bw.write("\n");
                            }
                        }
                        if (label.getText().contains("string")) {
                            if (label.getText().contains("private")) {
                                bw.write("    " + label.getText().replace("private", "").replace("string", "") + "=cadena");
                                bw.write(";");
                                bw.write("\n");
                            }
                            if (label.getText().contains("protected")) {
                                bw.write("    " + label.getText().replace("protected", "").replace("string", "") + "=cadena");
                                bw.write(";");
                                bw.write("\n");
                            }
                            if (label.getText().contains("public")) {
                                bw.write("    " + label.getText().replace("public", "").replace("string", "") + "=cadena");
                                bw.write(";");
                                bw.write("\n");
                            }
                        }
                    }
                    bw.write(" " + "}");
                    bw.write("\n");
                    bw.write("};");
                    bw.write("\n");
                    bw.write("#endif");
                    bw.write("\n");
                    bw.write("\n");
                    bw.write("#include <iostream>\n"
                            + "\"#include\" + '\"' + clase.getLista().get(0).getText() + \".cpp\" + '\"'" + "\n"
                            + "using namespace std;\n"
                            + "int main(){\n"
                            + "return 0;\n"
                            + "}"
                            + ""
                            + "");
                    bw.flush();

                    try {
                        bw.close();
                        fw.close();
                    } catch (IOException ex) {
                    }
                } catch (IOException ex) {
                }
                tp_text.removeAll();
                String codigo = archv("./archivuml.txt");
                tp_text.setText(codigo);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                }
                JOptionPane.showMessageDialog(uemeele, "Codigo de la clase generado exitosamente");

            }
        }
    }//GEN-LAST:event_jmi_generarActionPerformed

    private void bt_wardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_wardActionPerformed
        JFileChooser jfc = new JFileChooser();
        int op = jfc.showSaveDialog(uemeele);
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Imagen png", "png");
        jfc.addChoosableFileFilter(filtro);
        if (op == JFileChooser.APPROVE_OPTION) {
            Dimension d = jp_uml.getSize();
            BufferedImage image = new BufferedImage(d.width, d.height, BufferedImage.TYPE_INT_RGB);
            jp_uml.paint(image.getGraphics());
            try {
                ImageIO.write(image, "png", new File(jfc.getSelectedFile().getPath() + ".png"));
                path = jfc.getSelectedFile().getPath();
                System.out.println(path);

            } catch (IOException ex) {
            }
            JOptionPane.showMessageDialog(uemeele, "Imagen guardada exitosamente");
        }
    }//GEN-LAST:event_bt_wardActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser jfc = new JFileChooser();
        int op = jfc.showSaveDialog(uemeele);
        if (op == JFileChooser.APPROVE_OPTION) {
            umlcargar uml = new umlcargar(jfc.getSelectedFile().getPath() + ".SOTA2");
            for (clases clase : clase) {
                uml.getClases().add(clase);

            }
            uml.cargarArchivo();
            try {
                uml.escribirArchivo();
            } catch (IOException ex) {

            }
            JOptionPane.showMessageDialog(uemeele, "UML guardado exitosamente, como SOTA2");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_adminGuar;
    private javax.swing.JButton bt_attCrear;
    private javax.swing.JButton bt_cargar;
    private javax.swing.JButton bt_cargaruml;
    private javax.swing.JButton bt_conh;
    private javax.swing.JButton bt_conv;
    private javax.swing.JButton bt_crearclases;
    private javax.swing.JButton bt_datos;
    private javax.swing.JButton bt_flujo;
    private javax.swing.JButton bt_gen;
    private javax.swing.JButton bt_guardar;
    private javax.swing.JButton bt_if;
    private javax.swing.JButton bt_inicio;
    private javax.swing.JButton bt_pdf;
    private javax.swing.JButton bt_ward;
    private javax.swing.JButton bt_while;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JDialog jd_Flujo;
    private javax.swing.JDialog jd_clases;
    private javax.swing.JDialog jd_gen;
    private javax.swing.JDialog jd_guardado;
    private javax.swing.JMenuItem jmi_cambiartxt;
    private javax.swing.JMenuItem jmi_copy;
    private javax.swing.JMenuItem jmi_fuente;
    private javax.swing.JMenuItem jmi_generar;
    private javax.swing.JMenuItem jmi_organizar;
    private javax.swing.JMenuItem jmi_paste;
    private javax.swing.JMenuItem jmi_suprimir;
    private javax.swing.JPanel jp_tabla;
    private javax.swing.JPanel jp_uml;
    private javax.swing.JPopupMenu pp_OP;
    private javax.swing.JPopupMenu pp_uml;
    private javax.swing.JRadioButton rb_float;
    private javax.swing.JRadioButton rb_int;
    private javax.swing.JRadioButton rb_priv;
    private javax.swing.JRadioButton rb_pro;
    private javax.swing.JRadioButton rb_pub;
    private javax.swing.JRadioButton rb_string;
    private javax.swing.JTextField tf_nom;
    private javax.swing.JTextPane tp_text;
    private javax.swing.JDialog uemeele;
    // End of variables declaration//GEN-END:variables
    String path;
    JLabel jl_this = null;
    int c_if = 0;
    int c_dato = 0;
    int c_wh = 0;
    int c_sv = 0;
    int c_sh = 0;
    int c_finif = 0;
    int c_finwh = 0;
    JPanel este = null;
    int cont = 0;
    int con = 0;
    ArrayList<clases> clase = new ArrayList();
    ArrayList<JLabel> ctrlv = new ArrayList();
}
