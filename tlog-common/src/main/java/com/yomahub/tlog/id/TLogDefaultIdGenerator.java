package com.yomahub.tlog.id;

import com.yomahub.tlog.id.snowflake.UniqueIdGenerator;

import java.util.UUID;

public class TLogDefaultIdGenerator extends TLogIdGenerator{
//    @Override
//    public String generateTraceId() {
//        return UniqueIdGenerator.generateStringId();
//    }
    @Override
    public String generateTraceId() {
        return String.valueOf(UUID.randomUUID());
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
