package elasticsearch;

import org.elasticsearch.client.Client;

/**
 * @author vagrant
 *
 */
public class MainApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Client client = Connection.getClient();
		System.out.println(client.toString());
		Connection.shutDown();
	}

}
