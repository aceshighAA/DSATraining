package missingNumber

class MissingNumber {
    fun missingNumber(nums: IntArray): Int {
        var currTotal = 0
        val normalTotal = ((nums.size + 1) * nums.size) / 2

        nums.forEach { num ->
            currTotal += num
        }
        val missingNumber = normalTotal - currTotal

        return missingNumber
    }
}