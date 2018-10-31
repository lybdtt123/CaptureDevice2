package dasheng.com.capturedevice.util;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import dasheng.com.capturedevice.R;

/**
 * 作者： liuyuanbo on 2018/10/19 17:01.
 * 时间： 2018/10/19 17:01
 * 邮箱： 972383753@qq.com
 * 用途： 一些乱七八糟的通用的东西，不想放入父类中
 */

public class OtherUtil {
    /**
     * 微信两个蓝色按钮来回切换的状态
     * @param selectedTv 选中的按钮
     * @param unSelectedTv 未选中的按钮
     */
    public static void changeWechatTwoBtnBg(Context context, TextView selectedTv, TextView unSelectedTv){
        selectedTv.setBackgroundResource(R.drawable.blue_round_cornor);
        unSelectedTv.setBackgroundResource(R.drawable.blue_solid);
        selectedTv.setTextColor(ContextCompat.getColor(context, R.color.white));
        unSelectedTv.setTextColor(ContextCompat.getColor(context, R.color.wechatBlue));
    }
    /**
     * 微信生成页面中的预览按钮
     * @param previewBtn 预览按钮
     * @param canPreview 是否可以预览
     */
    public static void changeWechatPreviewBtnBg(Context context, Button previewBtn, boolean canPreview){
        if (canPreview){
            previewBtn.setBackground(ContextCompat.getDrawable(context, R.drawable.green_round_cornor));
            previewBtn.setEnabled(true);
            previewBtn.setClickable(true);
        }else{
            previewBtn.setBackground(ContextCompat.getDrawable(context, R.drawable.green_round_cornor_no));
            previewBtn.setEnabled(false);
            previewBtn.setClickable(false);
        }
    }

    /**
     * 开关按钮的方法
     * @param on
     * @param imageView
     */
    public static void onOrOff(boolean on, ImageView imageView){
        if (on){
            imageView.setImageResource(R.mipmap.on);
        }else{
            imageView.setImageResource(R.mipmap.off);
        }
    }

    /**
     * 微信两个蓝色按钮来回切换的状态
     * @param selectedTv 选中的按钮
     * @param unSelectedTv 未选中的按钮
     */
    public static void changeReoprtProblemBtnBg(Context context, TextView selectedTv, TextView unSelectedTv){
        selectedTv.setBackgroundResource(R.drawable.blue_solid1);
        unSelectedTv.setBackgroundResource(R.drawable.gray_solid1);
        selectedTv.setTextColor(ContextCompat.getColor(context, R.color.wechatBlue));
        unSelectedTv.setTextColor(ContextCompat.getColor(context, R.color.overallGray));
    }
}