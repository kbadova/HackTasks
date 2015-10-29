package task3;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {

		Map<String, Object> allPackages = new HashMap<>();
		allPackages.put("backbone", "jQuery,underscore");
		allPackages.put("jQuery", "queryJ");
		allPackages.put("underscore", "lodash");
		allPackages.put("queryJ", "[]");
		allPackages.put("lodash", "[]");

		HashMap<String, Object> dependencies = new HashMap<>();
		dependencies.put("projectName", "Test0000");
		dependencies.put("dependencies", "backbone");

		InstallDependancies.installModule("backbone", allPackages);
	}
}
