import java.net.*;
import java.util.*;

public class HostIP{
    public static void main(String[] args) {
        String hostname;
        try (Scanner stdin = new Scanner(System.in)) {
            InetAddress address;
            InetAddress address1;
            InetAddress address2;
   
            System.out.print("\n\n Enter a hostname: ");
            hostname = stdin.nextLine();
            try {
                address = InetAddress.getByName(hostname);
                address1 = InetAddress.getLocalHost();
                address2 = InetAddress.getLoopbackAddress();

                System.out.println("\n The IP address for the host " +hostname+ " is " +address.toString()); 
                System.out.println("\n The localHost Address " +address1+ " is " +address1.toString());
                System.out.println("\n The LoopbackAddress " +address2+ " is " +address2);    
                
            } catch (UnknownHostException unHost) {
                System.out.println("The address of the URL entered has a problem");
                System.exit(0);
            }
        }

    }
}