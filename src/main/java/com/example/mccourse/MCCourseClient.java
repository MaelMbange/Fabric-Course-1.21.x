package com.example.mccourse;

import net.fabricmc.api.ClientModInitializer;

public class MCCourseClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        MCCourse.LOGGER.info("Hello Fabric client world!");
    }
    
}
