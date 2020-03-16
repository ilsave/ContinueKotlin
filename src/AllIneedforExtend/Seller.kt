package AllIneedforExtend

class Seller(name:String, age: Int): WorkerF(name, age), Cleaner{
    override fun work() {
        println("Im selling the overpriced shoes>!")
    }

    override fun clean() {
        println("this seller is cleaning the room right now!> ")
    }

}