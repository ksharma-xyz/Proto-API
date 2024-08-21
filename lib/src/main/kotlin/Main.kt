import powerpuff.PowerpuffGirl

import powerpuff.PowerpuffGirl.Ability.FLIGHT
import powerpuff.PowerpuffGirl.Ability.SPEED

fun main() {

    val powerpuffGirl = PowerpuffGirl.Builder()
        .id(id = 1)
        .name(name = "")
        .type(type = PowerpuffGirl.Type.BUBBLE)
        .abilities(listOf(FLIGHT, SPEED))
        .build()

}
