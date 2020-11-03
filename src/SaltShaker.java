public class SaltShaker extends Dishes{
    private static double salt;

    public SaltShaker(String name, Material material, String producer, Size sizeOfShaker) {
        super(name, material, producer, sizeOfShaker);
    }


    private static class Salt {
        public void addSalt(double salt) {
            SaltShaker.salt += salt;
        }
        public void addSalt(int salt) {
            SaltShaker.salt += salt;
        }
    }
}
