package com.generics.notes1.raw;

import com.generics.notes0.Box;

public class RawTypes {

	public static void main(String[] args) {
// A raw type is the name of a generic class or interface without any type arguments.
		
		/**
		 * The term "unchecked" means that the compiler does not have enough type information to perform all type checks necessary to ensure type safety
		 */
		
		Box<Integer> integerBox = new Box<>();
		Box box = integerBox; // OK
//==========================================================================================================		
		Box<Integer> integerBox1 = new Box();
		Box box1 = integerBox; // Type safety: The expression of type Box needs unchecked conversion to conform to Box<Integer>
//==========================================================================================================
		Box b1 = new Box<>();
		Box<String> stringBox = b1; // Type safety: The expression of type Box needs unchecked conversion to conform to Box<String>
//==========================================================================================================
		Box<String> stringBox1 = new Box<>();
		Box b2 = stringBox1;
	    b2.setT(2); // Type safety: The method setT(Object) belongs to the raw type Box. References to generic type Box<T> should be parameterized
	}

}
