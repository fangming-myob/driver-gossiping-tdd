package com.tdd.gossiping

class GossipDriver {
    fun finishGossip(roadMaps: List<String>): String {
        for (i in roadMaps[0].indices) {
            if (roadMaps.map { it[i] }.distinct().size == 1) {
                return (i + 1).toString()
            }
        }
        return "never"
    }
}
