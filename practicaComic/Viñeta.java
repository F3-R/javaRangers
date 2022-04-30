public class Viñeta extends Thread {
    private Screen s;
    private String image_path;
    private String descripcion;
    private int milis;

    public Viñeta(String str, Screen s, String image_path, String descripcion, int milis){
        super(str);
        this.s = s;
        this.image_path = image_path;
        this.descripcion = descripcion;
        this.milis = milis;
    }

    public void run(){
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        s.cls();
        s.repaint();
        s.out("Mary Jane & Black Cat: Beyond\n\n\n", "Comic Sans MS", 25, Colors.LighterPurple);
        s.showImage(image_path);
        String outDescription = "\n"+ descripcion + "\n";

        s.out(outDescription,"Corbel", 20, Colors.PrestigeBlue);

    }
}
