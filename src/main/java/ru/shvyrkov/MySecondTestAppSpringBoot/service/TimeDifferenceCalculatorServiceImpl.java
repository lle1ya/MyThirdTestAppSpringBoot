package ru.shvyrkov.MySecondTestAppSpringBoot.service;

import java.time.Duration;
import java.time.Instant;

public class TimeDifferenceCalculatorServiceImpl implements TimeDifferenceCalculatorService {
    @Override
    public long calculateTimeDifference(Instant startTime, Instant endTime) {
        Duration duration = Duration.between(startTime, endTime);
        return duration.toMillis();
    }
}
