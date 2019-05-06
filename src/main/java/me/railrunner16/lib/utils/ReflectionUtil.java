package me.railrunner16.lib.utils;

import java.lang.reflect.Field;

/**
 * Reflection Utilities
 * @author RailRunner16
 */
public class ReflectionUtil {
    /**
     * Get a value from an object
     * @param obj The object to retrieve the value from
     * @param field The field to get the value of
     * @return The value of the specified field, or null (if not found, or if illegally accessed)
     */
    public static Object getValue(Object obj, String field) {
        try {
            Field f = getField(obj, field);

            if (f == null) return null;

            return f.get(obj);
        } catch (IllegalAccessException e) {
            return null;
        }
    }

    /**
     * Get a field from an object
     * @param obj The object to get the field from
     * @param field The name of the field to get from the object
     * @return The field specified, or null if not found
     */
    public static Field getField(Object obj, String field) {
        try {
            return obj.getClass().getField(field);
        } catch (NoSuchFieldException e) {
            return null;
        }
    }
}
