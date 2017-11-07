package estructuradatos2proyecto;

public class Campo {
    
    String Nombre;
    String Contenido;
    
    public Campo() {
  
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
        return "Nombre: "+Nombre+ ", Contenido: "+ Contenido;
    }
    
    
    
}
