package com.evan.genetic_algorithm.core;

/**
 * 遗传算法基本功能接口 
 * 
 * @author Evan
 * created on 2017年12月29日
 */
public interface GeneticAlgorithm {
	
	/**
	 * 初始化种群
	 * 
	 * @param param
	 * @return
	 */
	Population initPopulation(Object param);

	/**
	 * 检查终止条件是否满足
	 * 
	 * @param population
	 * @return
	 */
	boolean isTerminationConditionMet(Population population);

	/**
	 * 对种群进行交叉得到新种群
	 * 
	 * @param population
	 * @return
	 */
	Population crossoverPopulation(Population population);

	/**
	 * 对种群进行变异得到新种群
	 * 
	 * @param population
	 * @return
	 */
	Population mutatePopulation(Population population);

	/**
	 * 评估种群
	 * 
	 * @param population
	 */
	void evalPopulation(Population population);

	/**
	 * 评估个体
	 * 
	 * @param individual
	 * @return
	 */
	double calcFitness(Individual individual);

}
