package divideTwoIntegers

import kotlin.math.abs

class DivideTwoIntegers {
    fun divide(dividend: Int, divisor: Int): Int {
        var remaining = abs(dividend)
        var divResult = 0
        var isNegative = false

        if(dividend == Int.MIN_VALUE && (divisor == -1 || divisor == 1) ){
            return Int.MAX_VALUE
        }

        if (divisor < 0 && dividend > 0 || divisor > 0 && dividend < 0) {
            isNegative = true
        }


        while (remaining >= abs(divisor)) {
            divResult++
            remaining -= abs(divisor)
        }

        if (isNegative) {
            divResult = -divResult
        }

        return divResult
    }
}