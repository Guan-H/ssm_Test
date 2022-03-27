package com.gzcss.controller;


import com.gzcss.dao.IProductDao;
import com.gzcss.domain.Product;
import com.gzcss.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/gzcss")
public class ProductController{

    @Autowired
    private IProductService producService;


    @RequestMapping("/product")
    public ModelAndView findAll(){
        ModelAndView mv = new ModelAndView();
        List<Product> ps = producService.findAll();
        for (Product po:ps) {
            System.out.println(po);
        }
        mv.addObject("productList",ps);
        mv.setViewName("product-list");
        return mv;
    }


}
