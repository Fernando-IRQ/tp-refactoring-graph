package org.acme.graph.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class PathNode {
	
	private double cost;
	/**
	 * dijkstra - arc entrant avec le meilleur coût
	 */
	private Edge reachingEdge;
	/**
	 * dijkstra - indique si le sommet est visité
	 */
	private boolean visited;

	@JsonIgnore
	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@JsonIgnore
	public Edge getReachingEdge() {
		return reachingEdge;
	}

	public void setReachingEdge(Edge reachingEdge) {
		this.reachingEdge = reachingEdge;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	
	public PathNode(double cost, Edge reachingEdge, boolean visited) {
		this.cost = cost;
		this.reachingEdge = reachingEdge;
		this.visited = visited;
	}
}