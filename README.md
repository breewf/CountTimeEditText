# CountTimeEditText
CountTimeEditText
#### 提供输入计时功能的EditText

![](https://github.com/breewf/CountTimeEditText/blob/master/app/src/main/java/com/ghy/timeedittext/gif/time_demo.gif?raw=true)

##### 1.添加依赖
```javascript
compile 'com.ghy:CountTimeEditText:1.0'
```

##### 2.布局文件
```javascript
<com.ghy.counttimeedittext.CountTimeEditText
        android:id="@+id/time_edit_text"
        android:layout_width="220dp"
        android:layout_height="wrap_content"
        android:hint="请输入文本"/>
```

##### 3.添加监听
```javascript
mCountTimeEditText.setEnterTimeCountListener(new CountTimeEditText.EnterTimeCountCallBack() {
            @Override
            public void inputTime(int inputTime) {
                mTextView.setText("本次输入时长：" + inputTime + "s");
            }
        });
```
