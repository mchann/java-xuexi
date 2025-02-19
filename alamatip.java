import java.net.InetAddress;
import java.net.UnknownHostException;

public class alamatip {

    public static void main(String[] args) throws UnknownHostException {
        System.out.println("Lookin up local host :> ");
        InetAddress localAddress = InetAddress.getLocalHost();
        System.out.println("Name: " + localAddress.getHostName());
        System.out.println("IP address: " + localAddress.getHostAddress());
        System.out.println(localAddress);
    
    }
}