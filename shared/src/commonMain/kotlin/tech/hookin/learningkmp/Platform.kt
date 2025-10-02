package tech.hookin.learningkmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform