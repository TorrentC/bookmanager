```
相比宝贵的青春，我们在上学期间所需要的学费和生活开销几乎可以忽略不计。我们正在投下有价值的筹码，是时间。
面对足以改变你人生轨迹的黄金时间，你是否感受到了他的沉重？你是否想过要如何几乎这笔巨额投资。
平庸的生活方式是麻醉剂，他只会束缚你，让你没有作为，甚至没有出息地度过一生
```
## 为什么要使用索引
1、加快查询数据的速度
2、帮助数据库避免排序和创建临时表
3、随机io变成顺序io
4、通过创建唯一索引，保证数据库中数据的唯一性
#### 索引缺点
1、索引会影响增删改的速度，每一次修改数据都会额外去维护索引
2、创建的索引会占用物理空间

## hash索引和b+树索引
1、hash索引只适合等值查询，无法进行范围查找
2、用hash索引查出的数据无法进行排序。
3、存在多个值相同的情况，效率会变得很慢，存在哈希碰撞
4、hash索引不支持多列联合索引的最左匹配原则
## B+树的数据结构
？？？？？？
##索引分类
1、 主键索引
2、 普通索引
3、 唯一索引
4、 组合索引（最左前缀）
唯一索引和主键索引的区别在于主键索引不能为null

红黑树和avl树在内存中使用的数据结构，因为不可能将数据库中的数据全部加载的内存中，
因此使用红黑树会造成频繁io，导致效率低下

b树和b+树
b树
1、书内存储数据
2、叶子节点无链表
b+树
1、叶子节点存储数据
2、叶子节点存储数据

如何避免回表：
查询数据尽量走索引
索引覆盖：
一个组合索引包含了满足查询结果的数据

## mysql索引失效
1、范围查找之后的条件不会用到索引
2、where后面接表达式
3、发生隐性转化

--------------------
本日小结：
redis 
缓存雪崩 缓存穿透 缓存失效问题总结
mysql索引优化文档实操
mysql相关问题了解