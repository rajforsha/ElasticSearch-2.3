package elasticsearch;
import java.net.InetAddress;
import java.net.UnknownHostException;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;

/**
 * @author vagrant
 *
 */
public class Connection {
	public static Client client = null;

	public static Client getClient() {

		try {
			client = TransportClient.builder().build()
					.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("localhost"), 9300));
		} catch (UnknownHostException e) {

			e.printStackTrace();
		}

		if (client != null) {
			System.out.println("connected successfully :)");
		} else {
			System.out.println("ERROR!!");
		}

		return client;
	}

	public static void shutDown() {
		if (client != null) {
			client.close();
		}
	}

}
