package com.github.divyasaravanan.customplugin.services

import com.intellij.openapi.project.Project
import com.github.divyasaravanan.customplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
