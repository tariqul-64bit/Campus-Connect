<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
xmlns:android="http://schemas.android.com/apk/res/android"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:orientation="horizontal"
android:padding="16dp"
> <
ImageView
android:id="@+id/image"
android:layout_width="150dp"
android:layout_height="150dp"
android:src="@mipmap/ic_launcher" />
<LinearLayout
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:orientation="vertical"
> <
TextView
android:id="@+id/textView1"
android:textSize="26sp"
android:layout_width="match_parent"
android:layout_height="69dp"

android:layout_margin="5dp"
android:gravity="center"
android:text="Main Title"
android:textColor="#000"
android:textStyle="bold"
/>
<TextView
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:gravity="center"
android:text="Sub Title"
android:textColor="#0000ff"
android:textStyle="bold"
android:layout_margin="5dp"
android:textSize="20sp"
android:id="@+id/textView2"
/>
</LinearLayout>
</LinearLayout>
