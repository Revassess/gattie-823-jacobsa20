SELECT * FROM APP_USER 
	Join USER_ROLE on APP_USER.role_id = USER_ROLE.role_id
	WHERE USER_ROLE.name = "BASIC_USER";