
package paquete;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;


public class avion extends aereo{
    public String turbinas;

    public avion() {
        super("400km/hr", "Comercial");
        this.turbinas = "4 Turbinas";
    }

    public String getTurbinas() {
        return turbinas;
    }

    public void setTurbinas(String turbinas) {
        this.turbinas = turbinas;
    }

    @Override
    public String info() {
        return super.info() + "\n Cantidad de Turbiinas: "+ this.turbinas; //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void dibujar(Component comp, int x) {
        Graphics lapiz = comp.getGraphics();
        lapiz.setColor(Color.CYAN);
        lapiz.fillRect(0, 0, comp.getWidth(), comp.getHeight());
        lapiz.setColor(Color.GRAY);
        lapiz.fillRect(70 + x, 10, 25, 125);
        lapiz.fillRect(30 + x, 35, 100, 25);
        lapiz.setColor(Color.CYAN);
        lapiz.drawLine(72 + x, 25, 72, 100);
        lapiz.setColor(Color.BLACK);
        lapiz.fillOval(30 + x, 30, 30, 30);
        lapiz.fillOval(98 + x, 30, 30, 30);
        lapiz.drawString("Avion Comercial", 40 + x, 100);
        
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
