package com.xiecc.seeWeather.modules.main.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.xiecc.seeWeather.R;
import com.xiecc.seeWeather.common.utils.WeChatShareUtil;


@Deprecated
public class SharePresenter {

    private View mRootView;




    LinearLayout mLayTimeLine;

    public SharePresenter(Context context, String content) {

        ButterKnife.bind(this, mRootView);
        initListener(content);
    }

    private void initListener(String content) {
        mLayTimeLine.setOnClickListener(click -> WeChatShareUtil.toTimeLine(mLayTimeLine.getContext(), content));
    }

    public View getRootView() {
        return mRootView;
    }
}
