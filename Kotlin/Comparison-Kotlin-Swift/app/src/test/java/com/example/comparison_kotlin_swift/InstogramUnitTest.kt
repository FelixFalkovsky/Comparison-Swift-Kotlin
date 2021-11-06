package com.example.comparison_kotlin_swift

import kotlin.random.Random

/**
 * Ламбды в примере
 * */
fun main() {
    val posts = listOf(
        InstogramPost(0, Picture(generateRandomData(256)), ::pictureDownloader),
        InstogramPost(1, listOf(
            Picture(generateRandomData(256)),
            Picture(generateRandomData(256))),
            { pictures ->
                pictures
                .map(::pictureDownloader)
                //{ pic -> pic.data }
                .fold(byteArrayOf(), { acc, item -> acc + item })
            }),
        InstogramPost(2, Video(generateRandomData(1024)), ::videoDownloader)
    )
    println(posts)

    val downloadedContent = posts.map { post -> post.download() }.map { it.size }
    println(downloadedContent)
}

fun generateRandomData(lenght: Int): ByteArray = Random.nextBytes(lenght)

fun pictureDownloader(pic: Picture): ByteArray = pic.data
fun videoDownloader(video: Video): ByteArray = video.data

class InstogramPost<T>(
    val id: Long,
    val content: T,
    val downloader: (T) -> ByteArray
    ) {
    override fun toString(): String {
        return "InstogramPost(id: $id, content: $content)"
    }

    fun download(): ByteArray = downloader(content)
}

class Picture(
    val data: ByteArray
    ) {

}

class Video(
    val data: ByteArray
    ) {

}

class InstogramUnitTest {

}