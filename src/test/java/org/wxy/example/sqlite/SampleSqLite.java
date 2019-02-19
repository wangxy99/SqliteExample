package org.wxy.example.sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SampleSqLite {
	public static void main(String[] args) {
		Connection connection = null;
		try {
			// create a database connection
			connection = DriverManager.getConnection("jdbc:sqlite:testDB.db");
			// connection = DriverManager.getConnection("jdbc:sqlite::resource:testDB.db");
			Statement statement = connection.createStatement();
			statement.setQueryTimeout(30); // set timeout to 30 sec.

			statement.executeUpdate("drop table if exists person");
			statement.executeUpdate("create table person (id integer PRIMARY KEY AUTOINCREMENT, name string, age integer )");
			statement.executeUpdate("insert into person values(1, 'leo', 18)");
			statement.executeUpdate("insert into person values(2, 'yui', 19)");
			ResultSet rs = statement.executeQuery("select * from person");
			while (rs.next()) {
				// read the result set
				int ID = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				System.out.println(String.format("id=%d name=%s age=%d", ID, name, age));
			}
		} catch (SQLException e) {
			// if the error message is "out of memory",
			// it probably means no database file is found
			System.err.println(e.getMessage());
		} finally {
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				// connection close failed.
				System.err.println(e.getMessage());
			}
		}
	}
}