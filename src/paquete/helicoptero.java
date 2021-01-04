
package paquete;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;


public class helicoptero extends aereo{
    public String asientos; 

    public helicoptero() {
        super("200km/hr", "Privado");
        this.asientos = "4";
    }

    public String getAsientos() {
        return asientos;
    }

    public void setAsientos(String asientos) {
        this.asientos = asientos;
    }

    @Override
    public String info() {
        return super.info() + "\nCantidad de asientos: "+ this.asientos; //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void dibujar(Component comp, int x) {
        Graphics lapiz = comp.getGraphics();
        lapiz.setColor(Color.CYAN);
        lapiz.fillRect(0, 0, comp.getWidth(), comp.getHeight()); // ---
        lapiz.setColor(Color.GRAY);
        lapiz.fillOval(30 + x, 30, 70, 70);
        lapiz.setColor(Color.gray);
        lapiz.fillRect(60 + x, 40, 70, 35);
        lapiz.setColor(Color.red);
        lapiz.fillRect(130 + x, 25, 20, 50);
        lapiz.setColor(Color.BLACK);
        lapiz.drawLine(50 + x, 10, 70, 60);
        lapiz.drawLine(30 + x, 20, 40, 35);
        lapiz.drawString("Helicoptero fachero", 20 + x, 150);
        
    }

    @Override
    public void mover(Component comp) {
        for (int i = 1; i <= 300; i+=3) {
            dibujar(comp, i);
            try {
                Thread.sleep(36L);
            } catch (InterruptedException ex) {
                System.out.println("No funciona");
            }   
        }    
    }
}
