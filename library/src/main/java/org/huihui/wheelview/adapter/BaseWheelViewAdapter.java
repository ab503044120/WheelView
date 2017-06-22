package org.huihui.wheelview.adapter;

import java.util.List;

/**
 * Created by Administrator on 2017/6/19.
 */

public abstract class BaseWheelViewAdapter<T> {
    protected List<T> mDatas;

    public BaseWheelViewAdapter(List<T> datas) {
        mDatas = datas;
    }

    public abstract int size();

    public abstract String getItem(int position);
}
