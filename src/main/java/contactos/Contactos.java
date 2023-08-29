package contactos;

public class Contactos {
    private String nombre;
    private String apellido;
    private String email;
    private int telefono;

    public Contactos(String nombre, String apellido,String email,int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }


    // funcion publica
    public String getNombre(){
        return nombre;
    }

    // obtener contacto
    public void getContacto(){
        System.out.println("el nombre es: " + nombre + "el apellido es: "+apellido+" el email es: " + email+" y el telefono es: " + telefono);
    }

    // actualizar contacto
    public void updateContacto(String nuevo_nombre, String nuevo_apellido, String nuevo_email,int nuevo_telefono){
        this.nombre = nuevo_nombre;
        this.apellido = nuevo_apellido;
        this.email = nuevo_email;
        this.telefono = nuevo_telefono;
    }
}

