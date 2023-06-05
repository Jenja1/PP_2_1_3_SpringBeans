package app.model;

import org.springframework.stereotype.Component;

@Component
public class Timer {
    public long getTime() {
        return System.currentTimeMillis();
    }
}
