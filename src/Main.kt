import missingNumber.MissingNumber

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val intArray = intArrayOf(0)
    val intArray2 = intArrayOf(0, 1, 2)
    val intArray3 = intArrayOf(0, 2, 3, 4)
    val intArray4 = intArrayOf(0, 1, 2, 3)

    val missingNumber = MissingNumber()
    println(missingNumber.missingNumber(intArray))
    println(missingNumber.missingNumber(intArray2))
    println(missingNumber.missingNumber(intArray3))
    println(missingNumber.missingNumber(intArray4))
}