package com.sort;

import org.json.simple.*;;

public class InsertionSort {

  private static int count = 0;
  public static void main(String[] args) {
    String fileName =
      "C:\\Users\\rudyc\\Documents\\GitHub\\Lovelace-Cupcakes\\demo\\src\\main\\java\\com\\sort\\cupcake_3906.json";
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
    insertionSort(cupcakeNameArray);

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

//insertion sort array
//thank god it works
  public static void insertionSort(String[] arr) {
      for (int i=0; i < arr.length; i++) { 
          for (int j = i + 1; j < arr.length; j++) { 
              if (arr[i].compareTo(arr[j]) 
                  > 0) { 
                  String temp = arr[i]; 
                  arr[i] = arr[j]; 
                  arr[j] = temp; 
              } 
          } 
      } 
  } 
}

