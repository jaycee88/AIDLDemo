package com.jaycee88.aidldemo;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Book
 * Created by jaycee on 2017/10/19.
 */
public class Book implements Parcelable {

    private int id;
    private String name;

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }

    protected Book(Parcel in) {
        id = in.readInt();
        name = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(name);
    }

    // 手动实现这个方法
    public void readFromParcel(Parcel dest) {
        // 注意，这里的读取顺序要和writeToParcel()方法中的写入顺序一致
        id = dest.readInt();
        name = dest.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Book> CREATOR = new Creator<Book>() {
        @Override
        public Book createFromParcel(Parcel in) {
            return new Book(in);
        }

        @Override
        public Book[] newArray(int size) {
            return new Book[size];
        }
    };

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}' +
                "\n";
    }
}
