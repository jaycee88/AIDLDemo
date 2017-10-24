// INewBookArrivedListener.aidl
package com.jaycee88.aidldemo;
import com.jaycee88.aidldemo.Book;

// 提醒客户端新书到来
interface INewBookArrivedListener {
    void onNewBookArrived(in Book newBook);
}
