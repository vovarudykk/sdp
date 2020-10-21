public class Cup extends Dishes{
    private Handle handle;

    public Cup(String name, Material material, String producer, Handle handle, Size sizeOfCup) {
        super(name, material, producer, sizeOfCup);
        this.handle = handle;
    }
    public Cup(String name, Material material, String producer, Size sizeOfCup) {
        super(name, material, producer, sizeOfCup);
    }
}
