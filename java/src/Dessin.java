import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveAction;

public class Dessin {
    private List<AFigure> figures = new ArrayList<AFigure>();
    private Lumiere lumiere;
    private Camera camera;

    public Dessin(Lumiere lumiere, Camera camera) {
        this.lumiere = lumiere;
        this.camera = camera;
    }

    public void dessiner() {
        for (AFigure figure : this.figures) {
            figure.dessiner();
        }
    }

    public void ajouter(AFigure figure) {
        figures.add(figure);
    }

    public static void main(String[] args) {
        Camera camera = new Camera();
        Lumiere lumiere = new Lumiere();
        Dessin dessin = new Dessin(lumiere, camera);

        Rectangle rectangle = new Rectangle(10, 10, 10);
        Carre carre = new Carre(10);
        Cercle cercle = new Cercle(10);

        dessin.ajouter(rectangle);
        dessin.ajouter(carre);
        dessin.ajouter(cercle);
        dessin.dessiner();
    }
}
