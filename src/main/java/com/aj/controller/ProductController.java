package com.aj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.aj.entity.Product;
import com.aj.repo.ProductRepository;

@Controller
public class ProductController {
    @Autowired
    private ProductRepository repo;
    
    @GetMapping("/")
    public String loadForm(Model model) {
        model.addAttribute("p", new Product());
        return "index";
    }
    
    @PostMapping("/product")
    public String submitForm(@ModelAttribute("p") Product p, Model model) {
        p = repo.save(p);
        if (p.getPid() != null) {
            model.addAttribute("msg", "Product added successfully!");
        }
        return "index";
    }
    
    @GetMapping("/products")
    public String loadProduct(Model model) {
    	List<Product> prod = repo.findAll();
    	model.addAttribute("products",prod);
    	
    	return "data";
    }
}
