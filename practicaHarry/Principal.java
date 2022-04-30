package practicaHarry;

public class Principal {
    public static void main (String[] args){
        Personaje luna= new Personaje("Luna Lovegood", "Femenino", 41, "Ravenclaw");
        Personaje hermione = new Personaje("Hermione Granger", "Femenino", 43, "Gryffindor");
        Personaje mcgonagal= new Personaje("Minerva McGonagal", "Femenino", 0, "“Gryffindor");
        Personaje snape = new Personaje("Severus Snape", "Masculino", 62, "Slytherin");
        Personaje dumbledore = new Personaje("Albus Dumbledore", "Masculino", 141, "Gryffindor");

        System.out.println("\n" + luna + "\n" + hermione + "\n" + mcgonagal + "\n" + snape + "\n" + dumbledore);
    }
}
