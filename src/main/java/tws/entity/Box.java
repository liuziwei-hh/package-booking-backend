package tws.entity;

public class Box {

	public String getTransForm() {
		return transForm;
	}

	public void setTransForm(String transForm) {
		this.transForm = transForm;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getTelNum() {
		return telNum;
	}

	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	private String transForm;
	private String receiver;
	private String telNum;
	private String weight;
	private String status;
	private String orderTime;

	public Box(String transForm, String receiver, String telNum, String weight, String status, String orderTime,
			String orderNum) {
		this.transForm = transForm;
		this.receiver = receiver;
		this.telNum = telNum;
		this.weight = weight;
		this.status = status;
		this.orderTime = orderTime;
		this.orderNum = orderNum;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	private String orderNum;

	public Box() {
		// TODO Auto-generated constructor stub
	}

}
