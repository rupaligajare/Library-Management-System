package com.example.demo.dto;


public class CategoryDTO {
    private Long id;
    private String name;
    
	public CategoryDTO() {
		super();
	}
	public CategoryDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

    
    // Getters and Setters
}

