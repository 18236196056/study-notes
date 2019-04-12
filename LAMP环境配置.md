# study-notes
项目笔记之学习积累
一：安装Apache
  I：软件包的名称为httpd，使用命令：yum install httpd
  II：开启apache服务器设置开机自动开启服务
  III：查看apache的状态 开机httpd.service是enabled自动开启
  IV：开启防火墙的80端口，
    firewall-cmd --zone=public --add-port=80/tcp --permanent
  V：重启防火墙服务 firewall-cmd --reload
    显示防火墙的配置信息 firewall-cmd --list-all
    查看防火墙状态：systemctl status firewalld
  VI：在本机浏览器中输入ip地址，测试apache是否安装成功
二：安装php
  I：yum install php
  II：查看php版本：php -v
  升级软件安装库：
    rpm -Uvh https://mirror.webtatic.com/yum/el7/epel-release.rpm
    rpm -Uvh https://mirror.webtatic.com/yum/el7/webtatic-release.rpm
  III：删除php版本
    yum remove php-common
    安装5.6版本
    yum install -y php56w php56w-opcache php56w-xml php56w-mcrypt php56w-gd php56w-devel php56w-mysql php56w-intl php56w-mbstring
    重启httpd服务 service httpd restart
    查看php版本  php -v
三：安装mysql
  先使用yum list|grep mysql看下有没有已安装的mysql,没有mysql-server就行
  I：下载mysql的repo源
    wget http://repo.mysql.com/mysql-community-release-el7-5.noarch.rpm
  II：安装mysql-community-release-el7-5.noarch.rpm包
    sudo rpm -ivh mysql-community-release-el7-5.noarch.rpm
  III：使用ls -1 /etc/yum.repos.d/mysql-community* 查看/etc/yum.repos.d 文件夹下会获得两个mysql的yum repo源：
    /etc/yum.repos.d/mysql-community.repo和/etc/yum.repos.d/mysql-community-source.repo
    使用命令 yum -y install mysql mysql-server mysql-devel，安装成功
  IV：service mysqld start 启动服务
    systemctl status mysqld.service 查看状态
  V：use mysql;
    设置登陆密码 update user set password=password(“密码”) where user=”root”;
    Flush privileges; 
    mysql -u root p回车输入刚刚修改后的密码，登陆成功
  VI：mysql的卸载，详情请下载查看
四：phpMyadmin安装
  I：yum安装出错时：rpmdb: BDB0113 Thread/process 5680/140620260104000 failed: BDB1507 Thread died in Berkeley DB library 
      db5 错误(-30973) 来自 dbenv->failchk：BDB0087 DB_RUNRECOVERY: Fatal error, run database recovery
  II：找到对应rpm文件夹，重建rpm数据库
    cd /var/lib/rpm
    rm -rf __db*
    rpm --rebuilddb
  III：重新安装
    yum install epel-release
    rpm -ivh http://rpms.famillecollet.com/enterprise/remi-release-7.rpm
  IV：sudo yum install phpmyadmin
  V：修改配置文件
    sudo vi /etc/httpd/conf.d/phpMyAdmin.conf
  VI：重启httpd服务：systemctl restart httpd
  VII：验证是否安装成功:
    在浏览器中输入ip/phpmyadmin
  
  
  
