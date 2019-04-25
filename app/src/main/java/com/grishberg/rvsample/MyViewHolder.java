package com.grishberg.rvsample;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    // each data item is just a string in this case
    private TextView textView;

    MyViewHolder(View v) {
        super(v);
        textView = v.findViewById(R.id.title);
    }

    void bind(String data) {
        textView.setText(data);
    }
}
