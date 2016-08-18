# DesignPattern
design pattern using php java javascript ...

## 设计模式概述
在软件工程中，设计模式（Design Pattern）是对软件设计中普遍存在（反复出现）的各种问题，所提出的解决方案。这个术语是由埃里希·伽玛（Erich Gamma）等人在1990年代从建筑设计领域引入到计算机科学的。

设计模式并不直接用来完成代码的编写，而是描述在各种不同情况下，要怎么解决问题的一种方案。面向对象设计模式通常以类或对象来描述其中的关系和相互作用，但不涉及用来完成应用程序的特定类或对象。设计模式能使不稳定依赖于相对稳定、具体依赖于相对抽象，避免会引起麻烦的紧耦合，以增强软件设计面对并适应变化的能力。

并非所有的软件模式都是设计模式，设计模式特指软件“设计”层次上的问题。还有其它非设计模式的模式，如架构模式。同时，算法不能算是一种设计模式，因为算法主要是用来解决计算上的问题，而非设计上的问题。

## OOP设计原则

1. 单一职责原则（Single Responsibility Principle）   
每一个类应该专注于做一件事情。
2. 里氏替换原则（Liskov Substitution Principle）   
超类存在的地方，子类是可以替换的。
3. 依赖倒置原则（Dependence Inversion Principle）  
实现尽量依赖抽象，不依赖具体实现。
4. 接口隔离原则（Interface Segregation Principle）  
应当为客户端提供尽可能小的单独的接口，而不是提供大的总的接口。
5. 迪米特法则（Law Of Demeter）  
又叫最少知识原则，一个软件实体应当尽可能少的与其他实体发生相互作用。
6. 开闭原则（Open Close Principle）   
面向扩展开放，面向修改关闭。
7. 组合/聚合复用原则（Composite/Aggregate Reuse Principle CARP）  
尽量使用合成/聚合达到复用，尽量少用继承。原则： 一个类中有另一个类的对象。

### 单一职责原则 SRP（Single Responsibility Principle）
一个类应该仅有一个引起他变化的原因（There should never be more than one reason for a class to change）  
**优点**：
- 类的复杂性降低，实现什么职责都有清晰明确的定义
- 可读性提高
- 可维护性提高
- 变更引起的风险降低，如果接口的单一职责做得好，一个接口的修改支队相应的实现类有影响，对其他接口无影响。对系统扩展性、维护性有很大帮助。
单一职责原则提出了一个编写程序的标准，用”职责“或”变化原因“来衡量接口或类设计的是否优良，但是”职责“和“变化原因”都是不可度量的，因项目而已，因环境而异。  
单一职责适用于接口、类，同时也适用于方法，一个方法尽可能做一件事情。  
**接口一定要做到单一职责，类的设计尽量做到只有一个原因引起变化**  

拆分业务对象（BO Business Object）和业务逻辑(Biz Business Logic)

### 开放关闭原则 OCP(Open-Closed Principle)

### 里氏替换原则 LSP(Liskov Substitution Principle)
定义：  
1. 如果对每一个类型为S的对象o1，都有类型为T的对象o2，使得以T定义的所有程序P在所有的对象o1都替换成o2时，程序P的行为都没有变化，那么类型S是类型T的子类型。
2. 所有引用积累的地方必须能透明地使用其子类的对象。
通俗点讲，只要父类能出现的地方子类就可以出现，而且替换成子类不会产生任何错误或异常。  
里氏替换原则为良好的继承定义了一个规范，一句简单的定义包含了4层含义。
1）子类必须完全实现父类  
如果子类不能完整地实现父类的方法，或者父类的某些方法在子类中已经发生“畸变”，则建议断开父子继承关系，采用依赖、聚集、组合等关系代替继承。
2）子类可以有自己的个性  
3）覆盖或实现父类的方法时输入参数可以被放大  
4）覆盖或实现父类的方法是输出结果可以被缩小  

### 依赖倒置原则 DIP(Dependence Inversion Principle)

### 接口隔离原则 ISP(Interface Segregation Principle)

### 最少知识原则 LKP(Least Knowledge Principle)

## 常用设计模式大全
设计模式可以按照结构被分成三种不同的类型：

### 创建型
创建型设计模式用于处理对象的实例化，创建型模式解耦了对象的实例化过程:

- 抽象工厂模式（Abstract Factory）
- 建造者模式（Builder）
- 工厂方法模式（Factory Method）
- 多例模式（Multiton）
- 对象池模式（Pool）
- 原型模式（Prototype）
- 简单工厂模式（Simple Factory）
- 单例模式（Singleton）
- 静态工厂模式（Static Factory）

### 结构型

结构型设计模式用于处理类和对象的组合, 把类或对象结合在一起形成更大的结构：

- 适配器模式（Adapter）
- 桥梁模式（Bridge）
- 组合模式（Composite）
- 数据映射模式（Data Mapper）
- 装饰模式（Decorator）
- 依赖注入模式（Dependency Injection）
- 门面模式（Facade）
- 流接口模式（Fluent Interface）
- 代理模式（Proxy）
- 注册模式（Registry）

### 行为型

行为型设计模式用于处理类的对象间通信, 类和对象如何交互，及划分责任和算法
：

- 责任链模式（Chain Of Responsibilities）
- 命令行模式（Command）
- 迭代器模式（Iterator）
- 中介者模式（Mediator）
- 备忘录模式（Memento）
- 空对象模式（Null Object）
- [观察者模式（Observer）](observe/readme.md)
- 规格模式（Specification）
- 状态模式（State）
- [策略模式（Strategy）](strategy/readme.md)
- 模板方法模式（Template Method）
- 访问者模式（Visitor）

## 参考资料：
研磨设计模式
设计模式之禅
[图说设计模式](http://design-patterns.readthedocs.io/zh_CN/latest/index.html)
