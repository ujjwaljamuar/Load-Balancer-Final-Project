package algorithms;

import java.util.HashMap;
import java.util.Map;

public class MaxMinLoadBalancer {
	private Map<String, Integer> backendServerLoads;

	public MaxMinLoadBalancer() {
		backendServerLoads = new HashMap<>();
	}

	public void addBackendServer(String server) {
		backendServerLoads.put(server, 0);
	}

	public String getNextServer() {
		if (backendServerLoads.isEmpty()) {
			throw new IllegalStateException("No backend servers available");
		}

		// Find the server with the minimum load
		String minLoadServer = null;
		int minLoad = Integer.MAX_VALUE;
		for (String server : backendServerLoads.keySet()) {
			int currentLoad = backendServerLoads.get(server);
			if (currentLoad < minLoad) {
				minLoad = currentLoad;
				minLoadServer = server;
			}
		}

		// Increment the load of the selected server
		backendServerLoads.put(minLoadServer, backendServerLoads.get(minLoadServer) + 1);

		return minLoadServer;
	}
}
