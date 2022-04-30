package practicaMona;

public class Sentrytocat extends Mona{
    public Sentrytocat() {
        super();
        setOcupacion("Bombero");
        setVestimenta("Traje de bombero");
    }

    @Override
    public void saludar() {
        System.out.println("¡Buenos dias, ciudadano!");
    }
}