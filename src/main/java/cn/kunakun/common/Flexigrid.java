package cn.kunakun.common;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

public class Flexigrid {
	private int total;
	private int page;
	//总页数
	private int totalPage;
	
	@JSONField(serialize=false)
	private int rowEnd;
	
	@JSONField(serialize=false)
	private int rowStart;
	
	private int rp;
	
	@JSONField(serialize=false)
	private String sortName;
	
	@JSONField(serialize=false)
	private String sortOrder;
	
	@JSONField(serialize=false)
	private Object obj;
	
	private List<?> rows;
	
	public Flexigrid(){
		
	}
	
	public Flexigrid(int rp, int page) {
		this.rp = rp;
		this.page = page;
	}
	
	public Flexigrid(int total, int page, List<?> rows) {
		this.total = total;
		this.page = page;
		this.rows = rows;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public List<?> getRows() {
		return rows;
	}

	public void setRows(List<?> list) {
		this.rows = list;
	}

	public int getRowEnd() {
		return rowEnd;
	}

	public void setRowEnd(int rowEnd) {
		this.rowEnd = rowEnd;
	}

	public int getRowStart() {
		return rowStart;
	}

	public void setRowStart(int rowStart) {
		this.rowStart = rowStart;
	}

	public int getRp() {
		return rp;
	}

	public void setRp(int rp) {
		this.rp = rp;
	}

	public String getSortName() {
		return sortName;
	}

	public void setSortName(String sortName) {
		this.sortName = sortName;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public int getTotalPage() {
		
		if(rp == 0) return 1;
		// 提取信息行数
		int total = this.total;
		this.totalPage = total / rp;

		int mod = total % this.rp;
		if (mod != 0)
			this.totalPage += 1;

		return totalPage;
	}

}
