package com.Bankapp.Model.Account;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class AccountNumFileGenerator {

	private static String startCode = null;
	private static String sequence = null;
	private static Properties properties = new Properties();

	static {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("AccountNumDetails"));
			String startingCodeLine = reader.readLine(); //Starting code : ICI121
			String[] startingCode = startingCodeLine.split(":"); // startingCode[0] = Starting code  startingCode[1] = ICI121
			startCode = startingCode[1];
			String sequenceLine = reader.readLine();
			sequence = sequenceLine.split(";")[1];
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try {
			properties.load(new FileReader("ifsccodes"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getStartingCode() {

		return startCode;
	}

	public static String getIfscCode(String branchName) {
		return properties.getProperty(branchName);
	}

	public static int getSequence() {
		int nextNum = Integer.parseInt(sequence);
		nextNum++;
		sequence = String.valueOf(nextNum);
		return nextNum;
	}
}
