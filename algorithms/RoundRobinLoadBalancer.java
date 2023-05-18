package algorithms;

import java.util.ArrayList;
import java.util.List;

public class RoundRobinLoadBalancer {
	private List<String> backendServers;
	private int currentIndex;

	public RoundRobinLoadBalancer() {
		backendServers = new ArrayList<>();
		currentIndex = 0;
	}

	public void addBackendServer(String server) {
		backendServers.add(server);
	}

	public String getNextServer() {
		if (backendServers.isEmpty()) {
			throw new IllegalStateException("No backend servers available");
		}

		currentIndex = (currentIndex + 1) % backendServers.size();
		return backendServers.get(currentIndex);
	}
}
