public class Camera implements IPositionnable, IAllumable {

    private boolean allumer = false;
    private float x = 0;
    private float y = 0;
    private float z = 0;


    @Override
    public void allumer() {
        this.allumer = true;
    }

    @Override
    public void eteindre() {
        this.allumer = false;
    }


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
}
