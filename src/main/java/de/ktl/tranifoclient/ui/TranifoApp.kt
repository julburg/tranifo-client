package de.ktl.tranifo.ui

import javafx.scene.text.FontWeight
import tornadofx.App
import tornadofx.Stylesheet
import tornadofx.px

class TranifoApp : App(TranifoConfiguration::class, Styles::class)

class Styles : Stylesheet() {
    init {
        label {
            fontSize = 15.px
            fontWeight = FontWeight.BOLD
        }


    }    
}