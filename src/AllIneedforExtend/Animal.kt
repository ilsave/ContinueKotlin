package AllIneedforExtend

open class Animal(val name: String, var weight: Float, val habitat: String) {
    open fun eat(){
        println("eating...")
    }
    open fun run(){
        println("running")
    }
}