package com.guiacompass.apirest.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_product;
	
	private String name_product;
	
	private long id_manufacturer;
	
	private String sku_product;
	
	private String bar_code_product;
	
	private String category_product;
	
	private String description_product;
	
	public String getName_product() {
		return name_product;
	}

	public void setName_product(String name_product) {
		this.name_product = name_product;
	}
	
	public long getId_product() {
		return id_product;
	}

	public void setId_product(long id_product) {
		this.id_product = id_product;
	}

	public long getId_manufacturer() {
		return id_manufacturer;
	}

	public void setId_manufacturer(long id_manufacturer) {
		this.id_manufacturer = id_manufacturer;
	}

	public String getSku_product() {
		return sku_product;
	}

	public void setSku_product(String sku_product) {
		this.sku_product = sku_product;
	}

	public String getBar_code_product() {
		return bar_code_product;
	}

	public void setBar_code_product(String bar_code_product) {
		this.bar_code_product = bar_code_product;
	}

	public String getCategory_product() {
		return category_product;
	}

	public void setCategory_product(String category_product) {
		this.category_product = category_product;
	}

	public String getDescription_product() {
		return description_product;
	}

	public void setDescription_product(String description_product) {
		this.description_product = description_product;
	}

}
