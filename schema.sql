DROP TABLE IF EXISTS files;
CREATE TABLE files (
  FileID int(10) unsigned NOT NULL AUTO_INCREMENT,
  FileExtension varchar(255) DEFAULT NULL,
  BlurHash varchar(255) DEFAULT NULL,
  Status char(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (FileID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS user;
CREATE TABLE user (
  UserID int(10) unsigned NOT NULL AUTO_INCREMENT,
  UserName varchar(255) DEFAULT NULL,
  Password varchar(255) DEFAULT NULL,
  PRIMARY KEY (UserID)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8;

INSERT INTO user VALUES (1, 'talha', '123');
INSERT INTO user VALUES (2, 'shah', '123');
INSERT INTO user VALUES (3, 'taha', '123');
INSERT INTO user VALUES (4, 'tassadaq', '123');

DROP TABLE IF EXISTS user_account;
CREATE TABLE user_account (
  UserID int(10) unsigned NOT NULL,
  UserName varchar(255) DEFAULT NULL,
  Gender char(1) NOT NULL DEFAULT '',
  Image longblob,
  ImageString varchar(255) DEFAULT '',
  Status char(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (UserID),
  CONSTRAINT user_account_ibfk_1 FOREIGN KEY (UserID) REFERENCES user (UserID) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO user_account VALUES (1, 'talha', 'm', null, '', '1');
INSERT INTO user_account VALUES (2, 'shah', 'm', null, '', '1');
INSERT INTO user_account VALUES (3, 'taha', 'm', null, '', '1');
INSERT INTO user_account VALUES (4, 'tassadaq', 'm', null, '', '1');
