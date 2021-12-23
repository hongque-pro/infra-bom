# 基础组件包

![maven central version](https://img.shields.io/maven-central/v/com.labijie.bom/lib-dependencies?logo=java)
![workflow status](https://img.shields.io/github/workflow/status/hongque-pro/infra-bom/Gradle%20Build%20And%20Release/main?logo=github)
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

### 项目大版本号和 spring boot 版本号保持一致 ！
例如 2.6 兼容 spring boot 2.6 (小版本号不保持一致)

## 使用方法
```groovy
dependencies {
    implementation platform("com.labijie.bom:lib-dependencies:$infra_bom_version")
}
```


其他依赖项参考 spring boot:   
https://github.com/spring-projects/spring-boot/blob/v2.6.1/spring-boot-project/spring-boot-dependencies/build.gradle   


