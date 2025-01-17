/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package com.tdd.gossiping

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

class GossipDriverSpec : WordSpec({
    "Gossip driver" should {
        "init finishGossip method" {
            val roadMap = listOf("1")
            GossipDriver().finishGossip(roadMap) shouldBe "1"
        }

        "return 1 when 2 drivers have same 1 route" {
            val roadMap = listOf("1", "1")
            GossipDriver().finishGossip(roadMap) shouldBe "1"
        }

        "return never when 2 drivers have different 1 route" {
            val roadMap = listOf("1", "2")
            GossipDriver().finishGossip(roadMap) shouldBe "never"
        }

        "return never when multiple drivers have different 1 route" {
            val roadMap = listOf("1", "1", "3")
            GossipDriver().finishGossip(roadMap) shouldBe "never"
        }

        "return 1 when 2 drivers meet in the 1st stop" {
            val roadMap = listOf("1 1", "1 2")
            GossipDriver().finishGossip(roadMap) shouldBe "1"
        }

        "return 2 when 2 drivers meet in the 2nd stop" {
            val roadMap = listOf("3 5", "5 5")
            GossipDriver().finishGossip(roadMap) shouldBe "2"
        }

        "return 4 when 2 drivers meet in the 4th stop" {
            val roadMap = listOf("3 5", "1 3 2 5")
            GossipDriver().finishGossip(roadMap) shouldBe "4"
        }

        "return 6 when 2 drivers meet in the 6th stop" {
            val roadMap = listOf("3 1", "1 3 2 5 6 1")
            GossipDriver().finishGossip(roadMap) shouldBe "6"
        }
    }
})
