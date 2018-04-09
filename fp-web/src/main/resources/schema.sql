CREATE TABLE IF NOT EXISTS app_role (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  description varchar(255) DEFAULT NULL,
  role_name varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
);


CREATE TABLE IF NOT EXISTS app_user (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  first_name varchar(255),
  last_name varchar(255),
  password varchar(255) NOT NULL,
  username varchar(255) NOT NULL,
  email varchar(255) NOT NULL,
  accountExpired BOOLEAN,
  accountLocked BOOLEAN,
  credentialsExpired BOOLEAN,
  disabled BOOLEAN,
  PRIMARY KEY (id)
);


CREATE TABLE IF NOT EXISTS user_role (
  user_id bigint(20) NOT NULL,
  role_id bigint(20) NOT NULL,
  CONSTRAINT FK859n2jvi8ivhui0rl0esws6o FOREIGN KEY (user_id) REFERENCES app_user (id),
  CONSTRAINT FKa68196081fvovjhkek5m97n3y FOREIGN KEY (role_id) REFERENCES app_role (id)
);