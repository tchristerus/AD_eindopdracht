import Algorithms.Searching.SequentialSearch;
import Algorithms.Sorting.BubbleSort;
import Algorithms.Sorting.InsertionSort;
import Algorithms.Sorting.QuickSort;
import Lists.*;
import Lists.BinarySearchTree.BinarySearchTree;
import Lists.DoublyLinkedList.DoublyLinkedList;
import Lists.LinkedList.*;
import Lists.LinkedList.LinkedList;
import Lists.Queue;
import Lists.Stack;
import models.Lego;
import utils.ArrayGrabber;
import utils.DatasetParser;

import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Lego> items = DatasetParser.parseDataSet("dataset.csv");

        ArrayList<Integer> itemNumbers = ArrayGrabber.getItemNumbers(items);
        ArrayList<String> itemNames = ArrayGrabber.getItemNames(items);


        // BinarySearch
        Comparator<Integer> byName = Comparator.naturalOrder();
        //BubbleSort
       // BubbleSort.sort(itemNumbers, byName).forEach(e-> System.out.println(e));
        //QuickSort
//        QuickSort.sort(itemNumbers, byName, 0, itemNumbers.size()-1).forEach(e-> System.out.println(e));
        //InsertionSort
        //InsertionSort.sort(itemNumbers, byName).forEach(e-> System.out.println(e));




        //Select wanted output
        int tr = 1;
        int print;
        Scanner in = new Scanner(System.in);
        while(tr == 1){
            //Prompt user for Input
            System.out.println("----------------");
            System.out.println("Enter Input: ");
            System.out.println("0 = Exit ");
            System.out.println("1 = Stack ");
            System.out.println("2 = Queue ");
            System.out.println("3 = LinkedList ");
            System.out.println("4 = DoublyLinkedList ");
            System.out.println("5 = BinarySearchTree ");
            System.out.println("----------------");

            try{
                print = in.nextInt();
            }catch (InputMismatchException ex) {
                print = -1;
            }

            if(print == 1)
            {
                //TEST Stack
                System.out.println("--------Stack--------");
                Stack<Integer> StackList = new Stack<Integer>();
                StackList.push(50);
                StackList.push(53);
                StackList.push(48);
                StackList.push(22);

                System.out.println("Stack Size: " + StackList.size());
                System.out.println("Pop item: " + StackList.pop());
                System.out.println("Top item: " + StackList.peek());
                System.out.println("Stack Size: " + StackList.size());
            }
            else if (print == 2)
            {
                //TEST Queue:
                System.out.println("--------Queue--------");
                Queue<Integer> QueueList = new Queue<Integer>();
                QueueList.enqueue(12);
                QueueList.enqueue(13);
                QueueList.enqueue(18);
                QueueList.enqueue(2);

                System.out.println("Queue Size: " + QueueList.size());
                System.out.println("Dequeue item: " + QueueList.dequeue());
                System.out.println("First item: " + QueueList.peek());
                System.out.println("Queue Size: " + QueueList.size());
            }
            else if (print == 3)
            {
                System.out.println("--------LinkedList--------");

                LinkedList<Integer> Linkedlist = new LinkedList<Integer>();
                Linkedlist.add(10246);
                Linkedlist.add(10247);
                Linkedlist.add(10587);
                Linkedlist.add(10591);
                Linkedlist.add(10592);
                Linkedlist.add(10593);
                Linkedlist.add(10594);
            }
            else if (print == 4)
            {
                System.out.println("--------DoublyLinkedList--------");

                DoublyLinkedList<Integer> DoublyLinkedList = new DoublyLinkedList<Integer>();
                DoublyLinkedList.addFirst(10246);
                DoublyLinkedList.addFirst(10247);
                DoublyLinkedList.addLast(10587);
                DoublyLinkedList.addLast(10590);
                DoublyLinkedList.addLast(10591);
                DoublyLinkedList.addLast(10592);
                DoublyLinkedList.addLast(10593);
                DoublyLinkedList.addLast(10594);
                DoublyLinkedList.addLast(10595);
                DoublyLinkedList.getIterator();
                DoublyLinkedList.removeFirst();
                DoublyLinkedList.removeLast();
               // DoublyLinkedList.getIterator().getPrevious();
            } else if (print == 5)
            {
                System.out.println("--------BinarySearchTree--------");

                BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>(byName);
//                for (Integer x: itemNumbers) {
//                    binarySearchTree.insert(x);
//                }

                binarySearchTree.insert(8);
                binarySearchTree.insert(3);
                binarySearchTree.insert(1);
                binarySearchTree.insert(6);
                binarySearchTree.insert(4);
                binarySearchTree.insert(7);
                binarySearchTree.insert(13);
                System.out.println("Size: " + binarySearchTree.size());
                binarySearchTree.remove(8);
                System.out.println(" BinarySearchTree size = " + binarySearchTree.size());
//                //BinarySearchTree.delete(13);
//                System.out.println(" BinarySearchTree size after remove = " + BinarySearchTree.size());
//                BinarySearchTree.insert(155);
//               // BinarySearchTree.clear();
//                System.out.println(" BinarySearchTree size after clear = " + BinarySearchTree.size());

            }else if (print == 0)
            {
                //Close input
                tr = 0;
            }
            else if (print == -1)
            {
                System.out.println("Invalid Input...");
                tr = 0;
            }else
            {
                System.out.println("Invalid Number...");
            }
        }

    }


    }

