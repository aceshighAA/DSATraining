package removeDuplicates

class RemoveDuplicates {
    fun removeDuplicates(nums: IntArray): Int {
        var index = 1

        for (i in 1..<nums.size) {
            if (nums[i] != nums[i - 1]) {
                nums[index] = nums[i]
                index++
            }
        }

        return index
    }
}