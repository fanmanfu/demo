#来自基础镜像
FROM centos:7
#指定镜像创建者信息
MAINTAINER fanmanfu
#切换工作目录 /usr/local
WORKDIR /usr/local
#创建一个存放jdk的路径
RUN mkdir /usr/local/java
#将jdk压缩包复制并解压到容器中/usr/local/java
ADD jdk-8u171-linux-x64.tar.gz /usr/local/java
#配置java环境变量
ENV JAVA_HOME /usr/local/java/jdk1.8.0_171
ENV JRE_HOME $JAVA_HOME/jre
ENV CLASSPATH
$JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar:$JRE_HOME/lib:$CLASSPATH
ENV PATH $JAVA_HOME/bin:$PATH
CMD ["/bin/bash"]
