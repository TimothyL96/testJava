// you can also use imports, for example:

import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
	public String solution(String S) {
		// write your code in Java SE 8
		// Process input
		List<FileType> fileTypes = new ArrayList<FileType>();
		fileTypes.add(new FileType("music"));
		fileTypes.add(new FileType("images"));
		fileTypes.add(new FileType("movies"));
		fileTypes.add(new FileType("other"));

		for (String fileWithSize : S.trim().split("\n")) {
			String[] temp = fileWithSize.split(" ");

			// Get file name and size
			int fileSize = Integer.parseInt(temp[1].substring(0, temp[1].length() - 1));
			String fileName = temp[0];

			// Get file extension
			String[] tempFileExtension = fileName.split("\\.");
			String fileExtension = tempFileExtension[tempFileExtension.length - 1];

			// Check file extension
			switch (fileExtension) {
				case "mp3":
				case "aac":
				case "flac":
					// Music
					fileTypes.get(0).size += fileSize;
					break;
				case "jpg":
				case "bmp":
				case "gif":
					// Images
					fileTypes.get(1).size += fileSize;
					break;
				case "mp4":
				case "avi":
				case "mkv":
					// Movies
					fileTypes.get(2).size += fileSize;
					break;
				default:
					// Others
					fileTypes.get(3).size += fileSize;
			}
		}

		// Create answer string
		StringBuilder answer = new StringBuilder();

		for (FileType x : fileTypes) {
			answer.append(x.name);
			answer.append(" ");
			answer.append(x.size);
			answer.append("b\n");
		}


		return answer.toString();
	}
}

class FileType {
	String name;
	int size;

	FileType(String name) {
		this.name = name;
		size = 0;
	}
}