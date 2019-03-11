package com.example.attendence;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.cache.memory.impl.WeakMemoryCache;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.display.FadeInBitmapDisplayer;

import java.util.ArrayList;

public class customListAdapterDoctor  extends ArrayAdapter<docCard> {

    private static final String TAG = "customListAdapterDoctor";

    private Context mContext;
    private int mResource;
    private int lastPosition = -1;

    /**
     * Holds variables in a View
     */
    private static class ViewHolder {
        TextView Name;
        TextView Attend;
    }

    /**
     * Default constructor for the customListAdapter
     **/
    public customListAdapterDoctor(Context context, int resource, ArrayList<docCard> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        String name= getItem(position).getName();
        String attend= getItem(position).getAttend();

        try{


            //create the view result for showing the animation
            final View result;

            //ViewHolder object
            ViewHolder holder;


            if(convertView == null){
                LayoutInflater inflater = LayoutInflater.from(mContext);
                convertView = inflater.inflate(mResource, parent, false);
                holder= new ViewHolder();
                holder.Name= (TextView) convertView.findViewById(R.id.name);
                holder.Attend = (TextView) convertView.findViewById(R.id.attend);

                result = convertView;

                convertView.setTag(holder);
            }
            else{
                holder = (ViewHolder) convertView.getTag();
                result = convertView;
            }


            Animation animation = AnimationUtils.loadAnimation(mContext,
                    (position > lastPosition) ? R.anim.load_down_anim : R.anim.load_up_anim);
            result.startAnimation(animation);
            lastPosition = position;

            holder.Name.setText(name);
            holder.Attend.setText(attend);

            return convertView;
        }
        catch (IllegalArgumentException e)
        {
            Log.e(TAG,"getView:IllegalArgumentException: "+e.getMessage());
            return convertView;
        }
    }

}