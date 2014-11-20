package dev.henrychuang.component;


import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class MyImageView extends ImageView {
	
	int resID, resID_hover;
	
	public MyImageView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	public MyImageView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		
		TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.MyImageViewAttr);
		resID_hover = array.getResourceId(R.styleable.MyImageViewAttr_hover_res, -1);
		if(resID_hover != -1){
			int[] attrsArray = new int[] {
			        android.R.attr.src 
			    };
			
			TypedArray ta = context.obtainStyledAttributes(attrs, attrsArray);
		    resID = ta.getResourceId(0 , View.NO_ID);			
		    ta.recycle();
		    
		    setOnTouchListener(listener_onTouch);
		}
		
		array.recycle();
		
	}
	public MyImageView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
		TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.MyImageViewAttr);
		resID_hover = array.getResourceId(R.styleable.MyImageViewAttr_hover_res, -1);
		if(resID_hover != -1){
			int[] attrsArray = new int[] {
					android.R.attr.src 
			    };
			
			TypedArray ta = context.obtainStyledAttributes(attrs, attrsArray);
		    resID = ta.getResourceId(0 , View.NO_ID);			
		    ta.recycle();
		    
		    setOnTouchListener(listener_onTouch);
		}
		
		array.recycle();
	}
	
	
	
	OnTouchListener listener_onTouch = new OnTouchListener() {
		
		@Override
		public boolean onTouch(View v, MotionEvent event) {
			// TODO Auto-generated method stub
			
			switch (event.getAction()) {
			case MotionEvent.ACTION_DOWN:
				setImageResource(resID_hover);
				break;
				
			case MotionEvent.ACTION_MOVE:
				
				break;
				
			case MotionEvent.ACTION_UP:
				setImageResource(resID);
				break;
				
			default:
				break;
			}
			
			
			return false;
		}
	};

}
