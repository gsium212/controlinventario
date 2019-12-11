/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author gsium
 */
public class windows extends JFrame  {
JPanel panel1,panel2,panel3;//panel Globales
private JTextField cliente,marca,modelo,serie,fecha;
private JButton registro,Factura,base;
private JTextArea AREA;

    public windows(JTextField cliente, JTextField marca, JTextField modelo, JTextField serie, JTextField fecha) {
        this.cliente = cliente;
        this.marca = marca;
        this.modelo = modelo;
        this.serie = serie;
        this.fecha = fecha;
    }

    public void setCliente(JTextField cliente) { /*Metodos Setters*/
        this.cliente = cliente;
    }

    public void setMarca(JTextField marca) {
        this.marca = marca;
    }

    public void setModelo(JTextField modelo) {
        this.modelo = modelo;
    }

    public void setSerie(JTextField serie) {
        this.serie = serie;
    }

    public void setFecha(JTextField fecha) {
        this.fecha = fecha;
    }

    public windows(JButton registro, JButton Factura, JButton base) {
        this.registro = registro;
        this.Factura = Factura;
        this.base = base;
    }

    public void setRegistro(JButton registro) {
        this.registro = registro;
    }

    public void setFactura(JButton Factura) {
        this.Factura = Factura;
    }

    public void setBase(JButton base) {
        this.base = base;
    }

   

    public JTextField getCliente() {
        return cliente;
    }

    public JTextField getMarca() {
        return marca;
    }

    public JTextField getModelo() {
        return modelo;
    }

    public JTextField getSerie() {
        return serie;
    }

    public JTextField getFecha() {
        return fecha;
    }

    public JButton getRegistro() {
        return registro;
    }

    public JButton getFactura() {
        return Factura;
    }

    public JButton getBase() {
        return base;
    }

    public windows(JTextArea AREA) {
        this.AREA = AREA;
    }

    public void setAREA(JTextArea AREA) {
        this.AREA = AREA;
    }

    public JTextArea getAREA() {
        return AREA;
    }
    
    


    
public windows(){
this.setSize(700, 700);
      this.setTitle("Registro de Ventas Diarias");
       this.setLocationRelativeTo(null);
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       colocarPanel();
       etiquetas();
       botones();
       cajas();
       AreaTexto();
       

}

    private void colocarPanel(){
//**************************Creacion del Panel Menu Principal**************************        
  panel1=new JPanel();
     this.getContentPane().add(panel1);
     panel1.setLayout(null);
     panel1.setBounds(10, 10, 700,700);
      panel1.setVisible(true);
      
//*****************************Creacion del Menu de Facturacion*************************      
  panel2=new JPanel();
     this.getContentPane().add(panel2);
     panel2.setLayout(null);
      panel2.setBounds(10, 10, 700, 700);
     panel2.setBackground(Color.MAGENTA);
     panel2.setVisible(false);

//***********************************Creacion del Menu de la Base de Datos***************     
     panel3=new JPanel();
     this.getContentPane().add(panel3);
     //panel3.setLayout(null);
     // panel3.setBounds(10, 10, 700, 700);
     panel3.setBackground(Color.RED);
     panel3.setVisible(false);
     
     }
public void etiquetas(){
    //*********************Etiquetas del Menu Principal************************
    JLabel E1 =new JLabel("Menu Principal");
    E1.setBounds(100,20,250,100);
    panel1.add(E1);
    
    JLabel E2=new JLabel("Facturacion");
    E2.setBounds(100,20,100,100);
    panel2.add(E2);
    
    JLabel E3=new JLabel("Base de Datos");
    E3.setBounds(100,20,100,100);
    panel3.add(E3);
    //*************************************************************************
   //***************************Etiquetas del Menu Facturacion ***************
    JLabel time=new JLabel("Fecha");
    time.setBounds(50,300,40,50);
    panel2.add(time);
    
    JLabel cl=new JLabel("Cliente");
cl.setBounds(50,240,40,50);
panel2.add(cl);
    
    
    JLabel marc=new JLabel("Marca");
    marc.setBounds(50,150,40,40);
    panel2.add(marc);
    
    JLabel model=new JLabel("Modelo");
    model.setBounds(50,180,60,40);
    panel2.add(model);
    
    JLabel seri=new JLabel("Serie");
    seri.setBounds(50,210,40,40); 
    panel2.add(seri);
    
    
    
}
public void cajas(){
    marca=new JTextField();
    modelo=new JTextField();
    serie=new JTextField();
    cliente=new JTextField();
     fecha=new JTextField();
    marca.setBounds(100,150,150,20);
    modelo.setBounds(100,180 ,150, 20);
    serie.setBounds(100, 210, 150, 20);
    cliente.setBounds(100, 240, 150, 20);
    fecha.setBounds(100, 300, 150, 20);
    panel2.add(marca);
    panel2.add(modelo);
    panel2.add(serie);
    panel2.add(cliente);
    panel2.add(fecha);
    
}
public void botones(){
    
    /* Botones Menu Principal */
   JButton RG=new JButton("Regresar");
    registro=new JButton("Regresar");
    Factura=new JButton("Facturacion");
    base=new JButton("Base de Datos");
    Factura.setBounds(10,80, 150, 20);
    base.setBounds(200,80, 150, 20);
    registro.setBounds(10,80, 150, 20);
    RG.setBounds(10,80, 150, 20);
    
    panel2.add(RG);
    panel1.add(Factura);
    panel1.add(base);
    panel3.add(registro);
    Factura.addActionListener(Fact);
    base.addActionListener(bs);
    registro.addActionListener(rg);
    RG.addActionListener(rg);
    /*Aciones de los Botones del Menu Principal*/
    
    /*Se Crean los Botones del Menu Facturacion*/
    JButton Gp2=new JButton("Guardar");
    JButton Ep2=new JButton("Limpiar");
    Gp2.setBounds(300,150,80,20);
    Ep2.setBounds(300,180,80,20);
    panel2.add(Gp2);
     panel2.add(Ep2);
            
    Gp2.addActionListener(G);
    Ep2.addActionListener(E);
}


public void AreaTexto(){
    AREA=new JTextArea(10,50);
    //AREA.setBounds(100,20 , 500, 500);
    panel3.add(AREA);
}

ActionListener Fact=new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent ae) {
        panel1.setVisible(false);
                panel3.setVisible(false);
                panel2.setVisible(true);
                
    }
    
};

ActionListener G=new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent ae) {
      JOptionPane.showMessageDialog(null, "Datos Guardados ");
      AREA.append("Cliente:"+cliente.getText()+" Fecha:"+fecha.getText()+" Marca:"+marca.getText()+" Modelo:"+modelo.getText()+" serie:"+serie.getText()+" Fecha:"+fecha.getText()+"\n");
      
    }
    
};

ActionListener bs=new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent ae) {
         panel1.setVisible(false);
         panel2.setVisible(false);
         panel3.setVisible(true);
    }
    
};

ActionListener rg=new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent ae) {
        panel1.setVisible(true);
        panel2.setVisible(false);
        panel3.setVisible(false);
    }
    
};

ActionListener E=new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent ae) {
       cliente.setText(null);
       marca.setText(null);
       modelo.setText(null);
       serie.setText(null);
       fecha.setText(null);
       
    }
    
};
        }





