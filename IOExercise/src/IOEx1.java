import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEx1 {
    public static void main(String[] args) {
        byte[] inSrc = {1, 2, 3 ,4 ,5 ,6, 7, 8, 9};
        byte[] outSrc = null;

        ByteArrayInputStream input = null;
        ByteArrayOutputStream output= null;

        input = new ByteArrayInputStream(inSrc); //바이트 배열을 담고, 아래의 작업에서 사용
        output = new ByteArrayOutputStream();

        int data = 0;

        while((data = input.read()) != -1) { //read()는 데이터의 수를 읽음 , 읽을 데이터가 없으면 -1을 반환.
            output.write(data);
        }
            outSrc = output.toByteArray();
            System.out.println("inSrc = " + Arrays.toString(inSrc));
            System.out.println("outSrc = " + Arrays.toString(outSrc));
        }

    }

