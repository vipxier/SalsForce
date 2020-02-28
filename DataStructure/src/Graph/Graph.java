package Graph;

import java.util.LinkedList;

public class Graph {
	int size;
	LinkedList<Integer>[] neighbors;

	public Graph(int size) {
		this.size = size;
		this.neighbors = new LinkedList[size];
		for(int i = 0; i < size; i ++)
		{
			neighbors[i] = new LinkedList<Integer>();
		}
	}

	public void addUndirectedEdge(int source, int destination) {
		this.neighbors[source].add(destination);
		this.neighbors[destination].add(source);
	}

	public void addDirectedEdge(int source, int destination) {
		this.neighbors[source].add(destination);
	}
}
