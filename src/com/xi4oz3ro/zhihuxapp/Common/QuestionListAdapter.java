package com.xi4oz3ro.zhihuxapp.Common;


import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.xi4oz3ro.zhihuxapp.R;

public class QuestionListAdapter extends BaseAdapter {
	// 定义需要包装的JSONArray对象
	private JSONArray jsonArray;
	private int resLayoutID;
	private LayoutInflater listContainer;
	public QuestionListAdapter(Context context,JSONArray jsonArray,int resLayoutID)
	{ 
		this.jsonArray = jsonArray;
		this.resLayoutID = resLayoutID;
		this.listContainer = LayoutInflater.from(context);
	}

	@Override
	public int getCount()
	{
		return jsonArray.length();
	}

	@Override
	public Object getItem(int position)
	{
		return jsonArray.optJSONObject(position);
	}

	@Override
	public long getItemId(int position)
	{
		try
		{
			// 返回物品的ID
			return ((JSONObject)getItem(position)).getInt("id");
		}
		catch (JSONException e)
		{
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent)
	{
		ListItemView listItemView = null;
		if(convertView==null){
			convertView = listContainer.inflate(this.resLayoutID, null);
			listItemView = new ListItemView();
			listItemView.categoryName = (TextView)convertView.findViewById(R.id.item_question_categoryName);
			listItemView.typeName = (TextView)convertView.findViewById(R.id.item_question_typeName);
			listItemView.time = (TextView)convertView.findViewById(R.id.item_question_time);
			listItemView.content = (TextView)convertView.findViewById(R.id.item_question_content);
			convertView.setTag(listItemView);
		}else{
			listItemView = (ListItemView)convertView.getTag();
		}
		
		try{
			JSONObject question = (JSONObject)getItem(position);
			listItemView.categoryName.setText(question.getString("categoryName"));
			listItemView.typeName.setText("("+question.getString("questionTypeName")+")");
			listItemView.time.setText(question.getString("lastUpdateTime"));
			listItemView.content.setText(question.getString("questionContent"));
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return convertView;
	}
	
	static class ListItemView{				//自定义控件集合  
        public TextView categoryName;  
	    public TextView typeName;
	    public TextView time;  
	    public TextView content;
	} 
}
