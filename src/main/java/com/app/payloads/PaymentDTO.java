package com.app.payloads;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDTO {
	private Long paymentId;
	private String paymentMethod;
	public Long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	@Override
	public String toString() {
		return "PaymentDTO [paymentId=" + paymentId + ", paymentMethod=" + paymentMethod + "]";
	}
	public PaymentDTO(Long paymentId, String paymentMethod) {
		super();
		this.paymentId = paymentId;
		this.paymentMethod = paymentMethod;
	}
	public PaymentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
