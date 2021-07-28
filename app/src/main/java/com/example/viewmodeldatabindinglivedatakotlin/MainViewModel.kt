package com.example.viewmodeldatabindinglivedatakotlin

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    private var name: MutableLiveData<String> = MutableLiveData("name")
    private var content: MutableLiveData<String> = MutableLiveData("content");
    //private var count: MutableLiveData<String> = MutableLiveData();
    private var add: MutableLiveData<Int> = MutableLiveData(0);

    var nameStr: LiveData<String> = name
    var contentStr: LiveData<String> = content
    var addInt: LiveData<Int> = add

    fun setName(nameStr: String) {
        name.value = nameStr
   }

    fun setContent(contentStr: String) {
        content.value = contentStr
    }

    fun onAdd() {
        add.value = (add.value ?: 0) + 1
    }




}