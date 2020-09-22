public class SaltShaker extends Dishes{
    private static double salt;

    public SaltShaker(String name, Material material, String producer, Size sizeOfShaker) {
        super(name, material, producer, sizeOfShaker);
    }

    //nested класс "Соль" с методом добавить соли
    // знаю, что это бредово но ничего лучше с этой предметной областью придумать не получается, извините(
    private static class Salt {
        public void addSalt(double salt) {
            SaltShaker.salt += salt;
        }
    }
}
