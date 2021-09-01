package com.tdd.gossiping

class GossipDriver {
    fun finishGossip(roadMap: List<String>): String {
        return if (roadMap.size == 2) "1" else "never"
    }


}
