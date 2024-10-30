package ru.shvyrkov.MySecondTestAppSpringBoot.service;

import java.time.Instant;

public interface TimeDifferenceCalculatorService {
    long calculateTimeDifference(Instant startTime, Instant endTime);
}
