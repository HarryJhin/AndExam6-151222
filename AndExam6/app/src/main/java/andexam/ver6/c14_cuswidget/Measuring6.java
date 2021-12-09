package andexam.ver6.c14_cuswidget;

import andexam.ver6.*;
import android.app.*;
import android.content.*;
import android.graphics.*;
import android.os.*;
import android.util.*;
import android.view.*;
import android.widget.*;

public class Measuring6 extends Activity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.measuring6);

		final MeasView meas = (MeasView)findViewById(R.id.meas);
		final TextView text = (TextView)findViewById(R.id.text);
		text.postDelayed(new Runnable() {
			public void run() {
				text.setText(meas.mResult);
			}
		}, 100);
	}
}
