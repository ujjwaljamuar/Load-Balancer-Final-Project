package timeComparison;

import algorithms.MaxMinLoadBalancer;
import algorithms.RoundRobinLoadBalancer;

public class TimeComparison {
	public static void main(String[] args) {

		// Measure execution time for Round Robin
		long startTime1 = System.nanoTime();
		// Test Round Robin Load Balancer
		testRoundRobinLoadBalancer();
		long endTime1 = System.nanoTime();
		long executionTime1 = endTime1 - startTime1;

		// Measure execution time for Max_MIN Algorithm
		long startTime2 = System.nanoTime();
		// Test Max-Min Load Balancer
		testMaxMinLoadBalancer();
		long endTime2 = System.nanoTime();
		long executionTime2 = endTime2 - startTime2;

		System.out.println("\nExecution time of Round Robin Algorithm is : " + executionTime1 + " nanoseconds");
		System.out.println("Execution time of Max-Min Algorithm is : " + executionTime2 + " nanoseconds");

	}

	private static void testRoundRobinLoadBalancer() {
		RoundRobinLoadBalancer loadBalancer = new RoundRobinLoadBalancer();
		loadBalancer.addBackendServer("Server1");
		loadBalancer.addBackendServer("Server2");
		loadBalancer.addBackendServer("Server3");
		loadBalancer.addBackendServer("Server4");
		loadBalancer.addBackendServer("Server5");
		loadBalancer.addBackendServer("Server6");
		loadBalancer.addBackendServer("Server7");
		loadBalancer.addBackendServer("Server8");
		loadBalancer.addBackendServer("Server9");
		loadBalancer.addBackendServer("Server10");

		for (int i = 0; i < 10; i++) {
			String server = loadBalancer.getNextServer();
			System.out.println("Round Robin: Request sent to " + server);
		}
	}

	private static void testMaxMinLoadBalancer() {
		MaxMinLoadBalancer loadBalancer = new MaxMinLoadBalancer();
		loadBalancer.addBackendServer("Server1");
		loadBalancer.addBackendServer("Server2");
		loadBalancer.addBackendServer("Server3");
		loadBalancer.addBackendServer("Server4");
		loadBalancer.addBackendServer("Server5");
		loadBalancer.addBackendServer("Server6");
		loadBalancer.addBackendServer("Server7");
		loadBalancer.addBackendServer("Server8");
		loadBalancer.addBackendServer("Server9");
		loadBalancer.addBackendServer("Server10");

		for (int i = 0; i < 10; i++) {
			String server = loadBalancer.getNextServer();
			System.out.println("Max Min: Request sent to " + server);
		}
	}
}
