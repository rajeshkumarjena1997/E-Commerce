package com.app.payloads;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemDTO {

	private Long orderItemId;
	private ProductDTO product;
	private Integer quantity;
	private double discount;
	private double orderedProductPrice;
	public Long getOrderItemId() {
		return orderItemId;
	}
	public void setOrderItemId(Long orderItemId) {
		this.orderItemId = orderItemId;
	}
	public ProductDTO getProduct() {
		return product;
	}
	public void setProduct(ProductDTO product) {
		this.product = product;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getOrderedProductPrice() {
		return orderedProductPrice;
	}
	public void setOrderedProductPrice(double orderedProductPrice) {
		this.orderedProductPrice = orderedProductPrice;
	}
	@Override
	public String toString() {
		return "OrderItemDTO [orderItemId=" + orderItemId + ", product=" + product + ", quantity=" + quantity
				+ ", discount=" + discount + ", orderedProductPrice=" + orderedProductPrice + "]";
	}
	public OrderItemDTO(Long orderItemId, ProductDTO product, Integer quantity, double discount,
			double orderedProductPrice) {
		super();
		this.orderItemId = orderItemId;
		this.product = product;
		this.quantity = quantity;
		this.discount = discount;
		this.orderedProductPrice = orderedProductPrice;
	}
	public OrderItemDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
