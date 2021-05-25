package com.zmc.mymall.controller;

import com.zmc.mymall.common.api.CommonPage;
import com.zmc.mymall.common.api.CommonResult;
import com.zmc.mymall.nosql.elasticsearch.document.EsProduct;
import com.zmc.mymall.service.EsProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
// 如果需要验证访问，前往SecurityConfig配置文件修改
@Api(tags = "EsProductController", description = "搜索商品管理")
@Controller
@RequestMapping("/esProduct")
public class esProductController {

    @Autowired
    private EsProductService esProductService;

    @ApiOperation(value = "导入所有数据库中的商品到ES中")
    @RequestMapping(value = "/importAll",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Integer> importAllList(){
        int count = esProductService.importAll();
        return CommonResult.success(count);
    }
    @ApiOperation(value = "根据id删除商品")
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<Object> delete(@PathVariable("id") Long id){
        esProductService.delete(id);
        return CommonResult.success(null);
    }

    @ApiOperation(value = "根据id批量删除商品")
    @RequestMapping(value = "/delete/batch", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Object> delete(@RequestParam("ids") List<Long> ids){
        esProductService.delete(ids);
        return CommonResult.success(null);
    }

    @ApiOperation(value = "根据id创建商品")
    @RequestMapping(value = "/create/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<EsProduct> create(@PathVariable Long id){
        EsProduct esProduct = esProductService.create(id);
        if(esProduct != null){
            return CommonResult.success(esProduct);
        }else {
            return CommonResult.failed();
        }
    }

    @ApiOperation(value = "简单搜索")
    @RequestMapping(value = "/search/simple", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<EsProduct>> search(@RequestParam(required = false) String keyword,
                                                      @RequestParam(required = false, defaultValue = "0") Integer pageNum,
                                                      @RequestParam(required = false, defaultValue = "5") Integer pageSize) {
        Page<EsProduct> esProductPage = esProductService.search(keyword, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(esProductPage));
    }



}
