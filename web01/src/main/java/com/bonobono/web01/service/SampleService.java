package com.bonobono.web01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bonobono.web01.mapper.SampleMapper;
import com.bonobono.web01.vo.Sample;

@Service
public class SampleService {
	@Autowired 
	private SampleMapper sampleMapper;	
	public List<Sample> getSampleList(){
		List<Sample> list = sampleMapper.selectSampleList();
		return list;
	}
	public Sample getSampleOne(){
		return null;
	}	
	public int addSample(Sample sample){
		int result = 0;
		result= sampleMapper.insertSample(sample);
		return result;
	}	
	public int removeSample(Sample sample){
		return 0;
	}	
	public int modifySample(Sample sample){
		return 0;
	}
}
