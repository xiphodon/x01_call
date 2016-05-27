package com.gc.call;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //��ð�ť����
        Button bt_call = (Button)findViewById(R.id.bt_call);
        //���ð�ť�����¼�
        bt_call.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				   //ȡ�ñ༭�����
				   EditText et_num = (EditText)findViewById(R.id.et_num);
				   //ȡ�ñ༭������
				   String number = et_num.getText().toString();
				   
				   
				   
				   //�½���ͼ����
				   Intent intent = new Intent();
				   
				   //��ʽ��ת     ��ͬӦ�ü�activity��ת
				   //�Ѷ�����װ����ͼ������
				   intent.setAction(intent.ACTION_CALL);
				   //���ô�绰���ݣ��绰���룬���˭��
				   intent.setData(Uri.parse("tel:" + number));
				   
				   
				   
//				   //��ʽ��ת       ͬһӦ�ò�ͬactivity֮����ת        ("����"��"����+����")
//				   intent.setClassName(packageContext, className);
				   
				   
				   //�Ѷ�������ϵͳ
				   startActivity(intent);
				   
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
