package cn.huida.burt.retro.fragment.recfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import cn.huida.burt.retro.R;

/**
 * Created by dell-pc on 2017/4/20.
 */

public class Video extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.mostjoin_layout, container, false);
        TextView tv_mostjoin = (TextView) view.findViewById(R.id.tv_mostjoin);
        tv_mostjoin.setText("video");
        return view;
    }
}
