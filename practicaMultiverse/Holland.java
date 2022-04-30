import java.awt.*;

public class Holland extends SpiderMan implements HollandMovements {
    public Holland() {
        super("Peter Parker", "Spider-Man", "Masculino", "19999");
    }

    @Override
    public void punzada(Screen s) {
        s.cls();
        s.repaint();
        persistent(s, Colors.GloomyPurple);
        s.out("Poder: punzada\n", "Comic Sans MS", 20, Colors.LighterPurple);
        s.showImage("./img/03.jpg");
        powerDescription(s, "Sentido aracnido  de Peter Parker, capaz de advertir acerca " +
                "del peligro a un mayor rango de distancia y tiempo.");
    }

    @Override
    public void superFuerza(Screen s) {
        s.cls();
        s.repaint();
        persistent(s, Colors.GloomyPurple);
        s.out("Poder: super fuerza\n", "Comic Sans MS", 20, Colors.LighterPurple);
        s.showImage("./img/04.jpg");
        s.setLayout(new GridBagLayout());
        powerDescription(s, "Fuerza proporcional a la de una araña, Peter es capaz de realizar " +
                "hazañas tales como mantener unido un crucero que esta literalmente partido a la mitad.");
    }
}
