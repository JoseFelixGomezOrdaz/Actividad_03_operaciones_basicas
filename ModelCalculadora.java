package models;

public class ModelCalculadora {
    
    public float numero1;
    public float numero2;
    public float resultado1;
    public String resultado2;
    
    
    public float getNumero1() {
        return numero1;
    }
    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return numero2;
    }
    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    public float getResultado1() {
        return resultado1;
    }
    public void setResultado1(float resultado) {
        this.resultado1 = resultado;
    }
    
    public String getResultado2() {
        return resultado2;
    }
    public void setResultado2(String resultado2) {
        this.resultado2 = resultado2;
    }
    

    public void suma() {
        resultado1 = numero1 + numero2;
    }
    
    public void resta() {
        resultado1 = numero1 - numero2;
    }
    
    public void multiplicacion() {
        resultado1 = numero1 * numero2;
    }
    
    public void division() {
        resultado1 = numero1 / numero2;
    }
    
    public void modulo() {
        resultado1 = numero1 % numero2;
    }
    
}