package it.polito.tdp.newufosightings.model;

import java.util.HashMap;
import java.util.Map;

import org.jgrapht.Graphs;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleWeightedGraph;

import it.polito.tdp.newufosightings.db.NewUfoSightingsDAO;

public class Model {
	
	private Map<String, State> idMap;
	private SimpleWeightedGraph<State, DefaultWeightedEdge> grafo;
	
	public Model() {
		idMap = new HashMap<String, State>();
		grafo = new SimpleWeightedGraph<>(DefaultWeightedEdge.class);
	}

	public boolean isDigit1(String giorno) {
		if(!giorno.matches("\\d+")) {
			return false;
		}
		int giorno1 = Integer.parseInt(giorno);
		return giorno1>=1 && giorno1<=180;
	}

	public boolean isDigit2(String anno) {
		if(!anno.matches("\\d{4}")) {
			return false;
		}
		int anno1 = Integer.parseInt(anno);
		return anno1>=1906 && anno1<=2014;
	}

	public String getSommaPesiArchi(String anno, String giorno) {
		String risultato="";
		NewUfoSightingsDAO dao = new NewUfoSightingsDAO();
		dao.loadAllStates(idMap);
		Graphs.addAllVertices(grafo, idMap.values());
		
		return null;
	}

}
