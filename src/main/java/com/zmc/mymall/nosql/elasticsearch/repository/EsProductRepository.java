package com.zmc.mymall.nosql.elasticsearch.repository;

import com.zmc.mymall.nosql.elasticsearch.document.EsProduct;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * 商品ES操作
 */
public interface EsProductRepository extends ElasticsearchRepository<EsProduct,Long> {

    Page<EsProduct> findByNameOrSubTitleOrKeywords(String name, String subTitle , String keywords, Pageable page);
}
