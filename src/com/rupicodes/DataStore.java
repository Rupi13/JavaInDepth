package com.rupicodes;

import com.rupicodes.constants.BookGenre;
import com.rupicodes.constants.Gender;
import com.rupicodes.constants.MovieGenre;
import com.rupicodes.constants.UserType;
import com.rupicodes.entities.Bookmark;
import com.rupicodes.entities.User;
import com.rupicodes.entities.UserBookmark;
import com.rupicodes.managers.BookmarkManager;
import com.rupicodes.managers.UserManager;

public class DataStore {
	private static User[] users = new User[5];
	private static Bookmark[][] bookmarks = new Bookmark[3][5];
	private static UserBookmark[] userBookmarks = new UserBookmark[5 * 5];

	public static User[] getUsers() {
		return users;
	}

	public static Bookmark[][] getBookmarks() {
		return bookmarks;
	}

	public static void loadData() {
		loadUsers();
		loadWebLinks();
		loadMovies();
		loadBooks();
	}

	private static void loadMovies() {
		bookmarks[1][0] = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Welles", "Joseph Cotten" }, new String[] { "Orson Welles" }, MovieGenre.CLASSICS, 8.5);
	}

	private static void loadBooks() {
		bookmarks[2][0] = BookmarkManager.getInstance().createBook(4000, "Walden", "", 1854, "Wilder Publications",
				new String[] { "Henry David", " Thoreau" },BookGenre.PHILOSOPHY ,4.3);
	}

	private static void loadUsers() {
		users[0] = UserManager.getInstance().createUser(1000, "user0@semanticsquare.com", "test", "John", "M",
				UserType.USER, Gender.MALE);
		users[1] = UserManager.getInstance().createUser(1001, "user1@semanticsquare.com", "test", "John", "M",
				UserType.USER, Gender.MALE);
		users[2] = UserManager.getInstance().createUser(1002, "user2@semanticsquare.com", "test", "John", "M",
				UserType.USER, Gender.MALE);
		users[3] = UserManager.getInstance().createUser(1003, "user2@semanticsquare.com", "test", "John", "M",
				UserType.USER, Gender.MALE);
		users[4] = UserManager.getInstance().createUser(1004, "user2@semanticsquare.com", "test", "John", "M",
				UserType.USER, Gender.MALE);
	}

	private static void loadWebLinks() {
		bookmarks[0][0] = BookmarkManager.getInstance().createWeblink(2000,"Taming Tiger", "Part 2",	"http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html","http://www.javaworld.com"	);
	}
}
