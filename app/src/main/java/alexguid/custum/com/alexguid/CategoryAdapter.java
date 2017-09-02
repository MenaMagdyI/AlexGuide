package alexguid.custum.com.alexguid;


import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.content.ContextCompat;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.DynamicDrawableSpan;
import android.text.style.ImageSpan;

import static alexguid.custum.com.alexguid.R.drawable.tab_attraction;
import static android.support.v4.content.ContextCompat.getDrawable;


public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;


    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }


    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AttractionFragment();
        } else if (position == 1) {
            return new ResturantFragment();
        } else {
            return new PlacesFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.Attraction_fragment);
        } else if (position == 1) {
            return mContext.getString(R.string.Resturant_fragment);
        }  else {
            return mContext.getString(R.string.Places_fragment);
        }
    }
/*
    Drawable myDrawable;
    String title;

    @Override
    public CharSequence getPageTitle(int position) {

            if (position == 0) {
                myDrawable = mContext.getResources().getDrawable(R.drawable.tab_attraction);
                title = mContext.getResources().getString(R.string.Attraction_fragment);
            }
            else if (position == 1) {
                myDrawable = mContext.getResources().getDrawable(R.drawable.tab_res);
                title = mContext.getResources().getString(R.string.Resturant_fragment);
            }
            else {
                myDrawable = mContext.getResources().getDrawable(R.drawable.tab_places);
                title = mContext.getResources().getString(R.string.Places_fragment);
            }


        SpannableStringBuilder sb = new SpannableStringBuilder("   " + title); // space added before text for convenience
        try {
            myDrawable.setBounds(5, 5, myDrawable.getIntrinsicWidth(), myDrawable.getIntrinsicHeight());
            ImageSpan span = new ImageSpan(myDrawable, DynamicDrawableSpan.ALIGN_BASELINE);
            sb.setSpan(span, 0, 1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            return span;
        } catch (Exception e) {
        }



}*/
}

