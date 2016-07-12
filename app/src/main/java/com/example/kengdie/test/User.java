package com.example.kengdie.test;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by kengdie on 2016/7/12.
 */
//public class User implements Serializable{
public class User implements Parcelable{
    private String name;
    private int sco;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSco() {
        return sco;
    }


    public void setSco(int sco) {
        this.sco = sco;
    }
    public User(String name, int sco) {
        this.name = name;
        this.sco = sco;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(getName());
        dest.writeInt(getSco());
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel source) {
            return new User(source.readString(),source.readInt());
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };
}
