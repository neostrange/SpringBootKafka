package com.example.util;

public class Constants {
	
	public static final String TCP_PROTOCOL = "tcp";
	public static final String UDP_PROTOCOL = "udp";
	public static final String SMB_PROTOCOL = "smb";
	public static final String ICMP_PROTOCOL = "icmp";
	public static final String MYSQL_SERVICE = "mysql";
	public static final String MSSQL_SERVICE = "mssql";
	public static final String SIP_SERVICE = "sip";
	public static final String SSH_SERVICE = "ssh";
	public static final String HTTP_SERVICE = "http";
	public static final String MS_DS_SERVICE = "microsoft-ds";
	
	public static final String INCIDENT_INDEX = "incident";
	public static final String MYSQL_TYPE = "MysqlIncident";
	public static final String MSSQL_TYPE = "MssqlIncident";
	public static final String SIP_TYPE = "SipIncident";
	public static final String SMB_TYPE = "SmbIncident";
	public static final String SSH_TYPE = "SshIncident";
	public static final String WEB_TYPE = "WebIncident";
	public static final String MISC_TYPE = "MiscIncident";
	
	public static final String CONFIGURATION_INDEX = "configuration";
	public static final String INTERNAL_HOSTS = "InternalHosts";
	public static final String SENSORS = "Sensors";
	public static final String PORT = "port";
	public static final String SERVICE = "service";
	
	public static final String META_INDEX = "meta";
	public static final String NETWORK_INFO_TYPE = "NetworkInfo";

	
	public static final String MISC_STATE = "miscState";
	public static final String MISC_TIME = "miscTime";
	public static final String NETWORK_STATE = "networkState";
	public static final String NETWORK_TIME = "networkTime";
	public static final String MSSQL_STATE = "mssqlState";
	public static final String MSSQL_TIME = "mssqlTime";
	public static final String MYSQL_STATE = "mysqlState";
	public static final String MYSQL_TIME = "mysqlTime";
	public static final String SMB_STATE = "malwareState";
	public static final String SMB_TIME = "malwareTime";
	public static final String SIP_STATE = "sipState";
	public static final String SIP_TIME = "sipTime";
	public static final String SSH_STATE = "sshState";
	public static final String SSH_TIME = "sshTime";
	public static final String SSH_MALWARE_STATE = "sshMalwareState";
	public static final String SSH_MALWARE_TIME = "sshMalwareTime";
	public static final String WEB_STATE = "webState";
	public static final String WEB_TIME = "webTime";
	
	public static final String MODSEC_MODE = "modsecMode";
	public static final String MODSEC_TIME = "modsecTime";
	
	public static final String MODSEC_LOG_PATH = "MODSEC_LOG_PATH";
	
	public static final String LOG_RETENTION = "LOG_RETENTION";
	
	public static final String STATE_ON = "on";
	public static final String STATE_OFF = "off";

	public static final String SSH_DB_NAME = "SSH_DB_NAME";
	public static final String SSH_USER = "SSH_USER";
	public static final String SSH_PASSWORD = "SSH_PASSWORD";
	
	public static final String WEB_DB_NAME = "WEB_DB_NAME";
	public static final String WEB_USER = "WEB_USER";
	public static final String WEB_PASSWORD = "WEB_PASSWORD";
	
	public static final String NETWORK_DB_NAME = "NETWORK_DB_NAME";
	public static final String NETWORK_USER = "NETWORK_USER";
	public static final String NETWORK_PASSWORD = "NETWORK_PASSWORD";
	
	public static final String HOST = "HOST";
	
	public static final String SQLITE_DRIVER = "SQLITE_DRIVER";
	public static final String DB_DIONAEA = "DATABASE_DIONAEA";
	public static final String JOURNAL_MODE = "PRAGMA journal_mode=WAL";
	
	public static final String COLON = ":";
	public static final String IP_SEPARATOR_STRING = "f:";
	
	public static final String SSH_BIN_PATH = "SSH_BIN_PATH";
	public static final String DIONAEA_BIN_PATH = "DIONAEA_BIN_PATH";
}
