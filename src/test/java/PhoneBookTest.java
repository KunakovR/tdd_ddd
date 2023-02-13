import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

public class PhoneBookTest {

    String var1 = "Ольга";
    String var2 = "Алексей";
    String var3 = "89651258844";
    String var4 = "34552345677";
    String var5 = "89033103365";
    int var6 = 1;
    int var7 = 2;

    @Test
    public void addTest() {
        PhoneBook phoneBook = new PhoneBook();
        assertEquals(var6, phoneBook.add(var1, var3));
        assertEquals(var7, phoneBook.add(var2, var4));
        assertEquals(var7, phoneBook.add(var1, var5));
    }

    @Test
    public void findByNumberTest() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(var1, var3);
        phoneBook.add(var2, var4);
        phoneBook.add(var1, var5);
        assertEquals(var2, phoneBook.findByNumber(var4));
    }

    @Test
    public void findByNameTest() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(var1, var3);
        phoneBook.add(var2, var4);
        phoneBook.add(var1, var5);
        assertEquals(var3, phoneBook.findByName(var1));
    }

    @Test
    public void printAllNamesTest() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Андрей", "89033105689");
        phoneBook.add("Эдуард", "82241237489");
        phoneBook.add("Ольга", "89554569559");
        List<String> list = List.of("Андрей", "Ольга", "Эдуард");
        assertLinesMatch(list, phoneBook.printAllNames());
    }
}
