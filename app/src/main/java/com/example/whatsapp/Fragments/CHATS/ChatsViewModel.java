package com.example.whatsapp.Fragments.CHATS;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.whatsapp.Model.ChatsModel;
import com.example.whatsapp.R;
import java.util.ArrayList;

public class ChatsViewModel extends ViewModel {

    private MutableLiveData<ArrayList<ChatsModel>> mutableLiveData;

    public ChatsViewModel() {

        mutableLiveData = new MutableLiveData<>();
        ArrayList<ChatsModel> data = new ArrayList<>();

        data.add(new ChatsModel("safa", R.drawable.a));
        data.add(new ChatsModel("Mohammed", R.drawable.b));
        data.add(new ChatsModel("Mostufa", R.drawable.c));
        data.add(new ChatsModel("safa", R.drawable.a));
        data.add(new ChatsModel("Mohammed", R.drawable.b));
        data.add(new ChatsModel("Mostufa", R.drawable.c));
        data.add(new ChatsModel("safa", R.drawable.a));
        data.add(new ChatsModel("Mohammed", R.drawable.b));
        data.add(new ChatsModel("Mostufa", R.drawable.c));
        data.add(new ChatsModel("safa", R.drawable.a));
        data.add(new ChatsModel("Mohammed", R.drawable.b));
        data.add(new ChatsModel("Mostufa", R.drawable.c));

        mutableLiveData.setValue(data);

    }
    public LiveData<ArrayList<ChatsModel>> getlist() {
        return mutableLiveData;
    }

}