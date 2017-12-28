package com.evan.genetic_algorithm.core;
/**
 * 遗传算法基本抽象实现，含有部分共有逻辑
 *
 *@author Evan
 *created on 2017年12月29日
 */
public abstract class AbstractGeneticAlgorithm implements GeneticAlgorithm {
	// 种群规模
	private int populationSize;
	// 变异率
	private double mutationRate;
	// 交叉率
	private double crossoverRate;
	// 精英成员数
	private int elitismCount;
	
	@Override
	public void evalPopulation(Population population){
		  //种群个体适宜度总和
		  double populationFitness = 0;
		  //累加个体适宜度
	      for (Individual individual : population.getIndividuals()) {
	              populationFitness += calcFitness(individual);
	      }
	      //赋值写入
	      population.setPopulationFitness(populationFitness);
	}
	
	public int getPopulationSize() {
		return populationSize;
	}

	protected void setPopulationSize(int populationSize) {
		this.populationSize = populationSize;
	}

	public double getMutationRate() {
		return mutationRate;
	}

	protected void setMutationRate(double mutationRate) {
		this.mutationRate = mutationRate;
	}

	public double getCrossoverRate() {
		return crossoverRate;
	}

	protected void setCrossoverRate(double crossoverRate) {
		this.crossoverRate = crossoverRate;
	}

	public int getElitismCount() {
		return elitismCount;
	}

	protected void setElitismCount(int elitismCount) {
		this.elitismCount = elitismCount;
	}
	
	public AbstractGeneticAlgorithm(int populationSize, double mutationRate, double crossoverRate, int elitismCount) {
		this.populationSize = populationSize;
		this.mutationRate = mutationRate;
		this.crossoverRate = crossoverRate;
		this.elitismCount = elitismCount;
	}
}
