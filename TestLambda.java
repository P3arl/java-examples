package com.samples;

import java.util.List;
import java.util.function.Consumer;

/*
 * Custom Functional interface which throws Exception
 */
@FunctionalInterface
interface ShowFunction<T> {
	void apply(T t) throws Exception;
}

/**
 * 
 * @author P3arl
 *
 */
public class TestLambda {
 
	public static void main(String[] args) {
		List.of(1,3,5).forEach(showFunctionWrapper(TestLambda::show));
	}

	static Consumer<Integer> showFunctionWrapper(ShowFunction<Integer> function) {
		return i -> {
			try {
				function.apply(i);
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}
	private static Integer show(Integer i) throws Exception {
		if(i==3) {
			throw new Exception();
		}
		return i*3;
	}
}
