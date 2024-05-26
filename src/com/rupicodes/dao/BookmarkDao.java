package com.rupicodes.dao;

import com.rupicodes.DataStore;
import com.rupicodes.entities.Bookmark;

public class BookmarkDao {
	public Bookmark[][] getBookmarks() {
		return DataStore.getBookmarks();
	}
}
