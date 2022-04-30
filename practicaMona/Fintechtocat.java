package practicaMona;

public class Fintechtocat extends Mona{
    public Fintechtocat() {
        super();
        setOcupacion("Tecnologo");
        setVestimenta("Traje formal elegante");
    }

    @Override
    public void saludar() {
        System.out.println("Buen día, hoy los servidores se encuentran muy bien!");
    }
}
