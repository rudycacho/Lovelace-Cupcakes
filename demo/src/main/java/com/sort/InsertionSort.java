package com.sort;

import org.json.simple.*;;

public class InsertionSort {

  private static int count = 0;

  public static void main(String[] args) {
    String fileName =
      "C:\\Users\\rudyc\\Documents\\GitHub\\Lovelace-Cupcakes\\demo\\src\\main\\java\\com\\sort\\cupcake_test_10.json";
    // String fileName =
    //   "C:\\Users\\rudyc\\Documents\\GitHub\\Lovelace-Cupcakes\\demo\\src\\main\\java\\com\\sort\\cupcake_3906.json";

    // read cupcake names
    JSONArray cupcakeArray = JSONFile.readArray(fileName);
    String[] cupcakeNameArray = nameArray(cupcakeArray);
    System.out.println(cupcakeNameArray);

    // print unsorted list
    System.out.println("----- Unsorted array -----");
    print(cupcakeNameArray);

    // sort
    insertSort(cupcakeNameArray);

    // print sorted list
    System.out.println("----- Sorted array----- ");
    print(cupcakeNameArray);

    // print statistics
    System.out.println("----- Statistics -----");
    System.out.printf("Size of array = %d\n", cupcakeNameArray.length);
    System.out.printf("Count = %d\n", count);
  }

  // print cupcake array
  public static void print(String[] cupcakeNameArray) {
    System.out.printf("Number\tName\n");
    System.out.printf("------\t---------------\n");
    for (int i = 0; i < cupcakeNameArray.length; i++) {
      System.out.printf("%04d\t%s\n", i, cupcakeNameArray[i]);
    }
  }

  // get array of cupcake names
  public static String[] nameArray(JSONArray cupcakeArray) {
    String[] arr = new String[cupcakeArray.size()];

    // get names from json object
    for (int i = 0; i < cupcakeArray.size(); i++) {
      JSONObject o = (JSONObject) cupcakeArray.get(i);
      String name = (String) o.get("name");
      arr[i] = name;
    }
    return arr;
  }

//insert sort array
  public static void insertSort(String[] arr) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
        String key = arr[i];
        int j = i - 1;
    while (j >= 0 && key.length() < arr[j].length()) {
        arr[j + 1] = arr[j];
        j--;}
    arr[j + 1] = key;
        }
    }
}

