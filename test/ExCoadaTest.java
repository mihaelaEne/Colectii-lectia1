import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Queue;

public class ExCoadaTest {

    //todo:inversarea unui string

    @Test
    public static void sirInversat() {
        Queue<Character> sirCaractere = new ArrayDeque<>();

        String text = "ana are mere";

        for (int i = text.length(); i >= 0; i--) {
            sirCaractere.add(text.charAt(i));
        }

        String inv="";
        System.out.println(sirCaractere.element());


    }

}
