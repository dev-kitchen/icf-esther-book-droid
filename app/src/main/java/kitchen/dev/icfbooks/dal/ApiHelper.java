package kitchen.dev.icfbooks.dal;

import android.content.Context;

import kitchen.dev.icfbooks.model.media.Media;

/**
 * Created by noc on 19.02.16.
 */
public class ApiHelper {

    private Context context;

    private static final String MEDIA_URL = "https://rhino.dev.kitchen/media/";

    public ApiHelper(Context context) {
        this.context = context;
    }

    public Media getItem(String id) {
        String url = MEDIA_URL + id + ".json";
        //TODO: get data


        return null;
        //return ItemFactory.getInstance(this.context).addItem(uuid, title, type, teaser, thumbUrl, assetUrl);
    }

    //TODO: getVideo
    //TODO: getPic
}
