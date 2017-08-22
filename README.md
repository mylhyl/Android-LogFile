# Android-LogFile
 Android 端保存消息内容到SD卡，使用业务场景例如：用户请求某个功能业务，但中间出现失败，
 可能提示用户失败的原因是：“与服务器连接失败”、“获取用户信息失败”。 但这些只是展现给用户而已，但
 作为开发者来说，定位问题那么就要具体的详细咯，那么问题来了怎么记录呢？该库帮助你记录。

# 引用

```xml

```

# 使用

* 在`Application`中初始化

```java
        LogFileConfig loggerConfig = new LogFileConfig();
        LogFile.init(this, loggerConfig);
```
* 写入消息

```java
        LogFile.putMsg("与服务器连接失败：“, 可能原因是您使用的2G网络");

        LogFile.putMsg("获取用户信息失败：", "%s%d%s","用户ID", 27, "不存在");
```
