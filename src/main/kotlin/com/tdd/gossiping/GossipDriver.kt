package com.tdd.gossiping

class GossipDriver {
    fun finishGossip(roadMaps: List<String>): String {
        return if (roadMaps.size > 1) {
            if (roadMaps.distinct().size == 1) "1" else "never"
        } else {
            "never"
        }
    }
}
