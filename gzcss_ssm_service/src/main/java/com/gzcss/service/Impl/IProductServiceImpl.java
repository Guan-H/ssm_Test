package com.gzcss.service.Impl;

import com.gzcss.dao.IProductDao;
import com.gzcss.domain.Product;
import com.gzcss.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
/*@Transactional*/
public class IProductServiceImpl implements IProductService {

    @Autowired
    private IProductDao productDao;

    @Override
    public List<Product> findAll() {
        List<Product> productList = productDao.findAll();
        return productList;
    }
}
