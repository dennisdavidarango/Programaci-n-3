package proyectoarboln.modelo;

import proyectoarboln.exception.ArbolNException;
import java.io.Serializable;

/**
 *
 * @author walterarango
 */
public class ArbolN  implements Serializable{
    private NodoN raiz;

    public NodoN getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoN raiz) {
        this.raiz = raiz;
    }
    
    public void adicionarNodo(Empleado dato, String identificacionPadre, NodoN ayudante) throws ArbolNException{
    
    
        //Si hay datos
        //REVISAR SI EL EMPLEADO YA EXISTE
        // Encontar al papá
        //Si el papá existe lo adiciono
        
        if(raiz==null){
        
            raiz = new NodoN(dato);
            
        
        }
        else
        {
            if(buscarNodo(dato.getIdentificacion(), raiz) ==null)
            {
              //Encontrar un padre
                NodoN padreEncontrado = buscarNodo(identificacionPadre, raiz);
                if(padreEncontrado != null)
                {
                    //Encontró al padre
                    padreEncontrado.getHijos().add(new NodoN(dato));
                }
                else 
                {
                    throw new ArbolNException("Ojo el padre con identificación "+ identificacionPadre+ "no existe");
                }
            }
            else
            {
                throw new ArbolNException("Ojo el empleado con identificación "+ dato.getIdentificacion()+ "ya existe");
            }
        }
    }
    
    public NodoN buscarNodo(String identificacion, NodoN ayudante ){
        if(ayudante.getDato().getIdentificacion()==identificacion)
        {
            return ayudante;
        }
        else
        {
            //recorrer los hijos
            for(NodoN hijo: ayudante.getHijos())
            {
                NodoN nodoEncontrado = buscarNodo(identificacion, hijo);
                if(nodoEncontrado != null)
                {
                    return nodoEncontrado;
                }
            }
        }
        return null;
        
    
    }
    
}