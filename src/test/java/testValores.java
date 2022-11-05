import br.com.gerlan.Valores;
import junit.framework.TestCase;
import org.junit.Test;


public class testValores extends TestCase{

    Valores v = new Valores();

    @Test
    public void testins(){
        boolean retorno = v.ins(3);
        assertTrue(retorno);
    }

    @Test
    public void testdel(){
        assertEquals(-1,v.del(9));
        v.ins(2);
        v.ins(12);
        v.ins(13);
        System.out.println(v.size());
        assertEquals(2,v.del(0));
        assertEquals(12,v.del(1));
        assertEquals(13,v.del(2));
        System.out.println(v.size());

    }



}
