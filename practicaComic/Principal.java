public class Principal {
    public static void main(String[] args){
        Screen s = new Screen("Mary Jane & Black Cat");
        s.setVisible(true);
        s.setBounds(0, 0, 950, 750);
        new Viñeta("Viñeta 0", s, "./img/00.jpg",
                "En esta historia, Peter Parker se encuentra inconsciente en el hospital. " +
                        "Su vieja amiga (y ex) Felicia Hardy/Black Cat, busca la habitación de Peter, " +
                        "pues quiere cuidar de el.", 0).start();

        new Viñeta("Viñeta 1", s, "./img/01.jpg",
                "Sin embargo, al entrar en su habitacion, se encuentra con una escena algo inusual..."
                , 10000).start();

        new Viñeta("Viñeta 2", s, "./img/02.jpg",
                "Un viejo enemigo del Dr. Strange, Parker Robbins, amenaza la vida de Peter y MJ con " +
                        "un arma...\nEl tiene un trato para Felicia. Desea recuperar su capa, que le fue robada " +
                        "durante su ultimo combate, donde Felicia estuvo presente, y quien mejor que Black Cat, " +
                        "la mejor ladrona del mundo, para recuperarla.", 20000).start();
        new Viñeta("Viñeta 3", s, "./img/03.jpg",
                "Felicia lo piensa un momento y acepta el trato. " +
                        "Sin embargo, ella pide llevarse a MJ, pues la necesita para este trabajo.", 30000).start();
        new Viñeta("Viñeta 4", s, "./img/04.jpg",
                        "Ambos quedan sorprendidos (incluida MJ), pero Parker Robbins acepta.", 40000).start();
        new Viñeta("Viñeta 5", s, "./img/05.jpg",
                "Fuera de la habitacion de Peter, Mary Jane cuestiona a Felicia sobre por que " +
                        "la necesita para este trabajo. Felicia le contesta que solamente queria sacarla de ahi, " +
                        "pues Peter nunca la perdonaria si dejara que algo le pasara. MJ y Felicia se odian " +
                        "mutuamente, Felicia nunca la salvaria por su propia voluntad. Felicia le dice a MJ que " +
                        "se vaya a casa, ella se encargara de esto y no la necesita para nada. MJ se molesta.", 50000).start();
        new Viñeta("Viñeta 6", s, "./img/06.jpg",
                "Felicia va en busca de The Hood, quien estuvo en la ultima pelea de Parker Robins " +
                        "y tiene pistas de donde puede estar su capa. Ella le pide la informacion pero el se niega " +
                        "a darsela, pues Felicia no tiene nada que le interese para intercabiar.", 60000).start();
        new Viñeta("Viñeta 7", s, "./img/07.jpg",
                "En ello aparece MJ, quien es alguien a quien un conocedor del cine como lo es The Hood " +
                        "no podria ignorar en lo absoluto.", 70000).start();
        new Viñeta("Viñeta 8", s, "./img/08.jpg",
                "En ese momento, Felicia pierde toda la atencion de The Hood, quien se encuentra " +
                        "maravillado con MJ. Definitivamente complacera todo lo que MJ le pida, incluyendo " +
                        "la informacion que necesitan.", 80000).start();
        new Viñeta("Viñeta 9", s, "./img/09.jpg",
                "Con la informacion de The Hood, Felicia y MJ se aventuran en la busqueda de la capa, " +
                        "pista tras pista, se encuentran con viejos enemigos de Spider-Man con quienes tienen " +
                        "que lidiar de una u otra manera.", 90000).start();
        new Viñeta("Viñeta 10", s, "./img/10.jpg",
                "Tras una larga busqueda, dan con la persona que tiene la capa. Es Tombstone, " +
                        "uno de los enemigos mas peligrosos, violentos e inteligentes con quienes ha debido " +
                        "lidiar Spider-Man. No sera tarea facil quitarle la capa.", 100000).start();
        new Viñeta("Viñeta 11", s, "./img/11.jpg",
                "Pero para Black Cat nada es imposible, y Felicia tiene un plan: ¿Estas lista para " +
                        "para vestirte, roja?", 110000).start();
        new Viñeta("Viñeta 12", s, "./img/12.jpg",
                "Vemos a Black Cat trepando por el edificio de Tombstone, determinada a conseguir " +
                        "esa capa. Sin embargo, Tombstone la espera listo para acabar con ella. Nadie le roba a " +
                        "Tombstone.", 120000).start();
        new Viñeta("Viñeta 13", s, "./img/13.jpg",
                "Black Cat es descubierta por Tombstone, tiene que huir de ahi inmediatamente.",
                130000).start();
        new Viñeta("Viñeta 14", s, "./img/14.jpg",
                "Black Cat huye en la furgoneta de sus aliados, mientras Tombstone la persigue." +
                        "Pero, mientras tanto, en el edificio, vemos a una segunda Black Cat quien esta tomando " +
                        " un maleta.", 140000).start();
        new Viñeta("Viñeta 15", s, "./img/15.jpg",
                "En realidad, Tombstone esta persiguiendo a Mary Jane, vestida como Black Cat, " +
                        "quien uso sus dotes como actriz para engañarlo y abrir el camino para que Felicia pudiera " +
                        "tomar el paquete sin ningun problema.", 150000).start();
        new Viñeta("Viñeta 16", s, "./img/16.jpg",
                "Una vez fuera de peligro, vemos a las dos Black Cat hablar con el paquete que robaron, " +
                        "pues este resulta ser un demonio, el cual se comio la capa de Parker Robins. Sin embargo, " +
                        "puede ayudarlas, solo necesita una pequeña cosa a cambio...", 160000).start();
        new Viñeta("Viñeta 17", s, "./img/17.jpg",
                "Felicia y MJ regresan a la habitacion de Peter, Felicia tiene puesta la ansiada " +
                        "capa de Robbins, quien le exige que se la quite y se la devuelva.", 170000).start();
        new Viñeta("Viñeta 18", s, "./img/18.jpg",
                "Felicia le da la capa y Robbins se la pone inmediatamente, esta feliz por haber " +
                        "recuperado a su capa y, con ello, sus poderes. Pero siente algo raro, esta no es su " +
                        "capa...", 180000).start();
        new Viñeta("Viñeta 19", s, "./img/19.jpg",
                "El demonio adopto la forma de la capa para engañar a Robbins, pues cuando comio la capa, " +
                        "se quedo con hambre, el queria devorar la otra mitad del paquete, es decir, a Robbins. " +
                        "Black Cat mira la escena complacida, y MJ horrorizada.", 190000).start();
        new Viñeta("Viñeta 20", s, "./img/20.jpg",
                "Despues de una larga noche, ambas charlan en la azotea del hospital, mirando el amanecer. " +
                        "Esta noche, Felicia y MJ resolvieron sus diferencias y dieron fin a una rivalidad que tenian " +
                        "por años. Ahora, ellas pueden llamarse una a la otra, 'amiga'.", 200000).start();
    }
}
