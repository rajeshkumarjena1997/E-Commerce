package com.app.entites;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long productId;

	@NotBlank
	@Size(min = 3, message = "Product name must contain atleast 3 characters")
	private String productName;
	
	private String image;
	
	@NotBlank
	@Size(min = 6, message = "Product description must contain atleast 6 characters")
	private String description;
	
	private Integer quantity;
	private double price;
	private double discount;
	private double specialPrice;

	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;
	
	@OneToMany(mappedBy = "product", cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.EAGER)
	private List<CartItem> products = new ArrayList<>();
	
	@OneToMany(mappedBy = "product", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	private List<OrderItem> orderItems = new ArrayList<>();

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getSpecialPrice() {
		return specialPrice;
	}

	public void setSpecialPrice(double specialPrice) {
		this.specialPrice = specialPrice;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<CartItem> getProducts() {
		return products;
	}

	public void setProducts(List<CartItem> products) {
		this.products = products;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	public Product(Long productId,
			@NotBlank @Size(min = 3, message = "Product name must contain atleast 3 characters") String productName,
			String image,
			@NotBlank @Size(min = 6, message = "Product description must contain atleast 6 characters") String description,
			Integer quantity, double price, double discount, double specialPrice, Category category,
			List<CartItem> products, List<OrderItem> orderItems) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.image = image;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
		this.discount = discount;
		this.specialPrice = specialPrice;
		this.category = category;
		this.products = products;
		this.orderItems = orderItems;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
