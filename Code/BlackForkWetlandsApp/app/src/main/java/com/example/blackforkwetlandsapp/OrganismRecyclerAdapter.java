package com.example.blackforkwetlandsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class OrganismRecyclerAdapter  extends RecyclerView.Adapter<OrganismRecyclerAdapter.ViewHolder>{


    private List<OrganismClass> organismClassList;

    public OrganismRecyclerAdapter(List<OrganismClass> modelClassList) {
        this.organismClassList = modelClassList;
    }

    @NonNull
    @Override
    public OrganismRecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        // I don't know what these lines do but you need them
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.organism_recycler_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OrganismRecyclerAdapter.ViewHolder holder, int position) {

        //put one of these for each of the fields you need to display
        String name=organismClassList.get(position).getName();
        String description=organismClassList.get(position).getDescription();
        int img=organismClassList.get(position).getImageID();
        holder.setData(name,description,img);
    }

    @Override
    public int getItemCount() {
        return organismClassList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        // put all the things you need to display here
        private TextView name, description;
        private ImageView img;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            //put one of these for each of the things you need to display
            name=itemView.findViewById(R.id.nameView);
            description=itemView.findViewById(R.id.descriptionView);
            img=itemView.findViewById(R.id.imageView);


        }

        public void setData(String name, String des, int img){

            //put one of these for each of the things that needs displayed
            this.name.setText(name);
            this.description.setText(des);
            this.img.setImageResource(img);

        }

    }



}
