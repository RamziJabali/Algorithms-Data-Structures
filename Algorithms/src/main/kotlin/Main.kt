import java.util.*

fun main(args: Array<String>) {
    val quickSort = QuickSort()
    val array = arrayOf(1, 5, 3, 7, 3, 2)
    val solution = quickSort.quickSort(array, 0, array.size - 1)
    println(array.contentToString())
}