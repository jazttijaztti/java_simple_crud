package bms;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * ���ЊǗ��V�X�e���ɂ����鏑�Ѝ폜�@�\�Ɋւ��鏈���������Ȃ��T�[�u���b�g�N���X
 */
public class DeleteServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// JSP�t�@�C���ɑJ�ڂ���
		request.getRequestDispatcher("/view/delete.jsp").forward(request, response);

	}
}
