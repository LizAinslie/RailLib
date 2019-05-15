package me.railrunner16.lib.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

/**
 * Denotes that a parameter, field or method return value can be null.
 * 
 * @paramDoc This value may be {@code null}.
 * @returnDoc This value may be {@code null}.
 */
@Retention(RetentionPolicy.SOURCE)
@Documented
@Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD})
public @interface Nullable {}
