package com.bonobono.web01.vo;

public class Sample {
	private int sampleId; //smaple.sample_id
	private String sampleName; //smaple.sample_name
	
	public int getSampleId() {
		return sampleId;
	}
	public void setSampleId(int sampleId) {
		this.sampleId = sampleId;
	}
	public String getSampleName() {
		return sampleName;
	}
	public void setSampleName(String sampleName) {
		this.sampleName = sampleName;
	}
	@Override
	public String toString() {
		return "Sample [sampleId=" + sampleId + ", sampleName=" + sampleName + "]";
	}
	
}
