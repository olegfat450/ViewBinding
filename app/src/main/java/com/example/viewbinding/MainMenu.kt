package com.example.viewbinding

class MainMenu (val title: String,val image: Int) {

    companion object{
        val m1 = MainMenu("Профиль",R.drawable.home)
        val m2 = MainMenu("Чаты",R.drawable.chats)
        val m3 = MainMenu("Виджеты",R.drawable.widgets)
        val m4 = MainMenu("Браузер",R.drawable.webwiew)
        val m5 = MainMenu("Настройки",R.drawable.setting)
        val m6 = MainMenu("Выход",R.drawable.exit)

        val mainmenu = listOf(m1,m2,m3,m4,m5,m6)

    }


}