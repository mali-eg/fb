INSERT INTO app_role (role_name, description) VALUES ('USER', 'Standard User - Has no admin rights');
INSERT INTO app_role (role_name, description) VALUES ('ADMIN', 'Admin User - Has permission to perform admin tasks');

-- USER
-- non-encrypted password: jwtpass
INSERT INTO app_user (first_name, last_name, password, username, email) VALUES ('John', 'Doe', '123456', 'john.doe', 'john@google.com');
INSERT INTO app_user (first_name, last_name, password, username, email) VALUES ('Admin', 'Admin', '123456', 'ali', 'ali@google.com');


INSERT INTO user_role(user_id, role_id) VALUES(1,1);
INSERT INTO user_role(user_id, role_id) VALUES(2,1);
INSERT INTO user_role(user_id, role_id) VALUES(2,2);
