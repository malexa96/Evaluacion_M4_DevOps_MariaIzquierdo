import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.healthtrack.Usuario;


public class UsuarioTest {

    @Test // confirma que el peso se actualiza correctamente
    public void testActualizarPeso() {

        Usuario usuario = new Usuario("Maria", 70.0);

        usuario.actualizarPeso(72.5);

        assertEquals(72.5, usuario.getPeso(), 0.01, "El peso debería actualizarse correctamente");
    }

    @Test // valida que si se puede registrar un peso menor por si se baja de peso
    public void testActualizarConPesoMenor() {
        Usuario usuario = new Usuario("Carlos", 85.0);
        usuario.actualizarPeso(80.0);
        assertEquals(80.0, usuario.getPeso(), 0.01, "Debe permitir actualizar con un peso menor");
    }

    @Test // asegura que no hay errores si el peso que se ingresa es el mismo
    public void testActualizarConMismoPeso() {
        Usuario usuario = new Usuario("Ana", 60.0);
        usuario.actualizarPeso(60.0);
        assertEquals(60.0, usuario.getPeso(), 0.01, "Debe aceptar el mismo peso sin errores");
    }
}
