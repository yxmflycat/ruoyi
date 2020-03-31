package com.ruoyi.merchant.service;

import com.ruoyi.merchant.domain.MerchantInfo;

import java.util.List;

/**
 * 商户信息Service接口
 *
 * @author xinmao_ye@foxmail.com
 * @date 2020-03-31
 */
public interface IMerchantInfoService {
    /**
     * 查询商户信息
     *
     * @param id 商户信息ID
     * @return 商户信息
     */
    public MerchantInfo selectMerchantInfoById(Long id);

    /**
     * 查询商户信息列表
     *
     * @param merchantInfo 商户信息
     * @return 商户信息集合
     */
    public List<MerchantInfo> selectMerchantInfoList(MerchantInfo merchantInfo);

    /**
     * 新增商户信息
     *
     * @param merchantInfo 商户信息
     * @return 结果
     */
    public int insertMerchantInfo(MerchantInfo merchantInfo);

    /**
     * 修改商户信息
     *
     * @param merchantInfo 商户信息
     * @return 结果
     */
    public int updateMerchantInfo(MerchantInfo merchantInfo);

    /**
     * 批量删除商户信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteMerchantInfoByIds(String ids);

    /**
     * 删除商户信息信息
     *
     * @param id 商户信息ID
     * @return 结果
     */
    public int deleteMerchantInfoById(Long id);
}
