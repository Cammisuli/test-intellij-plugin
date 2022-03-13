package com.github.cammisuli.testintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.cammisuli.testintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
