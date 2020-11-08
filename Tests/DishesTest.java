import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class DishesTest {
    private Plate.Size sizeOfPlate = new Plate.Size(0.5, 110);
    private Plate plate1 = new Plate("Plate1", Material.PORCELAIN, "China", sizeOfPlate);

    @Test
    public void testAbstractDishes() throws Exception {
        Assertions.assertNotNull(this.plate1.getName());
        Assertions.assertEquals("Plate1", this.plate1.getName());
    }

    @Test
    public void testCreateSize() throws Exception {
        Assertions.assertNotNull(this.sizeOfPlate);
    }

    @Test
    public void testSizeToString() throws Exception {
        Assertions.assertNotNull(this.sizeOfPlate.toString());
    }

    @Test
    public void testIntegratedFunc() {
        SizeConvertor obj = Mockito.mock(SizeConvertor.class);
        Mockito.when(obj.smToMm(sizeOfPlate.getRadius(), sizeOfPlate.getDeep())).thenReturn("radius = 5.0мм; deep = 1.1м");
        Assertions.assertEquals(sizeOfPlate.convertSize(), "radius = 5.0мм; deep = 1.1м");
    }


}
