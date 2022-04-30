import java.awt.*;

public class Miles extends SpiderMan implements MilesMovements {
    public Miles() {
        super("Miles Morales", "Spider-Man", "Masculino", "1610");
    }

    @Override
    public void picaduraVenenosa(Screen s) {
        s.cls();
        s.repaint();
        persistent(s, Colors.GloomyPurple);
        s.out("Poder: picadura venenosa\n", "Comic Sans MS", 20, Colors.LighterPurple);
        s.showImage("./img/05.jpg");
        s.setLayout(new GridBagLayout());
        powerDescription(s, "Miles es capaz de darle una descarga electrica a sus enemigos, estos " +
                "sufriran una descarga electrica.");
    }

    @Override
    public void invisibilidad(Screen s) {
        s.cls();
        s.repaint();
        persistent(s, Colors.GloomyPurple);
        s.out("Poder: invisibilidad\n", "Comic Sans MS", 20, Colors.LighterPurple);
        s.showImage("./img/06.jpg");
        s.setLayout(new GridBagLayout());
        powerDescription(s, "Miles es capaz de hacerse invisible, siendo imperceptible para sus " +
                "enemigos.");
    }
}
