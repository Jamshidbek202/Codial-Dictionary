package com.wolves.itdictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wolves.itdictionary.Adapter.WordRecyclerAdapter
import com.wolves.itdictionary.Model.WordModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var list: ArrayList<WordModel>
    private lateinit var adapter: WordRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list = ArrayList()

        addWords()

        adapter = WordRecyclerAdapter(this, list)

        adapter.notifyDataSetChanged()

        wordRecyclerView.adapter = adapter
    }

    private fun addWords() {
        list.add(WordModel("Lecture", "Leksiya"))
        list.add(WordModel("Introduction", "Kirish qismi"))
        list.add(WordModel("Week", "Hafta"))
        list.add(WordModel("What", "Nima"))
        list.add(WordModel("And", "Va"))
        list.add(WordModel("Language", "Til"))
        list.add(WordModel("High", "Yuqori"))
        list.add(WordModel("Level", "Daraja"))
        list.add(WordModel("History", "Tarix"))
        list.add(WordModel("Of", "..ning"))
        list.add(WordModel("Standard", "Standart"))
        list.add(WordModel("Library", "Kutubxona"))
        list.add(WordModel("Translator", "Tarjimon"))
        list.add(WordModel("Compiler", "Tuzuvchi"))
        list.add(WordModel("Interpreter", "Tarjimon"))
        list.add(WordModel("Structure", "Qurish, Tuzish"))
        list.add(WordModel("Basic", "Asosiy"))
        list.add(WordModel("Typical", "Odatiy"))
        list.add(WordModel("Environment", "Atrof-muhit"))
        list.add(WordModel("Device", "Qurilma"))
        list.add(WordModel("Capable", "Qodir"))
        list.add(WordModel("Perform", "Bajarmoq, ijro etmoq"))
        list.add(WordModel("Computation", "Hisoblash"))
        list.add(WordModel("Make", "Yasamoq, tayyorlamoq"))
        list.add(WordModel("Logical", "Mantiqiy"))
        list.add(WordModel("Decision", "Qaror"))
        list.add(WordModel("Machine", "Mashina"))
        list.add(WordModel("Manipulate", "Ta'sir o'tkazmoq, ustalik bilan boshqarmoq"))
        list.add(WordModel("Data", "Ma'lumot'"))
        list.add(WordModel("List", "Ro'yxat"))
        list.add(WordModel("Instruction", "Ko'rsatma"))
        list.add(WordModel("Can", "Qila olmoq"))
        list.add(WordModel("Store", "Saqlamoq, yuklamoq"))
        list.add(WordModel("Retrieve", "Qaytarib olmoq"))
        list.add(WordModel("Process", "Jarayon"))
        list.add(WordModel("Set", "O'rnatmoq"))
        list.add(WordModel("Control", "Nazorat qilmoq"))
        list.add(WordModel("Hardware", "Apparat (masalan kompyuter qismlari)"))
        list.add(WordModel("Software", "Dasturiy ta'minot"))
        list.add(WordModel("Physical", "Jismoniy"))
        list.add(WordModel("Part", "Qism"))
        list.add(WordModel("Various", "Turli xil"))
        list.add(WordModel("Comprise", "O'z ichiga olmoq"))
        list.add(WordModel("Example", "Misol"))
        list.add(WordModel("Keyboard", "Klaviatura"))
        list.add(WordModel("Screen", "Ekran"))
        list.add(WordModel("Mouse", "Sichqoncha"))
        list.add(WordModel("Disk", "Disk"))
        list.add(WordModel("Memory", "Xotira"))
        list.add(WordModel("Unit", "Bo'lim"))
        list.add(WordModel("Collection", "Bo'lim"))
        list.add(WordModel("Procedure", "Jarayon"))
        list.add(WordModel("Documentation", "Hujjat"))
        list.add(WordModel("That", "O'sha, u"))
        list.add(WordModel("Run", "Yurgizmoq"))
        list.add(WordModel("Organization", "Tashkilot"))
        list.add(WordModel("Input", "Kiritish"))
        list.add(WordModel("Obtain", "Erishmoq, olmoq"))
        list.add(WordModel("Information", "Ma'lumot"))
        list.add(WordModel("Printer", "Printer"))
        list.add(WordModel("Other", "Boshqa"))
        list.add(WordModel("Rapid", "Tez, jadal"))
        list.add(WordModel("Access", "Kirish uchun ruxsat, kompyuterga kirish"))
        list.add(WordModel("Low", "Past"))
        list.add(WordModel("Capacity", "Quvvat, imkoniyat"))
        list.add(WordModel("Calculation", "Hisoblash"))
        list.add(WordModel("Supervise", "Nazorat qilmoq"))
        list.add(WordModel("Coordinate", "Moslamoq"))
        list.add(WordModel("Section", "bo'lim"))
        list.add(WordModel("Secondary", "Ikkilamchi"))
        list.add(WordModel("Storage", "Saqlash joyi"))
        list.add(WordModel("Cheap", "Arzon"))
        list.add(WordModel("Long-term", "Uzoq mudattli"))
        list.add(WordModel("High-capacity", "Yuqori quvvatli"))
        list.add(WordModel("Inactive", "Nofaol"))
        list.add(WordModel("Divide", "Bo'lmoq"))
        list.add(WordModel("Three", "Uch"))
        list.add(WordModel("Execute", "Bajarmoq"))
        list.add(WordModel("Directly", "Bevosita"))
        list.add(WordModel("Dependent", "Tobe, qaram"))
        list.add(WordModel("String", "Arqon, bog'lam"))
        list.add(WordModel("Specific", "Maxsus"))
        list.add(WordModel("Like", "O'xshash"))
        list.add(WordModel("Abbreviation", "Qisqartma"))
        list.add(WordModel("Represent", "Vakil bo'lmoq"))
        list.add(WordModel("Directly", "Bevosita"))
        list.add(WordModel("Directly", "Bevosita"))
        list.add(WordModel("Directly", "Bevosita"))
        list.add(WordModel("Directly", "Bevosita"))
        list.add(WordModel("Directly", "Bevosita"))
        list.add(WordModel("Directly", "Bevosita"))
        list.add(WordModel("Directly", "Bevosita"))

    }
}