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
	//모든 정보를 가져올 메서드 추상화
	public List<Sample> getSampleList(){
		List<Sample> list = sampleMapper.selectSampleList();
		return list;
	}
	//한개의 정보를 가져옴
	public List<Sample> getSampleOne(int sampleId){
		List<Sample> listOne = sampleMapper.selectSampleOne(sampleId);
		return listOne;
	}
	//한개의 정보를 추가함
	public int addSample(String sampleName){
		int result = 0;
		result= sampleMapper.insertSample(sampleName);
		return result;
	}
	//한개의 정보를 삭제함
	public int removeSample(int sampleId){
		int result = 0;
		result= sampleMapper.deleteSample(sampleId);
		return result;
	}
	//한개의 정보를 수정함
	public int modifySample(Sample sample){
		int result = 0;
		result= sampleMapper.updateSample();
		return 0;
	}
}
