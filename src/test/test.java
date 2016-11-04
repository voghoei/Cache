package test;
/*
 * For experiments with any java stuff
 */

import graph.common.Graph;
import graph.common.GraphUtils;

import java.util.HashSet;
import java.util.Set;

import org.javatuples.Pair;


public class test {

//	public static void main(String[] args) throws Exception {
//		Graph dataGraph = new Graph(args[0]);
//		GraphUtils.storeInverseGraph(dataGraph, args[1]);
//	}

	public static void main(String[] args) throws Exception {
		GraphUtils.arrangeVertexID(args[0], args[1]);
	}
}

