package task3;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class InstallDependancies {

	public static void installModule(String module_name, Map<String, Object> json) throws IOException {
		if (json.get(module_name) == "[]") {
			if (isModuleInPackage(module_name)) {
				System.out.println(module_name + " is already installed.");
			} else {
				createPackage(module_name);
				System.out.println("Installing " + module_name);
			}
		} else {
			Object module = json.get(module_name);
			String nextModule = (String) module;
			System.out.println("Installing " + module_name);
			if (nextModule.contains(",")) {
				String[] splitName = nextModule.split(",");
				String nameOne = splitName[0];
				String nameTwo = splitName[1];
				System.out
						.println("In order to install " + module_name
								+ " you need to install " + nameOne + " and "
								+ nameTwo);
				installModule(nameOne, json);
				installModule(nameTwo, json);
			} else {
				System.out.println("In order to install " + module_name
						+ " you need to install " + nextModule);
				installModule(nextModule, json);
			}
		}
	}

	private static void createPackage(String module) throws IOException {
		String path = "D:\\ECLIPSE\\programming101Application\\src\\installed_modules\\"
				+ module;
		File file = new File(path);
			file.createNewFile();
	}

	private static boolean isModuleInPackage(String module_name) {
		File file = new File(
				"D:\\ECLIPSE\\programming101Application\\src\\installed_modules");
		File[] listOfFiles = file.listFiles();
		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isFile()) {
				if (listOfFiles[i].getName().equals(module_name)) {
					return true;
				}
				return false;
			}
		}
		return false;
	}

}
