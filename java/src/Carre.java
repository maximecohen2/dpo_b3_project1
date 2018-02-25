public class Carre extends Rectangle {

    public Carre(float l) {
        super(l, l, l);
    }

    @Override
    public void dessiner() {
        System.out.println(String.format("Dessine un Carré (l: %f)", this.getl()));
    }
}
