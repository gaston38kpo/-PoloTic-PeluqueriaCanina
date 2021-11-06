package logica;

//import java.util.List;
import persistencia.ControladoraPersistencia;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearCliente(Cliente client) {
        controlPersis.crearCliente(client);
    }

    /*
    public void eliminarCliente(Cliente client) {
        controlPersis.eliminarCliente(client);
    }

    public void eliminarCliente(int id) {
        controlPersis.eliminarCliente(id);
    }

    public List<Cliente> obtenerClientes() {
        return controlPersis.obtenerClientes();
    }

    public void modificarCliente(Cliente client) {
        controlPersis.modificarCliente(client);
    }

    public Cliente buscarCliente(Cliente client) {
        return controlPersis.buscarCliente(client);
    }

    public Cliente buscarCliente(int id) {
        return controlPersis.buscarCliente(id);
    }
    */
}
