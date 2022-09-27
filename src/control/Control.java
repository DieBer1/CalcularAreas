/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionListener;
import modelo.Circulo;
import modelo.Rectangulo;
import modelo.Triangulo;
import vista.Vista;

/**
 *
 * @author estudiante
 */
public class Control implements ActionListener
{
    private Circulo circulo;
    private Rectangulo rectangulo;
    private Triangulo triangulo;
    private Vista vista;

    public Control(Circulo circulo, Rectangulo rectangulo, Triangulo triangulo, Vista vista) 
    {
        super();
        this.circulo = circulo;
        this.rectangulo = rectangulo;
        this.triangulo = triangulo;
        this.vista = vista;
        actionListener(this);
    }
    
    private void actionListener(ActionListener control  )
    {
        System.out.println("Peurrr");
        vista.btnGuardar.addActionListener(control);
        vista.btnCalcular.addActionListener(control);
        vista.btnMostrar.addActionListener(control);
    }
    
    @Override
    public void actionPerformed(ActionListener e)
    {
        try{System.out.println("action");
        }
    }
}
