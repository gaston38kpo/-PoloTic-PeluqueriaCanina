package persistencia;

import logica.Cliente;
//import java.util.List;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {

    ClienteJpaController clientJPA = new ClienteJpaController();

    // Alta
    public void crearCliente(Cliente client) {
        try {
            clientJPA.create(client);
        } catch (Exception e) {
            System.out.println("No se pudo crear el huesped: " + e.getMessage());
        }
    }

    // Baja (Dos metodos porque se sobrecarga para ambos inputs)
    /*
    public void eliminarCliente(Cliente client) {
        try {
            clientJPA.destroy(client.getId());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarCliente(int id) {
        try {
            clientJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Lectura
    
    public List<Cliente> obtenerClientes(){
        return clientJPA.findClienteEntities();        
    }
    
    // Modificacion
    
    public void modificarCliente(Cliente client) {
        try {
            clientJPA.edit(client);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Busqueda
    
    public Cliente buscarCliente(Cliente client) {
        return clientJPA.findCliente(client.getId());
    }

    public Cliente buscarCliente(int id) {
        return clientJPA.findCliente(id);
    }
     */
}
