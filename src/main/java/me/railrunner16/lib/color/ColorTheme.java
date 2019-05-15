package me.railrunner16.lib.color;

import java.awt.Color;
import java.util.List;
import java.util.Arrays;
import java.util.Random;

/**
 * A base color theme
 * @author RailRunner16
 */
public class ColorTheme {
	private Color darkColor;
	private Color lightColor;
	private List<Color> colors;
	private String name;
	private boolean dark;

	/**
	 * Create a new color theme.
	 * @param name The theme name.
	 * @param darkColor The dark background/text color.
	 * @param lightColor The light background/text color.
	 * @param colors The theme colors.
	 */
	public ColorTheme(String name, Color darkColor, Color lightColor, Color... colors) {
		this(name, darkColor, lightColor, false, colors);
	}
	
	/**
	 * Create a new color theme.
	 * @param name The theme name.
	 * @param darkColor The dark background/text color.
	 * @param lightColor The light background/text color.
	 * @param isDarkTheme Whether or not the theme is primarily dark.
	 * @param colors The theme colors.
	 */
	public ColorTheme(String name, Color darkColor, Color lightColor, boolean isDarkTheme, Color... colors) {
		this.name = name;
		this.dark = isDarkTheme;
		
		this.darkColor = darkColor;
		this.lightColor = lightColor;

		this.colors = Arrays.asList(colors);
	}

	/**
	 * Get the list of colors.
	 * @return The list of colors.
	 */
	public List<Color> getColors() {
		return this.colors;
	}

	/**
	 * Get the dark background/text color.
	 * @return The dark background/text color.
	 */
	public Color getDarkColor() {
		return this.darkColor;
	}

	/**
	 * Get the light background/text color.
	 * @return The light background/text color.
	 */
	public Color getLightColor() {
		return this.lightColor;
	}

	/**
	 * Get the theme name.
	 * @return The theme name.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Find whether or not the theme is primarily dark.
	 * @return Whether or not the theme is primarily dark.
	 */
	public boolean isDark() {
		return this.dark;
	}

	/**
	 * Get a random color from the list of theme colors.
	 * @return The randomly chosen color.
	 */
	public Color randomColor() {
		Random r = new Random();
		Color[] colors = this.colors.toArray(new Color[0]);

		int index = r.nextInt(colors.length);

		return colors[index];
	}
}
