package dasheng.com.capturedevice.wechat.wechatfont;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

/**
 * 作者： liuyuanbo on 2018/10/21 14:01.
 * 时间： 2018/10/21 14:01
 * 邮箱： 972383753@qq.com
 * 用途：
 */

public class WechatNumTextView extends AppCompatTextView {
    public WechatNumTextView(Context context) {
        super(context);
        applyCustomFont(context);
    }

    public WechatNumTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        applyCustomFont(context);
    }

    public WechatNumTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        applyCustomFont(context);
    }
    private void applyCustomFont(Context context) {
        Typeface customFont = FontCache.getTypeface("WeChatLqNumber.ttf", context);
        setTypeface(customFont);
    }

}
