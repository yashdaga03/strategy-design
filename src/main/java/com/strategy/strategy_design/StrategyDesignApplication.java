package com.strategy.strategy_design;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StrategyDesignApplication {

	public static void main(String[] args) {
		Context context = new Context(new OperationAdd());
		System.out.println("Add 10 + 5 = " + context.executeStrategy(10, 5));

		context = new Context(new OperationSub());
		System.out.println("Sub 10 - 5 = " + context.executeStrategy(10, 5));

		context = new Context(new OperationMul());
		System.out.println("Mul 10 * 5 = " + context.executeStrategy(10, 5));
	}

}
