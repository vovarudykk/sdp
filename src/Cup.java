public class Cup extends Dishes{
    private boolean handle;

    public Cup(String name, Material material, String producer, boolean handle, Size sizeOfCup) {
        super(name, material, producer, sizeOfCup);
        this.handle = handle;
    }
    public Cup(String name, Material material, boolean handle, Size sizeOfCup) {
        super(name, material, "Unknown", sizeOfCup);
        this.handle = handle;
    }

    public boolean isHandle() {return handle;}

    public void setHandle(boolean handle) {this.handle = handle;}
}
