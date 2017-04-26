package com.reconciler.service.strategies;

import java.util.List;

import com.reconciler.DTO.SourceDTO;

public interface IExecutionStrategy {
	
	List<SourceDTO> execute(List<SourceDTO> sources);

	List<String> compareSources(List<SourceDTO> data);
}
