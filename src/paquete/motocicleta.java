package paquete;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

class motocicleta extends terrestre{
    public String motor; 

    public motocicleta() {
        super("2 Turbo", "italika");
        this.motor = "GTX898 4 caballos de fuerza";
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
    
    @Override
    public String info(){
        return super.info() + "\n Modelo de Motor: "+ this.motor;
    }

    @Override
    public void dibujar(Component comp, int x) {
        Graphics lapiz = comp.getGraphics();
        lapiz.setColor(Color.CYAN);
        lapiz.fillRect(0, 0, comp.getWidth(), comp.getHeight());
        lapiz.setColor(Color.black);
        lapiz.fillOval(30 + x, 30, 50, 50);
        lapiz.setColor(Color.GREEN);
        lapiz.fillRect(40 + x, 20, 100, 40);
        lapiz.setColor(Color.BLACK);
        lapiz.fillOval(100 + x, 30, 50, 50);
        lapiz.setColor(Color.red);
        lapiz.drawLine(40 + x, 25, 90, 25);
        lapiz.setColor(Color.black);
        lapiz.drawString("Motocicleta", 40 + x, 100);
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
