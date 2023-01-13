package org.acme.graph.model;

import java.util.List;

public class Path {

	private List<Edge> edges;
	
	public Path(List<Edge> edges) {
		this.edges = edges;
	}
	
	public Edge getEdge(int i) {
		return this.edges.get(i);
	}
	
	public List<Edge> getEdges(){
		return this.edges;
	}
	
	public double getLength() {
		double length = 0;
		for(Edge e: edges) {
			length=+e.getCost();
		}
		return length;
	}
}
