package practicaMona;

public class Filmtocats extends Mona {

    public Filmtocats() {
        super();
        setOcupacion("Director de cine");
        setVestimenta("Camisa roja, playera gris, pantalones azules");
    }

    @Override
    public void saludar() {
        System.out.println("Accion!");
    }
}
