package com.reconciler.service.strategies;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.reconciler.DTO.SourceDTO;
import com.reconciler.service.IExecutionService;

public class OnTheFlyStrategy implements IExecutionStrategy {

	private IExecutionService executionService;
	private ExecutorService executor = null;
	
	@Override
	public List<SourceDTO> execute(List<SourceDTO> sources) {
		try {
			List<SourceDTO>data=null;
			if (sources != null) {
				executor = Executors.newFixedThreadPool(sources.size());
				data=new ArrayList<SourceDTO>();
				for (SourceDTO source : sources) {
					Future<SourceDTO> res = executor.submit(new OnFlyThread(source));
					data.add(res.get());
				}
				executor.shutdown();
				System.out.println("Main thread exiting.");
			}
			return data;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<String> compareSources(List<SourceDTO> data) {
		// TODO Auto-generated method stub
		return null;
	}

	
	class OnFlyThread implements Callable<SourceDTO> {
		private Thread thread;
		private SourceDTO sourceDto;

		public OnFlyThread(SourceDTO source) {
			this.sourceDto = source;
			thread = new Thread(source.getConfgName());
			System.out.println("New thread: " + thread);
			thread.start();
		}

		@Override
		public SourceDTO call() throws Exception {
			try {
				sourceDto.setResult(sourceDto.getJdbcTemplate().queryForRowSet(sourceDto.getSqlStatment()));
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(sourceDto.getConfgName() + " exiting.");

			return sourceDto;
		}

	}
	
}
