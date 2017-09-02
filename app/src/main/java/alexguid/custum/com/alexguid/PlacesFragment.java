package alexguid.custum.com.alexguid;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlacesFragment extends Fragment {


    public PlacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.activity_atrraction, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Fanar Askndrya","Ba7ary"));
        places.add(new Place("Mena2 Askndrya","Ba7ary"));
        places.add(new Place("Kasr al Montza","Montaza"));
        places.add(new Place("Al Mt7f al Kwmy","Manshya"));
        places.add(new Place("mt7f al a7ya2 al ma2ya","Ba7ary"));
        places.add(new Place("Al Mt7f al Yonany","ras al teen"));
        places.add(new Place("Fanar Askndrya","Ba7ary"));
        places.add(new Place("Mena2 Askndrya","Ba7ary"));
        places.add(new Place("Kasr al Montza","Montaza"));

        PlaceAdapter adaptor = new PlaceAdapter(getActivity(),places);
        ListView listView = (ListView)rootView.findViewById(R.id.List_view_item);
        listView.setAdapter(adaptor);

        return rootView;
    }

}
