/**
 * 
 */
package com.qhit.lh.gr3.hzz.t7.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Administrator
 *TODO
2017-12-5下午7:06:24

 */
public class FileAction extends ActionSupport{

	/**
	 * @param args
	 * 保存数据
	 * 处理业务
	 */
	private  String username;
	private File 	uploadFile;
	
	
	private String uploadFileFileName;  //文件名
	private String uploadFileContentType;  //文件类型
	
	
	public  String upload(){
		if(uploadFile != null){
			/*
			 * 上传的业务：
			 * 1.读取上传文件
			 *    读     ------>先获取上传文件的输入流
			 * 2.保存到服务器
			 *    写之前：创建保存的文件
			 *    写：输出流 --->根据创建的文件写入数据
			 * 
			 * */
			try {
				InputStream is = new FileInputStream(uploadFile);
				String  savePath = ServletActionContext.getServletContext().getRealPath("/")+"upload";
				//写 -->输出流
				OutputStream os = new FileOutputStream(savePath+"/"+uploadFileFileName);
				//根据创建的文件写入数据
				byte[] buffer  = new byte[8096];
				int len  = 0 ;
				while( (len = is .read(buffer)) != -1){
					os.write(buffer,0,len);
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				super.addFieldError("uploadFile","文件未找到！");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else{
			//文件未找到
			super.addFieldError("uploadFile","文件未找到！");
			
		}
		
		
		return "uploadSuccess";
		
		
	}
	
	
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public File getUploadFile() {
		return uploadFile;
	}
	public void setUploadFile(File uploadFile) {
		this.uploadFile = uploadFile;
	}
	public String getUploadFileFileName() {
		return uploadFileFileName;
	}
	public void setUploadFileFileName(String uploadFileFileName) {
		this.uploadFileFileName = uploadFileFileName;
	}
	public String getUploadFileContentType() {
		return uploadFileContentType;
	}
	public void setUploadFileContentType(String uploadFileContentType) {
		this.uploadFileContentType = uploadFileContentType;
	}
	
    
	
}
