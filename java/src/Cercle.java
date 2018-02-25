public class Cercle extends AFigure {

    private float r = 0;

    public Cercle(float r) {
        this.r = r;
    }

    public float getr() {
        return r;
    }

    public void setr(float r) {
        this.r = r;
    }

    @Override
    public void calculerSurface() {

    }

    @Override
    public void dessiner() {
        System.out.println(String.format("Dessine un Cercle (r: %f)", this.getr()));
    }
}
