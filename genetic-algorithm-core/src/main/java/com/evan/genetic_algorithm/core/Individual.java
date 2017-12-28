package com.evan.genetic_algorithm.core;
/**
 * 个体模型接口
 *
 *@author Evan
 *created on 2017年12月29日
 */
public interface Individual {
	
	 /**
	  * 在对应的偏移位上设置基因
	  * @param offset
	  * @param gene
	  */
	 void setGene(int offset, Object gene);
	 
	 /**
	  * 获取对应偏移位上的基因
	  * @param offset
	  * @return
	  */
     Object getGene(int offset);
     
     /**
      * 设置适宜度
      * @param fitness
      */
	 void setFitness(double fitness);
	 
	 /**
	  * 设置适宜度
	  * @return
	  */
	 double getFitness();
}
