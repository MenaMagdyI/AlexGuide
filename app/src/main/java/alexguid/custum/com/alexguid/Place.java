package alexguid.custum.com.alexguid;

/**
 * Created by Mena on 7/31/2017.
 */

public class Place {

    private String mName;
    private String mLoc;
    private int no_image = 0;
    private int mImage_Id = no_image;



    public Place(String name, String loc ){
        mName = name;
        mLoc = loc;
    }

    public Place(String name ,String loc,int Id){
        mName = name;
        mLoc = loc;
        mImage_Id = Id;
    }

    public String getmName(){
        return mName;
    }
    public String getmLoc(){
        return mLoc;
    }
    public int getmImage_Id(){
        return mImage_Id;
    }

    public boolean image(){
        return (mImage_Id!=no_image);
    }

}
