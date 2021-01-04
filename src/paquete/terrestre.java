package paquete;

import java.awt.Component;

class terrestre extends vehiculo{
    
    public String numRuedas;

    public terrestre(String numRuedas, String modelo) {
        super(modelo);
        this.numRuedas = numRuedas;
    }

    public String getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(String numRuedas) {
        this.numRuedas = numRuedas;
    }
    
    public String info(){
        return super.info() + "\nRuedas: " + this.numRuedas;
    }
    @Override
    public void dibujar(Component comp, int x) {}

    @Override
    public void mover(Component comp) {}
}
