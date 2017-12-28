package com.evan.genetic_algorithm.core;
/**
 * 种群模型
 *
 *@author Evan
 *created on 2017年12月29日
 */
public interface Population {
	
	  /**
	   * 获取当前所有个体
	   * @return
	   */
      Individual[] getIndividuals();
      
      /**
       * 获取最适应的第offset个个体
       * @param offset
       * @return
       */
      Individual getFittest(int offset);
      
      /**
       * 设置种群适宜度
       * @param fitness
       */
      void setPopulationFitness(double fitness);
      
      /**
       * 设置种群适宜度
       * @return
       */
      double getPopulationFitness();
      
      /**
       * 获取种群个体大小
       * @return
       */
      public int size();
      
      /**
       * 设置种群对应位置的个体
       * @param offset
       * @param individual
       * @return
       */
      Individual setIndividual(int offset, Individual individual);

      /**
       * 获取种群对应位置的个体
       * @param offset
       * @return
       */
      Individual getIndividual(int offset);

}
