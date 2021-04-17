package com.example.navbottomhw

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_toplama_sonuc.view.*

class ToplamaSonucFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val tasarim = inflater.inflate(R.layout.fragment_toplama_sonuc, container, false)

        val bundle:ToplamaSonucFragmentArgs by navArgs()

        val gelenSayi = bundle.toplamasonuc.toString()

        tasarim.ToplamaSonuc.text ="TOPLAMA SONUÇ : $gelenSayi"

        Log.e("Gelen Sayı :", gelenSayi)

        return tasarim
    }


}