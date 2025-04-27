import divideTwoIntegers.DivideTwoIntegers
import removeDuplicates.RemoveDuplicates

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val removeDuplicates = RemoveDuplicates()
    println( removeDuplicates.removeDuplicates(intArrayOf(1,1,2,3,3,4,5,6,6,6)) )

    val divideTwoIntegers = DivideTwoIntegers()
    divideTwoIntegers.divide(1 , 1)
}