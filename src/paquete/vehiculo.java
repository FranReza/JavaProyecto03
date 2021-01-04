
package paquete;

import java.awt.Component;


abstract class vehiculo implements Comparable<vehiculo>{
    
    public String modelo;

    public vehiculo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String info(){
        return "Modelo: "+ this.modelo;
    }
    
    public abstract void dibujar(Component comp, int x);
    public abstract void mover(Component comp);

    @Override
    public int compareTo(vehiculo o) {
        vehiculo veh = (vehiculo) o;
        int valor = getModelo().compareTo(veh.getModelo());
        return (valor != 0 ? valor : getModelo().compareTo(veh.getModelo()));
    }
    
    
    
}
