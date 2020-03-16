package WorkingWithStatic

class MyRandom {
    companion object{
        private const val Monday = "Monday"
        private const val Tuesday = "Tuesday"
        private const val Wednesday = "Wednesday"
        private const val Thursday = "Thursday"
        private const val Friday = "Friday"
        private const val Saturday = "Saturday"
        private const val Sunday = "Sunday"
        fun randomInt(from:Int, to: Int)=(Math.random() *(to-from+1)).toInt() + from
        fun randomBoolean() = randomInt(0, 1) > 0
        fun randomDayOfWeek(): String {
            val index = randomInt(1,7)
            return  when (index){
                1 -> Monday
                2 -> Tuesday
                3 -> Wednesday
                4 -> Thursday
                5 -> Friday
                6 -> Saturday
                else -> Sunday
            }
        }
    }
}