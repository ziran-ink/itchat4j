package com.github.ziran_ink.itchat4j.demo;

import com.alibaba.fastjson.JSON;
import com.github.ziran_ink.itchat4j.Wechat;
import com.github.ziran_ink.itchat4j.api.MessageTools;
import com.github.ziran_ink.itchat4j.core.Core;

public class HelloWorld {

	public static void main(String[] args) {
		Wechat wechat = new Wechat(new MsgHandler(), "/Users/xuzewei/Downloads/");
		wechat.start();
		System.out.println(JSON.toJSONString(Core.getInstance().getUserSelf()));
		System.out.println(JSON.toJSONString(Core.getInstance().getLoginInfo()));
		System.out.println(JSON.toJSONString(Core.getInstance().getNickName()));
		MessageTools.sendMsgByNickName(Core.getInstance().getNickName(), "测试");
	}

}
