package com.bonobon.web01.vo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bonobon.web01.vo.Sample;

@Mapper
public interface SampleMapper {
	List<Sample> selectSampleList();
}
