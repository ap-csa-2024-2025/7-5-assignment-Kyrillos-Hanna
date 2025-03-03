[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=18503664)
# unit-7-5-assignment

## Git Config
```
git config user.name "user"
git config user.email "email"
```

## Compiling and Running Java Programs
Note that since our classes are separate classes, you will need to compile ALL the files (at least one time).  You can do this by running
```
javac *.java
```
The star means to compile every file that is a Java file type.

Run your code by running
```
java Main
```

After you compile the shape classes, you only need to compile and run `Main.java` as usual.

# Instructions  

## Problem 1
Write a method, `public static void sortAndPrintDescending(String[] arr)`, which implements a selection sort on the array `arr`, so that the Strings are sorted in descending order. Then, print the sorted values on one line with a single space between values. Make sure to use the `String.compareTo()` method when sorting to decide the correct order of the Strings.

For example, if `sortAndPrintDescending` is called with the array arr initialized as `{"forest", "apple", "willow", "lake", "trees"}` then the following should be printed:
```
willow trees lake forest apple
```

## Problem 2
Write a method, `public static void selectSortDescending(ArrayList<Integer> list)`, which implements a selection sort on the `ArrayList` of `Integer` objects list. The elements should be sorted in descending order, so that the largest element comes first and the smallest element comes last. For example, if the parameter list would be printed as `[4, 6, 3, 7]` before a call to `selectSortDescending`, it would be printed as `[7, 6, 4, 3]` after the method call.
