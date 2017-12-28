package com.evan.genetic_algorithm.core;

public interface Individual {
	 void setGene(int offset, Object gene);
     Object getGene(int offset);
	 void setFitness(double fitness);
	 double getFitness();
}
