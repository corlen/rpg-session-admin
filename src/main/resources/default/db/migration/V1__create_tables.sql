CREATE TABLE PLAYER(
	ID INT AUTO_INCREMENT,
	NAME VARCHAR(255),
);

CREATE TABLE SESSION(
	ID INT AUTO_INCREMENT,
	DESCRIPTION VARCHAR(255),
	CREATED_DATE BIGINT
);

CREATE TABLE ROLL(
	ID INT AUTO_INCREMENT,
	DIE_FACE INT,
	QUANTITY INT,
	BONUS_INCREMENT INT,
	PLAYER_ID BIGINT,
	SESSION_ID BIGINT,
	SUM INT,
	ROLL_DATE BIGINT
);