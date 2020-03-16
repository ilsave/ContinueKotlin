import Annonymus.*
import GenericsStuff.MyArrayList
import GenericsStuff.MyList
import SingleTonPackage.Database
import SingleTonPackage.Test
import WorkingWithStatic.Calculator
import WorkingWithStatic.MyRandom
import javax.xml.crypto.Data

fun main() {

//    val user = User()
//    user.name = null
//    user.age = -19
//    println("name : ${user.name}  age : ${user.age}")
//
//    val Russia = Country("Russia", 144_000_000)
//    //Russia.name = "Soviet Union"
//    val Germany = Country(population = 1000)
//    println(Germany.population)
//    val book = Book("Alice in wonderful world")
//    println("name: ${book.name} date: ${book.date} price: ${book.price}")
    //!!lesson number 3
//    val cat = Cat("Marta", 5, 3f)
//    cat.printInfo()
//    println(cat.isOld)
//    cat.age = 30
//    cat.printInfo()
//    println(cat.isOld)
    //homework number 3

//    val programmer = Worker("ivan", "developer", 2019)
//    programmer.printInfo()

    //lesson number 6
//    val student1 = Student("Ilya", "Gushchin", 12345)
//    val student2 = Student("Ilya", "Gushchin", 12345)
//    val (name, lastName, id) = student1
//    val student3 = student1.copy(id = 12321)
//    println("$name $lastName $id")
//    println(student1)
//    println(student2)
//    println(student1.hashCode())
//    println(student2.hashCode())
//    println(student2 == student1)
//    println(student1 === student2)


    //lesson number 7 ENUM CLASSES
//    val month: Months = Months.OCTOBER
//    val season = when(month){
//        Months.DECEMBER, Months.JANUARY, Months.FEBROARY -> Season.WINTER
//        Months.MARCH, Months.APRIL, Months.MAY -> Season.SPRING
//        Months.JUNE, Months.JULY, Months.AUGUST -> Season.SUMMER
//        Months.SEPTEMBER, Months.OCTOBER, Months.NOVEMBER -> Season.AUTUMN
//    }
//    println(season)
//    println(season.tempAverage)

    //lesson number 8 Наследование и интерфейсы и каст еще
//    val dog = Dog(3.83f)
//    println(dog.habitat)
//
//    val workers = mutableListOf<WorkerF>()
//    workers.add(Seller("Leo", 12))
//    workers.add(Seller("Leonard", 35))
//    workers.add(Seller("Ivan", 39))
//    workers.add(Developer("Ilya", 19, "java and kotlin"))
//    workers.add(Director("Stive", 51))
//
//    for (worker in workers){
//        worker.work()
//        if (worker is Developer){
//            println(worker.language)
//        }
//        if (worker is Cleaner){
//            worker.clean()
//        }
//    }
//
//    val cleaners = workers.filter{it is Cleaner}.map { it as Cleaner }
//    for (cleaner in cleaners){
//        cleaner.clean()
//    }


    //lesson number 10 Анонимные классы (Папка Annonimus)
//    val car: Transport = Car("Caring")
//    val bicycle: Transport = Bicycle()
//
//   // if (car is Car && car.startEngine())
//
//    //anonimus class
//    travel(object : Transport("bus"){
//        override fun drive() {
//            println("bus is moving")
//        }
//    })
//
//    val sportsman = Sportsman()
////    sportsman.callWaterBoy(object: WaterBoy{
////        override fun BringWater() {
////            println("bring me water")
////        }
////    })
//    sportsman.callWaterBoy { println("bring me water") }


    //Lesson number 13 (работа со статикой)
//    println(Calculator.square(4)) // вызов метода без создания объекта класса
//    println(Calculator.lenghtOfCircle(5).toInt())
//    println(MyRandom.randomInt(5,10))
//    println(MyRandom.randomBoolean())
//    println(MyRandom.randomDayOfWeek())

//    //Lesson number 14 (SingleTon)
//    val db = Database
//    db.insertData("1")
//    db.insertData("2")
//    for (str in db.data){
//        println(str)
//    }
//
//    val test = Test()
//    test.insertTestData("3")
//    test.insertTestData("4")
//    for (str in db.data){
//        println(str)
//    }

    //Lesson number 15 (Generics)

    val list: MyList<Int> = MyArrayList()
//    for (i in 0..100){
//        list.add(i)
//    }
//    for (i in 0..90){
//        list.removeAt(0)
//    }
//    for (i in 0 until list.size()){
//        println(list.get(i))
//    }

    //Lesson number 16(FINAL YE GENERICS )
    val list1: MyList<String> = MyArrayList.myListOf()
    for (i in 0..100){
        list1.add("$i")
    }
    for (i in 0..90){
        list1.removeAt(0)
    }
    for (i in 0 until list1.size()){
        println(list1.get(i))
    }
}

fun travel(transport: Transport){
    transport.drive()
}

fun Worker.printInfo(){
    println("Name: $name  Workposition: $position   StartYear: $startYear  Experience: $experience")
}

