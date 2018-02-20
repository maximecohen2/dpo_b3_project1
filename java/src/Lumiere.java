public class Lumiere implements IColoriable, IAllumable {

    private boolean allumer = false;
    private int r = 0;
    private int v = 0;
    private int b = 0;


    @Override
    public void allumer() {
        this.allumer = true;
    }

    @Override
    public void eteindre() {
        this.allumer = false;
    }


    @Override
    public int getR() {
        return this.r;
    }

    @Override
    public int getV() {
        return this.v;
    }

    @Override
    public int getB() {
        return this.b;
    }

    @Override
    public void setR(int r) {
        this.r = r;
    }

    @Override
    public void setV(int v) {
        this.v = v;
    }

    @Override
    public void setB(int b) {
        this.b = b;
    }
    
}
