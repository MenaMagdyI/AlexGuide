package alexguid.custum.com.alexguid;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AttractionFragment extends Fragment {


    public AttractionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.activity_atrraction, container, false);
        Log.i("Numbers Fragment ","Here on create view 111111111111111111");
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Fanar Askndrya","Ba7ary",R.drawable.place_fanar));
        places.add(new Place("Mena2 Askndrya","Ba7ary",R.drawable.place_mena2));
        places.add(new Place("Kasr al Montza","Montaza",R.drawable.place_montza));
        places.add(new Place("Al Mt7f al Kwmy","Manshya",R.drawable.place_mt7fkwmy));
        places.add(new Place("mt7f al a7ya2 al ma2ya","Ba7ary",R.drawable.place_mt7fma2y));
        places.add(new Place("Al Mt7f al Yonany","ras al teen",R.drawable.place_mt7fyonany));
        places.add(new Place("Fanar Askndrya","Ba7ary",R.drawable.place_fanar));
        places.add(new Place("Mena2 Askndrya","Ba7ary",R.drawable.place_mena2));
        places.add(new Place("Kasr al Montza","Montaza",R.drawable.place_montza));

        PlaceAdapter adaptor = new PlaceAdapter(getActivity(),places);
        ListView listView = (ListView)rootView.findViewById(R.id.List_view_item);
        listView.setAdapter(adaptor);
        Log.i("Numbers Fragment ","Here on create view 111111111111111111");
        return rootView;
    }

}
