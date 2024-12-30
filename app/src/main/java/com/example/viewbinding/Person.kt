package com.example.viewbinding

 data class Person(val name: String,val surname: String,val address: String,val phone: String,val image: Int,val mail: String) {

     companion object {

         val person = Person("Oleg","Фантомас","Петровка 38","8-999-231-23-56",R.drawable.images1,"lkoju455@maol.com")

     }
}