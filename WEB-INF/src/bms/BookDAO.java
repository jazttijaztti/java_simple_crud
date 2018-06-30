package bms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * ���ЊǗ��V�X�e��DB�łŎg�p����f�[�^�x�[�X�֘A�̏������܂Ƃ߂��N���X
 */
public class BookDAO {

	// JDBC�h���C�o������Driver�N���X�p�X
	private static final String RDB_DRIVE = "com.mysql.jdbc.Driver";

	// �ڑ�����MySQL�f�[�^�x�[�X�p�X
	private static final String URL = "jdbc:mysql://localhost/mybookdb";

	// �f�[�^�x�[�X�̃��[�U�[��
	private static final String USER = "root";

	// �f�[�^�x�[�X�̃p�X���[�h
	private static final String PASSWD = "root123";

	// DB�R�l�N�V�����ێ��p
	private Connection con = null;

	// �X�e�[�g�����g�ێ��p
	private Statement smt = null;

	/**
	 * �t�B�[���h�ϐ��̏�����ɁADB�ڑ��������Ȃ��֐�
	 *
	 * @throws IllegalStateException �֐������ŗ�O�����������ꍇ
	 */
	private void connect() {

		try {

			Class.forName(RDB_DRIVE);
			this.con = DriverManager.getConnection(URL, USER, PASSWD);
			this.smt = this.con.createStatement();

		} catch (Exception e) {
			throw new IllegalStateException(e);
		}

	}

	/**
	 * DB�ڑ������������Ȃ��֐�
	 */
	private void disconnect() {

		if (this.smt != null) {
			try {
				this.smt.close();
			} catch (SQLException ignore) {
			}
		}

		if (this.con != null) {
			try {
				this.con.close();
			} catch (SQLException ignore) {
			}
		}

	}

	/**
	 * �N�G�����s�������Ȃ��֐�
	 *
	 * @return �N�G�����ʃZ�b�g
	 *
	 * @param sql ���s����SQL
	 *
	 * @throws IllegalStateException �֐������ŗ�O�����������ꍇ
	 */
	private ResultSet executeQuery(String sql) {

		try {
			return this.smt.executeQuery(sql);
		} catch (Exception e) {
			throw new IllegalStateException(e);
		}

	}

	/**
	 * SQL���s�������Ȃ��֐�
	 *
	 * @return �X�V�s��
	 *
	 * @param sql ���s����SQL
	 *
	 * @throws IllegalStateException �֐������ŗ�O�����������ꍇ
	 */
	private int executeUpdate(String sql) {

		try {
			return this.smt.executeUpdate(sql);
		} catch (Exception e) {
			throw new IllegalStateException(e);
		}

	}


}
