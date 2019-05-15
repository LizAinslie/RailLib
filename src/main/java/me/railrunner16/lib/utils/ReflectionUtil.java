package me.railrunner16.lib.utils;

import java.lang.reflect.Field;

import me.railrunner16.lib.annotations.Nullable;

/**
 * Reflection Utilities
 * @author RailRunner16
 */
public class ReflectionUtil {
     /**
     * Get all the accessible fields of an object
     *
     * @param o The object to get fields from
     * @return The object's fields
     */
    public static Field[] getFields(Object o) {
        return o.getClass().getFields();
    }

    /**
     * Retrieve a field from an object.
     *
     * @param o         The object to retrieve the field from.
     * @param fieldName The name of the field to retrieve.
     * @return The field, or null if the field does not exist.
     */
    @Nullable
    public static Field getField(Object o, String fieldName) {
        try {
            return o.getClass().getField(fieldName);
        } catch (NoSuchFieldException e) {
            return null;
        }
    }

    /**
     * Retrieve a value from an object's field.
     *
     * @param f The field to retrieve the value of.
     * @param o The object to retrieve the field from.
     * @return The value of the field, or null if access is denied.
     */
    @Nullable
    public static Object getFieldValue(Field f, Object o) {
        try {
            return f.get(o);
        } catch (IllegalAccessException e) {
            return null;
        }
    }
}
