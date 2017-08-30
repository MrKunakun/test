package cn.kunakun.common;


public class Result {
	Integer resultCode = 0;
	
	String msg;
	Object record;

	public Object getRecord() {
		return record;
	}

	public void setRecord(Object record) {
		this.record = record;
	}

	public Integer getResultCode() {
		return resultCode;
	}

	public void setResultCode(Integer resultCode) {
		this.resultCode = resultCode;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
