package org.juventus.seo2.streams

import java.nio.file.Files
import java.nio.file.Paths

fun nioEx() {
    val directoryPath = Paths.get("D:\\Projects\\school\\tmp")
    Files.createDirectories(directoryPath)

    val filePath = Paths.get("D:\\Projects\\school\\tmp\\helloworld.txt")
    Files.createFile(filePath)

    Files.write(filePath, "Hello World".toByteArray())

    val newFilePath = Paths.get("D:\\Projects\\school\\tmp\\renamed.txt")
    Files.move(filePath, newFilePath)

    val exists = Files.exists(newFilePath)
    println("File exists: $exists")

    val content = Files.readAllBytes(newFilePath)
    println("File content: ${String(content)}")

    Files.list(directoryPath).forEach { println(it) }

    Files.walk(directoryPath)
        .sorted(Comparator.reverseOrder())
        .forEach {
            println("Delete: ${it.fileName}")
            Files.delete(it)
        }

}
