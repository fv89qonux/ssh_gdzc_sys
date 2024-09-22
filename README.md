## 本项目实现的最终作用是基于SSH企业公司单位固定资产管理系统
## 分为1个角色
### 第1个角色为管理员角色，实现了如下功能：
 - 员工管理
 - 密码修改
 - 管理员登录
 - 管理员管理
 - 资产借还管理
 - 资产报表打印
 - 资产管理
 - 资产维修管理
## 数据库设计如下：
# 数据库设计文档

**数据库名：** ssh_gdzc_sys

**文档版本：** 


| 表名                  | 说明       |
| :---: | :---: |
| [comployee](#comployee) |  |
| [department](#department) |  |
| [user_info](#user_info) |  |
| [zc_info](#zc_info) |  |
| [zc_inout](#zc_inout) |  |
| [zc_wx](#zc_wx) |  |

**表名：** <a id="comployee">comployee</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | comployee_no |   varchar   | 255 |   0    |    N     |  Y   |       |   |
|  2   | comployee_name |   varchar   | 255 |   0    |    N     |  N   |       |   |
|  3   | sex |   varchar   | 5 |   0    |    N     |  N   |       | 性别  |
|  4   | age |   int   | 10 |   0    |    N     |  N   |       | 年龄  |
|  5   | dept |   varchar   | 255 |   0    |    N     |  N   |       |   |
|  6   | profession |   varchar   | 255 |   0    |    N     |  N   |       |   |
|  7   | address |   varchar   | 60 |   0    |    N     |  N   |       | 地址  |
|  8   | phone |   varchar   | 255 |   0    |    N     |  N   |       | 手机号码  |
|  9   | comployee_status |   varchar   | 255 |   0    |    N     |  N   |       |   |

**表名：** <a id="department">department</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | dept |   varchar   | 255 |   0    |    N     |  Y   |       |   |

**表名：** <a id="user_info">user_info</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | username |   varchar   | 255 |   0    |    N     |  Y   |       | 用户名  |
|  2   | pwd |   varchar   | 255 |   0    |    N     |  N   |       | 密码  |
|  3   | comployee_no |   varchar   | 255 |   0    |    N     |  N   |       |   |
|  4   | competence |   varchar   | 15 |   0    |    N     |  N   |       |   |

**表名：** <a id="zc_info">zc_info</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | zc_id |   varchar   | 255 |   0    |    N     |  Y   |       |   |
|  2   | zc_no |   varchar   | 255 |   0    |    N     |  N   |       |   |
|  3   | zc_name |   varchar   | 255 |   0    |    N     |  N   |       |   |
|  4   | zc_price |   float   | 13 |   0    |    N     |  N   |       |   |
|  5   | zc_factory |   varchar   | 255 |   0    |    N     |  N   |       |   |
|  6   | zc_produceTime |   varchar   | 255 |   0    |    N     |  N   |   '2024-03-01'    |   |
|  7   | zc_buyTime |   varchar   | 255 |   0    |    N     |  N   |   '2024-03-01'    |   |
|  8   | zc_buyer |   varchar   | 15 |   0    |    N     |  N   |       |   |
|  9   | zc_type |   varchar   | 255 |   0    |    N     |  N   |       |   |
|  10   | zc_status |   varchar   | 15 |   0    |    N     |  N   |       |   |
|  11   | zc_bzxx |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |

**表名：** <a id="zc_inout">zc_inout</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | inout_no |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | zc_id |   varchar   | 255 |   0    |    N     |  N   |       |   |
|  3   | comployee_no |   varchar   | 255 |   0    |    N     |  N   |       |   |
|  4   | out_time |   varchar   | 255 |   0    |    N     |  N   |       |   |
|  5   | should_time |   varchar   | 255 |   0    |    N     |  N   |       |   |
|  6   | back_time |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |

**表名：** <a id="zc_wx">zc_wx</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | repair_no |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | zc_id |   varchar   | 255 |   0    |    N     |  N   |       |   |
|  3   | send_time |   varchar   | 255 |   0    |    N     |  N   |       |   |
|  4   | sender |   varchar   | 255 |   0    |    N     |  N   |       |   |
|  5   | login_user |   varchar   | 255 |   0    |    N     |  N   |       |   |
|  6   | reason |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 原因  |
|  7   | wx_time |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  8   | wx_result |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  9   | cost |   float   | 13 |   0    |    Y     |  N   |   NULL    |   |
|  10   | wx_comment |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |

