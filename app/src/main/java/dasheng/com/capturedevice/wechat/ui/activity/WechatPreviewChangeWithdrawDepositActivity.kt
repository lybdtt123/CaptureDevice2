package dasheng.com.capturedevice.wechat.ui.activity

import android.content.Intent
import android.view.View
import dasheng.com.capturedevice.R
import dasheng.com.capturedevice.base.BaseWechatActivity
import dasheng.com.capturedevice.constant.IntentKey
import dasheng.com.capturedevice.util.StringUtils
import dasheng.com.capturedevice.wechat.entity.WechatWithdrawDepositEntity
import kotlinx.android.synthetic.main.activity_wechat_preview_change_withdraw_deposit.*
import java.math.BigDecimal
import java.math.RoundingMode

/**
 * 作者： liuyuanbo on 2018/10/30 10:10.
 * 时间： 2018/10/30 10:10
 * 邮箱： 972383753@qq.com
 * 用途： 微信 -- 预览 -- 零钱提现
 */

class WechatPreviewChangeWithdrawDepositActivity : BaseWechatActivity() {
    override fun setLayoutResourceId() = R.layout.activity_wechat_preview_change_withdraw_deposit

    override fun needLoadingView() = false

    override fun initAllViews() {}

    override fun initViewsListener() {
        mFinishIv.setOnClickListener { finish() }
    }

    override fun getAttribute(intent: Intent) {
        super.getAttribute(intent)
        val entity: WechatWithdrawDepositEntity = intent.getSerializableExtra(IntentKey.ENTITY) as WechatWithdrawDepositEntity
        mWechatTimeTv.text = StringUtils.insertFrontAndBack(entity.time, "预计", "到账")
        mWechatMoneyTv.text = StringUtils.insertFront(StringUtils.keep2Point(entity.money), "¥")
        mBankTv.text = StringUtils.insertFrontAndBack(" ", entity.bank, entity.bankNum4)
        if(entity.serviceCharge){
            if (entity.money.toFloat() < 100){
                mServiceChargeTv.text = StringUtils.insertFront("0.10", "¥")
            }else{
                val money = BigDecimal(entity.money.toDouble() * 0.001).setScale(2, RoundingMode.UP).toDouble()
                mServiceChargeTv.text = StringUtils.insertFront(money, "¥")
            }
            mServiceChargeLayout.visibility = View.VISIBLE
        }else{
            mServiceChargeLayout.visibility = View.GONE
        }
    }
}
