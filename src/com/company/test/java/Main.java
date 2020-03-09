package com.company.test.java;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// write your code here
		// Convert string to int and vice versa
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
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();

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
		map.forEach((k, v) -> System.out.println(k + v.toString()));
	}

	// New method
	public static void Test() {
		System.out.println("test!!!");
		la l = new la();
		l.Test();
	}
}

// Java OOP
class la {
	la() {
		System.out.println("la created!");
	}

	// New method
	public void Test() {
		final String music = "music";
		System.out.println("test!!!");
		la l;
	}
}

// Inheritance
class la2 extends la {
	int x;
	la l; // Composition

	la2() {
		this.Test();
	}
}

// Abstract class
abstract class cabstract {
	public abstract void abstractMethod();

	void testCall() {
		System.out.println("yeah");

		// Test interface
		Bike b = new Honda();
		b.Start();
	}
}

// Interface
interface Bike {
	public void Start();
}

interface Car {
	public void Start();
}

// Extend first, only then implement
class Honda extends cabstract implements Bike, Car {
	public void Start() {
		System.out.println("Honda car!");
	}

	// Override abstract method
	@Override
	public void abstractMethod() {

	}
}

// Coding test
class Test1 {
	String category;
	int fileSize;
	final static int digit = 5;

	String x = Integer.toString(1);

	Test1() {
		this.fileSize = 0;
		category = "asd.asd";

		Integer.parseInt("1");

		String answer = "";
		String []tempFileExtension = category.split(".");
		System.out.println("data:" + Arrays.toString(category.split(".")));
		System.out.println("Size:" + tempFileExtension.length);

		List<FileType> filetypes = new ArrayList<FileType>();
		filetypes.add(new FileType("music"));
		filetypes.add(new FileType("images"));
		filetypes.add(new FileType("movies"));
		filetypes.add(new FileType("other"));
		filetypes.get(0).size += fileSize;

		StringBuilder sb = new StringBuilder();
	}

	public static void updateFileSize(Map<String, Integer> files, String name, int fileSize) {
		files.put(name, files.get(name) + fileSize);
	}

	public static String getCategoryAnswer(Map<String, Integer> files, String name) {
		return name + " " + files.get(name) + "b\n";
	}
}

class FileType {
	String name;
	int size;

	FileType(String name) {
		this.name = name;
		size = 0;
	}
}