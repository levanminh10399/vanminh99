package com.myclass.dto;

import org.springframework.web.multipart.MultipartFile;

public class MyUploadForm {
	private String 	description;
	private MultipartFile[] fileDatas;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public MultipartFile[] getFileDatas() {
		return fileDatas;
	}
	public void setFileDatas(MultipartFile[] fileDatas) {
		this.fileDatas = fileDatas;
	}
	public MyUploadForm(String description, MultipartFile[] fileDatas) {
		super();
		this.description = description;
		this.fileDatas = fileDatas;
	}
	public MyUploadForm() {}
	
}
