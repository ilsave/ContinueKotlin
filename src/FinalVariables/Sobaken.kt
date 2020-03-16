package FinalVariables

class Sobaken {
    //private var a: String? =""
    private lateinit var a : String // lateinit означает позднюю инициализацию
    fun printA(){
        a ="qw"
        println(a)
    }
}