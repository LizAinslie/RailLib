package me.railrunner16.lib.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Denotes that a parameter, field or method return value can never be null.
 */
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target({
    ElementType.METHOD,
    ElementType.PARAMETER,
    ElementType.LOCAL_VARIABLE,
    ElementType.FIELD
})
public @interface NotNull {}
