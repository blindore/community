##码匠社区

##资料
[a] {https://v3.bootcss.com/components/#navbar-default}
[b] {https://spring.io/guides/gs/serving-web-content/}
[c] {https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/}
    
##工具

##快捷键及命令
[git命令_提交]{git commit --amend --no-edit}

CREATE CACHED TABLE PUBLIC.USER(
    ID BIGINT DEFAULT (NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_7E4F8BEA_BE89_460A_9AED_AB76F00F7927) NOT NULL NULL_TO_DEFAULT SEQUENCE PUBLIC.SYSTEM_SEQUENCE_7E4F8BEA_BE89_460A_9AED_AB76F00F7927,
    ACCOUNT_ID VARCHAR(100),
    NAME VARCHAR(50),
    TOKEN VARCHAR(36),
    GMT_CREATE BIGINT,
    GMT_MODIFIED BIGINT,
    BIO VARCHAR(256),
    AVATAR_URL VARCHAR(100)
)

2019-10-14项目重置
mvn flyway:migrate
mvn -Dmybatis.generator.overwrite=true mybatis-generator:generate

命令 
更新源  apt-get update
安装  sudo apt-get install git
打开文件夹 pwd /root
创建文件夹 mkdir App
cd App
git clone https://github.com/blindore/community.git
apt install maven
mvn compile package
cp src/main/resources/application.properties src/main/resources/application-production.properties//
vim src/main/resources/application-production.properties
