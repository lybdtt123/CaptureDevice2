package dasheng.com.capturedevice.ui.activity

import dasheng.com.capturedevice.R
import dasheng.com.capturedevice.base.BaseOverallInternetActivity
import dasheng.com.capturedevice.constant.RandomUtil
import dasheng.com.capturedevice.ui.adapter.OverallCommunicateAdapter
import dasheng.com.capturedevice.ui.entity.OverallCommunicateEntity
import dasheng.com.capturedevice.widget.ninegrid.ImageInfo
import kotlinx.android.synthetic.main.activity_overall_communicate.*

/**
 * 作者： liuyuanbo on 2018/11/7 14:37.
 * 时间： 2018/11/7 14:37
 * 邮箱： 972383753@qq.com
 * 用途：
 */

class OverallCommunicateActivity : BaseOverallInternetActivity() {
    private lateinit var mAdapter: OverallCommunicateAdapter
    private var mList: ArrayList<OverallCommunicateEntity> = arrayListOf()
    override fun setLayoutResourceId() = R.layout.activity_overall_communicate

    override fun needLoadingView(): Boolean {
        return false
    }

    override fun initAllViews() {
        var entity: OverallCommunicateEntity
        var info: ImageInfo
        for (i in 0..15) {
            entity = OverallCommunicateEntity()
            entity.avatarInt = RandomUtil.getRandomAvatar()
            entity.avatar = RandomUtil.getRandomNetPics()
            entity.content = RandomUtil.getRandomContents()
            entity.nickName = RandomUtil.getRandomNickName()
            if (i == 0){
                var infoList: ArrayList<ImageInfo> = arrayListOf()
                info = ImageInfo()
                val url = RandomUtil.randomNetPics[i]
                info.bigImageUrl = url
                info.thumbnailUrl = url
                info.imageViewHeight = RandomUtil.randomNetPicsHeight[i]
                info.imageViewWidth = RandomUtil.randomNetPicsWidth[i]
                info.whPercentage = (info.imageViewHeight / info.imageViewHeight).toFloat()
                infoList.add(info)
                entity.pics = infoList
            }else if (i == 1){
                var infoList: ArrayList<ImageInfo> = arrayListOf()
                for (j in 0..1) {
                    info = ImageInfo()
                    val url = RandomUtil.getRandomNetPics()
                    info.bigImageUrl = url
                    info.thumbnailUrl = url
                    info.imageViewHeight = RandomUtil.randomNetPicsHeight[i]
                    info.imageViewWidth = RandomUtil.randomNetPicsWidth[i]
                    info.whPercentage = (info.imageViewHeight / info.imageViewHeight).toFloat()
                    infoList.add(info)
                    entity.pics = infoList
                }
            }else if (i == 2){
                var infoList: ArrayList<ImageInfo> = arrayListOf()
                for (j in 0..2) {
                    info = ImageInfo()
                    val url = RandomUtil.getRandomNetPics()
                    info.bigImageUrl = url
                    info.thumbnailUrl = url
                    info.imageViewHeight = RandomUtil.randomNetPicsHeight[i]
                    info.imageViewWidth = RandomUtil.randomNetPicsWidth[i]
                    info.whPercentage = (info.imageViewHeight / info.imageViewHeight).toFloat()
                    infoList.add(info)
                    entity.pics = infoList
                }
            }else if (i == 3){
                var infoList: ArrayList<ImageInfo> = arrayListOf()
                for (j in 0..3) {
                    info = ImageInfo()
                    val url = RandomUtil.getRandomNetPics()
                    info.bigImageUrl = url
                    info.thumbnailUrl = url
                    info.imageViewHeight = RandomUtil.randomNetPicsHeight[i]
                    info.imageViewWidth = RandomUtil.randomNetPicsWidth[i]
                    info.whPercentage = (info.imageViewHeight / info.imageViewHeight).toFloat()
                    infoList.add(info)
                    entity.pics = infoList
                }
            }else if (i == 4){
                var infoList: ArrayList<ImageInfo> = arrayListOf()
                for (j in 0..4) {
                    info = ImageInfo()
                    val url = RandomUtil.getRandomNetPics()
                    info.bigImageUrl = url
                    info.thumbnailUrl = url
                    info.imageViewHeight = RandomUtil.randomNetPicsHeight[i]
                    info.imageViewWidth = RandomUtil.randomNetPicsWidth[i]
                    info.whPercentage = (info.imageViewHeight / info.imageViewHeight).toFloat()
                    infoList.add(info)
                    entity.pics = infoList
                }
            }else if (i == 5){
                var infoList: ArrayList<ImageInfo> = arrayListOf()
                for (j in 0..5) {
                    info = ImageInfo()
                    val url = RandomUtil.getRandomNetPics()
                    info.bigImageUrl = url
                    info.thumbnailUrl = url
                    info.imageViewHeight = RandomUtil.randomNetPicsHeight[i]
                    info.imageViewWidth = RandomUtil.randomNetPicsWidth[i]
                    info.whPercentage = (info.imageViewHeight / info.imageViewHeight).toFloat()
                    infoList.add(info)
                    entity.pics = infoList
                }
            }else if (i == 6){
                var infoList: ArrayList<ImageInfo> = arrayListOf()
                for (j in 0..6) {
                    info = ImageInfo()
                    val url = RandomUtil.getRandomNetPics()
                    info.bigImageUrl = url
                    info.thumbnailUrl = url
                    info.imageViewHeight = RandomUtil.randomNetPicsHeight[i]
                    info.imageViewWidth = RandomUtil.randomNetPicsWidth[i]
                    info.whPercentage = (info.imageViewHeight / info.imageViewHeight).toFloat()
                    infoList.add(info)
                    entity.pics = infoList
                }
            }else if (i == 7){
                var infoList: ArrayList<ImageInfo> = arrayListOf()
                for (j in 0..7) {
                    info = ImageInfo()
                    val url = RandomUtil.getRandomNetPics()
                    info.bigImageUrl = url
                    info.thumbnailUrl = url
                    info.imageViewHeight = RandomUtil.randomNetPicsHeight[i]
                    info.imageViewWidth = RandomUtil.randomNetPicsWidth[i]
                    info.whPercentage = (info.imageViewHeight / info.imageViewHeight).toFloat()
                    infoList.add(info)
                    entity.pics = infoList
                }
            }else if (i == 8){
                var infoList: ArrayList<ImageInfo> = arrayListOf()
                for (j in 0..8) {
                    info = ImageInfo()
                    val url = RandomUtil.getRandomNetPics()
                    info.bigImageUrl = url
                    info.thumbnailUrl = url
                    info.imageViewHeight = RandomUtil.randomNetPicsHeight[i]
                    info.imageViewWidth = RandomUtil.randomNetPicsWidth[i]
                    info.whPercentage = (info.imageViewHeight / info.imageViewHeight).toFloat()
                    infoList.add(info)
                    entity.pics = infoList
                }
            }else{
                var infoList: ArrayList<ImageInfo> = arrayListOf()
                info = ImageInfo()
                val url = RandomUtil.randomNetPics[i]
                info.bigImageUrl = url
                info.thumbnailUrl = url
                info.imageViewHeight = RandomUtil.randomNetPicsHeight[i]
                info.imageViewWidth = RandomUtil.randomNetPicsWidth[i]
                info.whPercentage = info.imageViewWidth.toFloat() / info.imageViewHeight
                infoList.add(info)
                entity.pics = infoList
            }
            mList.add(entity)
        }
        mAdapter = OverallCommunicateAdapter(mList)
        mOverallCommunicateRecyclerView.adapter = mAdapter
    }

    override fun initViewsListener() {

    }
}
