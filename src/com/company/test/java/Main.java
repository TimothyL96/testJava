package com.company.test.java;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// write your code here
		System.out.println(String.valueOf(Integer.parseInt("123")));

		for (int i = 0; i < 10; i++) {
			System.out.println("\r" + i + "%");
		}

		String[] arr = {"asd", "xas"};
		int[] x = new int[5];

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		System.out.println(input);

		List<Integer> intList = new ArrayList<Integer>();
		Queue<Integer> integerQueue = new LinkedList<Integer>();
		Stack<Integer> integerStack = new Stack<Integer>();
		Set<Integer> intSet = new HashSet<Integer>();
		Map<Integer, List<Integer>> map = new TreeMap<Integer, List<Integer>>();

		// Common methods for all collections
		intList.clear();
		integerQueue.isEmpty();
		integerStack.size();
		intSet.toString();
		map.equals(intList);

		// Set
		integerStack.add(1);
		integerQueue.remove(1);
		intList.add(1);

		// Map
		map.containsKey(intList);
		map.get(1);
		map.put(1, intList);
		map.remove(2);

		// Iterator
		// No map
		Iterator<Integer> it = intList.iterator();
		integerQueue.iterator();
		intSet.iterator();
		integerStack.iterator();
		intSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// Enhanced loops
		for (Integer s : intList) {
			System.out.println(s);
		}
		intList.forEach(System.out::println);

		// Loop through map
        for (Integer xx : map.keySet()) {
            System.out.println("Key:" + xx);
            System.out.println("Value:" + map.get(xx));
        }
        for (List<Integer> xx : map.values()) {
            System.out.println("Value:" + xx);
        }

        // Map for each
        map.forEach((k,v) -> System.out.println(k + v.toString()));
	}

	// New method
    public static void Test() {
	    System.out.println("test!!!");
    }
}

// Java OOP