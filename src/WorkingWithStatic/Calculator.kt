package WorkingWithStatic

class Calculator {


    companion object {
        const val PI = 3.14
        fun square(num: Int) = num*num
        fun lenghtOfCircle(r: Int) = 2 * PI * r
    }

}