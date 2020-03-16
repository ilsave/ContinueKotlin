package AllIneedforExtend

class Developer(name: String,age: Int, val language : String): WorkerF(name, age), Cleaner {
    override fun work() {
        println("Im writing my code using $language")
    }

    override fun clean() {
        println("Developer is cleaning his table!")
    }
}