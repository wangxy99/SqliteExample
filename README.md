##使用：
1. 先执行 SampleSqLite.main,可先创建需要的表

## 地址
测试地址：
http://localhost:8080/sqlite/hello

查询数据:
http://localhost:8080/sqlite/person/list

新增数据:
http://localhost:8080/sqlite/person/add

## 注意事项
###创建数据库时，启用主键自增加特性:
设置主键自增时（AUTOINCREMENT），主键类型必须是INTEGER，不能使用INT，否则会报错。
```$xslt
Create table testTable (id INTEGER PRIMARY KEY AUTOINCREMENT,...
```
### 返回新增数据的主键（失败）
@SelectKey中的表名必须大写



##参考资料
1. Spring Boot【快速入门】：https://www.cnblogs.com/wmyskxz/p/9010832.html
2. sqlite mybatis集成：https://www.jianshu.com/p/418b47be77c1
3. 创建数据表格，设置主键自增:https://blog.csdn.net/u010168781/article/details/82888503