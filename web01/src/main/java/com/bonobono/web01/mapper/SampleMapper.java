package com.bonobono.web01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bonobono.web01.vo.Sample;

@Mapper
public interface SampleMapper {
	//모든 정보를 가져올 메서드 추상화
	//리스트에 객체정보가담긴 주소를 담고 그 주소를 리턴 한다
	List<Sample> selectSampleList();
	
	//한개의 정보를 가져옴
	List<Sample> selectSampleOne(int sampleId);
	
	//한개의 정보를 추가함
	//정상적으로 실행이되면 1을 리턴받고 실패하면 0을 리턴 받는다
	int insertSample(String sampleName);
	
	//한개의 정보를 삭제함
	int deleteSample(int sampleId);
	
	//한개의 정보를 수정함
	int updateSample(Sample sample);
}
