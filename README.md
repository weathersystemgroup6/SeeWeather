# 恢弘天气
看天气应用就一个单纯、简单的看天气软件。是由我们软件工程第六小组参考网络资源联合开发的。

## 简介
恢弘天气——是一款界面友好的只看天气的APP。
- 卡片展现（当前天气情况，未来几小时天气情况，生活建议，一周七天概况）
- 缓存数据，减少网络请求，保证离线查看
- 内置两套图标（设置里更改）

## 权限说明

```xml
	<!--用于进行网络定位-->
	<uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION"/>
	<!--用于访问GPS定位-->
	<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION"/>
	<!--获取运营商信息，用于支持提供运营商信息相关的接口-->
	<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE"/>
	<!--用于访问wifi网络信息，wifi信息会用于进行网络定位-->
	<uses-permission android:name="android.permission.ACCESS_WIFI_STATE"/>
	<!--这个权限用于获取wifi的获取权限，wifi信息会用来进行网络定位-->
	<uses-permission android:name="android.permission.CHANGE_WIFI_STATE"/>
	<!--用于访问网络，网络定位需要上网-->
	<uses-permission android:name="android.permission.INTERNET"/>
	<!--用于读取手机当前的状态-->
	<uses-permission android:name="android.permission.READ_PHONE_STATE"/>
	<!--写入扩展存储，向扩展卡写入数据，用于写入缓存定位数据-->
	<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>
	<uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE"/>
```

## 功能部件
- 桌面小部件
- 通知栏提醒
- 更好，更多的天气ICONS
- 管理城市（多城市选择）
- 自动定位
- 自由定制的Item界面
- 引导页面

## 项目相关
- 公开 API
- 天气数据来源于：和风天气
- 城市信息来源于：CSDN
- 地理定位服务： 高德地图

## 截图


## 感谢
