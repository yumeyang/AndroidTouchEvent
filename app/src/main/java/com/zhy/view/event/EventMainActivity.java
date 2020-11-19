package com.zhy.view.event;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

/**
 * @author:yhz
 * @time:2020/11/19
 * @email:309581534@qq.com
 * @describe:
 */
public class EventMainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main_event);
    }
}
