package com.example.work1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private  String[] data = { "Apple", "华为 ", "OPPO", "ROG", "三星", " 索爱", "vivo", "小米" };

    private List<Phone> phoneList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);;
        setContentView(R.layout.activity_main);
        initPhone();
        PhoneAdapter adapter = new PhoneAdapter(MainActivity.this, R.layout.phone_item, phoneList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Phone phone = phoneList.get(position);
                Toast.makeText(MainActivity.this, phone.getName(),
                        Toast.LENGTH_SHORT).show();
            }
        });

        SearchView searchView = findViewById(R.id.search_id);
        //设置SearchView默认为自动缩小为图标
        searchView.setIconifiedByDefault(false);
        //设置SearchView显示搜索按钮
        searchView.setSubmitButtonEnabled(true);
        searchView.setQueryHint("搜索");
        //为该SearchView组件设置事件监听器
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                Toast.makeText(MainActivity.this, query+"搜索不到",
                        Toast.LENGTH_SHORT).show();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return true;
            }

        });
    }

    private  void initPhone(){
        for (int i=0;i<2;i++){
        Phone apple = new Phone("Apple", R.drawable.apple);
        phoneList.add(apple);
            Phone huawei = new Phone("华为", R.drawable.huawei);
            phoneList.add(huawei);
            Phone oppo = new Phone("OPPO", R.drawable.oppo);
            phoneList.add(oppo);
            Phone rog = new Phone("ROG", R.drawable.rog);
            phoneList.add(rog);
            Phone sanxing = new Phone("三星", R.drawable.sanxing);
            phoneList.add(sanxing);
            Phone suoai = new Phone("索爱", R.drawable.suoai);
            phoneList.add(suoai);
            Phone vivo = new Phone("vivo", R.drawable.vivo);
            phoneList.add(vivo);
            Phone xiaomi = new Phone("小米", R.drawable.xiaomi);
            phoneList.add(xiaomi);
        }
    }

}