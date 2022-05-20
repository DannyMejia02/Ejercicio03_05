/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marisolzhizhpon.g9_unidad03_ejercicio02;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author marisolzhizhpon
 */
public class VentanaE  extends JFrame {
    private JPanel jPanel1;
    private List<JLabel> jLabelList;
    private List<JTextField> jTextFieldList;
    private List<JPanel> jPanelList;
    private JComboBox jComboBox1;
    private JComboBox jComboBox2;
    private JComboBox jComboBox3;
    private JComboBox jComboBox4;
    private JComboBox jComboBox5;
    private JComboBox jComboBox6;
    
    public VentanaE(String title) throws HeadlessException {
        super(title);
        this.setSize(500,500);
        this.setLocation(30, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
    }
    
    public void iniciarComponentes(){
        this.jPanel1 = new JPanel();
        this.jPanel1.setBackground(Color.WHITE);
        this.jPanel1.setLayout(new GridLayout(3,1));
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarTextos();
        this.iniciarCombo();
    }
    
    public void iniciarPaneles(){
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        
        this.jPanel1.add(this.jPanelList.get(0));
        this.jPanel1.add(this.jPanelList.get(1));
        this.jPanel1.add(this.jPanelList.get(2));
        this.jPanel1.add(this.jPanelList.get(3));
        this.jPanel1.add(this.jPanelList.get(4));
        this.jPanel1.add(this.jPanelList.get(5));
        this.jPanel1.add(this.jPanelList.get(6));
    }
    
    public void iniciarEtiquetas(){
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("Sede: "));
        this.jLabelList.add(new JLabel("Campus/Extension: "));
        this.jLabelList.add(new JLabel("Carrera: "));
        this.jLabelList.add(new JLabel("Codigo del Proyecto: "));
        this.jLabelList.add(new JLabel("Modalidad: "));
        this.jLabelList.add(new JLabel("Periodo Academico: "));
        this.jLabelList.add(new JLabel("Fecha Inicio Clases: "));
        
        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jPanelList.get(1).add(this.jLabelList.get(1));
        this.jPanelList.get(2).add(this.jLabelList.get(2));
        this.jPanelList.get(3).add(this.jLabelList.get(3));
        this.jPanelList.get(4).add(this.jLabelList.get(4));
        this.jPanelList.get(5).add(this.jLabelList.get(5));
        this.jPanelList.get(6).add(this.jLabelList.get(6));
    }
    
    public void iniciarTextos(){
        this.jTextFieldList = new ArrayList<>();
        this.jTextFieldList.add(new JTextField());
        
        this.jTextFieldList.get(6).setColumns(15);
        
        this.jPanelList.get(0).add(this.jTextFieldList.get(0));
    }
    
    public void iniciarCombo(){
        this.jComboBox1 = new JComboBox();
        
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("MATRIZ CUENCA");
        this.jComboBox1.addItem("QUITO");
        this.jComboBox1.addItem("GUAYAQUIL");
        
        this.jPanelList.get(0).add(this.jComboBox1);
        
        this.jComboBox2 = new JComboBox();
        this.jComboBox2.addItem("EL VECINO");
        this.jComboBox2.addItem("GIRON");
        this.jComboBox2.addItem("CENTENARIO");
        
        this.jPanelList.get(1).add(this.jComboBox2);
        
        this.jComboBox3.addItem("ARQUITECTURA");
        this.jComboBox3.addItem("TELECOMUNICACIONES");
        this.jComboBox3.addItem("COMPUTACION");
        this.jComboBox3.addItem("ELECTRONICA");
        
        this.jPanelList.get(2).add(this.jComboBox3);
        
        this.jComboBox4.addItem("ARQUITECTURA[REDISEÑO]-NUEVA O REDISEÑ0");
        this.jComboBox4.addItem("ARQUITECTURA[NUEVA]-NUEVA O REDISEÑ0");
        this.jComboBox4.addItem("TELECOMUNICACIONES[REDISEÑO]-NUEVA O REDISEÑ0");
        this.jComboBox4.addItem("TELECOMUNICACIONES[NUEVA]-NUEVA O REDISEÑ0");
        this.jComboBox4.addItem("COMPUTACION[REDISEÑO]-NUEVA O REDISEÑ0");
        this.jComboBox4.addItem("COMPUTACION[NUEVA]-NUEVA O REDISEÑ0");
        this.jComboBox4.addItem("ELECTRONICA[REDISEÑO]-NUEVA O REDISEÑ0");
        this.jComboBox4.addItem("ELECTRONICA[NUEVA]-NUEVA O REDISEÑ0");
        
        this.jPanelList.get(3).add(this.jComboBox4);
        
        this.jComboBox5 = new JComboBox();
        this.jComboBox5.addItem("PRESENCIAL");
        this.jComboBox5.addItem("VIRTUAL");
        
        this.jPanelList.get(4).add(this.jComboBox5);
        
        this.jComboBox6 = new JComboBox();
        this.jComboBox6.addItem("2022-2022");
        this.jComboBox6.addItem("2021-2021");
        
        this.jPanelList.get(5).add(this.jComboBox6);
        
    }
    
    
    
    
    
}
