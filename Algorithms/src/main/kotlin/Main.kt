import Sorting.MergeSort
import Sorting.QuickSort
import binarysearchtree.BinarySearchTree

fun main(args: Array<String>) {
    val a = QuickSort()
    val b = MergeSort()
    val array = arrayOf(1, 5, 3, 7, 3, 2)
    val array2 = arrayOf(1, 9, 5, 8, 7, 0, 2,6)
//    a.quickSort(array, 0, array.size - 1)
//    b.mergeSort(array2)
//    println(array2.contentToString())
    val tree = BinarySearchTree(1)
    tree.addNumber(2)
    tree.addNumber(0)
    tree.addNumber(-1)
    tree.addNumber(3)
    println(tree.getSmallestNumber())
}