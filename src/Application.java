/**
 * User: perrym
 * Date: 26.03.13
 * Time: 0:50
 */
import org.mgk.Tools.CallableImpl;
import org.mgk.Tools.ThreadResult;

import java.util.*;
import java.util.concurrent.*;

public class Application {
    public static void main(String[] args) {
	    ExecutorService pool = Executors.newFixedThreadPool(10);
	    Set<Future<ThreadResult>> set = new HashSet<>();

		for (int i = 0; i < 10; i++) {
		    Callable<ThreadResult> callable = new CallableImpl(i);
		    Future<ThreadResult> future = pool.submit(callable);
		    set.add(future);
		}

	    for (Future<ThreadResult> future : set) {
		    try {
			    ThreadResult res = future.get();
			    res.print();
		    }
		    catch (Exception e) {
		    }
	    }

	    System.out.println("Done");

	    System.exit(0);
    }
}
