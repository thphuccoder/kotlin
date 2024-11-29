package tech.bumbii.experimental.v2_1_0

sealed class Animal {
    data class Cat(val mouseHunter: Boolean) : Animal() {
        fun feedCat() {
            println("feedCat() + mouseHunter = $mouseHunter")
        }
    }

    data class Dog(val breed: String) : Animal() {
        fun feedDog() {
            println("feedDog() + breed = $breed")
        }
    }
}

fun feedAnimal(animal: Animal) {
    when (animal) {
        is Animal.Dog -> animal.feedDog()
        is Animal.Cat if !animal.mouseHunter -> animal.feedCat()
        else -> println("Unknown animal")
    }
}

fun main() {
    feedAnimal(Animal.Dog(breed = "Dog"))
    feedAnimal(Animal.Cat(mouseHunter = false))
    feedAnimal(Animal.Cat(mouseHunter = true))
}