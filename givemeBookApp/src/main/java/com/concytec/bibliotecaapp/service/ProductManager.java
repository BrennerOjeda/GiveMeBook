package com.concytec.bibliotecaapp.service;

import java.io.Serializable;
import java.util.List;

import com.concytec.bibliotecaapp.domain.Product;



public interface ProductManager extends Serializable {

    public void increasePrice(int percentage);
    
    public List<Product> getProducts();

}