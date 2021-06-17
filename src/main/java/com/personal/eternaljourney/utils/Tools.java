package com.personal.eternaljourney.utils;

import java.util.UUID;

public class Tools {

    /**
     * 产生ID
     *
     * @return 生成的ID
     */
    public static String createID() {

        return UUID.randomUUID().toString().replaceAll("-", "");
    }

}
