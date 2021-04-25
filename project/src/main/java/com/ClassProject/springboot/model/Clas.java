package com.ClassProject.springboot.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "clas")
public class Clas {

    private String name;

    private int section;

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
