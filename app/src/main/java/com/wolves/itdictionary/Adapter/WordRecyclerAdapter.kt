package com.wolves.itdictionary.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.wolves.itdictionary.Model.WordModel
import com.wolves.itdictionary.R
import com.wolves.itdictionary.ShowActivity
import kotlinx.android.synthetic.main.word_item.view.*

class WordRecyclerAdapter(var context: Context, var list: ArrayList<WordModel>) : RecyclerView.Adapter<WordRecyclerAdapter.MyViewHolder>() {

    inner class MyViewHolder (val itemView : View) : RecyclerView.ViewHolder(itemView){
        fun onBind(model: WordModel, position: Int){
            itemView.txt_wordName.text = list[position].wordEng
            itemView.txt_number.text = (position+1).toString()

            itemView.setOnClickListener{
                val intent = Intent(context, ShowActivity::class.java)
                intent.putExtra("wordEnglish", list[position].wordEng)
                intent.putExtra("wordUzbek", list[position].wordUzb)

                context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.word_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.onBind(list[position], position)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun filterList(filteredList: ArrayList<WordModel>){
        list = filteredList
        notifyDataSetChanged()
    }
}