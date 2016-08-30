package com.zhangpeng.administrator.dialog;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static com.zhangpeng.administrator.dialog.R.style.CustomDialog;

public class MainActivity extends AppCompatActivity {
    private EditText mEditText;  // 输入框
    private ImageView mDropImage; // 右边的图片按钮
    private PopupWindow muPopup;
    private PopupWindow ligPopup;// 点击图片弹出popupwindow
    private WrapListView mPopView; // popupwindow的布局
    private  int model = 0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content);



    }
    public void butt(View view){
        Dialog mDialog  = new MyDialog(MainActivity.this);
        mDialog.setTitle("自定义样式");

        /*Window dialogWindow = mDialog.getWindow();
        WindowManager m = getWindowManager();
        Display d = m.getDefaultDisplay(); // 获取屏幕宽、高用
        WindowManager.LayoutParams p = dialogWindow.getAttributes(); // 获取对话框当前的参数值
        p.height = (int) (d.getHeight() * 0.6); // 高度设置为屏幕的0.6
        p.width = (int) (d.getWidth() * 0.65); // 宽度设置为屏幕的0.65
        dialogWindow.setAttributes(p);*/

        mDialog.show();

    }


}
