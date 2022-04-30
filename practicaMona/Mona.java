package practicaMona;

public abstract class Mona {
    private String ocupacion = "No tiene";
    private String vestimenta = "No tiene";

    public Mona() {
        super();
    }
    public String getOcupacion() {
        return ocupacion;
    }
    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getVestimenta() {
        return vestimenta;
    }

    public void setVestimenta(String vestimenta) {
        this.vestimenta = vestimenta;
    }

    public abstract void saludar() ;

    public void imprimir(){
        saludar();
        System.out.println("Vestimenta: " + vestimenta);
        System.out.println("Ocupacion: " + ocupacion + "\n");
    }
}
