import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CupTest {
    private Handle handle1 = new Handle(Material.STEEL);
    private Cup.Size sizeOfCup1 = new Cup.Size(5, 12);
    private Cup cup1 = new Cup("Cup1", Material.GLASS, "China", handle1, sizeOfCup1);

    @Test
    public void testCreationCup() throws Exception {
        Assertions.assertNotNull(this.cup1);
    }

    @Test
    public void testConstructor() throws Exception {
        Cup cup2 = new Cup("Cup2", Material.CERAMICS, "Ukraine", sizeOfCup1);
        Assertions.assertFalse(cup2.isHasHandle());

        Cup cup3 = new Cup("Cup3", Material.CERAMICS, "Ukraine", handle1, sizeOfCup1);
        Assertions.assertTrue(cup3.isHasHandle());
    }

    @Test
    public void testObjectEquation() throws Exception {
        Cup cup1_clone = new Cup("Cup1", Material.GLASS, "China", handle1, sizeOfCup1);
        Assertions.assertEquals(this.cup1, cup1_clone);
    }

    @Test
    public void testObjectEquationFalse() throws Exception {
        Cup cup1_clone = new Cup("Cup1", Material.PORCELAIN, "China", handle1, sizeOfCup1);
        Assertions.assertNotEquals(this.cup1, cup1_clone);
    }
}