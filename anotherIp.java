import java.net.InetAddress;

public class anotherIp {
    public static void main(String[] args) {
        try {
            System.out.println(" > Get hostname from current ip");
            String ip = "10.252.102.81";
            System.out.println("Hostname from IP \"" + ip + "\" is: "
                                 + InetAddress.getByName(ip).getHostName());
            System.out.println("\n> Get host Adress from current name");
            String hostname = "www.google.com";
            System.out.println("Host/IP " + InetAddress.getByName(hostname).getHostAddress());
            System.out.println("Host/IP "+ InetAddress.getByName(hostname));

            System.out.println("\n > Check connection");
            InetAddress address = InetAddress.getByName(hostname);
            if (address.isReachable(3000)) {
                System.out.println( address + " is reachable");
            } else {
                System.out.println(address + " is uReachable");
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
