package bms;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * ���ЊǗ��V�X�e���ɂ����鏑�Гo�^�@�\�Ɋւ��鏈���������Ȃ��T�[�u���b�g�N���X
 */
public class InsertServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		// ListServlet�ɑJ�ڂ���
		request.getRequestDispatcher("/list").forward(request, response);

	}
}
