package com.company.test.java;

public class test2 {
    public static void test() {
        System.out.println("A");
    }
}

a.	public static final String name = "Guy Dwyer";
        
        public List<Person> people = new List<Person>();
        
        b.	How would you declare and instantiate a new HashMap named "map" with an Integer type for its Keys and the value as a String
        
        public Map<Integer, String> map = new HashMap<Integer, String>();
        map.size()
        map.put(14, "Guidewire");
        map.put(14, "another");
        
        public class Name{

    private String firstName;
    private String lastName;

    public Name(String fName, String lName){
        this.firstName = fName;
        this.lastName = lName;
    }

    @Override
    public boolean equals(Object o) {
Name cmp = (Name)o;
if(cmp.getLastName().equals(this.lastName)) {
return true;
}

        return false;
    }

            public String getLastName(){
return this.lastName;
    }

}

// Using the class above, what is the result of the follow lines of code? Can you explain why each answer is the way it is?
        Name name1 = new Name ("John", "Doe");
        Name name2 = new Name ("Susan", "Doe");
        Name name3 = name1;

        System.out.println(name1 == name2); // False
        System.out.println(name1.equals(name2)); // True
        System.out.println(name1 == name3); // True
        
        // Update the Name class above so that the equals method returns true if the lastName is the same //
        
        
        i.	<Orders>
<Order id="123">
<Symbol> 6758.T</Symbol>
<Price> 2300</Price>
<Order>
<Orders>


        SELECT, WHERE and ORDER
        
        
        public abstract class Parent{
    private String name;
    public int age;
    public static String type;

    public Parent(){
    }

    public Parent(int a, String n){
        this.name = n;
        this.age = a;
    }

    public abstract String getNameLength();

    public String getType(){
        return this.type;
    }
}

// Implement a class called Child that extends Parent, this class should have at least one class level variable called classValue of type String. //
// The class should have two constructors, one which populates classValue only, and another which populates classValue as well as the name and age variables in Parent. //

        public class Child extends Parent {
private String classValue;

        Child(String value) {
this.classValue = value;
}

        Child(String value, int a, String n) {
super(a, n);
this.classValue = value;
}

        @Override
public String getNameLength() {
return this.name.length;
}
}

findpair({1,2,-3,4,5,6}, 10) = true;
        findpair({1,2,3,4,5,6}, 17) = false;

        
        Complete the method so that it returns true if any two values in the input array add up to the sum passed in

        public boolean findPair(int[] numbers, int sum) {
         Set<Integer> findpair = new Set<Integer>();
        
        for( int i : numbers ) {
        int remaining = sum - i;
        if(remaining >= 0 && findpair.contains(remaining)) {
        // Found
        return true;
        } else {
        findpair.add(i);
        }
        }
        
        return false;
        }
        
        Write a function, that returns the factorial number of the given parameter.


            public static int nFactorial(int factor) {
        // returns factorial number
        if( factor == 0 ) {
        return 1;
        }
        
         return factor * nFactorial(factor-1);
        }
        
        function tailrec(x, running_total = 1) {
        if (x === 0) {
        return running_total;
        } else {
        return tailrec(x - 1, running_total * x);
        }
        }