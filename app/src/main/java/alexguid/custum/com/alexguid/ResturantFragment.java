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
public class ResturantFragment extends Fragment {


    public ResturantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.activity_atrraction, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Byblos","Byblos",R.drawable.res_byblos));
        places.add(new Place("Fish Market","طريق الجيش، المزار",R.drawable.res_fishmarket));
        places.add(new Place("che Ghaby","As Soyouf Bahri, Qesm Al Montazah",R.drawable.res_cheghaby));
        places.add(new Place("Pablo Cafe & Restaurant","طريق الجيش",R.drawable.res_pablo));
        places.add(new Place("Country Hills","73 Down Town, El-Horeya Rd, Alexandria Governorate ",R.drawable.res_countryhell));
        places.add(new Place("Tejano's Mexican Grill","Estoret Louran Tower، 19",R.drawable.res_tejanos));
        places.add(new Place("Jars & Jazz","0",R.drawable.res_jaz));
        places.add(new Place("Delices","46 Saad Zaghloul, Raml Station, Alexandria ",R.drawable.res_delices));
        places.add(new Place("Holmes Burgers","7 إبراهيم نصير، سان ستفانو",R.drawable.res_holmez));

        PlaceAdapter adaptor = new PlaceAdapter(getActivity(),places);
        ListView listView = (ListView)rootView.findViewById(R.id.List_view_item);
        listView.setAdapter(adaptor);

        return rootView;
    }

}
