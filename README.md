MyImageViewDemo
===========
<br/>
Custom ImageView, <br/>
set hover effect in ImageView's attribute.

**Step 1 : declare-styleable(my_styles.xml)**<br/>
```sh
<declare-styleable name="MyImageViewAttr">
    <attr name="hover_res" format="reference" />
</declare-styleable>
```
 
**Step 2 : custom ImageView(MyImageView.java)**<br/>
```sh
public class MyImageView extends ImageView {
    ...
}
```

**Step 3 : declare myattr : xmlns:myattr="http://schemas.android.com/apk/res-auto" in layout xml**<br/>
```sh
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
            xmlns:myattr="http://schemas.android.com/apk/res-auto"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:orientation="vertical">
```


**Step 4 : set myattr:hover_res for MyImageView**<br/>
```sh
<dev.henrychuang.component.MyImageView 
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:clickable="true"
            myattr:hover_res="@drawable/icon_home_h"
            android:src="@drawable/icon_home"/>
```

<br/><br/>
henrychuang.tw@gmail.com
