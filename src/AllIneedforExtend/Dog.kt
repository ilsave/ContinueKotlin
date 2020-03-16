package AllIneedforExtend

import AllIneedforExtend.Animal

class Dog (weight: Float): Animal("dog", weight, "Land"){
    override fun eat(){
        println("eating the bones")
    }
}