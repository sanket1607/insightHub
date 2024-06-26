package edu.uci.ics.betterprofbackend.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum GradeFlag {
    BMA("bm_"), CPB("cp_");

    private final String flagValue;

    public static GradeFlag fromString(String value) {
        if(value.isBlank()) return CPB;
        for (GradeFlag gradeFlag : GradeFlag.values()) {
            if (gradeFlag.flagValue.equalsIgnoreCase(value)) {
                return gradeFlag;
            }
        }
        throw new IllegalArgumentException();
    }
}
