package com.example.navbottomhw

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_carpma.view.*

class CarpmaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val tasarim = inflater.inflate(R.layout.fragment_carpma, container, false)

        tasarim.buttonCarpma.setOnClickListener {

            val carpma = tasarim.editTextCarpma1.text.toString().toInt()*tasarim.editTextCarpma2.text.toString().toInt()

            val sonuc = CarpmaFragmentDirections.carpmaSonucGecis(carpma)

           Navigation.findNavController(it).navigate(sonuc)

       }
        return tasarim
    }
}

