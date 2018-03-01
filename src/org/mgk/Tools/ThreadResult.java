package org.mgk.Tools;

/**
 * User: perrym
 * Date: 31.03.13
 * Time: 18:05
 */
public class ThreadResult {
	private int _result;

	public ThreadResult(int result) {
		_result = result;
	}

	public void print()
	{
		System.out.println(_result);
	}
}
