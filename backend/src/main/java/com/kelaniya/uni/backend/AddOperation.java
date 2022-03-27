package com.kelaniya.uni.backend;

import org.springframework.stereotype.Component;

@Component
public class AddOperation implements Operation {
    @Override
    public int execute(int a, int b) {
        return a+b;
    }
}
