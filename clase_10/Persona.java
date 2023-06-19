package clase_10;

import java.time.LocalDate;

public class Persona {
    private int id;
    private String nombre;
    private int edad;
    private LocalDate fechaNacimiento;
    private String dni;

    public Persona() {
        // Constructor vacío
    }

    public Persona(int id, String nombre, int edad, LocalDate fechaNacimiento, String dni) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
    }

    // Setters y Getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    // Método mostrar()
    public void mostrar() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        System.out.println("DNI: " + dni);
    }

    // Método esMayorDeEdad()
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }
}
