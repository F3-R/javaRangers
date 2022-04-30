package practicaHarry;

public class Personaje {
    private String nombre;
    private String genero;
    private int edad;
    private String casa;

    public Personaje(String nombre, String genero, int edad, String casa){
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.casa = casa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    @Override
    public String toString(){
        String objeto = "";
        objeto += "\nNombre: " + nombre + "\nGenero: " + genero + "\nEdad: " + edad + "\nCasa: " + casa;
        return objeto;
    }
}
