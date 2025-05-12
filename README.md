#Find K Closest Elements
This Java program implements an efficient algorithm to find the `k` closest integers to a target value `x` in a **sorted integer array**. The result is returned as a list of integers sorted in ascending order.

#Problem Statement
Given a sorted integer array `arr`, two integers `k` and `x`, return the `k` closest integers to `x` in the array.
The result should also be sorted in ascending order. A number `a` is closer to `x` than a number `b` if:
- `|a - x| < |b - x|`, or
- `|a - x| == |b - x|` and `a < b`

#Features
- Handles edge cases where `x` is smaller than the first element or greater than the last element.
- Uses binary search to efficiently locate the closest starting point.
- Two-pointer technique to collect the `k` closest elements.

#How It Works

1. Binary search to find the lower bound (first index where `arr[i] >= x`).
2. Expand outward using two pointers (`i` left, `j` right) to collect the closest elements.
3. Return the `k` closest values in sorted order.

#Example

#Input:
arr = [-2, -1, 1, 2, 3, 4, 5]
k = 4
x = 3

#Output:
[1, 2, 3, 4, 5]

#File Structure
Solution.java: Main Java class with the solution and a sample test case.

Answer class: Contains the core logic in findClosestElements() method.

main method: Demonstrates usage of the function with a sample input.

#How to Run
Make sure you have Java installed.
Compile and run the program:

javac ques8.java
java ques8

#Related Concepts

Binary Search
Two-pointer Technique
Array Manipulation

#Author
Developed as a practice problem solution using efficient searching and selection techniques in Java.
