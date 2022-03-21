package com.clamos.redis.queue;

public interface MessagePublisher {

    void publish(final String message);
}
