package agenda;

import contactos.Contactos;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contactos> contactos;

    // constructor
    public Agenda() {
        this.contactos = new ArrayList<Contactos>();
    }

    // agregar un nuevo contacto
    public void agregarContacto(Contactos nuevoContacto){
        contactos.add(nuevoContacto);
    }

    // eliminar contacto
    public void eliminarContacto(Contactos contactoEliminar){
        int indice = contactos.indexOf(contactoEliminar);
        if(indice != -1){
            contactos.remove(indice);
            System.out.println("Conctacto Eliminado: " + contactoEliminar.getNombre());
        }else {
            System.out.println("Contacto no encontrado para eliminar");
        }
    }

    // mostrar contactos restantes
    public ArrayList<Contactos> getContactos(){
        return contactos;
    }

    // mostrar contactos
    public void mostrarContactos(){
        for (Contactos contacto : contactos){
            System.out.println(contacto.getNombre());
        }
    }
}
