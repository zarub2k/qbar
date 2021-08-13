package xyz.tham.qbar.misc;

import java.util.Arrays;
import java.util.Locale;

public class SlugGenerator {
    public static final String get(String value) {
        StringBuilder builder = new StringBuilder();
        String[] values = value.split(" ");
        Arrays.stream(values)
                .forEach(s -> builder.append(s.toLowerCase() + "-"));
        return builder.substring(0, builder.length() - 1);
    }
}
