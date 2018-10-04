package BasicSyntax

import java.nio.file.Files
import java.nio.file.Paths

fun fileReadTest() {
    val stream = Files.newInputStream(Paths.get("/test.txt"))
    stream.buffered().reader().use { reader ->
        println(reader.readText())
    }
}