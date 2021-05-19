package com.zmc.mymall.service;

import com.zmc.mymall.mbg.model.PmsBrand;

import java.util.List;

public interface PmsBrandService {
    /**
     * 所有品牌列表
     * @return
     */
    List<PmsBrand> listAllBrand();

    /**
     * 创建品牌
     * @param brand
     * @return
     */
    int createBrand(PmsBrand brand);

    /**
     * 更新
     * @param id
     * @param brand
     * @return
     */
    int updateBrand(Long id, PmsBrand brand);

    /**
     * 删除品牌
     * @param id
     * @return
     */
    int deleteBrand(Long id);

    /**
     * 某一页的品牌列表
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<PmsBrand> listBrand(int pageNum, int pageSize);

    /**
     * 根据id获取品牌
     * @param id
     * @return
     */
    PmsBrand getBrand(Long id);

}
