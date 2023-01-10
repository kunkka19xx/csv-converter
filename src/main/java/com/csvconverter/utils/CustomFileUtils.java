package com.csvconverter.utils;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CustomFileUtils {
	/**
	 * Check file is exist in path
	 * @param path
	 * @return
	 */
	public static boolean isExist(String path) {
		Path filePath = Paths.get(path);
		if (Files.exists(filePath) && !Files.isDirectory(filePath)) {
			return true;
		}
		return false;
	}
}
