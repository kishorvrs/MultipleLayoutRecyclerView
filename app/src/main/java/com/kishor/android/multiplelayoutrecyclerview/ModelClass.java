package com.kishor.android.multiplelayoutrecyclerview;

public class ModelClass {

    public static final int USER_INFO_LAYOUT=0;
    public static final int AD_LAYOUT=1;
    public static final int IMAGE_LAYOUT=2;
    public int getViewType() {
        return viewType;
    }

    public void setViewType(int viewType) {
        this.viewType = viewType;
    }

    private int viewType;

    ///user info layout
    private int imageResource;
    private String title;
    private String body;

    public ModelClass(int viewType,int imageResource, String title, String body) {
        this.imageResource = imageResource;
        this.title = title;
        this.body = body;
        this.viewType=viewType;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
    ////user info layout

    ///ad layout
    private String adText;

    public ModelClass(int viewType,String adText) {
        this.adText = adText;
        this.viewType=viewType;
    }

    public String getAdText() {
        return adText;
    }

    public void setAdText(String adText) {
        this.adText = adText;
    }
    ///ad layout

    ///image layout
    private int Resource;

    public ModelClass(int viewType,int resource) {
        Resource = resource;
        this.viewType=viewType;
    }

    public int getResource() {
        return Resource;
    }

    public void setResource(int resource) {
        Resource = resource;
    }
    ///image layout

}
