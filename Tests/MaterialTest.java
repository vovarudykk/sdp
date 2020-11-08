import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import java.util.ArrayList;

class MaterialTest {
    @Test
    public void testCountryMaterial() throws Exception {
        Assertions.assertEquals("France", Material.PORCELAIN.getCountryOfProduction());
    }

    @Test
    public void testGetAllMaterial() throws Exception {
        String result = Material.getStringAll();
        Assertions.assertNotNull(result);
    }
}