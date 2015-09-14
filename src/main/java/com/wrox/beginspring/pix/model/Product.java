package com.wrox.beginspring.pix.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="product", schema="irent")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "prod_name")
	private String prodName;
	@Column(name = "prod_desc")
	private String prodDesc;
	@Column(name = "prod_type")
	private Integer prodType;
	@Column(name = "prod_quantity")
	private Integer prodQuantity;
	@Column(name = "prod_price")
	private Double prodPrice;
	@Column(name = "prod_image_path")
	private String prodImagePath;
	

	protected Product() {
		// TODO Auto-generated constructor stub
	}
	

	public Product( String prodName, String prodDesc,
			Integer prodType, Integer prodQuantity, Double prodPrice,
			String prodImagePath) {
		super();
	
		this.prodName = prodName;
		this.prodDesc = prodDesc;
		this.prodType = prodType;
		this.prodQuantity = prodQuantity;
		this.prodPrice = prodPrice;
		this.prodImagePath = prodImagePath;
	}


	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getProdName() {
		return prodName;
	}



	public void setProdName(String prodName) {
		this.prodName = prodName;
	}



	public String getProdDesc() {
		return prodDesc;
	}



	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}



	public Integer getProdType() {
		return prodType;
	}



	public void setProdType(Integer prodType) {
		this.prodType = prodType;
	}



	public Integer getProdQuantity() {
		return prodQuantity;
	}



	public void setProdQuantity(Integer prodQuantity) {
		this.prodQuantity = prodQuantity;
	}



	public Double getProdPrice() {
		return prodPrice;
	}



	public void setProdPrice(Double prodPrice) {
		this.prodPrice = prodPrice;
	}



	public String getProdImagePath() {
		return prodImagePath;
	}



	public void setProdImagePath(String prodImagePath) {
		this.prodImagePath = prodImagePath;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((prodDesc == null) ? 0 : prodDesc.hashCode());
		result = prime * result
				+ ((prodImagePath == null) ? 0 : prodImagePath.hashCode());
		result = prime * result
				+ ((prodName == null) ? 0 : prodName.hashCode());
		result = prime * result
				+ ((prodPrice == null) ? 0 : prodPrice.hashCode());
		result = prime * result
				+ ((prodQuantity == null) ? 0 : prodQuantity.hashCode());
		result = prime * result
				+ ((prodType == null) ? 0 : prodType.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (prodDesc == null) {
			if (other.prodDesc != null)
				return false;
		} else if (!prodDesc.equals(other.prodDesc))
			return false;
		if (prodImagePath == null) {
			if (other.prodImagePath != null)
				return false;
		} else if (!prodImagePath.equals(other.prodImagePath))
			return false;
		if (prodName == null) {
			if (other.prodName != null)
				return false;
		} else if (!prodName.equals(other.prodName))
			return false;
		if (prodPrice == null) {
			if (other.prodPrice != null)
				return false;
		} else if (!prodPrice.equals(other.prodPrice))
			return false;
		if (prodQuantity == null) {
			if (other.prodQuantity != null)
				return false;
		} else if (!prodQuantity.equals(other.prodQuantity))
			return false;
		if (prodType == null) {
			if (other.prodType != null)
				return false;
		} else if (!prodType.equals(other.prodType))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", prodName=" + prodName + ", prodDesc="
				+ prodDesc + ", prodType=" + prodType + ", prodQuantity="
				+ prodQuantity + ", prodPrice=" + prodPrice
				+ ", prodImagePath=" + prodImagePath + "]";
	}




}
