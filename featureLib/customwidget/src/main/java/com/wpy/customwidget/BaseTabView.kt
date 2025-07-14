package com.wpy.customwidget

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import com.wpy.utils.ext.clickOpt

class BaseTabView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyle: Int = 0
) : LinearLayout(context, attrs, defStyle) {

    private lateinit var homeBtn: LinearLayout
    private lateinit var friendBtn: LinearLayout
    private lateinit var moreBtn: LinearLayout
    private lateinit var meBtn: LinearLayout

    private lateinit var homeIv: ImageView
    private lateinit var friendIv: ImageView
    private lateinit var moreIv: ImageView
    private lateinit var meIv: ImageView

    private lateinit var listener: TabBtnClickCallback
    init {
        LayoutInflater.from(context).inflate(R.layout.tab_container, this)
        bindView()
    }

    private fun bindView(){
        homeBtn = findViewById(R.id.homeWrap)
        friendBtn = findViewById(R.id.friendWrap)
        moreBtn = findViewById(R.id.moreWrap)
        meBtn = findViewById(R.id.meWrap)

        homeIv = findViewById(R.id.homeIv)
        friendIv = findViewById(R.id.friendIv)
        moreIv = findViewById(R.id.moreIv)
        meIv = findViewById(R.id.meIv)
    }

    fun setClickListener(callback: TabBtnClickCallback) {
        listener = callback
        homeBtn.clickOpt {
            homeIv.setImageResource(R.mipmap.ic_launcher)
            friendIv.setImageResource(R.mipmap.ic_launcher)
            moreIv.setImageResource(R.mipmap.ic_launcher)
            meIv.setImageResource(R.mipmap.ic_launcher)
            listener.invoke(0)
        }
        friendBtn.clickOpt {
            listener.invoke(1)
            homeIv.setImageResource(R.mipmap.ic_launcher)
            friendIv.setImageResource(R.mipmap.ic_launcher)
            moreIv.setImageResource(R.mipmap.ic_launcher)
            meIv.setImageResource(R.mipmap.ic_launcher)
        }
        moreBtn.clickOpt {
            listener.invoke(2)
            homeIv.setImageResource(R.mipmap.ic_launcher)
            friendIv.setImageResource(R.mipmap.ic_launcher)
            moreIv.setImageResource(R.mipmap.ic_launcher)
            meIv.setImageResource(R.mipmap.ic_launcher)
        }
        meBtn.clickOpt {
            listener.invoke(3)
            homeIv.setImageResource(R.mipmap.ic_launcher)
            friendIv.setImageResource(R.mipmap.ic_launcher)
            moreIv.setImageResource(R.mipmap.ic_launcher)
            meIv.setImageResource(R.mipmap.ic_launcher)
        }
    }

}
interface TabBtnClickCallback{
    fun invoke(position: Int)
}
