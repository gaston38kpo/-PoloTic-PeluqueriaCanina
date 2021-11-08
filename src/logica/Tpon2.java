package logica;

import igu.Pantalla;

public class Tpon2 {

    public static void main(String[] args) {
        //////////////////////////////////////
        // Creado por: Giacobini Gaston     //
        // Nombre db : peluqueria_canina    //
        // Usuario db : root (Sin password) //
        //////////////////////////////////////
        
        // Instancia de la Controladora para inicializar la persistencia
        Controladora control = new Controladora();

        // Inicializo la igu pasandole la instancia como argumento
        Pantalla panta = new Pantalla(control); // Conexion de la igu con la logica

        panta.setVisible(true); // La hace visible 
        panta.setLocationRelativeTo(null); // La centra en la pantalla
        panta.setResizable(false); // Hace que mantenga su tamaño

    }

}
