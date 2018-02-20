public abstract class AFigure implements IDessinable {

    private float x = 0;
    private float y = 0;
    private float z = 0;
    private int r = 0;
    private int v = 0;
    private int b = 0;

    @Override
    public float getX() {
        return this.x;
    }

    @Override
    public float getY() {
        return this.y;
    }

    @Override
    public float getZ() {
        return this.z;
    }

    @Override
    public void setX(float x) {
        this.x = x;
    }

    @Override
    public void setY(float y) {
        this.y = y;
    }

    @Override
    public void setZ(float z) {
        this.z = z;
    }

    @Override
    public void deplacer(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
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

    public abstract void calculerSurface();
}
