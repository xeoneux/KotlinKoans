import java.util.HashMap

fun <H, T> buildMap(build: MutableMap<H, T>.() -> Unit): Map<H, T> {
    val map = HashMap<H, T>()
    map.build()
    return map
}

fun usage(): Map<Int, String> {
    return buildMap {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}