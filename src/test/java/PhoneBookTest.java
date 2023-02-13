import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {

    @Test
    public void addTest() {
        PhoneBook phoneBook = new PhoneBook();
        String var1 = "Ольга";
        String var2 = "Алексей";
        String var3 = "89651258844";
        String var4 = "34552345677";
        String var5 = "89033103365";
        int var6 = 1;
        int var7 = 2;
        assertEquals(var6,phoneBook.add(var1, var3));
        assertEquals(var7,phoneBook.add(var2, var4));
        assertEquals(var7,phoneBook.add(var1, var5));
    }

}
