package alexguid.custum.com.alexguid;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Mena on 7/31/2017.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(Context context, List<Place> places) {
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       View listview = convertView;

        if (listview == null){
            listview = LayoutInflater.from(getContext()).inflate(R.layout.listitem_view,parent,false);
        }

        Place place = getItem(position);
        ImageView image = (ImageView) listview.findViewById(R.id.imageplace);
        TextView placename = (TextView)listview.findViewById(R.id.place);
        TextView address = (TextView)listview.findViewById(R.id.address);


        placename.setText(place.getmName());
        address.setText(place.getmLoc());
        if(place.image()){
            image.setImageResource(place.getmImage_Id());
            image.setVisibility(View.VISIBLE);
        }
        else{
            image.setVisibility(View.GONE);
        }

        if (place.getmLoc().equals("0")){
            address.setVisibility(View.GONE);
        }

        return listview;
    }
}
