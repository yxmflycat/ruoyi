package com.ruoyi.web.controller.merchant;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.merchant.domain.MerchantInfo;
import com.ruoyi.merchant.service.IMerchantInfoService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 商户信息Controller
 *
 * @author xinmao_ye@foxmail.com
 * @date 2020-03-31
 */
@Controller
@RequestMapping("/merchant")
public class MerchantInfoController extends BaseController {
    private String prefix = "merchant";

    @Autowired
    private IMerchantInfoService merchantInfoService;

    @RequiresPermissions("system:merchant:view")
    @GetMapping()
    public String merchant() {
        return prefix + "/merchant";
    }

    /**
     * 查询商户信息列表
     */
    @RequiresPermissions("system:merchant:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MerchantInfo merchantInfo) {
        startPage();
        List<MerchantInfo> list = merchantInfoService.selectMerchantInfoList(merchantInfo);
        return getDataTable(list);
    }

    /**
     * 导出商户信息列表
     */
    @RequiresPermissions("system:merchant:export")
    @Log(title = "商户信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(MerchantInfo merchantInfo) {
        List<MerchantInfo> list = merchantInfoService.selectMerchantInfoList(merchantInfo);
        ExcelUtil<MerchantInfo> util = new ExcelUtil<MerchantInfo>(MerchantInfo.class);
        return util.exportExcel(list, "merchant");
    }

    /**
     * 新增商户信息
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存商户信息
     */
    @RequiresPermissions("system:merchant:add")
    @Log(title = "商户信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(MerchantInfo merchantInfo) {
        return toAjax(merchantInfoService.insertMerchantInfo(merchantInfo));
    }

    /**
     * 修改商户信息
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap) {
        MerchantInfo merchantInfo = merchantInfoService.selectMerchantInfoById(id);
        mmap.put("merchantInfo", merchantInfo);
        return prefix + "/edit";
    }

    /**
     * 修改保存商户信息
     */
    @RequiresPermissions("system:merchant:edit")
    @Log(title = "商户信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(MerchantInfo merchantInfo) {
        return toAjax(merchantInfoService.updateMerchantInfo(merchantInfo));
    }

    /**
     * 删除商户信息
     */
    @RequiresPermissions("system:merchant:remove")
    @Log(title = "商户信息", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(merchantInfoService.deleteMerchantInfoByIds(ids));
    }
}
