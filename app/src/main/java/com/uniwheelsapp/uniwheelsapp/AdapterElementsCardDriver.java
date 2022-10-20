package com.uniwheelsapp.uniwheelsapp;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterElementsCardDriver extends RecyclerView.Adapter<AdapterElementsCardDriver.ViewHolder> {

    private List<ElementsCardDriver> ndata;
    private LayoutInflater nInflater;
    private Context context;

    public AdapterElementsCardDriver(List<ElementsCardDriver> itemList,Context context){
        this.nInflater = LayoutInflater.from(context);
        this.context = context;
        this.ndata =itemList;
    }
    /**
    Tamaño
     */
    @Override
    public int getItemCount(){return ndata.size();}

    @Override
    public AdapterElementsCardDriver.ViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
        View view = nInflater.inflate(R.layout.list_element,null);
        return new AdapterElementsCardDriver.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final AdapterElementsCardDriver.ViewHolder holder,final int position){
        holder.bindData(ndata.get(position));

    }
    /**
     * Listado nuevo
     */
    public void setItems (List<ElementsCardDriver> items){ndata = items;}

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView iconImage;
        TextView dia, cupos,salida,hora,destino;

        ViewHolder(View itemView){
            super(itemView);
            iconImage = itemView.findViewById(R.id.iconImageView);
            dia = itemView.findViewById(R.id.diaConductor);
            cupos = itemView.findViewById(R.id.cuposCondctor);
            salida = itemView.findViewById(R.id.lugarSalida);
            hora = itemView.findViewById(R.id.horaSalida);
            destino = itemView.findViewById(R.id.lugarDestino);
        }

        void bindData(final ElementsCardDriver item){
            iconImage.setColorFilter(Color.parseColor(item.color), PorterDuff.Mode.SRC_IN);
            dia.setText(item.getDia());
            cupos.setText(item.getCupos());
            salida.setText(item.getSalida());
            hora.setText(item.getHora());
            destino.setText(item.getDestino());


        }
    }

}
