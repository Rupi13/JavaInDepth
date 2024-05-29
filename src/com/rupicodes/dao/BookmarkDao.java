package com.rupicodes.dao;

import com.rupicodes.DataStore;
import com.rupicodes.entities.Bookmark;
import com.rupicodes.entities.UserBookmark;

public class BookmarkDao {
	public Bookmark[][] getBookmarks() {
		return DataStore.getBookmarks();
	}

	public void saveUserBookmark(UserBookmark userBookmark) {
		DataStore.add(userBookmark);
	}
}
