# StudyListSSM.github.io
# SSM框架构建简单的计划任务清单项目——项目实战


- [csdn全教程一步一步教你快速搭建SSM项目——计划清单小Demo]()

## 1、项目展示

<img src="https://github.com/HHXiaoFu/ImgRepository/blob/main/1.png" >

<img src="https://github.com/HHXiaoFu/ImgRepository/blob/main/4.png" >

<img src="https://github.com/HHXiaoFu/ImgRepository/blob/main/3.png" >

<img src="https://github.com/HHXiaoFu/ImgRepository/blob/main/2.png" >

### 1、页面布局展示

### 2、项目框架结构

**工程结构图**

```txt
├─src
│  ├─main
│  │  ├─java
│  │  │  └─com
│  │  │      └─alascanfu
│  │  │          ├─controller
│  │  │          │      PlanController.java
│  │  │          │
│  │  │          ├─dao
│  │  │          │      PlanMapper.java
│  │  │          │      PlanMapper.xml
│  │  │          │
│  │  │          ├─pojo
│  │  │          │      Plan.java
│  │  │          │
│  │  │          └─service
│  │  │                  PlanService.java
│  │  │
│  │  └─resources
│  │          applicationContext.xml
│  │          db.properties
│  │          mybatis-config.xml
│  │          spring-mvc.xml
│  │          spring-mybatis.xml
│  │          spring-service.xml
│  │
│  └─test
│      └─java
│              Test.java
└─web
    │  index.jsp
    │
    └─WEB-INF
        │  web.xml
        │
        └─jsp
                addPlan.jsp
                deletePlan.jsp
                planList.jsp
                updatePlan.jsp
```

**idea中的功能结构图**


## 2、项目开发环境以及技术栈

### 1、技术栈

> 项目所需掌握的技术栈

**`Spring+SpringMVC+MyBatis+MySQL+Bootstrap+Tomcat`**

### 2、开发环境

> 项目开发环境

**这里小付用的是`Spring5.3.9——MySQL8.0.25——Tomcat8.5.682`**

### 3、前置知识掌握

> 前置知识掌握

- [MySQL的最全常用SQL语句 —— 一文可以快速熟悉、回忆sql语句](https://alascanfu.blog.csdn.net/article/details/122432727)
- [Mybatis入门到入坟 一站式基础及进阶——囊括面试点与初学基础、框架分析——从0到1 不会私我 我手把手教你](https://alascanfu.blog.csdn.net/article/details/122460390)
- [Spring入门到入坟 一站式基础及进阶——囊括面试点与初学基础——源码分析——从0到1](https://alascanfu.blog.csdn.net/article/details/122496017)

- [Servlet入门到入坟 一站式基础及进阶——SpringMVC没它都不行 你确定不来看看——囊括初学基础以及进阶](https://alascanfu.blog.csdn.net/article/details/122542223)
- [Filter与Listener 快速上手到实战——一文通透——你真的理解了Filter与Listener了么](https://alascanfu.blog.csdn.net/article/details/122570795)
- [SpringMVC入门到入坟 一站式基础及进阶——囊括面试点与初学基础——从0到1 Servlet都会了那它就是小case](https://alascanfu.blog.csdn.net/article/details/122593478)

**上述前置知识掌握，写的较为详细，`初学者建议直接入手SSM与MySQL的相关知识`**

### 4、项目总结

**这是一个`非常非常简单基础的SSM项目`，`很快上手`，初学大概可能会花上1个小时甚至更多，但是`二刷时`，这个项目就`信手拈来`，小付大概写了`40分钟左右就拿捏了这个项目了`，是不错的一个`小项目`，大家也可以对其改善完成属于自己的小项目Demo，比如说什么`分页查询`啊，`模糊查询`什么的，我会将其`传入Github`上供大家`参阅`，`一同学习，一起进步`，加油，相信自己绝对没啥问题的。**
