
package paquete;

import java.awt.Component;

public class aereo extends vehiculo{
    
    public String velMaxima;

    public aereo(String velMaxima, String modelo) {
        super(modelo);
        this.velMaxima = velMaxima;
    }

    public String getVelMaxima() {
        return velMaxima;
    }

    public void setVelMaxima(String velMaxima) {
        this.velMaxima = velMaxima;
    }
    
    public String info(){
        return super.info() + "\nVelocidad Maxima: "+ this.velMaxima;
    }

    @Override
    public void dibujar(Component comp, int x) {
    }

    @Override
    public void mover(Component comp) {
    }
    
}
