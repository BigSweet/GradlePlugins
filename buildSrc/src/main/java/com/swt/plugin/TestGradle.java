package com.swt.plugin;

import org.gradle.api.Action;
import org.gradle.api.Plugin;
import org.gradle.api.Project;

class TestGradle implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        Test test = project.getExtensions().create("android2", Test.class);
        project.afterEvaluate(new Action<Project>() {
            @Override
            public void execute(Project project) {
                System.out.println(test.getName());
                System.out.println(test.getAge());
            }
        });
    }
}