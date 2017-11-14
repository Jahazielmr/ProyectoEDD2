package estructuradatos2proyecto;

import java.util.ArrayList;

public class Campo {
    
    String Nombre;
    String Contenido;
    ArrayList <String> contenidos = new ArrayList();
    
    public Campo() {
  
    }

    public ArrayList<String> getContenidos() {
        return contenidos;
    }

    public void setContenidos(ArrayList<String> contenidos) {
        this.contenidos = contenidos;
    }
    
    public String getContenidoA(int n) {
        return contenidos.get(n);
    }

    public void setContenidoA(String a) {
        contenidos.add(a);
    }
    
    
    public Campo(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getContenido() {
        return Contenido;
    }

    public void setContenido(String Contenido) {
        this.Contenido = Contenido;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
    
    
}
