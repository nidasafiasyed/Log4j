# Log4j

1. Clone the repository.
2. Create a table in your MySql workbench
` create table LOGS
   (USER_ID varchar(20)    not null,
    DATED   date           not null,
    LOGGER  varchar(50)    not null,
    LEVEL   varchar(10)    not null,
    MESSAGE varchar(1000)  not null
   );`

2. Under `src/main/resources`, in the `log4j.properties` file, change the databasse in `log4j.appender.DB.URL`, and add your credentials to `log4j.appender.DB.user` and `log4j.appender.DB.password`.
3. In the same file, change the SQL query for `log4j.appender.DB.sql` to add your own USER_ID.
4. Run the Logging.java as a Java application.
5. View the logs in your workbench with the query, `select * from <database_name>.LOGS`.
