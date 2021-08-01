package com.example.apicallinfragmetn;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.jetbrains.annotations.NotNull;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class ApiFragment extends Fragment {
    private EditText username;
    private Button click;
    private TextView user;
    private TextView login;
    private ImageView image;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_api, container, false);
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
    }

    private void initView(View view) {
        username=view.findViewById(R.id.edtuserid);
        click=view.findViewById(R.id.btnclick);
        user=view.findViewById(R.id.txtname);
        login=view.findViewById(R.id.txtlogin);
        image=view.findViewById(R.id.imgImage);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ApiService apiService=Network.getInstance().create(ApiService.class);
                String Uname=username.getText().toString();
                apiService.getUser(Uname).enqueue(new Callback<ResponseModel>() {
                    @Override
                    public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
                        ResponseModel model=response.body();
                        String UserName=model.getName();
                        String LoginId=model.getLogin();
                        user.setText(UserName);
                        login.setText(LoginId);
                        Glide.with(image).load(model.getAvatarUrl()).into(image);
                    }

                    @Override
                    public void onFailure(Call<ResponseModel> call, Throwable t) {

                    }
                });
            }
        });
    }
}