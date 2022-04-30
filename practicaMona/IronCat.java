package practicaMona;

public class IronCat extends Mona{
    public IronCat() {
        super();
        setOcupacion("Vengador");
        setVestimenta("Armadura Mark 60");
    }

    @Override
    public void saludar() {
        System.out.println("Yo soy IronCat");
    }
}