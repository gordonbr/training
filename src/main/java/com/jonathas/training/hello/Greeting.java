package com.jonathas.training.hello;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "All details about the Greeting. ")
public class Greeting {

    @ApiModelProperty(notes = "The greeting id")
    private final long id;

    @ApiModelProperty(notes = "The greeting content")
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
