# 基础组件包

![maven central version](https://img.shields.io/maven-central/v/com.labijie.bom/lib-dependencies?style=flat-square)
![workflow status](https://img.shields.io/github/workflow/status/hongque-pro/infra-bom/Gradle%20Build%20And%20Release?label=CI%20publish&style=flat-square)
![license](https://img.shields.io/github/license/hongque-pro/infra-bom?style=flat-square)

用于固定开发依赖的版本, 包含:   
Kotlin
Spring    
spring boot    
Zookeeper    
Curator    
MyBatis    
Kryo    
...

### 项目版本号和 spring boot 版本号保持一致 ！

## 使用方法
```groovy
dependencies {
    implementation platform("com.labijie.bom:lib-dependencies:$infra_bom_version")
}
```


## 开发环境兼容性：

|组件|版本|说明|
|--------|--------|--------|
|   kotlin    |     1.6.0   |           |
|   jdk    |      1.8   |           |
|   spring boot    |      2.6    |           |
|   spring framework    |     5.3.13   |           |
|   spring security    |     5.6.0   |           |
|   mybatis    |      5.3.7    |           |

其他依赖项参考 spring boot:   
https://github.com/spring-projects/spring-boot/blob/v2.6.0/spring-boot-project/spring-boot-dependencies/build.gradle   

## 发布到自己的 Nexus

在项目根目录下新建 gradle.properties 文件，添加如下内容

```text
PUB_USER=[nexus user name]
PUB_PWD=[nexus password]
PUB_URL=http://XXXXXXX/repository/maven-releases/
```
运行  **gradle publish**
