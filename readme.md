# 基于Java的车辆租赁管理平台/租车系统


### 功能介绍

平台采用B/S结构，后端采用主流的Springboot框架进行开发，前端采用主流的Vue.js进行开发。源码价格115

整个平台包括前台和后台两个部分。

- 前台功能包括：首页、车辆详情、车辆预订、用户中心模块。
- 后台功能包括：车辆管理、分类管理、标签管理、评论管理、用户管理、运营管理、日志管理、统计分析、系统信息模块。

### 适合人群

大学生、系统设计人员、课程作业、毕业设计

### 演示地址

前台地址：  http://zuche.gitapp.cn

后台地址： http://zuche.gitapp.cn/admin

后台管理帐号：

用户名：admin123
密码：admin123

### 代码结构

- server目录是后端代码
- web目录是前端代码

### 部署运行

#### 后端运行步骤

(1) 下载代码后，使用IntelliJ IDEA打开server目录

(2) 配置application.yml文件，配置数据库和upload根目录

(3) 安装mysql 5.7数据库，并创建数据库，创建SQL如下：
```
CREATE DATABASE IF NOT EXISTS xxx DEFAULT CHARSET utf8 COLLATE utf8_general_ci
```
(4) 恢复sql数据。在mysql下依次执行如下命令：

```
mysql> use xxx;
mysql> source D:/xxx/xxx/shop.sql;
```

(5) 启动后端服务：点击IDEA顶部run按钮


#### 前端运行步骤

(1) 安装node 16.14

(2) cmd进入web目录下，安装依赖，执行:
```
npm install 
```
(3) 运行项目
```
npm run dev
```

 



### 开发文档

[点击进入](doc.md)


### 参考论文
[点击进入](doc/java_zuche.docx)


### 付费咨询

微信：Java2048

