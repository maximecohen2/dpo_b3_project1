public class Rectangle extends AFigure {
    private float l;
    private float H;
    private float L;

    public Rectangle(float l, float H, float L) {
        this.l = l;
        this.H = H;
        this.L = L;
    }

    @Override
    public void calculerSurface() {

    }

    public float getl() {
        return l;
    }

    public void setl(float l) {
        this.l = l;
    }

    public float getL() {
        return L;
    }

    public void setL(float L) {
        this.L = L;
    }

    public float getH() {
        return H;
    }

    public void setH(float H) {
        H = H;
    }

    @Override
    public void dessiner() {
        System.out.println(String.format("Dessine un Rectangle (l: %f, H: %f, L: %f)",
                this.getl(), this.getH(), this.getL()));
    }
}
