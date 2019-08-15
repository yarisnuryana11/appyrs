package com.example.appsyrs.click;

import com.example.appsyrs.entity.Friends;

import java.util.ArrayList;

// 10116348 Yaris Nuryana IF 8  14 agustus 2019
public interface LoadFriendsCallback {
    void preExecute();
    void postExecute(ArrayList<Friends> friends);
}
