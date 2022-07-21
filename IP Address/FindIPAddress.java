import java.net.InetAddress;
import java.net.UnknownHostException;

public class FindIPAddress
{
	public static void main(String[] args){
		try{
			InetAddress ia = InetAddress.getLocalHost();
			String ipAddress = ia.getHostAddress();
			String hostName = ia.getHostName();
			
			
			System.out.println("IP Address:"+ ipAddress + " Host Name:"+ hostName);
			
		}catch(UnknownHostException e){
			e.printStackTrace();
		}
			
	}
}