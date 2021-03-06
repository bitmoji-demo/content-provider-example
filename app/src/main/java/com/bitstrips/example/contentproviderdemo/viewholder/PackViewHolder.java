package com.bitstrips.example.contentproviderdemo.viewholder;

import com.bitstrips.example.contentproviderdemo.R;
import com.bitstrips.example.contentproviderdemo.adpater.StickersAdapter;
import com.bitstrips.example.contentproviderdemo.model.StickerPack;

import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class PackViewHolder extends RecyclerView.ViewHolder {

    public TextView mTextView;
    public StickersAdapter mAdapter;
    public RecyclerView mRecyclerView;

    public PackViewHolder(@NonNull View view) {
        super(view);

        mTextView = view.findViewById(R.id.sticker_pack_entry_name);
        mAdapter = new StickersAdapter();
        mRecyclerView = view.findViewById(R.id.sticker_pack_images_recycler_view);
        mRecyclerView.setLayoutManager(
                new LinearLayoutManager(view.getContext(), LinearLayoutManager.HORIZONTAL, false));
        mRecyclerView.setAdapter(mAdapter);
    }

    public void bind(StickerPack stickerPack) {
        mTextView.setText(stickerPack.mName);
        mAdapter.setImageUris(stickerPack.mImageUris);
    }
}
