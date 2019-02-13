package com.bonobono.web01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bonobono.web01.vo.Sample;

@Mapper
public interface SampleMapper {
	//모든 정보를 가져올 메서드 추상화
	List<Sample> selectSampleList();
	
	//한개의 정보를 가져옴
	Sample selectSampleOne();
	
	//한개의 정보를 추가함
	int insertSample(String sampleName);
	
	//한개의 정보를 삭제함
	int deleteSample(int sampleId);
	
	//한개의 정보를 수정함
	int updateSample();
}
