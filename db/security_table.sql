

--系统表
DROP TABLE IF EXISTS project;
CREATE TABLE project (
  id bigint(20) AUTO_INCREMENT  NOT NULL COMMENT 'ID',
  code VARCHAR(20) NOT NULL COMMENT '项目编码，唯一',
  name VARCHAR(200) NOT NULL COMMENT '项目名称',
  is_enable int NOT NULL COMMENT '启用状态,0-未启用 1-启用',
  create_time datetime NOT NULL COMMENT '创建时间',
  update_time datetime NOT NULL COMMENT '更新时间',
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='项目表';


--菜单表
DROP TABLE IF EXISTS menu;
CREATE TABLE menu (
  id bigint(20) AUTO_INCREMENT  NOT NULL COMMENT '菜单ID',
  code VARCHAR(20) NOT NULL COMMENT '菜单编码',
  name VARCHAR(200) NOT NULL COMMENT '菜单名称',
  url VARCHAR(1000) NOT NULL COMMENT '菜单路径',
  system_code VARCHAR(20) NOT NULL COMMENT '系统编码-逻辑外键，表示当前菜单属于哪个系统',
  is_enable int NOT NULL COMMENT '启用状态,0-未启用 1-启用',
  create_time datetime NOT NULL COMMENT '创建时间',
  update_time datetime NOT NULL COMMENT '更新时间',
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='菜单表';