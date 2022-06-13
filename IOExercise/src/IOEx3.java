import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class IOEx3 {
    public static void main(String[] args) {

        byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        byte[] ourSrc = null;
        byte[] temp = new byte[4];

        ByteArrayInputStream input = null;
        ByteArrayOutputStream output = null;

        input = new ByteArrayInputStream(inSrc);
        output = new ByteArrayOutputStream();

        System.out.println("Input Source: " + Arrays.toString(inSrc));

        try{
            while(input.available() > 0) {

                input.read(temp);
                output.write(temp);
                System.out.println("temp = " + Arrays.toString(temp));

                ourSrc = output.toByteArray();
                printArrays(temp, ourSrc);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void printArrays(byte[] temp, byte[] ourSrc) {
        System.out.println("temp = " + temp);
        System.out.println("ourSrc = " + ourSrc);
    }
}
