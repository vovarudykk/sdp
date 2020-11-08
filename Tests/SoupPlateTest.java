import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SoupPlateTest {
    private SoupPlate.Size sizeOfSoupPlate = new SoupPlate.Size(20.5, 2);
    private SoupPlate soupplate1 = new SoupPlate("SoupPlate1", Material.CERAMICS, "Ukraine", sizeOfSoupPlate, 2);

    @Test
    public void testCreationSoupPlate() throws Exception {
        Assertions.assertNotNull(this.soupplate1);
    }

    @Test
    public void testSideWidth() throws Exception {
        double side_width = 2;
        Assertions.assertEquals(side_width, soupplate1.getSide_width());
    }
}
