package Annonymus

class Car(override var name: String): Transport(name) {
    override fun drive() {
        println("Car is moving")
    }

    fun startEngine(): Boolean{
        println("Engine is starting")
        return true
    }
}