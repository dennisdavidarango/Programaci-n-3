package proyectoarboln.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author walterarango
 */
public class NodoN implements Serializable{
    private Empleado dato;
    private List<NodoN> hijos;

    public NodoN(Empleado dato) {
        this.dato = dato;
        this.hijos = new ArrayList<>();
    }

    public Empleado getDato() {
        return dato;
    }

    public void setDato(Empleado dato) {
        this.dato = dato;
    }

    public List<NodoN> getHijos() {
        return hijos;
    }

    public void setHijos(List<NodoN> hijos) {
        this.hijos = hijos;
    }
    
    
    
    
}