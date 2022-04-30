package practicaMona;

public class Boxertocat extends Mona{
    public Boxertocat() {
        super();
        setOcupacion("Boxeador");
        setVestimenta("Tres guantes de boxeo y una bandana");
    }

    @Override
    public void saludar() {
        System.out.println("¿Quieres pelea? >:v");
    }
}
