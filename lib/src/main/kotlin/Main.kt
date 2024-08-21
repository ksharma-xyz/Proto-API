import powerpuff.PowerpuffGirl

import powerpuff.PowerpuffGirl.Ability.FLIGHT
import powerpuff.PowerpuffGirl.Ability.SPEED

fun main() {

    val powerpuffGirl = PowerpuffGirl.Builder()
        .id(id = 1)
        .name(name = "Bubble")
        .type(type = PowerpuffGirl.Type.BUBBLE)
        .abilities(listOf(FLIGHT, SPEED))
        .build()

    println(powerpuffGirl.encodeByteString())
    println("size: ${powerpuffGirl.encodeByteString().size} bytes")
}

/**
 * [hex=08011206427562626c65180218042000]
 * size: 16 bytes
 */