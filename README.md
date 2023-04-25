# 项目设计

### 项目简介

项目名称：基于Web的比赛报名网站的开发

### 项目启动
使用idea打开BackEnd和FrontEnd，后端需要jdk1.8，前端需要Vue脚手架和node.js才可运行

## 项目功能

* 登录、退出、注册
* 消息查看、消息删除
* 报名比赛
* 消息发布
* 评审比赛
* 用户信息修改
* 搜索比赛
* 查看评审结果、比赛排名

## 项目所用技术

* Json文件读写
* 平均分配算法（自行设计，目前能用，比较简单，后续更新）
* JWT
* MyBatis-plus和MyBatis-plus-join链表查询插件
* alibaba druid连接池
* Spring Security登录鉴权
* element-ui
* axios
* vuex
* vue-router

## 已知bug

1. 点击消息列表后，前端消息已读数量偶尔出现不变化的情况。是应为后台运行查询比修改快，导致获取的消息列表跟上一次相同，目前未找到良好的解决方案。


## 在线预览

http://contest.zhangguapi.com

