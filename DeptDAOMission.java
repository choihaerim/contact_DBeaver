package step03.mission;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.junit.Test;
import org.junit.internal.builders.AllDefaultPossibilitiesBuilder;

import util.DBUtil;
import model.dto.DeptDTO;

public class DeptDAOMission {
	//1
	public void selectAll() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rset = null;

		try {
			con = DBUtil.getConnection();
			stmt = con.createStatement();

			rset = stmt.executeQuery("SELECT ename, sal FROM emp2");

			while (rset.next()) {
				System.out.println(rset.getInt("deptno") + "/" + rset.getString("dname") + "/" + rset.getString("loc"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(con, stmt, rset);
		}
	}
	
	//2
	public void selectComm() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rset = null;

		try {
			con = DBUtil.getConnection();
			stmt = con.createStatement();

			rset = stmt.executeQuery("SELECT comm FROM emp2");

			if (rset.next()) {
				System.out.println(rset.getInt("deptno") + "/" + rset.getString("dname") + "/" + rset.getString("loc"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(con, stmt, rset);
		}
	}
	
	//3
	public void selectOne() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rset = null;

		try {
			con = DBUtil.getConnection();
			stmt = con.createStatement();

			rset = stmt.executeQuery("select * from dept where deptno=10");

			if (rset.next()) {
				System.out.println(rset.getInt("deptno") + "/" + rset.getString("dname") + "/" + rset.getString("loc"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(con, stmt, rset);
		}
	}
	
	//4
	
	//5
}
