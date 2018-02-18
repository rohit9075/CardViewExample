package squareandcube.com.cardviewexample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by VIVEK on 10/16/2017.
 */

public class ItemArrayAdapter extends RecyclerView.Adapter<ItemArrayAdapter.ViewHolder> {

    private ArrayList<ItemData> mItemDataList;
    private int listItemLayout;

    public ItemArrayAdapter(ArrayList<ItemData> mItemDataList, int listItemLayout) {
        this.mItemDataList = mItemDataList;
        this.listItemLayout = listItemLayout;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list, parent, false);
        ViewHolder mViewHolder = new ViewHolder(view);
        return mViewHolder;
    }

    @Override
    public void onBindViewHolder(ItemArrayAdapter.ViewHolder holder, int position) {

        TextView mNameTextView = holder.mNameTextView;
        mNameTextView.setText(mItemDataList.get(position).getName());

        TextView mIdTextView = holder.mIdTextView;
        mIdTextView.setText(mItemDataList.get(position).getId());

        TextView mNotesTextView = holder.mNotesTextView;
        mNotesTextView.setText(mItemDataList.get(position).getNotes());



    }

    @Override
    public int getItemCount() {
        return mItemDataList == null ? 0 : mItemDataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView mNameTextView, mIdTextView, mNotesTextView;


        public ViewHolder(View itemView) {
            super(itemView);
          mNameTextView = (TextView)itemView.findViewById(R.id.name_textView);
          mIdTextView = (TextView)itemView.findViewById(R.id.id_textView);
          mNotesTextView = (TextView)itemView.findViewById(R.id.notes_textView);
        }
    }
}
