package com.ruoyi.project.product.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.product.mapper.ProductMapper;
import com.ruoyi.project.product.domain.Product;
import com.ruoyi.project.product.service.IProductService;

/**
 * 产品Service业务层处理
 * 
 * @author abc
 * @date 2020-04-11
 */
@Service
public class ProductServiceImpl implements IProductService 
{
    @Autowired
    private ProductMapper productMapper;

    /**
     * 查询产品
     * 
     * @param productId 产品ID
     * @return 产品
     */
    @Override
    public Product selectProductById(Long productId)
    {
        return productMapper.selectProductById(productId);
    }

    /**
     * 查询产品列表
     * 
     * @param product 产品
     * @return 产品
     */
    @Override
    public List<Product> selectProductList(Product product)
    {
        return productMapper.selectProductList(product);
    }

    /**
     * 新增产品
     * 
     * @param product 产品
     * @return 结果
     */
    @Override
    public int insertProduct(Product product)
    {
        return productMapper.insertProduct(product);
    }

    /**
     * 修改产品
     * 
     * @param product 产品
     * @return 结果
     */
    @Override
    public int updateProduct(Product product)
    {
        return productMapper.updateProduct(product);
    }

    /**
     * 批量删除产品
     * 
     * @param productIds 需要删除的产品ID
     * @return 结果
     */
    @Override
    public int deleteProductByIds(Long[] productIds)
    {
        return productMapper.deleteProductByIds(productIds);
    }

    /**
     * 删除产品信息
     * 
     * @param productId 产品ID
     * @return 结果
     */
    @Override
    public int deleteProductById(Long productId)
    {
        return productMapper.deleteProductById(productId);
    }
}
