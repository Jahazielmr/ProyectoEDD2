package estructuradatos2proyecto;

import java.util.ArrayList;

public class Registro {
    
    ArrayList <Campo> campos = new ArrayList();
    String nombre;

    public Registro() {
        
    }

    public Registro(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Campo> getCampos() {
        return campos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCampos(ArrayList<Campo> campos) {
        this.campos = campos;
    }
    
    public Campo getCampo(int n) {
        return campos.get(n);
    }

    public void setCampo(Campo c) {
        campos.add(c);
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    

   
    
}
