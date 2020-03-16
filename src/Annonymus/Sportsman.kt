package Annonymus

class Sportsman {
    fun callWaterBoy(waterBoy: WaterBoy){
        waterBoy.BringWater()
    }
    inline fun callWaterBoy(bringWater: () -> Unit){
        bringWater()
    }
}