
package cafeteriautm;

/**
 *Clase Base del problema de la cafeteria
 * 11/jun/25
 * @author Gris
 */
public class Producto {
    private String cveProducto;
    private String nombre;
    private float precio;
    private short existencias;

    public Producto(String cveProducto, String nombre, float precio, short existecias) {
        this.cveProducto = cveProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.existencias = existecias;
    }

    public String getCveProducto() {
        return cveProducto;
    }

    public void setCveProducto(String cveProducto) {
        this.cveProducto = cveProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public short getExistencias() {
        return existencias;
    }

    public void setExistencias(short existencias) {
        this.existencias = existencias;
    }
    
    
}
