package org.mgk.Tools;

public class ThreadResult {
	private int _result;

	ThreadResult(int result) {
		_result = result;
	}

	public void print()
	{
		System.out.println(_result);
	}
}
