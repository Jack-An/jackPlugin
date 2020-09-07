package com.github.jack-an.jackplugin.services

import com.intellij.openapi.project.Project
import com.github.jack-an.jackplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
