package com.das.group.assignment.store;

import java.util.LinkedList;

public class MainApp {
  private static MyCart myCartFrame = new MyCart();
  private static MainPage myStorePage = new MainPage();

  public static void main(final String[] args) {
    // The run time of application
    final long startTime = System.currentTimeMillis();
    myStorePage.cartFrame = myCartFrame;
    myCartFrame.myStorePage = myStorePage;

    final LinkedList<StoreItem> myCartList = new LinkedList<StoreItem>();

    final LinkedList<StoreItem> myStoreItemList = new LinkedList<StoreItem>();
    final LinkedList<StoreItem> searchedStoreItemList = new LinkedList<StoreItem>();

    myStoreItemList.add(new StoreItem("Apple", 5, 1));
    myStoreItemList.add(new StoreItem("Apricot", 6, 1));
    myStoreItemList.add(new StoreItem("Avocado", 7, 1));
    myStoreItemList.add(new StoreItem("Banana", 8, 1));
    // myStoreItemList.add(new StoreItem("Blackberry", 9, 1));
    // myStoreItemList.add(new StoreItem("Blackcurrant", 10, 1));
    myStoreItemList.add(new StoreItem("Bluberry", 11, 1));
    // myStoreItemList.add(new StoreItem("Breadfruit", 12, 1));
    myStoreItemList.add(new StoreItem("Cherry", 13, 1));
    myStoreItemList.add(new StoreItem("Coconut", 14, 1));
    myStoreItemList.add(new StoreItem("Chickoo", 15, 1));
    // yStoreItemList.add(new StoreItem("Custard Apple", 10, 1));
    // myStoreItemList.add(new StoreItem("Cranberries", 10, 1));
    myStoreItemList.add(new StoreItem("Date", 10, 1));
    // myStoreItemList.add(new StoreItem("Dragonfruit", 12, 1));
    myStoreItemList.add(new StoreItem("Durian", 9, 1));
    // myStoreItemList.add(new StoreItem("Elderberries", 10, 1));
    myStoreItemList.add(new StoreItem("Fig", 10, 1));
    myStoreItemList.add(new StoreItem("Feijoa", 10, 1));
    myStoreItemList.add(new StoreItem("Guava", 10, 1));
    // myStoreItemList.add(new StoreItem("Grapefruit", 10, 1));
    myStoreItemList.add(new StoreItem("Grape", 10, 1));
    // myStoreItemList.add(new StoreItem("Gooseberries", 10, 1));
    myStoreItemList.add(new StoreItem("Juiube", 10, 1));
    myStoreItemList.add(new StoreItem("Kiwi", 10, 1));
    myStoreItemList.add(new StoreItem("Lime", 10, 1));
    myStoreItemList.add(new StoreItem("Lemon", 10, 1));
    myStoreItemList.add(new StoreItem("Lychee", 10, 1));
    myStoreItemList.add(new StoreItem("Longan", 10, 1));
    myStoreItemList.add(new StoreItem("Mango", 10, 1));
    // myStoreItemList.add(new StoreItem("Mulberry", 10, 1));
    // myStoreItemList.add(new StoreItem("Mandarin", 10, 1));
    // myStoreItemList.add(new StoreItem("Mangosteen", 10, 1));
    // myStoreItemList.add(new StoreItem("Nectarine", 10, 1));
    myStoreItemList.add(new StoreItem("Oragen", 10, 1));
    myStoreItemList.add(new StoreItem("Papaya", 10, 1));
    // myStoreItemList.add(new StoreItem("Passion fruit", 10, 1));
    myStoreItemList.add(new StoreItem("Peach", 10, 1));
    myStoreItemList.add(new StoreItem("Pear", 10, 1));
    myStoreItemList.add(new StoreItem("Plum", 10, 1));
    // myStoreItemList.add(new StoreItem("Pineapple", 10, 1));
    // myStoreItemList.add(new StoreItem("Pomegranate", 10, 1));
    // myStoreItemList.add(new StoreItem("Prickly Pear", 10, 1));
    myStoreItemList.add(new StoreItem("Prunes", 10, 1));
    // myStoreItemList.add(new StoreItem("Pummelo", 10, 1));
    myStoreItemList.add(new StoreItem("Quince", 10, 1));
    // myStoreItemList.add(new StoreItem("Raspberry", 10, 1));
    myStoreItemList.add(new StoreItem("Starfruit", 10, 1));
    // myStoreItemList.add(new StoreItem("Strawberry", 10, 1));
    myStoreItemList.add(new StoreItem("Soursop", 10, 1));
    // myStoreItemList.add(new StoreItem("Tangerine", 10, 1));
    // myStoreItemList.add(new StoreItem("Watermelon", 10, 1));

    for(StoreItem item : myStoreItemList){
      searchedStoreItemList.add(item);
    }

    myCartFrame.myCartList = myCartList;
    myStorePage.myCartList = myCartList;
    myStorePage.myStoreItemList = myStoreItemList;
    myStorePage.searchedStoreItemList = myStoreItemList;
    myStorePage.loadItems();
    myStorePage.setVisible(true);

    final long endTime = System.currentTimeMillis();
    final long totalTime = endTime - startTime;
    System.out.println("The running time of the program in miliseconds is : " + totalTime);

  }
}