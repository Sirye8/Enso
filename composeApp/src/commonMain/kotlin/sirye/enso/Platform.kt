package sirye.enso

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform