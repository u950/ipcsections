package com.example.ipcapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NestedAdapter extends RecyclerView.Adapter<NestedAdapter.NestedViewHolder> {

    private List<String> mList;
    private boolean[] expandedStates;
    private PopupWindow popupWindow;

    public NestedAdapter(List<String> mList){
        this.mList = mList;
        expandedStates = new boolean[mList.size()];
    }

    @NonNull
    @Override
    public NestedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.nested_item , parent , false);
        return new NestedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NestedViewHolder holder, int position) {
        holder.mTv.setText(mList.get(position));

        if (expandedStates[position]) {
            holder.arrowImageView.setImageResource(R.drawable.arrow_up);
            holder.expandableLayout.setVisibility(View.VISIBLE);
        } else {
            holder.arrowImageView.setImageResource(R.drawable.arrow_down);
            holder.expandableLayout.setVisibility(View.GONE);
        }

        holder.cardView.setOnClickListener(v -> {
            expandedStates[position] = !expandedStates[position];
            notifyItemChanged(position);
        });

        holder.itemView.setOnClickListener(v -> {
            showPopup(holder.itemView, mList.get(position));
        });
    }
    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class NestedViewHolder extends RecyclerView.ViewHolder{
        private TextView mTv;
        private CardView cardView;
        private View expandableLayout;
        private ImageView arrowImageView;

        public NestedViewHolder(@NonNull View itemView) {
            super(itemView);
            mTv = itemView.findViewById(R.id.nestedItemTv);
            cardView = itemView.findViewById(R.id.cardView);
            expandableLayout = itemView.findViewById(R.id.expandableLayout);
            arrowImageView = itemView.findViewById(R.id.arrowImageView);
        }
    }

    private void showPopup(View anchorView, String detailedDescription) {
        View popupView = LayoutInflater.from(anchorView.getContext()).inflate(R.layout.popup_discrption, null);
        TextView detailedDescriptionTv = popupView.findViewById(R.id.detailedDescriptionTv);
        detailedDescriptionTv.setText(detailedDescription);

        popupWindow = new PopupWindow(popupView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, true);
        popupWindow.setElevation(10);
        popupWindow.showAtLocation(anchorView, Gravity.CENTER, 0, 0);

        popupView.setOnClickListener(v -> popupWindow.dismiss());
    }
}
