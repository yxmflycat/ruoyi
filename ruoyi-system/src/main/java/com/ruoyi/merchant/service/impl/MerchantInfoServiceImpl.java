package com.ruoyi.merchant.service.impl;

import com.ruoyi.common.core.text.Convert;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.merchant.domain.MerchantInfo;
import com.ruoyi.merchant.mapper.MerchantInfoMapper;
import com.ruoyi.merchant.service.IMerchantInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商户信息Service业务层处理
 *
 * @author xinmao_ye@foxmail.com
 * @date 2020-03-31
 */
@Service
public class MerchantInfoServiceImpl implements IMerchantInfoService {
    @Autowired
    private MerchantInfoMapper merchantInfoMapper;

    /**
     * 查询商户信息
     *
     * @param id 商户信息ID
     * @return 商户信息
     */
    @Override
    public MerchantInfo selectMerchantInfoById(Long id) {
        return merchantInfoMapper.selectMerchantInfoById(id);
    }

    /**
     * 查询商户信息列表
     *
     * @param merchantInfo 商户信息
     * @return 商户信息
     */
    @Override
    public List<MerchantInfo> selectMerchantInfoList(MerchantInfo merchantInfo) {
        return merchantInfoMapper.selectMerchantInfoList(merchantInfo);
    }

    /**
     * 新增商户信息
     *
     * @param merchantInfo 商户信息
     * @return 结果
     */
    @Override
    public int insertMerchantInfo(MerchantInfo merchantInfo) {
        merchantInfo.setCreateTime(DateUtils.getNowDate());
        return merchantInfoMapper.insertMerchantInfo(merchantInfo);
    }

    /**
     * 修改商户信息
     *
     * @param merchantInfo 商户信息
     * @return 结果
     */
    @Override
    public int updateMerchantInfo(MerchantInfo merchantInfo) {
        return merchantInfoMapper.updateMerchantInfo(merchantInfo);
    }

    /**
     * 删除商户信息对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteMerchantInfoByIds(String ids) {
        return merchantInfoMapper.deleteMerchantInfoByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除商户信息信息
     *
     * @param id 商户信息ID
     * @return 结果
     */
    @Override
    public int deleteMerchantInfoById(Long id) {
        return merchantInfoMapper.deleteMerchantInfoById(id);
    }
}
