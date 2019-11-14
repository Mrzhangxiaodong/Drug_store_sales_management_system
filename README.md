# 基于SSM(Spring、SpringMVC、MyBatis)框架的药品药店销售管理系统

##  项目需求

  主要实现以下模块销售管理模块（销售登记、销售报表、更新药品信息、销售情况显示）、 库存管理模块（进货管理、库存查 询、设置库存的上限和下限、库存量报警、退货信息处理、 库存盘点）、查询统计（药品进货查询、进货退货查询、药品销售查询、 药品库存查询、药品 销售排行）、 系统维护模块管理（角色管理、登录管理）。 

##  系统支持

### 开发系统：Window10(X86)、Linux(Centos 7)（X86）

### 开发语言：Java、Js

### 开发软件：IDEA

### 数据库：MySQL

### 使用技术：JSP、Xml、Json、Maven

### 使用框架

#### 前端框架：BootStrap

#### 后端框架：Spring、SpringMVC、MyBatis、Dubbo

## 数据库设计

<table>
  <tr>
    <td colspan="5" align="center">表1.1 管理员表</td>
  <tr>
  <tr>
    <td>列名</td>
     <td>类型</td>
     <td>是/否为空</td>
    <td>主/外键</td>
    <td>备注</td>
  </tr>
  <tr>
     <td>User_id</td>
     <td>Int(11)</td>
    <td>否</td>
    <td>主键</td>
    <td>管理员ID</td>
  </tr>
  <tr>
  <td>User_name</td>
     <td>Varchar(45)</td>
    <td>/</td>
    <td>/</td>
    <td>用户名</td>
  </tr>
  <tr>
  <td>User_password</td>
     <td>Varchar(45)</td>
    <td>/</td>
    <td>/</td>
    <td>用户密码</td>
  </tr>
</table>

<table>
<tr>
    <td colspan="5" align="center">表1.2 购入药品表</td>
  <tr>
  <tr>
    <td>列名</td>
     <td>类型</td>
     <td>是/否为空</td>
    <td>主/外键</td>
    <td>备注</td>
  </tr>
  <tr>
     <td>Info_id</td>
     <td>Int(11)</td>
    <td>否</td>
    <td>主键</td>
    <td>药品ID</td>
  </tr>
  <tr>
     <td>Info_drugname</td>
     <td>varchar(45)</td>
    <td>/</td>
    <td>/</td>
    <td>药品名称</td>
  </tr>
  <tr>
     <td>Info_changshang</td>
     <td>Varchar(100)</td>
    <td>/</td>
    <td>/</td>
    <td>供货厂商</td>
  </tr>
  <tr>
     <td>Info_beizhu</td>
     <td>VarChar(75)</td>
    <td>/</td>
    <td>/</td>
    <td>备注</td>
  </tr>
  <tr>
     <td>Info_location</td>
     <td>Varchar(75)</td>
    <td>/</td>
    <td>/</td>
    <td>药品位置</td>
  </tr>
  <tr>
     <td>Info_unit</td>
     <td>Varchar(45)</td>
    <td>/</td>
    <td>/</td>
    <td>药品单位</td>
  </tr>
  <tr>
     <td>Info_guige</td>
     <td>Varchar(75)</td>
    <td>/</td>
    <td>/</td>
    <td>药品规格</td>
  </tr>
  <tr>
     <td>Info_tiaoxingma</td>
     <td>Int(11)</td>
    <td>/</td>
    <td>/</td>
    <td>药品条形码</td>
  </tr>
</table>

其他表详细设计略

##  项目部署图：略

##  运行结果图






