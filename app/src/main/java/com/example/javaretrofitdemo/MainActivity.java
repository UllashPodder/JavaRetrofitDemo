package com.example.javaretrofitdemo;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.javaretrofitdemo.APIclient.APIcontroller;
import com.example.javaretrofitdemo.DataModel.PostManResponseModel;
import com.example.javaretrofitdemo.DataModel.ResponseModel;

public class MainActivity extends AppCompatActivity {
    private EditText text1;
    private EditText number1;
    private Button submitButton;
    private TextView responseView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = findViewById(R.id.text_field1);
        number1 = findViewById(R.id.number_field);
        responseView = findViewById(R.id.response_view);
        submitButton = findViewById(R.id.submit_button);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processDATA();
            }
        });
    }
    private void processDATA(){
        responseView.setText("");
        Call<PostManResponseModel> call = APIcontroller.getInstance()
                .getAPI()
                .getPostResponse(text1.getText().toString());

        call.enqueue(new Callback<PostManResponseModel>() {
            @Override
            public void onResponse(Call<PostManResponseModel> call, Response<PostManResponseModel> response) {
                PostManResponseModel responseObj = response.body();
                responseView.setText(responseObj.getJson().getParam1());
            }

            @Override
            public void onFailure(Call<PostManResponseModel> call, Throwable t) {
                responseView.setText("Responnse failed");
            }
        });

    }
    /*{
        responseView.setText("");
        Call<ResponseModel> call = APIcontroller.getInstance()
                .getAPI()
                .getResult();
//                .getResult(text1.getText().toString(),Integer.parseInt(number1.getText().toString()));

        call.enqueue(new Callback<ResponseModel>() {
            @Override
            public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
                ResponseModel responseObj = response.body();
                responseView.setText(responseObj.getFact() + "\n length is " + responseObj.getLength().toString());
            }

            @Override
            public void onFailure(Call<ResponseModel> call, Throwable t) {
                responseView.setText("Responnse failed");
            }
        });

    }*/
}