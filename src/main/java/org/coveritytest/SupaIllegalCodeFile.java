package org.coveritytest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SupaIllegalCodeFile {

  private static String sharedResource;

  public static void main(String[] args) {
    // Null Pointer Dereference
    String str = null;
    if (str.equals("test")) { // Bug: Null pointer dereference
      System.out.println("This will never be printed.");
    }

    // Resource Leak
    try {
      BufferedReader reader = new BufferedReader(new FileReader("nonexistent.txt"));
      String line = reader.readLine();
      System.out.println(line);
      // Bug: Reader is not closed properly
    } catch (IOException e) {
      System.out.println("File not found.");
    }

    // Deadlock
    Object lock1 = new Object();
    Object lock2 = new Object();

    Thread thread1 = new Thread(() -> {
      synchronized (lock1) {
        try {
          Thread.sleep(50); // Simulate work
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        synchronized (lock2) { // Bug: Potential deadlock
          System.out.println("Thread 1 acquired lock2.");
        }
      }
    });

    Thread thread2 = new Thread(() -> {
      synchronized (lock2) {
        try {
          Thread.sleep(50); // Simulate work
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        synchronized (lock1) { // Bug: Potential deadlock
          System.out.println("Thread 2 acquired lock1.");
        }
      }
    });

    thread1.start();
    thread2.start();
  }

  // Static Analysis Bug: Missing Synchronization
  public static void setSharedResource(String resource) {
    sharedResource = resource; // Bug: No synchronization
  }

  public static String getSharedResource() {
    return sharedResource; // Bug: No synchronization
  }
}