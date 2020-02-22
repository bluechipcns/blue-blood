package com.bluechipcns.test1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.contracts_item.view.*

class MainAdapter : RecyclerView.Adapter<MainAdapter.MainViewHoler>() {

    var items: MutableList<ContractData> = mutableListOf(ContractData("Name","Tel"),
        ContractData("Name","Tel"),
        ContractData("Name","Tel"))

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int) = MainViewHoler(parent)

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: MainAdapter.MainViewHoler, position: Int) {
        items[position].let { item ->
            with(holder) {
                tvContractName.text = item.name
                tvContractTel.text = item.tel
            }
        }
    }

    inner class MainViewHoler(parent: ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.contracts_item, parent, false)) {
        val tvContractName = itemView.tv_contract_name
        val tvContractTel = itemView.tv_contract_tel
    }

}