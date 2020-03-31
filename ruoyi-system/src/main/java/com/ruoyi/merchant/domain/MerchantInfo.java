package com.ruoyi.merchant.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 商户信息对象 tb_merchant_info
 * 
 * @author xinmao_ye@foxmail.com
 * @date 2020-03-31
 */
public class MerchantInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 商户id */
    private Long id;

    /** 公司名称 */
    @Excel(name = "公司名称")
    private String companyName;

    /** 注册地址 */
    private String registerAddr;

    /** 经营地址 */
    private String activeAddr;

    /** 场所类型 */
    private Long placeType;

    /** 是否连锁 */
    private Long chain;

    /** 沟通方式 */
    private String communicateChannel;

    /** 公司法人姓名 */
    private String corporationName;

    /** 公司法人电话 */
    private String corporationTel;

    /** 公司法人证件号 */
    private String corporationId;

    /** 员工数量 */
    private Long staffNum;

    /** 教练数量 */
    private Long coachNum;

    /** 教练类型 */
    private Long coachType;

    /** 会员数量 */
    private Long memberNum;

    /** 会员年限 */
    private Long memberYears;

    /** 会员预约方式 */
    private String memberAppointmentType;

    /** 商户申请状态 */
    @Excel(name = "商户申请状态")
    private Long applyStatus;

    /** 申请时间 */
    @Excel(name = "申请时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date applyTime;

    /** 审核时间 */
    @Excel(name = "审核时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date confirmTime;

    /** 入驻渠道 */
    @Excel(name = "入驻渠道")
    private Long applySource;

    /** 申请姓名 */
    @Excel(name = "申请姓名")
    private String applicantName;

    /** 审核人id */
    private String confirmUserId;

    /** 审核人姓名 */
    @Excel(name = "审核人姓名")
    private String confirmUserName;

    /** 审核状态 */
    private Long confirmStatus;

    /** 商户等级 */
    private Long merchantLevel;

    /** 审核说明 */
    private String confirmDescription;

    /** 营业执照照片地址 */
    private String companyCredentialsUrl;

    /** 门头照片 */
    private String companyDoorwayUrl;

    /** 室内照片 */
    private String gymPicUrl;

    /** 证件照正面 */
    private String corporationIdObverseUrl;

    /** 证件照反面 */
    private String corporationIdReverseUrl;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCompanyName(String companyName) 
    {
        this.companyName = companyName;
    }

    public String getCompanyName() 
    {
        return companyName;
    }
    public void setRegisterAddr(String registerAddr) 
    {
        this.registerAddr = registerAddr;
    }

    public String getRegisterAddr() 
    {
        return registerAddr;
    }
    public void setActiveAddr(String activeAddr) 
    {
        this.activeAddr = activeAddr;
    }

    public String getActiveAddr() 
    {
        return activeAddr;
    }
    public void setPlaceType(Long placeType) 
    {
        this.placeType = placeType;
    }

    public Long getPlaceType() 
    {
        return placeType;
    }
    public void setChain(Long chain) 
    {
        this.chain = chain;
    }

    public Long getChain() 
    {
        return chain;
    }
    public void setCommunicateChannel(String communicateChannel) 
    {
        this.communicateChannel = communicateChannel;
    }

    public String getCommunicateChannel() 
    {
        return communicateChannel;
    }
    public void setCorporationName(String corporationName) 
    {
        this.corporationName = corporationName;
    }

    public String getCorporationName() 
    {
        return corporationName;
    }
    public void setCorporationTel(String corporationTel) 
    {
        this.corporationTel = corporationTel;
    }

    public String getCorporationTel() 
    {
        return corporationTel;
    }
    public void setCorporationId(String corporationId) 
    {
        this.corporationId = corporationId;
    }

    public String getCorporationId() 
    {
        return corporationId;
    }
    public void setStaffNum(Long staffNum) 
    {
        this.staffNum = staffNum;
    }

    public Long getStaffNum() 
    {
        return staffNum;
    }
    public void setCoachNum(Long coachNum) 
    {
        this.coachNum = coachNum;
    }

    public Long getCoachNum() 
    {
        return coachNum;
    }
    public void setCoachType(Long coachType) 
    {
        this.coachType = coachType;
    }

    public Long getCoachType() 
    {
        return coachType;
    }
    public void setMemberNum(Long memberNum) 
    {
        this.memberNum = memberNum;
    }

    public Long getMemberNum() 
    {
        return memberNum;
    }
    public void setMemberYears(Long memberYears) 
    {
        this.memberYears = memberYears;
    }

    public Long getMemberYears() 
    {
        return memberYears;
    }
    public void setMemberAppointmentType(String memberAppointmentType) 
    {
        this.memberAppointmentType = memberAppointmentType;
    }

    public String getMemberAppointmentType() 
    {
        return memberAppointmentType;
    }
    public void setApplyStatus(Long applyStatus) 
    {
        this.applyStatus = applyStatus;
    }

    public Long getApplyStatus() 
    {
        return applyStatus;
    }
    public void setApplyTime(Date applyTime) 
    {
        this.applyTime = applyTime;
    }

    public Date getApplyTime() 
    {
        return applyTime;
    }
    public void setConfirmTime(Date confirmTime) 
    {
        this.confirmTime = confirmTime;
    }

    public Date getConfirmTime() 
    {
        return confirmTime;
    }
    public void setApplySource(Long applySource) 
    {
        this.applySource = applySource;
    }

    public Long getApplySource() 
    {
        return applySource;
    }
    public void setApplicantName(String applicantName) 
    {
        this.applicantName = applicantName;
    }

    public String getApplicantName() 
    {
        return applicantName;
    }
    public void setConfirmUserId(String confirmUserId) 
    {
        this.confirmUserId = confirmUserId;
    }

    public String getConfirmUserId() 
    {
        return confirmUserId;
    }
    public void setConfirmUserName(String confirmUserName) 
    {
        this.confirmUserName = confirmUserName;
    }

    public String getConfirmUserName() 
    {
        return confirmUserName;
    }
    public void setConfirmStatus(Long confirmStatus) 
    {
        this.confirmStatus = confirmStatus;
    }

    public Long getConfirmStatus() 
    {
        return confirmStatus;
    }
    public void setMerchantLevel(Long merchantLevel) 
    {
        this.merchantLevel = merchantLevel;
    }

    public Long getMerchantLevel() 
    {
        return merchantLevel;
    }
    public void setConfirmDescription(String confirmDescription) 
    {
        this.confirmDescription = confirmDescription;
    }

    public String getConfirmDescription() 
    {
        return confirmDescription;
    }
    public void setCompanyCredentialsUrl(String companyCredentialsUrl) 
    {
        this.companyCredentialsUrl = companyCredentialsUrl;
    }

    public String getCompanyCredentialsUrl() 
    {
        return companyCredentialsUrl;
    }
    public void setCompanyDoorwayUrl(String companyDoorwayUrl) 
    {
        this.companyDoorwayUrl = companyDoorwayUrl;
    }

    public String getCompanyDoorwayUrl() 
    {
        return companyDoorwayUrl;
    }
    public void setGymPicUrl(String gymPicUrl) 
    {
        this.gymPicUrl = gymPicUrl;
    }

    public String getGymPicUrl() 
    {
        return gymPicUrl;
    }
    public void setCorporationIdObverseUrl(String corporationIdObverseUrl) 
    {
        this.corporationIdObverseUrl = corporationIdObverseUrl;
    }

    public String getCorporationIdObverseUrl() 
    {
        return corporationIdObverseUrl;
    }
    public void setCorporationIdReverseUrl(String corporationIdReverseUrl) 
    {
        this.corporationIdReverseUrl = corporationIdReverseUrl;
    }

    public String getCorporationIdReverseUrl() 
    {
        return corporationIdReverseUrl;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("companyName", getCompanyName())
            .append("registerAddr", getRegisterAddr())
            .append("activeAddr", getActiveAddr())
            .append("placeType", getPlaceType())
            .append("chain", getChain())
            .append("communicateChannel", getCommunicateChannel())
            .append("corporationName", getCorporationName())
            .append("corporationTel", getCorporationTel())
            .append("corporationId", getCorporationId())
            .append("staffNum", getStaffNum())
            .append("coachNum", getCoachNum())
            .append("coachType", getCoachType())
            .append("memberNum", getMemberNum())
            .append("memberYears", getMemberYears())
            .append("memberAppointmentType", getMemberAppointmentType())
            .append("applyStatus", getApplyStatus())
            .append("applyTime", getApplyTime())
            .append("confirmTime", getConfirmTime())
            .append("applySource", getApplySource())
            .append("applicantName", getApplicantName())
            .append("confirmUserId", getConfirmUserId())
            .append("confirmUserName", getConfirmUserName())
            .append("confirmStatus", getConfirmStatus())
            .append("merchantLevel", getMerchantLevel())
            .append("confirmDescription", getConfirmDescription())
            .append("companyCredentialsUrl", getCompanyCredentialsUrl())
            .append("companyDoorwayUrl", getCompanyDoorwayUrl())
            .append("gymPicUrl", getGymPicUrl())
            .append("corporationIdObverseUrl", getCorporationIdObverseUrl())
            .append("corporationIdReverseUrl", getCorporationIdReverseUrl())
            .append("createTime", getCreateTime())
            .toString();
    }
}
