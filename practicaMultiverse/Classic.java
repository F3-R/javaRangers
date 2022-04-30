import java.awt.*;

public class Classic extends SpiderMan implements ClassicMovements {
    public Classic() {
        super("Peter Parker", "Spider-Man", "Masculino", "616");
    }

    @Override
    public void trepar(Screen s) {
        s.cls();
        s.repaint();
        persistent(s, Colors.GloomyPurple);
        s.out("Poder: trepar paredes\n", "Comic Sans MS", 20, Colors.LighterPurple);
        s.showImage("./img/01.jpg");
        s.setLayout(new GridBagLayout());
        powerDescription(s, "Capacidad para trepar paredes generando un campo magnético al rededor de " +
                "sus dedos, lo que le permite pegarse a las paredes como si se tratara de un iman.");
    }

    @Override
    public void sentidoAracnido(Screen s) {
        s.cls();
        s.repaint();
        persistent(s, Colors.GloomyPurple);
        s.out("Poder: sentido aracnido\n", "Comic Sans MS", 20, Colors.LighterPurple);
        s.showImage("./img/02.jpg");
        s.setLayout(new GridBagLayout());
        powerDescription(s, "Sentido aracnido que le avisa de los peligros cercanos antes de que sufra " +
                "algun daño");
    }
}
