package com.bonobono.web01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bonobono.web01.service.SampleService;
import com.bonobono.web01.vo.Sample;

@Controller
public class SampleController {
	@Autowired private SampleService sampleService;
	//1.입력폼
	@GetMapping("/addSample")
	public String addSample() {
		return "addSample"; //view 이름은 templates 폴더의 add 된 같은명의 view가 포워드됨
		
	}
	//2.입력 액션
	@PostMapping("/addSampleAction")
	public String addSample(@RequestParam(value="sampleName") String sampleName) {
			sampleService.addSample(sampleName);
		
		return "redirect:/sampleList";//redirect 가 없으면 forward된다
		
	}
	//3.목록
	@GetMapping("/sampleList")
	public String sampleList(Model model) {//정보를 담아 뷰에 넘길때 Model을 사용한다.
		List<Sample> list = sampleService.getSampleList();
		model.addAttribute("list",list);
		return "sampleList";
		
	}
	
	//4.삭제 액션
	
	//5.수정 폼
	
	//6.수정 액션
}
