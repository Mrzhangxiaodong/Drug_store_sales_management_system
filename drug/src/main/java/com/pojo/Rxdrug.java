package com.pojo;

public class Rxdrug {
	private String time;  //购药时间
	private String drugname;//药品名称
	private String changshang;//厂商
	private String date;//日期
	private String pihao;//批号
	private String count;//数量
	public String getTime()
	{
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getDrugname() {
		return drugname;
	}
	public void setDrugname(String drugname) {
		this.drugname = drugname;
	}
	public String getChangshang() {
		return changshang;
	}
	public void setChangshang(String changshang) {
		this.changshang = changshang;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPihao() {
		return pihao;
	}
	public void setPihao(String pihao) {
		this.pihao = pihao;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public Rxdrug() {}
	public Rxdrug(String time, String drugname, String changshang, String date, String pihao, String count) {
		super();
		this.time = time;
		this.drugname = drugname;
		this.changshang = changshang;
		this.date = date;
		this.pihao = pihao;
		this.count = count;
	}

}
