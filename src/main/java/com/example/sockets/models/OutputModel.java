package com.example.sockets.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class OutputModel {
    String outMessage;


    public OutputModel(InputModel inputModel) {
        this.outMessage = inputModel.getName();
    }
}
