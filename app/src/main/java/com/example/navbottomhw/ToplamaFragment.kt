package com.example.navbottomhw

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_toplama.view.*

class ToplamaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val tasarim = inflater.inflate(R.layout.fragment_toplama, container, false)

        tasarim.buttonToplama.setOnClickListener {

            val topla = tasarim.editTextTopla1.text.toString().toInt()+tasarim.editTextTopla2.text.toString().toInt()

            val sonuc = ToplamaFragmentDirections.toplamaSonucGecis(topla)

            Navigation.findNavController(it).navigate(sonuc)
        }

        return tasarim
    }


}