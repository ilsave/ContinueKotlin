package AllIneedforExtend

class Director(name:String, age: Int): WorkerF(name, age) {
    override fun work() {
        println("Controlling the procces...")
    }
}