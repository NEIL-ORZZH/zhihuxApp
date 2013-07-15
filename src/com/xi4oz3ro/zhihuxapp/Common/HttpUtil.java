package com.xi4oz3ro.zhihuxapp.Common;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class HttpUtil
{
	// ����HttpClient����
	public static HttpClient httpClient = new DefaultHttpClient();
	public static final String BASE_URL = "http://10.0.2.2/index.php/Index/Api/";
	/**
	 * 
	 * @param url ���������URL
	 * @return ��������Ӧ�ַ���
	 * @throws Exception
	 */
	public static String getRequest(String url)
		throws Exception
	{
		// ����HttpGet����
		HttpGet get = new HttpGet(BASE_URL+url);
		// ����GET����
		HttpResponse httpResponse = httpClient.execute(get);
		// ����������ɹ��ط�����Ӧ
		if (httpResponse.getStatusLine().getStatusCode() == 200)
		{
			// ��ȡ��������Ӧ�ַ���
			String result = EntityUtils.toString(httpResponse.getEntity());
			
			return result;
		}
		return null;
	}

	/**
	 * 
	 * @param url ���������URL
	 * @param params �������
	 * @return ��������Ӧ�ַ���
	 * @throws Exception
	 */
	public static String postRequest(String url, Map<String ,String> rawParams)
			throws Exception
	{
		// ����HttpPost����
		HttpPost post = new HttpPost(BASE_URL+url);
		// ������ݲ��������Ƚ϶�Ļ����ԶԴ��ݵĲ������з�װ
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		for(String key : rawParams.keySet())
		{
			//��װ�������
			params.add(new BasicNameValuePair(key , rawParams.get(key)));
		}
		// �����������
		post.setEntity(new UrlEncodedFormEntity(params, "gbk"));
		// ����POST����
		HttpResponse httpResponse = httpClient.execute(post);
		// ����������ɹ��ط�����Ӧ
		if (httpResponse.getStatusLine().getStatusCode() == 200)
		{
			// ��ȡ��������Ӧ�ַ���
			String result = EntityUtils.toString(httpResponse.getEntity());
			return result;
		}
		return null;
	}
}

