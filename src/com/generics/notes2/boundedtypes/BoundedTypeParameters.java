package com.generics.notes2.boundedtypes;

import java.util.ArrayList;
import java.util.Collection;

import com.generics.notes0.Box;

//restrict the types that can be used as type arguments in a parameterized type

public class BoundedTypeParameters {

	public static void main(String[] args) {
		numberType(5);
		numberType(7849653217L);
		// numberType("test string"); ==> erreur de compilation		
		ArrayList<String> list = new ArrayList<>();
		TestCollection<String, ArrayList<String>> t = new TestCollection<>();
		// Multiple bounded
		E<A> e = new E<>();
	}

	public static <T extends Number> void numberType(T t) {
		System.out.println(t.getClass().getName());
	}

	static class TestCollection<U,T extends Collection<U>> {

	}
	
	// Multiple bounded
	class A implements B,C,D{}
	interface B{}
	interface C{}
	interface D{}
	
	static class E<T extends B & C & D>{}
	
	/**
	 *  Misunderstanding !!! 
	 */
	public void boxTest(Box<Number> n) { /* ... */ }
	// boxTest(Box<Integer>) or boxTest(Box<Double>) ==> Compile error, because Box<Integer> or Box<Double> are not subtypes of Box<Number>
	// ==> if A extends B ==> generic<A> IS NOT generic<B>
	// ==> The only super type of generic<A> and generic<B> is Object
   
}
