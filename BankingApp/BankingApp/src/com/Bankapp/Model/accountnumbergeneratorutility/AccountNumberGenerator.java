package com.Bankapp.Model.accountnumbergeneratorutility;

public interface AccountNumberGenerator {
	private String getStartingCode();
	private String getIfscCode(String Branch);
	private String getSequence();
	private void updateSequence();

}
