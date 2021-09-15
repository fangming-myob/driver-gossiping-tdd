package com.tdd.gossiping

class GossipDriver {
    fun finishGossip(roadMaps: List<String>): String {
        val roadIntList = roadMaps.map { convertList(it) }
        for (i in roadIntList[0].indices) {
            if (roadIntList.map { it[i] }.distinct().size == 1) {
                return (i + 1).toString()
            }
        }
        return "never"
    }

    private fun convertList(input: String): List<Int> = input.split(" ").map { it.toInt() }
}
