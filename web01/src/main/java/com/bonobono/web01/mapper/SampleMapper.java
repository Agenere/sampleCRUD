package com.bonobono.web01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bonobono.web01.vo.Sample;

@Mapper
public interface SampleMapper {
	List<Sample> selectSampleList();
}
