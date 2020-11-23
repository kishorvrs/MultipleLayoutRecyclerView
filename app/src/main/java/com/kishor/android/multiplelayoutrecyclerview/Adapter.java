package com.kishor.android.multiplelayoutrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import static com.kishor.android.multiplelayoutrecyclerview.ModelClass.AD_LAYOUT;
import static com.kishor.android.multiplelayoutrecyclerview.ModelClass.IMAGE_LAYOUT;
import static com.kishor.android.multiplelayoutrecyclerview.ModelClass.USER_INFO_LAYOUT;

public class Adapter extends RecyclerView.Adapter{
    public Adapter(List<ModelClass> modelClassList) {
        this.modelClassList = modelClassList;
    }

    private List<ModelClass> modelClassList;

    @Override
    public int getItemViewType(int position) {
        switch (modelClassList.get(position).getViewType()){
            case 0:
                return USER_INFO_LAYOUT;
            case 1:
                return AD_LAYOUT;
            case 2:
                return IMAGE_LAYOUT;
            default:
                return -1;
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        switch (viewType){
            case USER_INFO_LAYOUT:
                View userInfoLayout=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_layout,viewGroup,false);
                 return new UserInfoLayout(userInfoLayout);
                case AD_LAYOUT:
                    View adLayout=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ad_layout,viewGroup,false);
                    return new AdLayout(adLayout);
            case IMAGE_LAYOUT:
                View imageLayout=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.image_layout,viewGroup,false);
                return new ImageLayout(imageLayout);
            default:
                return null;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
      switch(modelClassList.get(position).getViewType()){

              case USER_INFO_LAYOUT:
                  int userImage=modelClassList.get(position).getImageResource();
                  String title=modelClassList.get(position).getTitle();
                  String body=modelClassList.get(position).getBody();
                  ((UserInfoLayout)viewHolder).setData(userImage,title,body);
                    break;
              case AD_LAYOUT:
                     String ad=modelClassList.get(position).getAdText();
                  ((AdLayout)viewHolder).setAdText(ad);
                  break;
              case IMAGE_LAYOUT:
                  int resource=modelClassList.get(position).getResource();
                  ((ImageLayout)viewHolder).setImageView(resource);
                  break;

              default:
                  return;


      }
    }

    @Override
    public int getItemCount() {
        return modelClassList.size();
    }
    class UserInfoLayout extends RecyclerView.ViewHolder {

        private ImageView userImage;
        private TextView username;
        private TextView body;
        public UserInfoLayout(@NonNull View itemView) {
            super(itemView);
            userImage=itemView.findViewById(R.id.id_main_image);
            username=itemView.findViewById(R.id.id_title);
            body=itemView.findViewById(R.id.id_body);
        }
        private void setData(int image,String name,String bodyText){

            userImage.setImageResource(image);
            username.setText(name);
            body.setText(bodyText);


        }
    }
    class AdLayout extends RecyclerView.ViewHolder {
        private TextView adText;
        public AdLayout(@NonNull View itemView) {
            super(itemView);
            adText=itemView.findViewById(R.id.id_ad);
        }

        private void setAdText(String ad){
               adText.setText(ad);
        }
    }
    class ImageLayout extends RecyclerView.ViewHolder {
        private ImageView imageView;
        public ImageLayout(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.id_main_image);
        }
        private void setImageView(int image){
                imageView.setImageResource(image);
        }
    }
}
