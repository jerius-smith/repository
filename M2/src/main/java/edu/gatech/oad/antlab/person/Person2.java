package edu.gatech.oad.antlab.person;

import java.util.Random;
/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string 
 *
 * @author Jerius
 * @version 1.1
 */
public class Person2 {
    /** Holds the persons real name */
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = pname;
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
	  //Person 2 put your implementation here
      String result = "";
      Random rand = new Random();
      String[] arr = new String[input.length()];
      int[] used = new int[input.length()];

      for (int n = 0; n < input.length(); n++) {
          arr[n] = input.substring(n, n + 1);
      }

      for (int i = 0; i < input.length(); i++) {
          int index = rand.nextInt(input.length()) + 1;

          while (contained(used, index)) {
              index = rand.nextInt(input.length()) + 1;

          }
          used[i] = index;
          result += arr[index - 1];
      }
	  return result;
	}
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}

    /**
     * Return whether index has already been used
     *
     * @param arr the array being searched
     * @param num the number being checked
     * @return whether the number was contained in the array
     */
    private boolean contained(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

}
