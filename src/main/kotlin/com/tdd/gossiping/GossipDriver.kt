package com.tdd.gossiping

class GossipDriver {
    private val maxStop = 480
    fun finishGossip(roadMaps: List<String>): String {
        val roadIntList = roadMaps.map { repeatList(convertList(it)) }
        for (i in roadIntList[0].indices) {
            if (roadIntList.map { it[i] }.distinct().size == 1) {
                return (i + 1).toString()
            }
        }
        return "never"
    }

    private fun convertList(input: String): List<Int> = input.split(" ").map { it.toInt() }
    private fun repeatList(originalList: List<Int>): List<Int> =
        originalList.repeat(maxStop / originalList.size + 1).take(maxStop).toList()

    private fun <T> List<T>.repeat(n: Int) = sequence { repeat(n) { yieldAll(this@repeat) } }
}
