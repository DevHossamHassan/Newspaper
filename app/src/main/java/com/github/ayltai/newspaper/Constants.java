package com.github.ayltai.newspaper;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import android.support.annotation.IntDef;

import com.github.ayltai.newspaper.main.MainScreen;

public final class Constants {
    public static final int REMOTE_CONFIG_CACHE_EXPIRATION = 1000 * 60 * 60;

    public static final int REFRESH_LOAD_TIMEOUT = 30;
    public static final int INIT_LOAD_TIMEOUT    = 3;
    public static final int INIT_LOAD_ITEM_COUNT = 10;

    static final int UPDATE_INTERVAL = 3 * 60;

    public static final int REQUEST_SETTINGS = 1;
    public static final int REQUEST_FIREBASE = 2;

    public static final int DRAWER_MENU_ANIMATION_DELAY = 250;

    public static final int MAX_IMAGE_SCALE = 100;

    public static final String ENCODING_UTF8 = "UTF-8";

    public static final String EMPTY = "";

    public static final String SOURCE_BOOKMARK = "BOOKMARK";

    public static final String ANALYTICS_BOOKMARK_ADD    = "Bookmark (Add)";
    public static final String ANALYTICS_BOOKMARK_REMOVE = "Bookmark (Remove)";

    @Retention(RetentionPolicy.SOURCE)
    @IntDef({ Constants.LIST_VIEW_TYPE_COZY, Constants.LIST_VIEW_TYPE_COMPACT })
    public @interface ListViewType {
    }

    public static final int LIST_VIEW_TYPE_COZY    = 1;
    public static final int LIST_VIEW_TYPE_COMPACT = 2;
    public static final int LIST_VIEW_TYPE_DEFAULT = Constants.LIST_VIEW_TYPE_COMPACT;

    static final Object KEY_SCREEN_MAIN = new MainScreen.Key();

    private Constants() {
    }
}
