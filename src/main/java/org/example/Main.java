package org.example;

import agenda.Agenda;
import contactos.Contactos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // instanciar agenda
        Agenda miAgenda = new Agenda();

        // crear nuevo contacto
        Contactos contacto1 = new Contactos("jose","roper","lopecito@gmail.com",6664644);
        Contactos contacto2 = new Contactos("lucas","montoya","mini@hotmail.com",52562);

        contacto1.getContacto();
        contacto2.getContacto();
        //contacto1.updateContacto("lucas","plaza","pluta@hotmail.com",555353);
        //contacto1.getContacto();

        miAgenda.agregarContacto(contacto2);
        miAgenda.eliminarContacto(contacto2);

        ArrayList<Contactos> contactosRestantes = miAgenda.getContactos();
        for (Contactos contacto : contactosRestantes){
            System.out.println(contacto.getNombre());
        }
        miAgenda.mostrarContactos();

    }
}