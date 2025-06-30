

dependencies {


    api(platform("org.mockito:mockito-bom:${Versions.mockito_version}"))
    api(platform("org.springframework.cloud:spring-cloud-dependencies:${Versions.spring_cloud_version}"))
    api(platform("org.springframework.boot:spring-boot-dependencies:${Versions.spring_boot_version}"))
    // spring boot include springframe and spring security
//    api(platform("org.springframework:spring-framework-bom:${Versions.spring_version}"))
//    api(platform("org.springframework.security:spring-security-bom:${Versions.spring_security_version}"))
    api(platform("org.apache.logging.log4j:log4j-bom:${Versions.log4j_version}"))
    api(platform("com.squareup.okhttp3:okhttp-bom:${Versions.okhttp}"))
    api(platform("io.grpc:grpc-bom:${Versions.grpc}"))
    api(platform("org.jetbrains.kotlin:kotlin-bom:${Versions.kotlin_version}"))

    constraints {

        api("org.springframework.boot:spring-boot-configuration-processor:${Versions.spring_boot_version}")
//        api("org.jetbrains.kotlin:kotlin-allopen:${Versions.kotlin_version}")
//        api("org.jetbrains.kotlin:kotlin-allopen:${Versions.kotlin_version}")

        api("com.cronutils:cron-utils:${Versions.cron_utils_version}")

        api("org.apache.zookeeper:zookeeper:${Versions.zk_version}")
        api("org.apache.zookeeper:zookeeper-jute:${Versions.zk_version}")
        api("org.apache.zookeeper:zookeeper-prometheus-metrics:${Versions.zk_version}")

        api("org.apache.curator:curator-recipes:${Versions.curator_version}")
        api("org.apache.curator:curator-client:${Versions.curator_version}")
        api("org.apache.curator:curator-framework:${Versions.curator_version}")
        api("org.apache.curator:curator-x-discovery:${Versions.curator_version}")
        api("org.apache.curator:curator-x-async:${Versions.curator_version}")
        api("org.apache.curator:apache-curator:${Versions.curator_version}")

        api("org.msgpack:jackson-dataformat-msgpack:${Versions.jackson_msgpack_version}")

        api("org.bouncycastle:bcprov-jdk18on:${Versions.bouncy_castle_version}")


        api("org.mybatis:mybatis:${Versions.mybatis_version}")
        api("com.github.jsqlparser:jsqlparser:${Versions.jsqlparser_version}")
        api("org.mybatis.spring.boot:mybatis-spring-boot-starter:${Versions.mybatis_starter_version}")
        api("com.github.pagehelper:pagehelper:${Versions.mybatis_pagehelper_version}")
        api("org.mybatis.dynamic-sql:mybatis-dynamic-sql:${Versions.mybatis_dynamic_sql_version}")
        api("org.mybatis.generator:mybatis-generator-core:${Versions.mybatis_generator_version}")

        api("com.esotericsoftware:kryo:${Versions.kryo_version}")

        api("org.apache.commons:commons-text:${Versions.apache_commons_text_version}")
    }
}
