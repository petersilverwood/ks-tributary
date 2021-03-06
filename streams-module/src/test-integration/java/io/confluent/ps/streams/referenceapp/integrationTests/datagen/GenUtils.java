package io.confluent.ps.streams.referenceapp.integrationTests.datagen;

import java.time.Instant;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GenUtils {

  public static final Instant randomSeedInstant = new Calendar.Builder().setTimeZone(TimeZone.getTimeZone("UTC")).setDate(1982, 6, 10).build().toInstant();
  public static final long randomSeed = randomSeedInstant.toEpochMilli();

  public <T> List<T> createSomeStuff(Integer quantity, IntFunction<T> constructor) {
    return IntStream.range(0, quantity)
            .mapToObj(constructor)
            .collect(Collectors.toUnmodifiableList());
  }

}
