package ru.shvyrkov.MySecondTestAppSpringBoot.util;

import java.time.Duration;
import java.time.Instant;

public class TimeDifferenceCalculator {
    public static long calculateTimeDifference(Instant startTime, Instant endTime) {
        Duration duration = Duration.between(startTime, endTime);
        return duration.toMillis();
    }
}
