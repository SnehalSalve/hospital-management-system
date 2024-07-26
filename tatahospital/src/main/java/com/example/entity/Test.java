package com.example.entity;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Test {
	public static void main(String[] args) {
		EntityManagerFactory eManagerFactory=Persistence.createEntityManagerFactory("mahi");
		System.out.println("Hello");
	}
}
