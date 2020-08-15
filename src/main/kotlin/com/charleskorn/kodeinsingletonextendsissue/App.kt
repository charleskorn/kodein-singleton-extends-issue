package com.charleskorn.kodeinsingletonextendsissue

import org.kodein.di.*

fun main(args: Array<String>) {
    val firstContainer = DI.direct {
        bind<Thing>() with singleton { Thing() }
    }

    val firstInstance = firstContainer.instance<Thing>()

    val secondContainer = DI.direct {
        extend(firstContainer, copy = Copy.All)
    }

    val secondInstance = secondContainer.instance<Thing>()

    println("From first container: $firstInstance")
    println("From second container: $secondInstance")
}

class Thing