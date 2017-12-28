package com.evan.genetic_algorithm.core;
/**
 * 异常算法驱动引导类，核心骨骼
 *
 *@author Evan
 *created on 2017年12月29日
 */
public class GeneticBootstrap {
	
	/**
	 * 拒绝外部实例化
	 */
	protected GeneticBootstrap(){}
	
	/**
	 * 异常算法功能组件
	 */
	private GeneticAlgorithm geneticAlgorithm;
	
	/**
	 * 进行初始化和进化分析
	 * @param initParam
	 * @return 进化的最后一代
	 */
	public Population intialAndEvolution(Object initParam){
		//初始化种群
		Population population=geneticAlgorithm.initPopulation(initParam);
		//进行初始化评估
		geneticAlgorithm.evalPopulation(population);
		//种群代数
		@SuppressWarnings("unused")
		int generation=1;
		//未满足终止条件 继续进化
		while (!geneticAlgorithm.isTerminationConditionMet(population)) {
			//先对种群进行交叉得到新种群
			population=geneticAlgorithm.crossoverPopulation(population);
			//再对种群进行变异得到新种群
			population=geneticAlgorithm.mutatePopulation(population);
			//再进行评估
			geneticAlgorithm.evalPopulation(population);
			//种群代数加1
			generation++;
		}
		return population;
	}
	
	/**
	 * 工厂方法
	 * @param geneticAlgorithm
	 * @return
	 */
	public static GeneticBootstrap createBootstrap(GeneticAlgorithm geneticAlgorithm){
		GeneticBootstrap bootstrap=new GeneticBootstrap();
		bootstrap.geneticAlgorithm=geneticAlgorithm;
		return bootstrap;
	}
}
