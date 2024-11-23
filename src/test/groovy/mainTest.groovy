import org.junit.Test
import static org.junit.jupiter.api.Assertions.*;

class mainTest {
    @Test
    void entryContact(){
        String inputAdd = "Juan Pérez\njuan.perez@email.com\n30\n";
        Scanner mockScannerAdd = new Scanner(inputAdd);
        Main.setLectura(mockScannerAdd);
        Main.addContact();

        Contacto contact = Main.arrayContactos.get(0);
        assertEquals("Juan Pérez",contact.nombre);
        assertEquals("juan.perez@email.com",contact.email);
        assertEquals(30,contact.edad);
    }
    @Test
    void deleteContact(){
        String inputAdd = "juan.perez@email.com";
        Scanner mockScannerAdd = new Scanner(inputAdd);
        Main.setLectura(mockScannerAdd);
        Main.deleteContact();
        assertTrue(Main.arrayContactos.isEmpty(), "La lista de contactos debería estar vacía");
    }

    @Test
    void testSearchContact() {
        String inputAdd = "Ana López\nana.lopez@email.com\n25\n";
        Scanner mockScannerAdd = new Scanner(inputAdd);
        Main.setLectura(mockScannerAdd);
        Main.addContact();

        String inputSearch = "Ana López\nana.lopez@email.com\n25\n";
        Scanner mockScannerSearch = new Scanner(inputSearch);
        Main.setLectura(mockScannerSearch);
        Main.searchContact();

        Contacto contacto = Main.arrayContactos.get(1);
        assertEquals("Ana López", contacto.getNombre());
        assertEquals("ana.lopez@email.com", contacto.getEmail());
        assertEquals(25, contacto.getEdad());
    }
}
