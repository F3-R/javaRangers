import java.awt.*;

public class SpiderMan {
    private String nombre;
    private String alias;
    private String genero;
    private String universo;

    public SpiderMan() {
    }

    public SpiderMan(String nombre, String alias, String genero, String universo) {
        this.nombre = nombre;
        this.alias = alias;
        this.genero = genero;
        this.universo = universo;
    }

    public java.lang.String getNombre() {
        return nombre;
    }

    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }

    public java.lang.String getAlias() {
        return alias;
    }

    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }

    public java.lang.String getGenero() {
        return genero;
    }

    public void setGenero(java.lang.String genero) {
        this.genero = genero;
    }

    public java.lang.String getUniverso() {
        return universo;
    }

    public void setUniverso(java.lang.String universo) {
        this.universo = universo;
    }

    public void persistent(Screen s, Color c) {
        // Hace lo mismo que persisten(Screen s) pero acepta un color personalizado
        String outName = nombre + "\n";
        String outInfo = "\n\uD83D\uDD78 Universo: " + universo + "\n\uD83D\uDD78 Alias: " + alias + "\n\uD83D\uDD78 Genero: " + genero + "\n\n";
        s.out(outName, "Comic Sans MS", 30, c);
        s.out(outInfo, "MV Boli", 20, Colors.PrestigeBlue);
    }

    // Muestra la descripcion del Poder en turno
    public void powerDescription(Screen s, String description) {
        // Almacena la descipcion y le da formato de texto
        String outDescription = "\n" + description + "\n";
        // Muestra la descripciion con formato de estilo
        s.out(outDescription,"Corbel", 20, Colors.PrestigeBlue);
    }

    // Regresa la descripcion del Spiderman
    public String showMessage() {
        return "Nombre: " + nombre + "\nAlias: " + alias +
                "\nGenero: " + genero + "\nUniverso: " +
                universo + "\n";
    }
}
