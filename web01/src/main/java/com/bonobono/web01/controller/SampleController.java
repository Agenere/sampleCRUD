package com.bonobono.web01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bonobono.web01.service.SampleService;
import com.bonobono.web01.vo.Sample;

@Controller
public class SampleController {
	@Autowired private SampleService sampleService;
	//1.입력폼 //DB에 원하는 정보를 입력 하기위한 화면을 보기위한 메서드 실행
	@GetMapping("/addSample")
	public String addSample() {
		return "addSample"; //view 이름은 templates 폴더의 add 된 같은명의 view가 포워드됨
		
	}
	//2.입력 액션 // 입력폼에서 입력 받은 값을 DB에 저장하기 위해 실행
	@PostMapping("/addSampleAction")
	public String addSample(@RequestParam String sampleName) {
		sampleService.addSample(sampleName);
		
		return "redirect:/sampleList";//redirect 가 없으면 forward된다
		
	}
	//3.목록	//DB에 담겨있는 모든 정보를 가져오기 위해 사용
	@GetMapping("/sampleList")
	public String sampleList(Model model) {//정보를 담아 뷰에 넘길때 Model을 사용한다.
		List<Sample> list = sampleService.getSampleList();//samlpe 
		model.addAttribute("list",list);
		return "sampleList";		
	}
	
	//4.삭제 액션	// 삭제하려는 데이터의 키값을 가지고 DB에 접속해 해당 데이터를 삭제하기위해 사용
	@GetMapping("/smapleDelete") 
	public String smapleDelete(@RequestParam int sampleId) {
		sampleService.removeSample(sampleId);
		return "redirect:/sampleList";
		
	}
	//5.수정 폼	 // 먼저 수정 데이터의  키값(PK)을 가지고 DB접속하여 해당 데이터를 불러와 출력해 주기위해 사용
	@GetMapping("/sampleUpdate")
	public String sampleUpdate(Model model,@RequestParam int sampleId){
		List<Sample> listOne = sampleService.getSampleOne(sampleId);//DB에서 가져온 정보가 담긴 하나의 객체 주소를 list에 담아온다
		model.addAttribute("listOne",listOne);
		return "sampleUpdate";		
	}
		
	//6.수정 액션	// 수정 하려하는 데이터값을 받아와 DB에 적용(UPDATE) 시키기위해 사용
	//@PostMapping("/sampleUpdateAction") 일반적인 post방식으로 호출할때 사용되는 어노테이션
	//Post방식으로 호출될때 post로 담겨진 값들을 미리 정해진 vo(Sample)에 맞게 셋팅 된 객체로 받을 수있게 된다.
	@RequestMapping(value="/sampleUpdateAction", method=RequestMethod.POST)
	public String sampleUpdateAction(Sample sample) {
		sampleService.modifySample(sample);		
		return "redirect:/sampleList";
		
	}
	
}
