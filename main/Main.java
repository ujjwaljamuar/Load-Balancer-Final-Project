package main;

import algorithms.MaxMinLoadBalancer;
import algorithms.RoundRobinLoadBalancer;

public class Main {
	public static void main(String[] args) {
		// Test Round Robin Load Balancer
		testRoundRobinLoadBalancer();

		// Test Max Min Load Balancer
		testMaxMinLoadBalancer();
	}

	private static void testRoundRobinLoadBalancer() {
		RoundRobinLoadBalancer loadBalancer = new RoundRobinLoadBalancer();
		for (int i = 1; i <= 100; i++) {
			loadBalancer.addBackendServer("Server" + i);
		}

		for (int i = 0; i < 10; i++) {
			String server = loadBalancer.getNextServer();
			System.out.println("Round Robin: Request sent to " + server);
		}
	}

	private static void testMaxMinLoadBalancer() {
		MaxMinLoadBalancer loadBalancer = new MaxMinLoadBalancer();
		for (int i = 1; i <= 100; i++) {
			loadBalancer.addBackendServer("Server" + i);
		}

		for (int i = 0; i < 10; i++) {
			String server = loadBalancer.getNextServer();
			System.out.println("Max Min: Request sent to " + server);
		}
	}
}
