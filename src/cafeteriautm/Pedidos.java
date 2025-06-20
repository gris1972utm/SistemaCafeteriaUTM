package cafeteriautm;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * 11/06/25 Clase que levanta los pedidos de los clientes
 *
 * @author gris
 */
public class Pedidos {

    Pedidos numPedido;
    String fecha;
    String hora;
    Cliente idCliente;
    int totalProductos;
    float subtotal;
    float total;
    float descuento;
    ArrayList<Comida> productosPedidosComida = new ArrayList<>();
    ArrayList<Integer> productosCantidadPedidosComida = new ArrayList<>();
    ArrayList<Bebidas> productosPedidosBebida = new ArrayList<>();
    ArrayList<Integer> productosCantidadPedidosBebida = new ArrayList<>();

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

      

    public Pedidos(Pedidos numPedido, String fecha, String hora, Cliente idCliente, int totalProductos, float subtotal) {
        this.numPedido = numPedido;
        this.fecha = fecha;
        this.hora = hora;
        this.idCliente = idCliente;
        this.totalProductos = totalProductos;
        this.subtotal = subtotal;
        
       
    }
    
    public Pedidos(){
        this.numPedido =null;
        this.fecha = "";
        this.hora = "";
        this.idCliente = null;
        this.totalProductos = 0;
        this.subtotal = 0;
    }
    
    

    public int getTotalProductos() {
        return totalProductos;
       
    }

    public void setTotalProductos(int totalProductos) {
        this.totalProductos = totalProductos;
    }


    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public Pedidos getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(Pedidos numPedido) {
        this.numPedido = numPedido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public void mostrarPedido() {
        System.out.println("Cve: " + this.numPedido
                + " - Fecha: " + this.fecha
                + " - Hora: " + this.hora
                + "- Cliente: " + this.idCliente.getNombre());
    }
    
       public void mostrarPedidoFinal() {
        System.out.println("Cve: " + this.numPedido
                + " - Fecha: " + this.fecha
                + " - Hora: " + this.hora
                + "- Cliente: " + this.idCliente.getNombre()
                +" -No productos: "+this.getTotalProductos()
                +  " Total venta: " + this.getSubtotal());
                 
    }
}
