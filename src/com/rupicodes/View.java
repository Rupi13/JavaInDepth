package com.rupicodes;

import com.rupicodes.entities.Bookmark;
import com.rupicodes.entities.User;

public class View {
    public static void bookmark(User user, Bookmark[][] bookmarks) {
        System.out.println(user.getEmail() + "is bookmarking");
        for (int i = 0; i < DataStore.USER_BOOKMARK_LIMIT; i++) {
            int typeOffset = (int) (Math.random() * DataStore.BOOKMARK_TYPES_COUNT);
            int bookmarkOffset = (int) (Math.random() * DataStore.BOOKMARK_COUNT_PER_TYPE);
            Bookmark bookmark = bookmarks[typeOffset][bookmarkOffset];
        }
    }
}
