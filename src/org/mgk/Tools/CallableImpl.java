package org.mgk.Tools;

import java.util.concurrent.Callable;

public class CallableImpl implements Callable<ThreadResult> {
	private volatile boolean _running;
	private ThreadResult _result;

	public CallableImpl(int result) {
		_result = new ThreadResult(result);
	}

	public ThreadResult call() {
		_running = true;

		System.out.println("Running");
		//while (_running && !Thread.currentThread().isInterrupted())
		{
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException ex) {
				System.out.println("Interrupted");
				//break;
			}
		}

		System.out.println("Exiting");

		_running = false;

		return _result;
	}

	public boolean isRunning()
	{
		return _running;
	}
}
