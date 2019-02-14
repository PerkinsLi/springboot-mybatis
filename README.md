# springboot-mybatis
springboot 集成 mybatis demo

pom.xml 文件添加插件

```java

            <plugin>
                <groupId>org.mybatis.generator</groupId>
                <artifactId>mybatis-generator-maven-plugin</artifactId>
                <version>1.3.2</version>
                <configuration>
                    <verbose>true</verbose>
                    <overwrite>true</overwrite>
                </configuration>
            </plugin>
 ```

配置 generatorConfig.xml 文件


配置maven mybatis-generator运行项
命令：mybatis-generator:generate -e
