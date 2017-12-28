package com.evan.genetic_algorithm.core;

public interface Population {

      Individual[] getIndividuals();

      Individual getFittest(int offset);

      void setPopulationFitness(double fitness);
     
      double getPopulationFitness();

      public int size();

      Individual setIndividual(int offset, Individual individual);

      Individual getIndividual(int offset);

}
