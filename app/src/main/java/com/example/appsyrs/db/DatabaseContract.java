package com.example.appsyrs.db;

import android.provider.BaseColumns;

// 10116348 agustus IF 8  14 agustus 2019
public class DatabaseContract {
    static String TABLE_FRIENDS = "friends";

    static final class FriendsColumn implements BaseColumns {
        static String NIM = "nim";
        static String NAMA = "nama";
        static String KELAS = "kelas";
        static String TELEPON = "telepon";
        static String EMAIL = "email";
        static String SOSMED = "sosmed";

    }
}

