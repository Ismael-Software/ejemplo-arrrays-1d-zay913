class Person{
    String nombre;
    String apaterno;
    int edad;


    public Persona(String nombre, String apaterno, int edad) {
        this.nombre = nombre;
        this.apaterno = apaterno;
        this.edad = edad;
    }

    public void saludar() {
        System.out.println("¡HOLA!");
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " Apellido: " + apaterno + " Edad: " + edad);
    }

    public void comer() {
        System.out.println("Estoy comiendo");
    }
}

public class Persona{
    public static void main(String[] args) {

        Persona profesor = new Persona("Luis", "Gress", 25);
        Persona alumno = new Persona("Zayuri", "Vargas", 17);
        Persona vendedor = new Persona("Jamileth", "Mayorga", 20);
        Persona chofer = new Persona("Carlos", "Ramírez", 40);

        profesor.saludar();
        profesor.comer();
        profesor.mostrarInfo();

        alumno.saludar();
        alumno.comer();
        alumno.mostrarInfo();

        vendedor.saludar();
        vendedor.comer();
        vendedor.mostrarInfo();

        chofer.saludar();
        chofer.comer();
        chofer.mostrarInfo();

        System.out.println(profesor.nombre + " " + profesor.apaterno + " " + profesor.edad);
        System.out.println(alumno.nombre + " " + alumno.apaterno + " " + alumno.edad);
        System.out.println(vendedor.nombre + " " + vendedor.apaterno + " " + vendedor.edad);
        System.out.println(chofer.nombre + " " + chofer.apaterno + " " + chofer.edad);
    }
}