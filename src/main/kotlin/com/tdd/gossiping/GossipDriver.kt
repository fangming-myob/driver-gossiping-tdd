package com.tdd.gossiping

class GossipDriver {
    fun finishGossip(roadMap: List<String>): String {
        return if (roadMap.size > 1) {
            if (roadMap[0] == roadMap[1]) "1" else "never"
        } else {
            "never"
        }
    }


}
