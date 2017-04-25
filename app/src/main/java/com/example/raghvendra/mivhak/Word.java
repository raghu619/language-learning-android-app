package com.example.raghvendra.mivhak;

/**
 * Created by raghvendra on 28/1/17.
 */

public class Word

{

private String mDefaultTranslation;
    private  String mMivokTranslation;
    private int mimg_id=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;
private int mAudioResourceId;


    public Word(String DefaultTranslation,String MivokTranslation,int img_id,int AudioRsourceId )

    {
 mDefaultTranslation=DefaultTranslation;
  mMivokTranslation=MivokTranslation;
        mimg_id=img_id;
        mAudioResourceId=AudioRsourceId;

    }
    public Word(String DefaultTranslation,String MivokTranslation ,int AudioRsourceId  )

    {
        mDefaultTranslation=DefaultTranslation;
        mMivokTranslation=MivokTranslation;
        mAudioResourceId=AudioRsourceId;



    }


    public String getDefaultTranslation()
    {
        return mDefaultTranslation;


    }


    public String getMivokTranslation()
    {
        return mMivokTranslation;


    }

    public int getimg_id()
    {

        return mimg_id;
    }

    public int getmAudioResourceId()
    {


        return mAudioResourceId;

    }


    public boolean hasImage()
    {
        return mimg_id!=NO_IMAGE_PROVIDED;


    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMivokTranslation='" + mMivokTranslation + '\'' +
                ", mimg_id=" + mimg_id +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
