package practicaMona;

public class Octonaut extends Mona{
    public Octonaut() {
        super();
        setOcupacion("Astronauta");
        setVestimenta("Un traje de astronauta profesional");
    }

    @Override
    public void saludar() {
        System.out.println("¡Saludos, forma de vida alienigena!");
    }
}