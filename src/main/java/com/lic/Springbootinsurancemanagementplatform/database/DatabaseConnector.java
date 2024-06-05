package com.lic.Springbootinsurancemanagementplatform.database;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class DatabaseConnector {

    public void downloadPostgreSQLJDBCDriver() {
        // Manually download the PostgreSQL JDBC driver JAR file
        String jdbcDriverUrl = "https://repo1.maven.org/maven2/org/postgresql/postgresql/42.2.23/postgresql-42.2.23.jar";
        String jdbcDriverFilePath = "postgresql-42.2.23.jar";

        try {
            URL url = new URL(jdbcDriverUrl);
            try (InputStream inputStream = url.openStream();
                 OutputStream outputStream = new FileOutputStream(jdbcDriverFilePath)) {
                byte[] buffer = new byte[1024];
                int length;
                while ((length = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, length);
                }
            }
            System.out.println("PostgreSQL JDBC driver downloaded successfully.");
        } catch (IOException e) {
            System.out.println("Failed to download PostgreSQL JDBC driver: " + e.getMessage());
        }
    }

}
