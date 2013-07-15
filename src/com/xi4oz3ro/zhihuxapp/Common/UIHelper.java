package com.xi4oz3ro.zhihuxapp.Common;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.app.Activity;
import android.widget.Toast;

public class UIHelper {
	
	/**
	 * ����Toast��Ϣ
	 * 
	 * @param msg
	 */
	public static void ToastMessage(Context cont, String msg) {
		Toast.makeText(cont, msg, Toast.LENGTH_SHORT).show();
	}

	public static void ToastMessage(Context cont, int msg) {
		Toast.makeText(cont, msg, Toast.LENGTH_SHORT).show();
	}

	public static void ToastMessage(Context cont, String msg, int time) {
		Toast.makeText(cont, msg, time).show();
	}
	
	// ����һ����ʾ��Ϣ�ĶԻ���
		public static void ShowDialog(final Context ctx, String msg , boolean closeSelf)
		{
			// ����һ��AlertDialog.Builder����
			AlertDialog.Builder builder = new AlertDialog.Builder(ctx).setMessage(msg).setCancelable(false);
			if(closeSelf)
			{
				builder.setPositiveButton("ȷ��", new OnClickListener()
				{
					@Override
					public void onClick(DialogInterface dialog, int which)
					{
						// ������ǰActivity
						((Activity)ctx).finish();
					}
				});		
			}
			else
			{
				builder.setPositiveButton("ȷ��", null);
			}
			builder.create().show();
		}	
		// ����һ����ʾָ������ĶԻ���
		public static void ShowDialog(Context ctx , View view)
		{
			AlertDialog.Builder builder = new AlertDialog.Builder(ctx).setView(view).setCancelable(false).setPositiveButton("ȷ��", null);
			builder.create().show();
		}
}