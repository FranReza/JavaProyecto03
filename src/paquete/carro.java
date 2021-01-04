
package paquete;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;


public class carro extends terrestre{
    public String tipo; 

    public carro() {
        super("4 ruedas deportivas", "Ferrari");
        this.tipo = "Deportivo";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    @Override
        public String info(){
        return super.info() + "\n Tipo de carro: "+ this.tipo;
    }

    @Override
    public void dibujar(Component comp, int x) {
        Graphics lapiz = comp.getGraphics();
        lapiz.setColor(Color.CYAN);
        lapiz.fillRect(0, 0, comp.getWidth(), comp.getHeight());
        lapiz.fillOval(30 + x, 70, 50, 50);
        lapiz.setColor(Color.RED);
        lapiz.fillRect(40 + x, 40, 150, 40);
        lapiz.fillRect(40 + x, 25, 90, 20);
        lapiz.setColor(Color.CYAN);
        lapiz.fillRect(70 + x, 30, 50, 20);
        lapiz.setColor(Color.BLACK);
        lapiz.fillOval(150 + x, 70, 50, 50);
        lapiz.setColor(Color.CYAN);
        lapiz.drawLine(45 + x, 40, 100, 40);
        lapiz.setColor(Color.black);
        lapiz.drawString("Carrito Ferrari", 40 + x, 15);
        
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
