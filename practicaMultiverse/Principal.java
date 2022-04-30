public class Principal {
    public static void main(String[] args) throws InterruptedException {
        Screen s = new Screen("Spiderverse");
        s.setVisible(true);
        // Define la posicion y dimensiones del Screen, favor de no modificar
        s.setBounds(0, 0, 950, 750);

        Dialog d = new Dialog();

        // Los ifs verifican si el programa debe ser terminado
        if (holland(s,d) != 0) {
            // Termina el programa
            System.exit(0);
        }

        if (miles(s,d) != 0) {
            // Termina el programa
            System.exit(0);
        }

        if (classic(s,d) != 0) {
            // Termina el programa
            System.exit(0);
        }
    }

    static int holland(Screen s, Dialog d) throws InterruptedException {
        Holland holland = new Holland();

        holland.punzada(s);
        if (d.confirm("Next? (Yes) | Quit (No or Cancel)", d.tit) != 0) {
            return 1;
        }

        holland.superFuerza(s);
        if (d.confirm("Next? (Yes) | Quit (No or Cancel)", d.tit) != 0) {
            return 1;
        }
        return 0;
    }

    static int miles(Screen s, Dialog d) throws InterruptedException {
        Miles miles = new Miles();

        miles.picaduraVenenosa(s);
        if (d.confirm("Next? (Yes) | Quit (No or Cancel)", d.tit) != 0) {
            return 1;
        }

        miles.invisibilidad(s);
        if (d.confirm("Next? (Yes) | Quit (No or Cancel)", d.tit) != 0) {
            return 1;
        }
        return 0;
    }

    static int classic(Screen s, Dialog d) throws InterruptedException {
        Classic classic = new Classic();

        classic.trepar(s);
        if (d.confirm("Next? (Yes) | Quit (No or Cancel)", d.tit) != 0) {
            return 1;
        }

        classic.sentidoAracnido(s);
        if (d.confirm("Next? (Yes) | Quit (No or Cancel)", d.tit) != 0) {
            return 1;
        }
        return 0;
    }
}
