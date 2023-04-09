import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    Item item=new Item("item1",100);
    @Test
    void getName() {
        assertEquals("item1",item.getName());
    }

    @Test
    void testToString() {
        assertNotNull(item.toString());
    }

    @Test
    void getPrice() {
        assertEquals(100,item.getPrice());
    }
}