package com.app.payloads;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
	
	private Long orderId;
	private String email;
	private List<OrderItemDTO> orderItems = new ArrayList<>();
	private LocalDate orderDate;
	private PaymentDTO payment;
	private Double totalAmount;
	private String orderStatus;
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<OrderItemDTO> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(List<OrderItemDTO> orderItems) {
		this.orderItems = orderItems;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public PaymentDTO getPayment() {
		return payment;
	}
	public void setPayment(PaymentDTO payment) {
		this.payment = payment;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	@Override
	public String toString() {
		return "OrderDTO [orderId=" + orderId + ", email=" + email + ", orderItems=" + orderItems + ", orderDate="
				+ orderDate + ", payment=" + payment + ", totalAmount=" + totalAmount + ", orderStatus=" + orderStatus
				+ "]";
	}
	public OrderDTO(Long orderId, String email, List<OrderItemDTO> orderItems, LocalDate orderDate, PaymentDTO payment,
			Double totalAmount, String orderStatus) {
		super();
		this.orderId = orderId;
		this.email = email;
		this.orderItems = orderItems;
		this.orderDate = orderDate;
		this.payment = payment;
		this.totalAmount = totalAmount;
		this.orderStatus = orderStatus;
	}
	public OrderDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
