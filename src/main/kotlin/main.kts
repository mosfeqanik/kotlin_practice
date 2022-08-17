
fun printHello() {
    println("Hello World")
    println("Hello great World")
}
printHello()

val i: Int = 5
println(i)

val b1 = i.toByte()
println(b1)

val oneMillion = 1_000_000
println(oneMillion)

val socialSecurityNumber = 999_99_9999L
println(socialSecurityNumber)

val hexBytes = 0xFF_EC_DE_5E
println(hexBytes)

val bytes = 0b11010010_01101001_10010100_10010010
println(bytes)

val numberOfFish = 5
val numberOfPlants = 12
//println("I have $numberOfFish fish" + " and $numberOfPlants plants")
println("I have $numberOfFish fish and $numberOfPlants plants")

val numberOfFish1 = 50
val numberOfPlants2 = 23
if (numberOfFish1 > numberOfPlants2) {
    println("Good ratio!")
} else {
    println("Unhealthy ratio")
}


val fish = 150
if (fish in 1..100) {
    println(fish)
}

if (numberOfFish == 0) {
    println("Empty tank")
} else if (numberOfFish < 40) {
    println("Got fish!")
} else {
    println("That's a lot of fish!")
}


//main.kts:53:5: warning: condition 'fishFoodTreats != null' is always 'true'
//var fishFoodTreats = 6
//if (fishFoodTreats != null) {
//    fishFoodTreats = fishFoodTreats.dec()
//}


var fishFoodTreats = 6
fishFoodTreats = fishFoodTreats.dec()
println("fishFoodTreats + $fishFoodTreats")

fishFoodTreats = fishFoodTreats.dec() ?: 0
println(fishFoodTreats)

val school = listOf("mackerel", "trout", "halibut")
println(school)